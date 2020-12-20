/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SqlProductos extends Conexion{
     public boolean registrar(productos prod) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO productos (cod_producto, descripcion, precio_costo, precio_venta, precio_mayori, descuento, iva, stock, obs, id_proveedor1, id_marca1, unidad_med)"
                + " VALUES (?,?,?,?,?,?,?,?,?, (SELECT id_proveedor FROM proveedor WHERE nombre_prov=?),(SELECT id_marca FROM marca WHERE descripcion_m=?),?)";

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
            ps.setString(12, prod.getUnidad_med());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
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
     
     public int existeUsusario(String producto) {
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
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
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
}
