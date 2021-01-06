/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Interfaz.Productos;
import Modelo.productos;
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
public class SqlProductos extends Conexion{
    
    public static void cargar(String valor){
         
    String mostrar="SELECT cod_producto, descripcion, precio_venta, stock, "
            + "unidad_med, descripcion_m, descripcion_c from productos "
            + "inner join marca on productos.id_marca1=marca.id_marca "
           + "inner join categoria on productos.id_categoria1=categoria.id_categoria "
            + "WHERE descripcion LIKE '%"+valor+"%' or cod_producto LIKE '%"+valor+"%'";
    String []titulos={"CODIGO","PRODUCTO","PRECIO","STOCK","U.M","MARCA","CATEGORIA"};
    String []Registros=new String[7];
    DefaultTableModel model= new DefaultTableModel(null,titulos);
  
          Conexion cc = new Conexion(); 
          Connection cn=cc.getConexion();
        try {
          
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("cod_producto");
                  Registros[1]= rs.getString("descripcion");
                  Registros[2]= rs.getString("precio_venta");
                  Registros[3]= rs.getString("stock");
                  Registros[4]= rs.getString("unidad_med");        
                 Registros[5]= rs.getString("descripcion_m");        
                 Registros[6]= rs.getString("descripcion_c");        
                  model.addRow(Registros); 
                  
              }
            Productos.tabla_prod.setModel(model);
                   Productos.tabla_prod.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Productos.tabla_prod.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(50);
         columnModel.getColumn(1).setPreferredWidth(160);
         columnModel.getColumn(2).setPreferredWidth(150);
         columnModel.getColumn(3).setPreferredWidth(130);
         columnModel.getColumn(4).setPreferredWidth(50);
         columnModel.getColumn(5).setPreferredWidth(150);
         columnModel.getColumn(6).setPreferredWidth(150);
        } catch (SQLException ex) {
            Logger.getLogger(SqlProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  }  
 }
    
    public static List mostrarP(String valor){
         
    String mostrar="SELECT cod_producto, descripcion, precio_costo, precio_venta, precio_mayori, descuento, iva, "
            + "stock, obs, unidad_med, nombre_prov, descripcion_m, descripcion_c from productos "
            + "inner join proveedor on productos.id_proveedor1=proveedor.id_proveedor "
            + "inner join marca on productos.id_marca1=marca.id_marca "
           + "inner join categoria on productos.id_categoria1=categoria.id_categoria "
            + "WHERE cod_producto ="+valor+"";
  
    List listpro=new ArrayList();
          Conexion cc = new Conexion(); 
          Connection cn=cc.getConexion();
          
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  productos prod = new productos();
                 prod.setCodigo(rs.getString("cod_producto"));
                  prod.setDescripcion(rs.getString("descripcion"));
                  prod.setPrecio_costo(rs.getFloat("precio_costo"));
                  prod.setPrecio_venta(rs.getFloat("precio_venta"));
                  prod.setPrecio_mayor(rs.getFloat("precio_mayori"));        
                 prod.setDescuento(rs.getFloat("descuento"));        
                prod.setIva(rs.getInt("iva")); 
                 prod.setStock(rs.getInt("stock")); 
                 prod.setObs(rs.getString("obs")); 
                 prod.setUnidad_med(rs.getString("unidad_med")); 
                prod.setId_proveedor(rs.getString("nombre_prov"));  
                 prod.setId_marca(rs.getString("descripcion_m")); 
                 prod.setId_categoria(rs.getString("descripcion_c")); 
                  listpro.add(prod);
              }
        } catch (SQLException ex) {
            Logger.getLogger(SqlProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        } 
        finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
       return listpro;
    }
    
    public boolean registrar(productos prod) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO productos (cod_producto, descripcion, precio_costo, precio_venta, precio_mayori, descuento, iva, stock, obs, id_proveedor1, id_marca1, id_categoria1, unidad_med)"
                + " VALUES (?,?,?,?,?,?,?,?, (SELECT id_proveedor FROM proveedor WHERE nombre_prov=?),(SELECT id_marca FROM marca WHERE descripcion_m=?),(SELECT id_categoria FROM categoria WHERE descripcion_c=?),?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getDescripcion());
            ps.setFloat(3, prod.getPrecio_costo());
            ps.setFloat(4, prod.getPrecio_venta());
            ps.setFloat(5, prod.getPrecio_mayor());
            ps.setFloat(6, prod.getDescuento());
            ps.setInt(7, prod.getIva());
            ps.setInt(8, prod.getStock());
            ps.setString(9, prod.getObs());
            ps.setString(10, prod.getId_proveedor());
            ps.setString(11, prod.getId_marca());
            ps.setString(12, prod.getId_categoria());
            ps.setString(13, prod.getUnidad_med());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }finally{
            
        if(con!=null){  
        try {
      //      ps.close();
            con.close();
        //    ps=null;
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   }
  }
     
    public int existeProducto(String producto) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(id_producto) FROM productos WHERE cod_producto=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, producto);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);

            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlProductos.class.getName()).log(Level.SEVERE, null, ex);
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
     
    public boolean eliminar(productos produ) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "delete from productos where cod_producto=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, produ.getCodigo());
            rs=ps.executeQuery();
            
            if(rs.next()){
            return true;
            }
            
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SqlProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
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
    
    public boolean modificar(productos prod) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE productos set descripcion=?, precio_costo=?, precio_venta=?, precio_mayori=?, descuento=?, iva=?, stock=?, obs=?, "
                + "id_proveedor1=(SELECT id_proveedor FROM proveedor WHERE nombre_prov=?), id_marca1=(SELECT id_marca FROM marca WHERE descripcion_m=?),"
                + "id_categoria1=(SELECT id_categoria FROM categoria WHERE descripcion_c=?), unidad_med=? where cod_producto=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getDescripcion());
            ps.setFloat(2, prod.getPrecio_costo());
            ps.setFloat(3, prod.getPrecio_venta());
            ps.setFloat(4, prod.getPrecio_mayor());
            ps.setFloat(5, prod.getDescuento());
            ps.setInt(6, prod.getIva());
            ps.setInt(7, prod.getStock());
            ps.setString(8, prod.getObs());
            ps.setString(9, prod.getId_proveedor());
            ps.setString(10, prod.getId_marca());
            ps.setString(11, prod.getId_categoria());
            ps.setString(12, prod.getUnidad_med());
            ps.setString(13, prod.getCodigo());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }finally{
            
        if(con!=null){  
        try {
         //   ps.close();
            con.close();
         //   ps=null;
            con=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   }
  }    
     
}
