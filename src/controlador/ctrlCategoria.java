
package controlador;

import Interfaz.Productos;
import Modelo.SqlCategoria;
import Modelo.categoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ctrlCategoria implements ActionListener {
    
    private categoria cat;
    private SqlCategoria categ;
    private Productos frpro;
    
    public ctrlCategoria(){
   
        frpro.btnCategoria.addActionListener(this);
        frpro.btnGuardar_c.addActionListener(this);
        frpro.btnModificar_c.addActionListener(this);
        frpro.btnEliminar_c.addActionListener(this);
        frpro.txt_buscar_c.addKeyListener(tecla);
    }
    
    public void iniciar(){
   // SqlCategoria m = new SqlCategoria();
    categ.mostrarCategoria("");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    //BtnCategoria
    if(ae.getSource()==frpro.btnCategoria){
     if(frpro.jTabbedPane1.getSelectedIndex()==0 || frpro.jTabbedPane1.getSelectedIndex()==1 || frpro.jTabbedPane1.getSelectedIndex()==3){
          categ.mostrarCategoria("");
     frpro.jTabbedPane1.setSelectedIndex(2);
     }else{
    //BtnGuardar 
     if(ae.getSource()==frpro.btnGuardar_c){
   
        if(frpro.txt_desc_c.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{

            cat.setDescripcion_c(frpro.txt_desc_c.getText());
            if(frpro.combo_estado_c.getSelectedItem().toString().equals("Activo")){
                cat.setEstado(1);
            }else{
                cat.setEstado(2);
            }
            if(categ.registrar_categoria(cat)){

                JOptionPane.showMessageDialog(null, "Registro Guardado");
            //    tablaMarca();

            }else{

                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        }
     }
    //BtnModificar
      if(ae.getSource()==frpro.btnModificar_c){
         if(frpro.txt_desc_c.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{

            cat.setDescripcion_c(frpro.txt_desc_c.getText());
            if(frpro.combo_estado_c.getSelectedItem().toString().equals("Activo")){
                cat.setEstado(1);
            }else{
                cat.setEstado(2);
            }
            if(categ.modificar(cat)){

                JOptionPane.showMessageDialog(null, "Modificación Guardada");
            //    tablaMarca();

            }else{

                JOptionPane.showMessageDialog(null, "Error al Modificar");

            }
        }
     }
    //BtnEliminar
      if(ae.getSource()==frpro.btnEliminar_c){
     int fila= frpro.tabla_categoria.getSelectedRow();
        int id =Integer.parseInt(frpro.tabla_categoria.getValueAt(fila, 0).toString());
        DefaultTableModel Tabla = new DefaultTableModel();
        try {
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");

            }else {
               cat.setId_categoria(id);
                if(JOptionPane.showConfirmDialog(null, "¿Eliminar el registro?", "",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(categ.eliminarCategoria(cat)){
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
            if(ke.getSource()==frpro.txt_buscar_c){
                
                 categ.mostrarCategoria(frpro.txt_buscar_c.getText());
            
            }
       }
    };
    
}
