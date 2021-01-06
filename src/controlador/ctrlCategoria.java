
package controlador;

import Interfaz.Productos;
import Modelo.SqlCategoria;
import Modelo.SqlEstado;
import Modelo.categoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ctrlCategoria implements ActionListener {
    
    private categoria cat;
    private SqlCategoria categ;
    private Productos frpro;
    
    public ctrlCategoria(categoria cat, SqlCategoria categ, Productos frpro){
   this.cat=cat;
   this.categ=categ;
   this.frpro=frpro;
        frpro.btnCategoria.addActionListener(this);
        frpro.btnGuardar_c.addActionListener(this);
        frpro.btnModificar_c.addActionListener(this);
        frpro.btnEliminar_c.addActionListener(this);
        frpro.txt_buscar_c.addKeyListener(tecla);
    }
    
    public void iniciar(){
   // SqlCategoria m = new SqlCategoria();
  //  categ.mostrarCategoria("");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    //BtnCategoria
    if(ae.getSource()==frpro.btnCategoria){
     if(frpro.Pane_Prod.getSelectedIndex()==0 || frpro.Pane_Prod.getSelectedIndex()==1 || frpro.Pane_Prod.getSelectedIndex()==3){
    
          frpro.Pane_Prod.setEnabledAt(0, false);
          frpro.Pane_Prod.setEnabledAt(1, false);
          frpro.Pane_Prod.setEnabledAt(2, true);
          frpro.Pane_Prod.setEnabledAt(3, false);
          
          frpro.Pane_Prod.setSelectedIndex(2);
        mostrar_categ();
        SqlEstado est= new SqlEstado(); 
        est.consultar_estado(frpro.combo_estado_c);
        
     } //   }else{
    }  //BtnGuardar 
       if(ae.getSource()==frpro.btnGuardar_c){
        
           registrar();
   
       }
       
      //BtnModificar
      if(ae.getSource()==frpro.btnModificar_c){
          
        modificar();
        
     }
      
      //BtnEliminar
      if(ae.getSource()==frpro.btnEliminar_c){
          
       eliminar();
       
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
                
                 SqlCategoria.mostrarCategoria(frpro.txt_buscar_c.getText());
            
            }
       }
    };
    
    public void registrar(){
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
                      mostrar_categ();
            }else{

                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        }
    }
    
    public void modificar(){
        int fila= frpro.tabla_categoria.getSelectedRow();
  
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");

            }else {
                mostrar_entxt();
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
                mostrar_categ();
            }else{

                JOptionPane.showMessageDialog(null, "Error al Modificar");

            }
        }
    }
 }
    
    public void eliminar(){
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
             
                              mostrar_categ();//    Tabla.removeRow(id);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
            }
        }
    

        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void mostrar_categ(){
         
    String [] columnas ={"CODIGO","DESCRIPCION","ESTADO"};
    Object[] obj= new Object[3];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
    List ls;
    try{
    ls= SqlCategoria.mostrarCategoria("");
    for (int i=0;i<ls.size(); i++){
        cat = (categoria) ls.get(i);
        obj[0] = cat.getId_categoria();
        obj[1] = cat.getDescripcion_c();
        obj[2] = cat.getNombre_est(); 
        Tabla.addRow(obj);
    }
    frpro.tabla_categoria.setModel(Tabla);
   }catch (Exception e){
 //  e.printStackTrace();
   System.out.println(e);
   }
           frpro.tabla_categoria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = frpro.tabla_categoria.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
  
    }
//     public void mostrar_categ(){
//         
//    String [] columnas ={"CODIGO","DESCRIPCION","ESTADO"};
//    Object[] obj= new Object[3];
//    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
//    List ls;
//    try{
//    SqlCategoria.mostrarCategoria2("");
//    for (int i=0;i<ls.size(); i++){
//     //   cat = (categoria) ls.get(i);
//        obj[0] = cat.getId_categoria();
//        obj[1] = cat.getDescripcion_c();
//        obj[2] = cat.getNombre_est(); 
//        Tabla.addRow(obj);
//     }
//    frpro.tabla_categoria.setModel(Tabla);
//   }catch (Exception e){
// //  e.printStackTrace();
//   System.out.println(e);
//   }
//           frpro.tabla_categoria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//         TableColumnModel columnModel = frpro.tabla_categoria.getColumnModel();
//         columnModel.getColumn(0).setPreferredWidth(80);
//         columnModel.getColumn(1).setPreferredWidth(150);
//         columnModel.getColumn(2).setPreferredWidth(200);
//  
//    }
    public void mostrar_entxt(){
    int fila = frpro.tabla_categoria.getSelectedRow();
    
    String codigo= frpro.tabla_categoria.getValueAt(fila, 0).toString();
    List ls;
    try{
        ls=SqlCategoria.mostrarCategoria(codigo);
        
    for(int i= 0; i<ls.size();i++){
    cat= (categoria) ls.get(i);
    frpro.txt_cod_c.setText(Integer.toString(cat.getId_categoria()));
    frpro.combo_estado_c.setSelectedItem(cat.getNombre_est());
    frpro.txt_desc_c.setText(cat.getDescripcion_c());
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
        
    }
}
