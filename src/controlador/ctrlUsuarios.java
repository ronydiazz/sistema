
package controlador;


import Interfaz.Menu;
import Interfaz.Usuarios;

import Modelo.SqlUsuarios;
import Modelo.hash;
import Modelo.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


public class ctrlUsuarios implements ActionListener  {
    
    private usuarios usu;
    private SqlUsuarios sqlusu;
    private Usuarios frusu;
    public static Menu frmenu;
    public ctrlUsuarios (usuarios usu, SqlUsuarios sqlusu, Usuarios frusu){
    
    this.usu= usu;
    this.sqlusu=sqlusu;
    this.frusu= frusu;
    this.frusu.btnRegUsuario.addActionListener(this);
    this.frusu.btnModificarProv.addActionListener(this);
    this.frusu.btnEliminarProv.addActionListener(this);
     frusu.txt_bus.addKeyListener(tecla);
    }
    
    public void iniciar(){
       SqlUsuarios.cargar("");
      bloqueoform();
    }
    

    @Override
    public void actionPerformed(ActionEvent e){
    //Boton Registrar
    if(e.getSource() == frusu.btnRegUsuario){
        if(this.frusu.tablepane.getSelectedIndex()==0 || this.frusu.tablepane.getSelectedIndex()==2){
            frusu.tablepane.setSelectedIndex(1);
      //  frusu.panel_reg.setVisible(true);
        }else{
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
                            limpiar_reg();
                             SqlUsuarios.cargar("");
                            frusu.tablepane.setSelectedIndex(0);
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
    }
    
    //Boton Modificar
    if(e.getSource() == frusu.btnModificarProv){
        int fila= Usuarios.tabla_usu.getSelectedRow();
                    if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           frusu.tablepane.setSelectedIndex(0);
            }else {
                        
         if(this.frusu.tablepane.getSelectedIndex()==0 || this.frusu.tablepane.getSelectedIndex()==1){
        frusu.tablepane.setSelectedIndex(2);
        
        mostrar_mod();
        }else {
        
     usuarios mod1 = new usuarios();
        String pas_act = new String(frusu.txtPasswordA1.getPassword());
        String pass_actual = hash.sha1(pas_act);
        String pass = new String(frusu.txtPassword1.getPassword());
        String passCon = new String(frusu.txtConfirmarPassword1.getPassword());
        String nuevoPass = hash.sha1(pass);

        if (frusu.txtUsuario1.getText().equals("") || passCon.equals("") || frusu.txtNombre1.getText().equals("") || frusu.txtCorreo1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            
        } else {
            mod1.setId(Integer.parseInt(frusu.txt_cod1.getText()));
            mod1.setPassword(pass_actual);
            
            if(sqlusu.contraseña_actual(mod1)){
                
               if (pass.equals(passCon)) {
                    if (sqlusu.esEmail(frusu.txtCorreo1.getText())) {
                        usu.setUsuario(frusu.txtUsuario1.getText());
                        usu.setPassword(nuevoPass);
                        usu.setNombre(frusu.txtNombre1.getText());
                        usu.setCorreo(frusu.txtCorreo1.getText());
                        
                         if(frusu.combo_tipo1.getSelectedItem().toString().equals("Administrador")){
                       usu.setId_tipo(1);
                       }else{
                       usu.setId_tipo(2);
                       }
                     
                        usu.setId(Integer.parseInt(frusu.txt_cod1.getText()));

                        if (sqlusu.modificar(usu)) {
                            JOptionPane.showMessageDialog(null, "Modificación Guardada");
                            limpiar_mod();
                             SqlUsuarios.cargar("");
                            frusu.tablepane.setSelectedIndex(0);
                            
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
  }
 }
    
    //Boton Eliminar
      if(e.getSource() == frusu.btnEliminarProv){
      
        int fila= Usuarios.tabla_usu.getSelectedRow();
        
            if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           frusu.tablepane.setSelectedIndex(0);
            }else {
                 int ide = Integer.parseInt(Usuarios.tabla_usu.getValueAt(fila, 0).toString());
                 usu.setId(ide);
                if(JOptionPane.showConfirmDialog(null, "¿Eliminar el registro?", "",
                        JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(sqlusu.eliminarUsuario(usu)){
                    
                JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
      //          Tabla.removeRow(fila);
              SqlUsuarios.  cargar("");
                }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
             }
         }
      }
  }
   
    KeyListener tecla = new KeyListener(){
        
        @Override
        public void keyReleased(KeyEvent ke) {
         if(ke.getSource()==frusu.txt_bus){
         SqlUsuarios. cargar(frusu.txt_bus.getText());
         }  
        }

        @Override
        public void keyTyped(KeyEvent ke) {
           }
        @Override
        public void keyPressed(KeyEvent ke) {
          }
    };
    
    public void limpiar_reg(){
    // this.frusu.txt_cod.setText("");
     this.frusu.txtUsuario.setText("");
     this.frusu.txtPassword.setText("");
     this.frusu.txtConfirmarPassword.setText("");
     this.frusu.txtNombre.setText("");
     this.frusu.txtCorreo.setText("");
     }
     
    public void mostrar_mod(){
   // ModificarUsuario =null;

   
       int fila = Usuarios.tabla_usu.getSelectedRow();
       frusu.txt_cod1.setText(String.valueOf(Usuarios.tabla_usu.getValueAt(fila, 0)));
       frusu.txtUsuario1.setText(String.valueOf(Usuarios.tabla_usu.getValueAt(fila, 1)));
       frusu.txtNombre1.setText(String.valueOf(Usuarios.tabla_usu.getValueAt(fila, 2)));
       frusu.txtCorreo1.setText(String.valueOf(Usuarios.tabla_usu.getValueAt(fila, 3)));
       frusu.combo_tipo1.setSelectedItem(String.valueOf(Usuarios.tabla_usu.getValueAt(fila, 4)));
    }
     
    public void limpiar_mod(){
     this.frusu.txt_cod1.setText("");
     this.frusu.txtUsuario1.setText("");
     this.frusu.txtPasswordA1.setText("");
     this.frusu.txtPassword1.setText("");
     this.frusu.txtConfirmarPassword1.setText("");
     this.frusu.txtNombre1.setText("");
     this.frusu.txtCorreo1.setText("");
     }
    
    public void bloqueoform(){
    
      
     
    }
}



