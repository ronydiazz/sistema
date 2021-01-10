
package controlador;

import Interfaz.Productos;
import Modelo.SqlCategoria;
import Modelo.SqlEstado;
import Modelo.categoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


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
        Productos.tabla_categoria.addMouseListener(mous);
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
     //   mostrar_categ();
     frpro.txt_cod_c.setEnabled(false);
     SqlCategoria.mostrarCategoria("");
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
    
    MouseListener mous= new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            
            mostrar_entxt();
       }

        @Override
        public void mousePressed(MouseEvent me) {
       }

        @Override
        public void mouseReleased(MouseEvent me) {
       }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
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
         
              //        mostrar_categ();
              SqlCategoria.mostrarCategoria("");
            }else{

                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        }
    }
    
     public void modificar(){
        int fila= Productos.tabla_categoria.getSelectedRow();
  
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");

            }else if(JOptionPane.showConfirmDialog(null, "¿Modificar registro?", "",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                 if(frpro.txt_desc_c.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
                     
                 cat.setDescripcion_c(frpro.txt_desc_c.getText());
            if(frpro.combo_estado_c.getSelectedItem().toString().equals("Activo"))
            {cat.setEstado(1); }else{ cat.setEstado(2);}
            
              if(categ.modificar(cat)){
           
                    JOptionPane.showMessageDialog(null, "Modificado correctamente", "Información", JOptionPane.OK_OPTION);
             
                    SqlCategoria.mostrarCategoria("");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al modificar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
            }
      } 
 }
    
     public void eliminar(){
        int fila= Productos.tabla_categoria.getSelectedRow();
        
        try {
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");

            }else {
                
        int id =Integer.parseInt(Productos.tabla_categoria.getValueAt(fila, 0).toString());
               cat.setId_categoria(id);
                if(JOptionPane.showConfirmDialog(null, "¿Eliminar el registro?", "",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(categ.eliminarCategoria(cat)){
               //     tablaMarca();
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
             
                             // mostrar_categ();
                              SqlCategoria.mostrarCategoria("");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
            }
        }
    

        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
     
     public void mostrar_entxt(){
    int fila = Productos.tabla_categoria.getSelectedRow();
 //   String codigo= Productos.tabla_categoria.getValueAt(fila, 0).toString();
    
    try{
      
 //    SqlCategoria.mostrarCategoria(codigo);
   
    frpro.txt_cod_c.setText(String.valueOf(Productos.tabla_categoria.getValueAt(fila, 0)));
      frpro.txt_desc_c.setText(String.valueOf(Productos.tabla_categoria.getValueAt(fila, 1)));
    frpro.combo_estado_c.setSelectedItem(String.valueOf(Productos.tabla_categoria.getValueAt(fila, 2)));
  
        
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
        
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
//    public void mostrar_categ(){
//         
//    String [] columnas ={"CODIGO","DESCRIPCION","ESTADO"};
//    Object[] obj= new Object[3];
//    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
//    List ls;
//    try{
//    ls= SqlCategoria.mostrarCategoria("");
//    for (int i=0;i<ls.size(); i++){
//        cat = (categoria) ls.get(i);
//        obj[0] = cat.getId_categoria();
//        obj[1] = cat.getDescripcion_c();
//        obj[2] = cat.getNombre_est(); 
//        Tabla.addRow(obj);
//    }
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
    
//    public void mostrar_entxt(){
//    int fila = Productos.tabla_categoria.getSelectedRow();
//    
//    String codigo= Productos.tabla_categoria.getValueAt(fila, 0).toString();
//    List ls;
//    try{
//        ls=SqlCategoria.mostrarCategoria(codigo);
//        
//    for(int i= 0; i<ls.size();i++){
//    cat= (categoria) ls.get(i);
//    frpro.txt_cod_c.setText(Integer.toString(cat.getId_categoria()));
//    frpro.combo_estado_c.setSelectedItem(cat.getNombre_est());
//    frpro.txt_desc_c.setText(cat.getDescripcion_c());
//        }
//    }catch(Exception e){
//    JOptionPane.showMessageDialog(null, e);
//    }
//        
//    }
}
