/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.BuscarVendedor;
import Vista.Cliente;
import Vista.Vendedor;
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

/**
 *
 * @author DELL
 */
public class SqlVendedor extends Conexion{

      public void mostrarVendedor (String v) {

    String [] columnas ={"CODIGO","NOMBRE Y APELLIDO","RUC/CI","CELULAR", "EMAIL", "SALARIO","TIPO"};
    Object[] obj= new Object[7];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
    
        Connection con = getConexion();
        String sql = "SELECT a.id_vendedor, s.nombre, a.cedula, a.celular, a.correo, a.salario, d.nombreTipo from vendedor a "
                + "inner join  usuarios s on a.id_usuario1=s.id_usuario "
              //  + "inner join estado d on a.estado1=d.id_estado "
                + "inner join tipo_usuario d on a.id_tipo1=d.id_tipousuario "
                + " WHERE s.nombre LIKE '%"+v+"%' or a.cedula LIKE '%"+v+"%' ORDER BY a.id_vendedor ASC";

         try {

          Statement  ps = con.createStatement();
        ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

           obj[0]=rs.getInt("id_vendedor");
           obj[1]=rs.getString("nombre");
           obj[2]=rs.getString("cedula");
           obj[3]=rs.getString("celular");
           obj[4]=rs.getString("correo");
           obj[5]=rs.getString("salario");
           obj[6]=rs.getString("nombreTipo");
             Tabla.addRow(obj);
            }
            Vendedor.tabla_vendedor.setModel(Tabla);
             Vendedor.tabla_vendedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Vendedor.tabla_vendedor.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(240);
         columnModel.getColumn(2).setPreferredWidth(130);
         columnModel.getColumn(3).setPreferredWidth(115);
         columnModel.getColumn(4).setPreferredWidth(150);
         columnModel.getColumn(5).setPreferredWidth(100);
         columnModel.getColumn(6).setPreferredWidth(100);
        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
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
      
       public boolean registrar_vend(vendedor vend) {

        PreparedStatement ps = null;
        Connection con = getConexion();
            String sql = "INSERT INTO vendedor (id_usuario1, cedula, celular, correo, salario, comision, direccion, obs, id_tipo1, nombre) VALUES ((SELECT id_usuario FROM usuarios WHERE usuario=?),?,?,?,?,?,?,?,?, ? )";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vend.getId_usuario());
            ps.setString(2, vend.getCedula());
            ps.setString(3, vend.getCelular());
            ps.setString(4, vend.getCorreo());
            ps.setInt(5, vend.getSalario());
            ps.setInt(6, vend.getComision());
            ps.setString(7, vend.getDireccion());
            ps.setString(8, vend.getObservacion());
            ps.setInt(9, vend.getId_estado());
            ps.setString(10, vend.getNombre());
             ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
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
       public boolean modificar_vend(vendedor vend) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE vendedor SET id_usuario1=(SELECT id_usuario FROM usuarios WHERE usuario=?), cedula=?, celular=?, correo=?, salario=?, comision=?, direccion=?, obs=?, id_tipo1=?, nombre=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vend.getId_usuario());
            ps.setString(2, vend.getCedula());
            ps.setString(3, vend.getCelular());
            ps.setString(4, vend.getCorreo());
            ps.setInt(5, vend.getSalario());
            ps.setInt(6, vend.getComision());
            ps.setString(7, vend.getDireccion());
            ps.setString(8, vend.getObservacion());
            ps.setInt(9, vend.getId_estado());
            ps.setString(10, vend.getNombre());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
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
       
        public List mostrar_en_txt (String v) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT  usuario, nombre, correo, nombreTipo from usuarios inner join tipo_usuario on usuarios.id_tipo=tipo_usuario.id_tipousuario WHERE id_usuario ='"+v+"' ";
        List aggvendedor = new ArrayList(4);

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           vendedor vend = new vendedor();
           vend.setId_usuario(rs.getString("usuario"));
           vend.setNombre(rs.getString("nombre"));
       
           vend.setCorreo(rs.getString("correo"));
           vend.setNombre_est(rs.getString("nombreTipo"));
           
           aggvendedor.add(vend);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
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
  return aggvendedor;
}
        //arreglar
        public List mostrar_en_txt1 (String v) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT  a.id_vendedor,s.usuario, s.nombre, a.cedula, a.celular, a.correo, a.salario, a.comision, a.direccion, a.obs, d.nombreTipo from vendedor a "
                + "inner join  usuarios s on a.id_usuario1=s.id_usuario "
              //  + "inner join estado d on a.estado1=d.id_estado "
                + "inner join tipo_usuario d on a.id_tipo1=d.id_tipousuario "
                + " WHERE a.id_vendedor ='"+v+"' ";
        List vendedor = new ArrayList(11);
         try {
            ps = con.prepareCall(sql);
         rs = ps.executeQuery();
            while (rs.next()) {
           vendedor vend = new vendedor();
           vend.setId(rs.getInt("id_vendedor"));
           vend.setId_usuario(rs.getString("usuario"));
           vend.setNombre(rs.getString("nombre"));
           vend.setCedula(rs.getString("cedula"));
           vend.setCelular(rs.getString("celular"));
           vend.setCorreo(rs.getString("correo"));
           vend.setSalario(rs.getInt("salario"));
           vend.setComision(rs.getInt("comision"));
           vend.setDireccion(rs.getString("direccion"));
           vend.setObservacion(rs.getString("obs"));
           vend.setNombre_est(rs.getString("nombreTipo"));
           vendedor.add(vend);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
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
  return vendedor;
}
        
          public void consultar_vendedor(JComboBox cbx_proveedor){
         
 Connection con = getConexion(); 
PreparedStatement pst = null;
ResultSet result = null;

//Creamos la Consulta SQL
String SSQL = "SELECT usuarios.nombre FROM vendedor inner join usuarios  on vendedor.id_usuario1=usuarios.id_usuario ORDER BY usuarios.nombre ASC";
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
   
       cbx_proveedor.addItem(result.getString("nombre"));
   } }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
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
          
     public static void cargar_usu(String valor){
         
    String mostrar="SELECT id_usuario, usuario, nombre, correo, nombreTipo from usuarios inner join tipo_usuario on usuarios.id_tipo=tipo_usuario.id_tipousuario WHERE nombre LIKE '%"+valor+"%' ORDER BY id_usuario ASC";
    String []titulos={"ID","USUARIO","NOMBRE","CORREO","TIPO"};
    String []Registros=new String[5];
    DefaultTableModel model= new DefaultTableModel(null,titulos);
  
          Conexion cc = new Conexion(); 
          Connection cn=cc.getConexion();
        try {
          
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("id_usuario");
                  Registros[1]= rs.getString("usuario");
                  Registros[2]= rs.getString("nombre");
                  Registros[3]= rs.getString("correo");
                  Registros[4]= rs.getString("nombreTipo");        
                  model.addRow(Registros);
              }
            BuscarVendedor.tabla_vendedor.setModel(model);
                    BuscarVendedor.tabla_vendedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = BuscarVendedor.tabla_vendedor.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(50);
         columnModel.getColumn(1).setPreferredWidth(120);
         columnModel.getColumn(2).setPreferredWidth(200);
         columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
    
  }
     
       public int existeVendedor(String vendedor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(id_vendedor) FROM vendedor WHERE id_usuario1=(SELECT id_usuario FROM usuarios WHERE usuario=?) ";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, vendedor);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }finally{
    if(con!=null){  
        try {
//            rs.close();
//            ps.close();
            con.close();
//            rs=null;
//            ps=null;
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
    }
       public int existeVendedor2(String vendedor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(id_vendedor) FROM vendedor WHERE id_usuario1=(SELECT id_usuario FROM usuarios WHERE usuario=?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, vendedor);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlVendedor.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }finally{
    if(con!=null){  
        try {
//            rs.close();
//            ps.close();
            con.close();
//            rs=null;
//            ps=null;
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
    }
      
}
