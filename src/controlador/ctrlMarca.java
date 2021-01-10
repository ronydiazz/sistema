
package controlador;

import Interfaz.Productos;
import Modelo.SqlEstado;
import Modelo.SqlMarca;
import Modelo.marca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ctrlMarca implements ActionListener {
      
    private marca mar;
    private SqlMarca sqlmarca;
    private Productos frpro;
    
    public ctrlMarca(marca mar, SqlMarca sqlmarca, Productos frpro){
   this.mar=mar;
   this.sqlmarca=sqlmarca;
   this.frpro=frpro;
        this.frpro.btnMarca.addActionListener(this);
        this.frpro.btnGuardar_m.addActionListener(this);
        this.frpro.btnModificar_m.addActionListener(this);
        this.frpro.btnEliminar_m.addActionListener(this);
        this.frpro.txt_bus_m.addKeyListener(tecla);
    }
    
    public void iniciar(){
   // SqlCategoria m = new SqlCategoria();
  //  categ.mostrarCategoria("");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    //BtnCategoria
    if(ae.getSource()==frpro.btnMarca){
     if(frpro.Pane_Prod.getSelectedIndex()==0 || frpro.Pane_Prod.getSelectedIndex()==1 || frpro.Pane_Prod.getSelectedIndex()==2){
          
          frpro.Pane_Prod.setEnabledAt(0, false);
          frpro.Pane_Prod.setEnabledAt(1, false);
          frpro.Pane_Prod.setEnabledAt(2, false);
          frpro.Pane_Prod.setEnabledAt(3, true);
          
        frpro.Pane_Prod.setSelectedIndex(3);
        frpro.txt_cod_m.setEnabled(false);
      SqlMarca.mostrarMarca("");
        SqlEstado est= new SqlEstado();
        est.consultar_estado(frpro.combo_estado_m);
     }
    }   
    //BtnGuardar 
     if(ae.getSource()==frpro.btnGuardar_m){
         
         registrar();
        
     }
    //BtnModificar
      if(ae.getSource()==frpro.btnModificar_m){
           modificar();
     }
    //BtnEliminar
      if(ae.getSource()==frpro.btnEliminar_m){
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
            if(ke.getSource()==frpro.txt_bus_m){
                
                 SqlMarca.mostrarMarca(frpro.txt_bus_m.getText());
            
            }
       }
    };

    public void registrar(){
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
             SqlMarca.mostrarMarca("");

            }else{

                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        }
    }
    
    public void modificar(){
     int fila = Productos.tabla_marca.getSelectedRow();
         
          if(fila<0){
          JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
   
           }else{
              mostrar_entxt();
              if(JOptionPane.showConfirmDialog(null, "¿Modificar registro?", "",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
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
            SqlMarca.mostrarMarca("");

            }else{

                JOptionPane.showMessageDialog(null, "Error al Modificar");

            }
        }
      }
          }
    }
    
    public void eliminar(){
    int fila= Productos.tabla_marca.getSelectedRow();
        try {
            if(fila<0){
                JOptionPane.showMessageDialog(null, "Seleccione alguna fila");

            }else {
                
        int id =Integer.parseInt(Productos.tabla_categoria.getValueAt(fila, 0).toString());
               mar.setCodigo(id);
                if(JOptionPane.showConfirmDialog(null, "¿Eliminar el registro?", "Información",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(sqlmarca.eliminarMarca(mar)){
               //     tablaMarca();
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
                //    Tabla.removeRow(id);
                 SqlMarca.mostrarMarca("");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
            }
        }
    
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
//    public void mostrar_m(){
//         
//    String [] columnas ={"CODIGO","DESCRIPCION","ESTADO"};
//    Object[] obj= new Object[3];
//    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
//    List ls;
//    try{
//    ls= sqlmarca.mostrarMarca("");
//    for (int i=0;i<ls.size(); i++){
//        mar = (marca) ls.get(i);
//        obj[0] = mar.getCodigo();
//        obj[1] = mar.getDescripcion();
//        obj[2] = mar.getNombre_est(); 
//        Tabla.addRow(obj);
//    }
//    frpro.tabla_marca.setModel(Tabla);
//   }catch (Exception e){
// //  e.printStackTrace();
//   System.out.println(e);
//   }
//           frpro.tabla_marca.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//         TableColumnModel columnModel = frpro.tabla_marca.getColumnModel();
//         columnModel.getColumn(0).setPreferredWidth(80);
//         columnModel.getColumn(1).setPreferredWidth(150);
//         columnModel.getColumn(2).setPreferredWidth(200);
//  
//    }
    
     public void mostrar_entxt(){
    int fila = Productos.tabla_marca.getSelectedRow();
    try{
    
        this.frpro.txt_cod_m.setText(String.valueOf(Productos.tabla_marca.getValueAt(fila, 0)));
        this.frpro.txt_desc_m.setText(String.valueOf(Productos.tabla_marca.getValueAt(fila, 1)));
        this.frpro.combo_estado_m.setSelectedItem(String.valueOf(Productos.tabla_marca.getValueAt(fila, 2)));
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
        
    }
}
