
package controlador;

import Interfaz.Productos;
import Modelo.SqlMarca;
import Modelo.marca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ctrlMarca implements ActionListener {
      
    private marca mar;
    private SqlMarca sqlmarca;
    private Productos frpro;
    
    public ctrlMarca(){
   
        frpro.btnMarca.addActionListener(this);
        frpro.btnGuardar_m.addActionListener(this);
        frpro.btnModificar_m.addActionListener(this);
        frpro.btnEliminar_m.addActionListener(this);
        frpro.txt_bus_m.addKeyListener(tecla);
    }
    
    public void iniciar(){
   // SqlCategoria m = new SqlCategoria();
  //  categ.mostrarCategoria("");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    //BtnCategoria
    if(ae.getSource()==frpro.btnCategoria){
     if(frpro.jTabbedPane1.getSelectedIndex()==0 || frpro.jTabbedPane1.getSelectedIndex()==1 || frpro.jTabbedPane1.getSelectedIndex()==2){
          sqlmarca.mostrarMarca("");
     frpro.jTabbedPane1.setSelectedIndex(3);
     }else{
    //BtnGuardar 
     if(ae.getSource()==frpro.btnGuardar_m){
   
        if(frpro.txt_desc_m.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{

            mar.setDescripcion(frpro.txt_desc_m.getText());
            if(frpro.combo_estado_m.getSelectedItem().toString().equals("Activo")){
                mar.setEstado1(1);
            }else{
                mar.setEstado1(2);
            }
            if(sqlmarca.registrar_marca(mar)){

                JOptionPane.showMessageDialog(null, "Registro Guardado");
            //    tablaMarca();

            }else{

                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        }
     }
    //BtnModificar
      if(ae.getSource()==frpro.btnModificar_m){
         if(frpro.txt_desc_m.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{

            mar.setDescripcion(frpro.txt_desc_m.getText());
            if(frpro.combo_estado_m.getSelectedItem().toString().equals("Activo")){
                mar.setEstado1(1);
            }else{
                mar.setEstado1(2);
            }
            if(sqlmarca.modificar(mar)){

                JOptionPane.showMessageDialog(null, "Modificación Guardada");
            //    tablaMarca();

            }else{

                JOptionPane.showMessageDialog(null, "Error al Modificar");

            }
        }
     }
    //BtnEliminar
      if(ae.getSource()==frpro.btnEliminar_m){
     int fila= frpro.tabla_marca.getSelectedRow();
        int id =Integer.parseInt(frpro.tabla_categoria.getValueAt(fila, 0).toString());
        DefaultTableModel Tabla = new DefaultTableModel();
        try {
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");

            }else {
               mar.setCodigo(id);
                if(JOptionPane.showConfirmDialog(null, "¿Eliminar el registro?", "",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(sqlmarca.eliminarMarca(mar)){
               //     tablaMarca();
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
                //    Tabla.removeRow(id);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Error al eliminar");

        }catch (Exception e){
            e.printStackTrace();
        }
     }
     
     }
    }   
   }
    
    KeyListener tecla = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent ke) {
        }

        @Override
        public void keyPressed(KeyEvent ke) {
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if(ke.getSource()==frpro.txt_bus_m){
                
                 sqlmarca.mostrarMarca(frpro.txt_bus_m.getText());
            
            }
       }
    };
    
    public void mostrar_m(){
    
    
    }
}
