/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vendedor.BuscarCliente;
import Vendedor.Cliente;
import Vendedor.Productos;
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
public class SqlCliente extends Conexion{
    
      
    public boolean registrar_cli(cliente cli) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente (nombre_cli, cedula, celular, telefono, email, direccion) VALUES (?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getCedula());
            ps.setString(3, cli.getCelular());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getEmail());
            ps.setString(6, cli.getDireccion());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlCliente.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
 
     
    public boolean modificar (cliente cli) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE cliente SET nombre_cli=?, cedula=?, celular=?, telefono=?, "
                + "email=?, direccion=? WHERE id_cliente=?";

        try {
            ps = con.prepareStatement(sql);
             ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getCedula());
            ps.setString(3, cli.getCelular());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getEmail());
            ps.setString(6, cli.getDireccion());
            ps.setInt(7, cli.getCodigo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
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
     
    public List mostrar_en_txt (String v) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT id_cliente, nombre_cli, cedula, celular, telefono, email, direccion from cliente WHERE id_cliente ='"+v+"' ORDER BY id_cliente ASC";
        List aggcliente = new ArrayList(7);

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           cliente cli = new cliente();
           cli.setCodigo(rs.getInt("id_cliente"));
           cli.setNombre(rs.getString("nombre_cli"));
           cli.setCedula(rs.getString("cedula"));
           cli.setCelular(rs.getString("celular"));
           cli.setTelefono(rs.getString("telefono"));
           cli.setEmail(rs.getString("email"));
           cli.setDireccion(rs.getString("direccion"));
           
           aggcliente.add(cli);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlCliente.class.getName()).log(Level.SEVERE, null, ex);
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
  return aggcliente;
}
 
    public void mostrarCliente (String v) {

    String [] columnas ={"CODIGO","NOMBRE Y APELLIDO","RUC/CI","CELULAR", "EMAIL"};
    Object[] obj= new Object[5];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
    
        Connection con = getConexion();
        String sql = "SELECT id_cliente, nombre_cli, cedula, celular, email from cliente WHERE nombre_cli LIKE '%"+v+"%' or cedula LIKE '%"+v+"%' ORDER BY id_cliente ASC";

         try {

          Statement  ps = con.createStatement();
        ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

           obj[0]=rs.getInt("id_cliente");
           obj[1]=rs.getString("nombre_cli");
           obj[2]=rs.getString("cedula");
           obj[3]=rs.getString("celular");
           obj[4]=rs.getString("email");
             Tabla.addRow(obj);
            }
            Cliente.tabla_cliente.setModel(Tabla);
             Cliente.tabla_cliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Cliente.tabla_cliente.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(300);
         columnModel.getColumn(2).setPreferredWidth(130);
         columnModel.getColumn(3).setPreferredWidth(100);
         columnModel.getColumn(4).setPreferredWidth(150);
        } catch (SQLException ex) {
            Logger.getLogger(SqlCliente.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public boolean eliminarUsuario(cliente cli){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "delete from cliente where id_cliente=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, cli.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlCliente.class.getName()).log(Level.SEVERE, null, ex);
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
