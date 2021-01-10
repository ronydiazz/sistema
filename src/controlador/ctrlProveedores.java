
package controlador;

import Interfaz.Proveedor;
import static Interfaz.Proveedor.tabla_prov;
import Modelo.SqlProveedor;
import Modelo.proveedor;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


 public class ctrlProveedores implements ActionListener {
     
    private proveedor prov;
    private SqlProveedor sqlprov;
    private Proveedor frprov;
   
    
    public ctrlProveedores (proveedor prov, SqlProveedor sqlprov, Proveedor frprov){
    this.prov=prov;
    this.sqlprov=sqlprov;
    this.frprov=frprov;
    this.frprov.btnRegProv.addActionListener(this);
    this.frprov.btnModificarProv.addActionListener(this);
    this.frprov.btnEliminarProv.addActionListener(this);
     frprov.txt_busdesc.addKeyListener(tecla);
    
  //  this.frpro.Pane_Prod.addChangeListener(evt);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
   if(ae.getSource() == frprov.btnRegProv){
   
   
   }
   if(ae.getSource() == frprov.btnModificarProv){
   
   
    }
   
   if(ae.getSource() == frprov.btnEliminarProv){
   
   
   }
 } 
    
     KeyListener tecla = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
       
        }

        @Override
        public void keyPressed(KeyEvent ke) {
       
        }

        @Override
        public void keyReleased(KeyEvent ke) {
              if(ke.getSource()==frprov.txt_busdesc){
           sqlprov.mostrarProveedores(frprov.txt_busdesc.getText());
        
        }
    }};
     
     public void registrar(){
      if(frprov.txt_cod.getText().equals("")|| frprov.txt_nomp.getText().equals("") || frprov.txt_cont.getText().equals("") || frprov.txt_cont2.getText().equals("") || frprov.txt_sitio.getText().equals("") || frprov.txt_email.getText().equals("") || frprov.txt_direc.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            
            prov.setNombre_prov(frprov.txt_nomp.getText());
            prov.setContacto(frprov.txt_cont.getText());
            prov.setContacto2(frprov.txt_cont2.getText());
            prov.setSitioweb(frprov.txt_sitio.getText());
            prov.setEmail(frprov.txt_email.getText());
            prov.setDireccion_pro(frprov.txt_direc.getText());
            
            if(sqlprov.registrar_prov(prov)){
       JOptionPane.showMessageDialog(null, "Registro Guardado");
    sqlprov.mostrarProveedores("");
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Guardar");   
       
      }
        }
     }
     
     public void modificar(){
         int fila = Proveedor.tabla_prov.getSelectedRow();
         if(fila<0){
                
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           
            }else {
         mostrar_txt();
         }if(JOptionPane.showConfirmDialog(null, "¿Modificar registro?", "",
                    JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
       if(frprov.txt_cod1.getText().equals("")|| frprov.txt_nomp1.getText().equals("") || frprov.txt_cont1.getText().equals("") || frprov.txt_cont3.getText().equals("") || frprov.txt_sitio1.getText().equals("") || frprov.txt_email1.getText().equals("") || frprov.txt_direc1.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            
            prov.setNombre_prov(frprov.txt_nomp1.getText());
            prov.setContacto(frprov.txt_cont1.getText());
            prov.setContacto2(frprov.txt_cont3.getText());
            prov.setSitioweb(frprov.txt_sitio1.getText());
            prov.setEmail(frprov.txt_email1.getText());
            prov.setEmail(frprov.txt_direc1.getText());
            
          if(JOptionPane.showConfirmDialog(null, "¿Modificar registro?", "",
               JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){  
            if(sqlprov.modificar(prov)){
                
       JOptionPane.showMessageDialog(null, "Modificación Guardada");
       sqlprov.mostrarProveedores("");
      
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Modificar");   
       
      }
      }
     }
   }
    }
     
     public void eliminar(){
     
        int fila = tabla_prov.getSelectedRow();
        int id = (int) tabla_prov.getValueAt(fila, 0);
        DefaultTableModel tabla= new DefaultTableModel();
        
        try{
            if(fila<0){
                
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           
            }else {
           prov.setId_prov(id);
           if(JOptionPane.showConfirmDialog(null, "¿Eliminar registro?", "", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
         
            if(sqlprov.eliminarUsuario(prov)){
            JOptionPane.showMessageDialog(null, "Eliminado correctamente","Información", JOptionPane.OK_OPTION);
            sqlprov.mostrarProveedores("");
            tabla.removeRow(id);
           }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);}
                }
            }
            JOptionPane.showMessageDialog(null, "Error al eliminar");
           
           }catch(HeadlessException e){
           JOptionPane.showMessageDialog(null, e);
        
        }
     }
     
     public void mostrar_txt(){
     int fila = Proveedor.tabla_prov.getSelectedRow();
    String codigo;
    codigo=String.valueOf(Proveedor.tabla_prov.getValueAt(fila, 0));
    List ls;
    
    try{
       
        ls=sqlprov.mostrar_en_txt(codigo);
        for(int i = 0; i<ls.size();i++){
            
    prov= (proveedor) ls.get(i);
    frprov.txt_cod1.setText(Integer.toString(prov.getId_prov()));
    frprov.txt_nomp1.setText(prov.getNombre_prov());
    frprov.txt_cont1.setText(prov.getContacto());
    frprov.txt_cont3.setText(prov.getContacto2());
    frprov.txt_sitio1.setText(prov.getSitioweb());
    frprov.txt_email1.setText(prov.getEmail());
    frprov.txt_direc1.setText(prov.getDireccion_pro());
   
        }
    }catch(Exception e){
    System.out.println(e);
    }
     
     }
 }
