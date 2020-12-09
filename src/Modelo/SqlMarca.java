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
        String sql = "INSERT INTO marca (descripcion_m, estado1) VALUES (?, (SELECT id_estado FROM estado WHERE nom_estado=?))";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mar.getDescripcion());
            ps.setString(2, mar.getEstado1());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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

   ps = con.prepareStatement(SSQL);
   rs = ps.executeQuery();
   cbx_marca.addItem("Seleccione una opción");
   
   while(rs.next()){
   
       cbx_marca.addItem(rs.getString("descripcion_m"));
   
   }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
}finally{
    if(con!=null){  
        try {
            rs.close();
            ps.close();
            con.close();
            rs=null;
            ps=null;
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
}
     

   
        
  

      public void consultar_estado(JComboBox cbx_estado){
         
 Connection con = getConexion();    
PreparedStatement pst = null;
ResultSet result = null;
String SSQL = "SELECT nom_estado FROM estado ORDER BY nom_estado ASC";

try {

   pst = con.prepareStatement(SSQL);
   result = pst.executeQuery();
   cbx_estado.addItem("Seleccione una opción");
   
   while(result.next()){
   
       cbx_estado.addItem(result.getString("nom_estado"));
   
   }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
}finally{

    if(con!=null){
        
        try {
            result.close();
            pst.close();
            con.close();
            
            result=null;
            pst.close();
            con=null;
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
             
        }
    }
 }
}
}
