/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SqlMarca extends Conexion{
    
      public boolean registrar_marca(marca mar) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO marca (descripcion_m, estado1) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mar.getDescripcion());
            ps.setInt(2, mar.getEstado1());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlMarca.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        } finally{
        if(con!=null){  
        try {
            ps.close();
            con.close();
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
}
    
      public void consultar_marca(JComboBox cbx_marca){
         
 Connection con = getConexion();    
PreparedStatement ps = null;
ResultSet rs = null;
String SSQL = "SELECT descripcion_m FROM marca ORDER BY descripcion_m ASC";

try {

   
    if(cbx_marca.getSelectedIndex()>=0){
      //  cbx_proveedor.removeAllItems();
   }else{
        ps = con.prepareStatement(SSQL);
   rs = ps.executeQuery();
   cbx_marca.addItem("Seleccione una opción");
   
   while(rs.next()){
   
       cbx_marca.addItem(rs.getString("descripcion_m"));
   }
   }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
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
     
      public boolean modificar(marca marc){
          
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="UPDATE marca SET descripcion_m=?, estado1=? WHERE id_marca=?";
        
        try {
         ps= con.prepareStatement(sql);
         ps.setString(1, marc.getDescripcion());
         ps.setInt(2, marc.getEstado1());
         ps.setInt(3, marc.getCodigo());
         ps.execute();
         return true;
        } catch (SQLException ex) {
        Logger.getLogger(SqlMarca.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex);
        return false;
        }finally{
        if(con!=null){
            try{
        con.close();
        } catch (SQLException ex)
        {JOptionPane.showMessageDialog(null, ex);}
        }
        }
      }
      
      public List mostrarMarca( String m){
         PreparedStatement ps = null;
         ResultSet rs = null;
         Connection con =getConexion();
          String sql = "SELECT id_marca,descripcion_m, nom_estado "
                + "from marca inner join estado on marca.estado1=estado.id_estado WHERE descripcion_m LIKE '%"+m+"%'";
        List lista_marca = new ArrayList();

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           marca mar = new marca();
           mar.setCodigo(rs.getInt("id_marca"));
           mar.setDescripcion(rs.getString("descripcion_m"));
           mar.setNombre_est(rs.getString("nom_estado"));
           lista_marca.add(mar);
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlMarca.class.getName()).log(Level.SEVERE, null, ex);
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
  return lista_marca;
      }
      
      public boolean eliminarMarca(marca ma){
       PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "delete from marca where id_marca=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, ma.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                 
                return true;

            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlMarca.class.getName()).log(Level.SEVERE, null, ex);
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
