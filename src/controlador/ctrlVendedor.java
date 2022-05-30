/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.SqlVendedor;
import Modelo.vendedor;
import Vista.Vendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ctrlVendedor implements ActionListener{
    private vendedor vend;
    private SqlVendedor sqlvend;
    private Vendedor frvendedor;
    
    public ctrlVendedor (vendedor vend, SqlVendedor sqlvend, Vendedor frvendedor){
    
    this.vend=vend;
    this.sqlvend=sqlvend;
    this.frvendedor=frvendedor;
        
    this.frvendedor.btnReg.addActionListener(this);
    this.frvendedor.btnModificar.addActionListener(this);
    this.frvendedor.btnEliminar.addActionListener(this);
    this.frvendedor.btnBuscar.addActionListener(this);
    
    }

    public void iniciar(){
    
    
      sqlvend.mostrarVendedor("");
    frvendedor.PanelPestaña.setEnabledAt(1, false);
      frvendedor.PanelPestaña.setEnabledAt(2, false);
    
    }
    
    
  
    @Override
    public void actionPerformed(ActionEvent ae) {
          // Boton Registrar 
       if(ae.getSource()== frvendedor.btnReg){
          
       registrar();
        frvendedor.txt_cod.requestFocus();
    }
       if(ae.getSource()== frvendedor.btnModificar){
          
       modificar();
        frvendedor.txt_cod.requestFocus();
    }
       // Boton Buscar usuariohh
        if(ae.getSource()== frvendedor.btnbuscarusu){
          
       
    }
    }
    
      public void registrar(){
          if(this.frvendedor.PanelPestaña.getSelectedIndex()==0 || this.frvendedor.PanelPestaña.getSelectedIndex()==2){
            frvendedor.PanelPestaña.setSelectedIndex(1);
            frvendedor.txt_cod.setEnabled(false);
        frvendedor.PanelPestaña.setEnabledAt(0, false);
      frvendedor.PanelPestaña.setEnabledAt(2, false);
      frvendedor.PanelPestaña.setEnabledAt(1, true);
     
      //  frusu.panel_reg.setVisible(true);
        }else{
              //frprov.txt_cod.getText().equals("")||
      if( Vendedor.txt_nomp.getText().equals("") || frvendedor.txt_ci.getText().equals("") || 
              frvendedor.txt_celular.getText().equals("") || Vendedor.combo_tipo.getSelectedItem().equals("Seleccione una opción") ||
              frvendedor.txt_comision.getText().equals("") || frvendedor.txt_direc.getText().equals("")
              || frvendedor.txt_salario.getText().equals("") || Vendedor.txt_email.getText().equals("")
              || frvendedor.txt_obs.getText().equals(""))
          
        { 
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            
             vend.setId_usuario(Vendedor.txt_nomp.getText());
            vend.setCedula(frvendedor.txt_ci.getText());
            vend.setCelular(frvendedor.txt_celular.getText());
            vend.setDireccion(frvendedor.txt_direc.getText());
            vend.setObservacion(frvendedor.txt_obs.getText());
            
             if(Vendedor.combo_tipo.getSelectedItem().toString().equals("Administrador")){
                 vend.setId_estado(1);
            }else{
                vend.setId_estado(2);
            }
      //      vend.setId_estado(Vendedor.combo_estado.getSelectedItem().toString());
            vend.setComision(Integer.parseInt(frvendedor.txt_comision.getText()));
             vend.setSalario(Integer.parseInt(frvendedor.txt_salario.getText()));
             vend.setCorreo(Vendedor.txt_email.getText());
            
            if(sqlvend.registrar_vend(vend)){
       JOptionPane.showMessageDialog(null, "Registro Guardado");
       limpiar_reg();
    sqlvend.mostrarVendedor("");
 //    frcliente.PanelPestaña.setSelectedIndex(0);
    
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Guardar");   
       
      }
        }
     }}
      
      
      public void modificar(){
          
               int fila = Vendedor.tabla_vendedor.getSelectedRow();
           if(fila<0){
                
            JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           frvendedor.PanelPestaña.setSelectedIndex(0);
            frvendedor.PanelPestaña.setEnabledAt(0, true);
      frvendedor.PanelPestaña.setEnabledAt(2, false);
      frvendedor.PanelPestaña.setEnabledAt(1, false);
            }else {
          
          if(this.frvendedor.PanelPestaña.getSelectedIndex()==0 || this.frvendedor.PanelPestaña.getSelectedIndex()==1){
            frvendedor.PanelPestaña.setSelectedIndex(2);
            frvendedor.txt_cod.setEnabled(false);
        frvendedor.PanelPestaña.setEnabledAt(0, false);
      frvendedor.PanelPestaña.setEnabledAt(1, false);
     frvendedor.PanelPestaña.setEnabledAt(2, true);
      //  frusu.panel_reg.setVisible(true);
        }else{
              //frprov.txt_cod.getText().equals("")||
      if( Vendedor.txt_nomp.getText().equals("") || frvendedor.txt_ci.getText().equals("") || 
              frvendedor.txt_celular.getText().equals("") || Vendedor.combo_tipo.getSelectedItem().equals("Seleccione una opción") ||
              frvendedor.txt_comision.getText().equals("") || frvendedor.txt_direc.getText().equals("")
              || frvendedor.txt_salario.getText().equals("") || Vendedor.txt_email.getText().equals("")
              || frvendedor.txt_obs.getText().equals(""))
          
        { 
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            
             vend.setId_usuario(Vendedor.txt_nomp.getText());
            vend.setCedula(frvendedor.txt_ci.getText());
            vend.setCelular(frvendedor.txt_celular.getText());
            vend.setDireccion(frvendedor.txt_direc.getText());
            vend.setObservacion(frvendedor.txt_obs.getText());
            
             if(Vendedor.combo_tipo.getSelectedItem().toString().equals("Administrador")){
                 vend.setId_estado(1);
            }else{
                vend.setId_estado(2);
            }
      //      vend.setId_estado(Vendedor.combo_estado.getSelectedItem().toString());
            vend.setComision(Integer.parseInt(frvendedor.txt_comision.getText()));
             vend.setSalario(Integer.parseInt(frvendedor.txt_salario.getText()));
             vend.setCorreo(Vendedor.txt_email.getText());
            
            if(sqlvend.modificar_vend(vend)){
       JOptionPane.showMessageDialog(null, "Modificación Guardada");
       limpiar_reg();
    sqlvend.mostrarVendedor("");
 //    frcliente.PanelPestaña.setSelectedIndex(0);
    
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Guardar");   
       
      }
        }
     }
   }
  }
           
    
       public void limpiar_reg(){
     
frvendedor.txt_cod.setText("");
Vendedor.txt_nomp.setText("");
frvendedor.txt_ci.setText("");
frvendedor.txt_celular.setText("");
frvendedor.txt_direc.setText("");
frvendedor.txt_obs.setText("");
Vendedor.combo_tipo.removeAllItems();
frvendedor.txt_comision.setText("");
frvendedor.txt_salario.setText("");
Vendedor.txt_email.setText("");
     }  
}
