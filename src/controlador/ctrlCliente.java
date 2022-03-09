
package controlador;

import Vendedor.Cliente;
import Vendedor.Productos;
import Modelo.SqlEstado;
import Modelo.SqlCliente;
import Modelo.cliente;
import Modelo.marca;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ctrlCliente implements ActionListener {
      
    private cliente cli;
    private SqlCliente sqlcliente;
    private Cliente frcliente;
    
    public ctrlCliente(cliente cli, SqlCliente sqlcliente, Cliente frcliente){
   this.cli=cli;
   this.sqlcliente=sqlcliente;
   this.frcliente=frcliente;
        this.frcliente.btnReg.addActionListener(this);
        this.frcliente.btnModificar.addActionListener(this);
        this.frcliente.btnEliminar.addActionListener(this);
        this.frcliente.btnBuscar.addActionListener(this);
       
        this.frcliente.txt_bus_ci.addKeyListener(tecla);
        this.frcliente.txt_bus_nom.addKeyListener(tecla);
        //  Productos.tabla_marca.addMouseListener(mous);
    }
    
    public void  iniciar(){
   // SqlCategoria m = new SqlCategoria();
  //  categ.mostrarCategoria("");
  sqlcliente.mostrarCliente("");
    frcliente.PanelPestaña.setEnabledAt(1, false);
      frcliente.PanelPestaña.setEnabledAt(2, false);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
    //BtnGuardar
    if(ae.getSource()==frcliente.btnReg){
 registrar();
    }   
    
    //BtnModificar
      if(ae.getSource()==frcliente.btnModificar){
  
          modificar();
          
     }
    //BtnEliminar
      if(ae.getSource()==frcliente.btnEliminar){
        
          eliminar();
     }
      if(ae.getSource()==frcliente.btnBuscar){
        buscar();
        
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
            if(ke.getSource()==frcliente.txt_bus_ci){
                
               sqlcliente.mostrarCliente(frcliente.txt_bus_ci.getText());
            }
            if(ke.getSource()==frcliente.txt_bus_nom){
                
                  sqlcliente.mostrarCliente(frcliente.txt_bus_nom.getText());
            }
       }
    };
    
 MouseListener mous= new MouseListener() {
       
        @Override
        public void mouseClicked(MouseEvent me) {
          //  mostrar_entxt(); 
        
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
 
 
 public void buscar(){
  if(this.frcliente.PanelPestaña.getSelectedIndex()==1 || this.frcliente.PanelPestaña.getSelectedIndex()==2){
 frcliente.PanelPestaña.setSelectedIndex(0);
  frcliente.PanelPestaña.setEnabledAt(0, true);
      frcliente.PanelPestaña.setEnabledAt(2, false);
      frcliente.PanelPestaña.setEnabledAt(1, false);
 }}
 
 
   public void registrar(){
          if(this.frcliente.PanelPestaña.getSelectedIndex()==0 || this.frcliente.PanelPestaña.getSelectedIndex()==2){
            frcliente.PanelPestaña.setSelectedIndex(1);
            frcliente.txt_cod.setEnabled(false);
        frcliente.PanelPestaña.setEnabledAt(0, false);
      frcliente.PanelPestaña.setEnabledAt(2, false);
      frcliente.PanelPestaña.setEnabledAt(1, true);
      //  frusu.panel_reg.setVisible(true);
        }else{
              //frprov.txt_cod.getText().equals("")||
      if( frcliente.txt_nomp.getText().equals("") || frcliente.txt_ci.getText().equals("") || frcliente.txt_celular.getText().equals("") || frcliente.txt_tel.getText().equals("") || frcliente.txt_email.getText().equals("") || frcliente.txt_direc.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            
            cli.setNombre(frcliente.txt_nomp.getText());
            cli.setCedula(frcliente.txt_ci.getText());
            cli.setCelular(frcliente.txt_celular.getText());
            cli.setTelefono(frcliente.txt_tel.getText());
            cli.setEmail(frcliente.txt_email.getText());
            cli.setDireccion(frcliente.txt_direc.getText());
            
            if(sqlcliente.registrar_cli(cli)){
       JOptionPane.showMessageDialog(null, "Registro Guardado");
       limpiar_reg();
    sqlcliente.mostrarCliente("");
 //    frcliente.PanelPestaña.setSelectedIndex(0);
    
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Guardar");   
       
      }
        }
     }}
    
 public void modificar(){
         int fila = Cliente.tabla_cliente.getSelectedRow();
           if(fila<0){
                
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           frcliente.PanelPestaña.setSelectedIndex(0);
            frcliente.PanelPestaña.setEnabledAt(0, true);
      frcliente.PanelPestaña.setEnabledAt(2, false);
      frcliente.PanelPestaña.setEnabledAt(1, false);
            }else {
               
           if(this.frcliente.PanelPestaña.getSelectedIndex()==0 || this.frcliente.PanelPestaña.getSelectedIndex()==1){
            frcliente.PanelPestaña.setSelectedIndex(2);
            frcliente.txt_cod1.setEnabled(false);
              frcliente.PanelPestaña.setEnabledAt(0, false);
      frcliente.PanelPestaña.setEnabledAt(2, true);
      frcliente.PanelPestaña.setEnabledAt(1, false);
             mostrar_txt();
          }else if(frcliente.txt_cod1.getText().equals("")|| frcliente.txt_nomp1.getText().equals("") || frcliente.txt_ci1.getText().equals("") || frcliente.txt_celular1.getText().equals("") || frcliente.txt_tel1.getText().equals("") || frcliente.txt_email1.getText().equals("") || frcliente.txt_direc1.getText().equals(""))
        { 
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            
             cli.setNombre(frcliente.txt_nomp1.getText());
            cli.setCedula(frcliente.txt_ci1.getText());
            cli.setCelular(frcliente.txt_celular1.getText());
            cli.setTelefono(frcliente.txt_tel1.getText());
            cli.setEmail(frcliente.txt_email1.getText());
            cli.setDireccion(frcliente.txt_direc1.getText());
            
          if(JOptionPane.showConfirmDialog(null, "¿Modificar registro?", "",
               JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){  
            if(sqlcliente.modificar(cli)){
                
       JOptionPane.showMessageDialog(null, "Modificación Guardada");
       sqlcliente.mostrarCliente("");
       limpiar();
      
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Modificar");   
       
      }
      }
     
   }
    }
     }
    
    public void eliminar(){  
        
        if(this.frcliente.PanelPestaña.getSelectedIndex()==1 || this.frcliente.PanelPestaña.getSelectedIndex()==2){
            frcliente.PanelPestaña.setSelectedIndex(0);
             frcliente.PanelPestaña.setEnabledAt(0, true);
      frcliente.PanelPestaña.setEnabledAt(2, false);
      frcliente.PanelPestaña.setEnabledAt(1, false);
      //  frusu.panel_reg.setVisible(true);
        }else{
        int fila = Cliente.tabla_cliente.getSelectedRow();
        DefaultTableModel tabla= new DefaultTableModel();
        
        try{
            if(fila<0){
                
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           
            }else {
                
        int id = Integer.parseInt(Cliente.tabla_cliente.getValueAt(fila, 0).toString());
           cli.setCodigo(id);
           if(JOptionPane.showConfirmDialog(null, "¿Eliminar registro?", "", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
         
            if(sqlcliente.eliminarUsuario(cli)){
            JOptionPane.showMessageDialog(null, "Eliminado correctamente","Información", JOptionPane.OK_OPTION);
            sqlcliente.mostrarCliente("");
//            tabla.removeRow(id);
           }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);}
                }
            }
           
           
           }catch(HeadlessException e){
           JOptionPane.showMessageDialog(null, e);
        
        }
     }
    }
    

    
    public void mostrar_txt(){
     int fila = Cliente.tabla_cliente.getSelectedRow();
    String codigo;
    codigo=String.valueOf(Cliente.tabla_cliente.getValueAt(fila, 0));
    List ls;
    
    try{
       
        ls=sqlcliente.mostrar_en_txt(codigo);
        for(int i = 0; i<ls.size();i++){
            
    cli= (cliente) ls.get(i);
    frcliente.txt_cod1.setText(Integer.toString(cli.getCodigo()));
    frcliente.txt_nomp1.setText(cli.getNombre());
    frcliente.txt_ci1.setText(cli.getCedula());
    frcliente.txt_celular1.setText(cli.getCelular());
    frcliente.txt_tel1.setText(cli.getTelefono());
    frcliente.txt_email1.setText(cli.getEmail());
    frcliente.txt_direc1.setText(cli.getDireccion());
   
        }
    }catch(Exception e){
    System.out.println(e);
    }
     
     }
      public void limpiar(){
     
     frcliente.txt_cod1.setText("");
    frcliente.txt_nomp1.setText("");
    frcliente.txt_ci1.setText("");
    frcliente.txt_celular1.setText("");
    frcliente.txt_tel1.setText("");
    frcliente.txt_email1.setText("");
    frcliente.txt_direc1.setText("");
     }   
      public void limpiar_reg(){
     
     frcliente.txt_cod.setText("");
    frcliente.txt_nomp.setText("");
    frcliente.txt_ci.setText("");
    frcliente.txt_celular.setText("");
    frcliente.txt_tel.setText("");
    frcliente.txt_email.setText("");
    frcliente.txt_direc.setText("");
     }   
    }
     
         

