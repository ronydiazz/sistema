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
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
       
   //Establecemos conexión con la BD 
//   conectar = con.dataSource.getConnection();  
   //Preparamos la consulta SQL
   pst = con.prepareStatement(SSQL);
   //Ejecutamos la consulta
   result = pst.executeQuery();
   
   //LLenamos nuestro ComboBox
   cbx_proveedor.addItem("Seleccione una opción");
   
   while(result.next()){
   
       cbx_proveedor.addItem(result.getString("nombre_prov"));
   }
   
    
} catch (SQLException e) {

    JOptionPane.showMessageDialog(null, e);
    
}finally{

    if(con!=null){
        
        try {
        
            con.close();
            result.close();
            
            con=null;
            result=null;
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        
        }
    
    }

}
     }
     
     
}
