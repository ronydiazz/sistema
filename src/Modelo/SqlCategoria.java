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
public class SqlCategoria extends Conexion{
    
    public boolean registrar_categoria(categoria cat) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO categoria (descripcion_c, estadoc) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getDescripcion_c());
            ps.setInt(2, cat.getEstado());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlCategoria.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
     public void consultar_categoria(JComboBox cbx_categoria){
         
 Connection con = getConexion();    
PreparedStatement ps = null;
ResultSet rs = null;
String SSQL = "SELECT descripcion_c FROM categoria ORDER BY descripcion_c ASC";

try {

   ps = con.prepareStatement(SSQL);
   rs = ps.executeQuery();
   cbx_categoria.addItem("Seleccione una opción");
   
   while(rs.next()){
   
       cbx_categoria.addItem(rs.getString("descripcion_c"));
   
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

      public boolean modificar(categoria cate){
          
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="UPDATE categoria SET descripcion_c=?, estadoc=? WHERE id_categoria=?";
        
        try {
         ps= con.prepareStatement(sql);
         ps.setString(1, cate.getDescripcion_c());
         ps.setInt(2, cate.getEstado());
         ps.setInt(3, cate.getId_categoria());
         ps.execute();
         return true;
        } catch (SQLException ex) {
        Logger.getLogger(SqlCategoria.class.getName()).log(Level.SEVERE, null, ex);
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
      
      public List mostrarCategoria( String v){
         PreparedStatement ps = null;
         ResultSet rs = null;
         Connection con =getConexion();
          String sql = "SELECT id_categoria,descripcion_c, nom_estado "
                + "from categoria inner join estado on categoria.estadoc=estado.id_estado where descripcion_c LIKE '%"+v+"%'" ;
        List lista_marca = new ArrayList();

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           marca mar = new marca();
           mar.setCodigo(rs.getInt("id_categoria"));
           mar.setDescripcion(rs.getString("descripcion_c"));
           mar.setNombre_est(rs.getString("nom_estado"));
           lista_marca.add(mar);
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlCategoria.class.getName()).log(Level.SEVERE, null, ex);
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
      
      public boolean eliminarCategoria(categoria ma){
       PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "delete from categoria where id_categoria=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, ma.getId_categoria());
            rs = ps.executeQuery();

            if (rs.next()) {
                 
                return true;

            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlCategoria.class.getName()).log(Level.SEVERE, null, ex);
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
