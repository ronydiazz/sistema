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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SqlEstado extends Conexion{
    
    
  public void consultar_estado(JComboBox cbx_estado){
         
 Connection con = getConexion();    
PreparedStatement pst = null;
ResultSet result = null;
String SSQL = "SELECT nom_estado FROM estado ORDER BY nom_estado ASC";

try {
 if(cbx_estado.getSelectedIndex()>=0){
 
 //   if(cbx_estado.getSelectedIndex()>=0){
      //  cbx_proveedor.removeAllItems();
   }else{
       pst = con.prepareStatement(SSQL);
   result = pst.executeQuery();
   cbx_estado.addItem("Seleccione una opción");
//   result.next();
//          JOptionPane.showMessageDialog(null,result.getString("nom_estado"));
   
   while(result.next()){
   
       cbx_estado.addItem(result.getString("nom_estado"));
       
   //    JOptionPane.showMessageDialog(null,"ingresa result while");
   
   }}
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
}finally{

    if(con!=null){
        
        try {
//            result.close();
     //       pst.close();
            con.close();
            
      //      result=null;
     //       pst.close();
            con=null;
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
             
        }
    }
 }
}
    
}
