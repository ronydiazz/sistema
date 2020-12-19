/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import controlador.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SqlUsuarios extends Conexion {

    public boolean registrar(usuarios usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO usuarios (usuario, contraseña, nombre, correo, id_tipo) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorreo());
            
            ps.setInt(5, usr.getId_tipo());
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

    public int existeUsusario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(id_usuario) FROM usuarios WHERE usuario=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usuario);
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

    public boolean esEmail(String correo) {
        //patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        //"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+) * (\\.[A-Za-z] {2,})$");
        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }

    public boolean modificar (usuarios usr) {

        PreparedStatement ps = null;
        
        Connection con = getConexion();
        String sql = "UPDATE usuarios SET usuario=?, contraseña=?, nombre=?, correo=?, "
                + "id_tipo=? WHERE id_usuario=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorreo());
            ps.setInt(5, usr.getId_tipo());
            ps.setInt(6, usr.getId());
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
    
     public boolean contraseña_actual (usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT contraseña from usuarios WHERE id_usuario=?";

         try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(1))) {
       
      //              ps.execute();

                    return true;
                    
                } else {

                    return false;
                }

            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
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
    public boolean login(usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT id_usuario, usuario, contraseña, nombre, id_tipo, nombretipo"
                + " FROM usuarios INNER JOIN tipo_usuario ON id_tipo=id_tipousuario WHERE usuario=?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(3))) {

                    String sqlUpdate = "UPDATE usuarios SET last_session=? WHERE id_usuario=?";
                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getLast_session());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    usr.setNombre_tipo(rs.getString(6));
                    return true;
                    
                } else {

                    return false;
                }

            }
           return false;
           

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
            return false;
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
    
 public List mostrarUsuarios () {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT id_usuario, usuario, nombre, correo, nombretipo "
                + "from usuarios inner join tipo_usuario on usuarios.id_tipo=tipo_usuario.id_tipousuario ";
        List listaUsuarios = new ArrayList();

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           usuarios usu = new usuarios();
           usu.setId(rs.getInt("id_usuario"));
           usu.setUsuario(rs.getString("usuario"));
           usu.setNombre(rs.getString("nombre"));
           usu.setCorreo(rs.getString("correo"));
           usu.setNombre_tipo(rs.getString("nombretipo"));
           listaUsuarios.add(usu);
        
            }
           

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
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
        return listaUsuarios;

    }
 
    
    /*
     public void mostrarUsuarios () {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT id_usuario, usuario, nombre, correo, nombretipo "
                + "from usuarios inner join tipo_usuario on usuarios.id_tipo=tipo_usuario.id_tipousuario ";
     

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();
           
         ResultSetMetaData rsMd = rs.getMetaData();
         int cantidadColumnas = rsMd.getColumnCount();
            while (rs.next()) {

           usuarios usu = new usuarios();
           Object[] filas = new Object[cantidadColumnas];
           
            for(int i = 0; i<cantidadColumnas; i++){
            filas[i]= rs.getObject(i+1);
            }
         Tabla.addRow(filas);
            }
           

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
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
*/
    
 public boolean eliminarUsuario(usuarios usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "delete from usuarios where id_usuario=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, usr.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                 
                return true;

            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return false;
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
 
 
