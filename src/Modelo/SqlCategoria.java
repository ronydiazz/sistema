
package Modelo;

import Vista.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



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
        //    ps.close();
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
    
    if(cbx_categoria.getSelectedIndex()>=0){
      //  cbx_proveedor.removeAllItems();
   }else{
        ps = con.prepareStatement(SSQL);
   rs = ps.executeQuery();
   cbx_categoria.addItem("Seleccione una opción");
   
   
   while(rs.next()){
   
       cbx_categoria.addItem(rs.getString("descripcion_c"));
   
   }}
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e);
}finally{
    if(con!=null){  
        try {
         //   rs.close();
       //     ps.close();
            con.close();
      //      rs=null;
     //       ps=null;
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

      public static void mostrarCategoria(String v){
           String [] columnas ={"CODIGO","DESCRIPCION","ESTADO"};
    Object[] obj= new Object[3];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
          Conexion cc= new Conexion();
       //  Prepared
      //           Statement ps = null;
    //     ResultSet rs = null;
         Connection con =cc.getConexion();
          String sql = "SELECT id_categoria,descripcion_c, nom_estado "
                + "from categoria inner join estado on categoria.estadoc=estado.id_estado where descripcion_c LIKE '%"+v+"%' ORDER BY id_categoria ASC";
      

         try {

       Statement ps = con.createStatement();
       ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

           obj[0]= rs.getInt("id_categoria");
           obj[1]=rs.getString("descripcion_c");
           obj[2]=rs.getString("nom_estado");
            Tabla.addRow(obj);
     
            }
            Productos.tabla_categoria.setModel(Tabla);
               Productos.tabla_categoria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Productos.tabla_categoria.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
         
            
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
  //return lista_cate;
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
      
//       public void consultar_estado(JComboBox cbx_estado){
//         
// Connection con = getConexion();    
//PreparedStatement pst = null;
//ResultSet result = null;
//String SSQL = "SELECT nom_estado FROM estado ORDER BY nom_estado ASC";
//
//try {
// if(cbx_estado.getSelectedIndex()>=0){
// 
// //   if(cbx_estado.getSelectedIndex()>=0){
//      //  cbx_proveedor.removeAllItems();
//   }else{
//       pst = con.prepareStatement(SSQL);
//   result = pst.executeQuery();
//   cbx_estado.addItem("Seleccione una opción");
////   result.next();
////          JOptionPane.showMessageDialog(null,result.getString("nom_estado"));
//   
//   while(result.next()){
//   
//       cbx_estado.addItem(result.getString("nom_estado"));
//       
//   //    JOptionPane.showMessageDialog(null,"ingresa result while");
//   
//   }}
//} catch (SQLException e) {
//    JOptionPane.showMessageDialog(null, e);
//}finally{
//
//    if(con!=null){
//        
//        try {
////            result.close();
//     //       pst.close();
//            con.close();
//            
//      //      result=null;
//     //       pst.close();
//            con=null;
//            
//            
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(null, ex);
//             
//        }
//    }
// }
//}
}



















         /*  
      public static List mostrarCategoriaoriginal( String v){
          Conexion cc= new Conexion();
       //  Prepared
      //           Statement ps = null;
    //     ResultSet rs = null;
         Connection con =cc.getConexion();
          String sql = "SELECT id_categoria,descripcion_c, nom_estado "
                + "from categoria inner join estado on categoria.estadoc=estado.id_estado where descripcion_c LIKE '%"+v+"%' or id_categoria ='"+v+"'";
        List lista_cate = new ArrayList();

         try {

   PreparedStatement         ps = con.prepareCall(sql);
ResultSet         rs = ps.executeQuery();

            while (rs.next()) {

           categoria cat = new categoria();
           cat.setId_categoria(rs.getInt("id_categoria"));
           cat.setDescripcion_c(rs.getString("descripcion_c"));
           cat.setNombre_est(rs.getString("nom_estado"));
           
           lista_cate.add(cat);
        
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
  return lista_cate;
      }
*/

