/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import static Interfaz.clieveedor.tabla_prov;
import Vendedor.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
//import static Interfaz.Proveedor.tabla_prov;

/**
 *
 * @author DELL
 */
public class SqlProveedor extends Conexion  {
    
    public boolean registrar_prov(proveedor prov) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO proveedor (nombre_prov, contacto, contacto2, sitioweb, email, direccion_pro) VALUES (?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombre_prov());
            ps.setString(2, prov.getContacto());
            ps.setString(3, prov.getContacto2());
            ps.setString(4, prov.getSitioweb());
            ps.setString(5, prov.getEmail());
            ps.setString(6, prov.getDireccion_pro());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlProveedor.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }finally{
    if(con!=null){  
        try {
            ps.close();
            con.close();
            ps=null;
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
    }
    
    
    public void consultar_proveedores(JComboBox cbx_proveedor){
         
 Connection con = getConexion();
//Creamos objeto tipo Connection    
//java.sql.Connection conectar = null;    
PreparedStatement pst = null;
ResultSet result = null;

//Creamos la Consulta SQL
String SSQL = "SELECT nombre_prov FROM proveedor ORDER BY nombre_prov ASC";

//Establecemos bloque try-catch-finally
try {
 
    if(cbx_proveedor.getSelectedIndex()>=0){
      //  cbx_proveedor.removeAllItems();
   }else{
        pst = con.prepareStatement(SSQL);
   //Ejecutamos la consulta
   result = pst.executeQuery();
   cbx_proveedor.addItem("Seleccione una opción");
   
   while(result.next()){
   
       cbx_proveedor.addItem(result.getString("nombre_prov"));
   }
   }
 
} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}finally{

    if(con!=null){
        
        try {
            con.close();
       //     result.close();
            
            con=null;
     //       result=null;
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        
    }
  }
 }
}
     
    public boolean modificar (proveedor prov) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE proveedor SET nombre_prov=?, contacto=?, contacto2=?, sitioweb=?, "
                + "email=?, direccion_pro=? WHERE id_proveedor=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombre_prov());
            ps.setString(2, prov.getContacto());
            ps.setString(3, prov.getContacto2());
            ps.setString(4, prov.getSitioweb());
            ps.setString(5, prov.getEmail());
            ps.setString(6, prov.getDireccion_pro());
            ps.setInt(7, prov.getId_prov());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlProveedor.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }finally{
    if(con!=null){  
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
}
     
    public List mostrar_en_txt (String v) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT id_proveedor, nombre_prov, contacto, contacto2, sitioweb, email, direccion_pro from proveedor WHERE id_proveedor ='"+v+"' ORDER BY id_proveedor ASC";
        List listaProveedor = new ArrayList(7);

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           proveedor prov = new proveedor();
           prov.setId_prov(rs.getInt("id_proveedor"));
           prov.setNombre_prov(rs.getString("nombre_prov"));
           prov.setContacto(rs.getString("contacto"));
           prov.setContacto2(rs.getString("contacto2"));
           prov.setSitioweb(rs.getString("sitioweb"));
           prov.setEmail(rs.getString("email"));
           prov.setDireccion_pro(rs.getString("direccion_pro"));
           listaProveedor.add(prov);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlProveedor.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }finally{
    if(con!=null){  
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
  return listaProveedor;
}
 
    public void mostrarProveedores (String v) {

    String [] columnas ={"CODIGO","PROVEEDOR","EMAIL", "CONTACTO"};
    Object[] obj= new Object[4];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
    
        Connection con = getConexion();
        String sql = "SELECT id_proveedor, nombre_prov, contacto, email from proveedor WHERE nombre_prov LIKE '%"+v+"%' ORDER BY id_proveedor ASC";

         try {

          Statement  ps = con.createStatement();
        ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

           obj[0]=rs.getInt("id_proveedor");
           obj[1]=rs.getString("nombre_prov");
           obj[2]=rs.getString("email");
           obj[3]=rs.getString("contacto");
             Tabla.addRow(obj);
            }
            Proveedor.tabla_prov.setModel(Tabla);
            Proveedor.tabla_prov.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Proveedor.tabla_prov.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
         columnModel.getColumn(3).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(SqlProveedor.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }finally{
    if(con!=null){  
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
}
    
    public boolean eliminarUsuario(proveedor prov){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "delete from proveedor where id_proveedor=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, prov.getId_prov());
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlProveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }finally{
    if(con!=null){  
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
}
}
