/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaz.Productos;
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
      
      public static void mostrarMarca( String m){
                  String [] columnas ={"CODIGO","DESCRIPCION","ESTADO"};
    Object[] obj= new Object[3];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
       Statement ps = null;
         ResultSet rs = null;
         Conexion con =new Conexion();
         Connection cc= con.getConexion();
          String sql = "SELECT id_marca,descripcion_m, nom_estado "
                + "from marca inner join estado on marca.estado1=estado.id_estado WHERE descripcion_m LIKE '%"+m+"%' ORDER BY id_marca ASC";
      

         try {

            ps = cc.createStatement();
         rs = ps.executeQuery(sql);

            while (rs.next()) {
                
           obj[0]=rs.getInt("id_marca");
          obj[1]=rs.getString("descripcion_m");
           obj[2]=rs.getString("nom_estado");
           Tabla.addRow(obj);
        
            }
             Productos.tabla_marca.setModel(Tabla);
               Productos.tabla_marca.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Productos.tabla_marca.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(SqlMarca.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }finally{
    if(cc!=null){  
        try {
            cc.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
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
