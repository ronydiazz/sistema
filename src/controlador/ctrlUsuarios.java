
package controlador;


import Interfaz.Usuarios;
import Modelo.Conexion;

import Modelo.SqlUsuarios;
import Modelo.hash;
import Modelo.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ctrlUsuarios implements ActionListener {
    
    private usuarios usu;
    private SqlUsuarios sqlusu;
    private Usuarios frusu;
    
    public ctrlUsuarios (usuarios usu, SqlUsuarios sqlusu, Usuarios frusu){
    
    this.usu= usu;
    this.sqlusu=sqlusu;
    this.frusu= frusu;
    this.frusu.btnRegUsuario.addActionListener(this);
    this.frusu.btnModificarProv.addActionListener(this);
    this.frusu.btnEliminarProv.addActionListener(this);
    this.frusu.txt_bus.addActionListener(this);
    }
    public void iniciar(){
       frusu.setVisible(true);
    }
  public void cargar(String valor){
         
    String mostrar="SELECT id_usuario, usuario, nombre, correo, nombreTipo from usuarios inner join tipo_usuario on usuarios.id_tipo=tipo_usuario.id_tipousuario WHERE nombre LIKE '%"+valor+"%'";
    String []titulos={"ID","USUARIO","NOMBRE","CORREO","TIPO"};
    String []Registros=new String[5];
    DefaultTableModel model= new DefaultTableModel(null,titulos);
  
          Conexion cc = new Conexion(); 
        try {
          Connection cn=cc.getConexion();
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("id_usuario");
                  Registros[1]= rs.getString("usuario");
                  Registros[2]= rs.getString("nombre");
                  Registros[3]= rs.getString("correo");
                  Registros[4]= rs.getString("nombreTipo");        
                  model.addRow(Registros);
              }
              frusu.tabla_usu.setModel(model);
              frusu.tabla_usu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = frusu.tabla_usu.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(50);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
         columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
    
    @Override
    public void actionPerformed(ActionEvent e){
    //Boton Registrar
    if(e.getSource() == frusu.btnRegUsuario){
    String pass = new String(frusu.txtPassword.getPassword());
        String passCon = new String(frusu.txtConfirmarPassword.getPassword());

        if (frusu.txtUsuario.getText().equals("") || passCon.equals("") || frusu.txtNombre.getText().equals("") || frusu.txtCorreo.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            
        } else {

            if (pass.equals(passCon)) {

                if (sqlusu.existeUsusario(frusu.txtUsuario.getText()) == 0) {

                    if (sqlusu.esEmail(frusu.txtCorreo.getText())) {

                        String nuevoPass = hash.sha1(pass);

                        usu.setUsuario(frusu.txtUsuario.getText());
                        usu.setPassword(nuevoPass);
                        usu.setNombre(frusu.txtNombre.getText());
                        usu.setCorreo(frusu.txtCorreo.getText());
                        
                       if(frusu.combo_tipo.getSelectedItem().toString().equals("Administrador")){
                       usu.setId_tipo(1);
                       }else{
                       usu.setId_tipo(2);
                       }
                        
                        if (sqlusu.registrar(usu)) {
                            JOptionPane.showMessageDialog(null, "Registro guardado");

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                        }
                    } else {
                         JOptionPane.showMessageDialog(null,"El correo electronico no es valido");
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "El usuario ya existe");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contranseñas no coiciden");
            }
        }
    }
    
    //Boton Modificar
    if(e.getSource() == frusu.btnModificarProv){
        
     usuarios mod1 = new usuarios();
        String pas_act = new String(frusu.txtPasswordA.getPassword());
        String pass_actual = hash.sha1(pas_act);
        String pass = new String(frusu.txtPassword.getPassword());
        String passCon = new String(frusu.txtConfirmarPassword.getPassword());
        String nuevoPass = hash.sha1(pass);

        if (frusu.txtUsuario.getText().equals("") || passCon.equals("") || frusu.txtNombre.getText().equals("") || frusu.txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            
        } else {
            mod1.setId(Integer.parseInt(frusu.txt_cod.getText()));
            mod1.setPassword(pass_actual);
            
            if(sqlusu.contraseña_actual(mod1)){
                
               if (pass.equals(passCon)) {
                    if (sqlusu.esEmail(frusu.txtCorreo.getText())) {
                        usu.setUsuario(frusu.txtUsuario.getText());
                        usu.setPassword(nuevoPass);
                        usu.setNombre(frusu.txtNombre.getText());
                        usu.setCorreo(frusu.txtCorreo.getText());
                        
                         if(frusu.combo_tipo.getSelectedItem().toString().equals("Administrador")){
                       usu.setId_tipo(1);
                       }else{
                       usu.setId_tipo(2);
                       }
                     
                        usu.setId(Integer.parseInt(frusu.txt_cod.getText()));

                        if (sqlusu.modificar(usu)) {
                            JOptionPane.showMessageDialog(null, "Modificación Guardada");
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                        }
                    } else {
                         JOptionPane.showMessageDialog(null,"El correo electronico no es valido");
                    }
            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coiciden");
            } 
        } else {

                JOptionPane.showMessageDialog(null, "Las contranseña actual es incorrecta");
            } 
        }
    }
    
    //Boton Eliminar
      if(e.getSource() == frusu.btnEliminarProv){
      
        int fila= frusu.tabla_usu.getSelectedRow();
         int ide = (int)frusu.tabla_usu.getValueAt(fila, 0);
        DefaultTableModel Tabla = new DefaultTableModel();
     
            if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           
            }else {
                 usu.setId(ide);
                if(JOptionPane.showConfirmDialog(null, "¿Eliminar el registro?", "",
                        JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(sqlusu.eliminarUsuario(usu)){
                    
                JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
      //          Tabla.removeRow(fila);
                }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
             }
         }
      }
  }
}


