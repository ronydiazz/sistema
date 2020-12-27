/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaz.Productos;
import Interfaz.Usuarios;
import Modelo.SqlProductos;
import Modelo.SqlUsuarios;
import Modelo.productos;
import Modelo.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


public class ctrlProductos implements ActionListener {

    private productos pro;
    private SqlProductos sqlpro;
    private Productos frpro;
    
    public ctrlProductos (usuarios usu, SqlUsuarios sqlusu, Usuarios frusu){
    this.pro=pro;
    this.sqlpro=sqlpro;
    this.frpro=frpro;
    this.frpro.btnRegProducto.addActionListener(this);
    this.frpro.btnModificar.addActionListener(this);
    this.frpro.btnEliminar.addActionListener(this);
    this.frpro.btnCategoria.addActionListener(this);
    this.frpro.btnMarca.addActionListener(this);
    this.frpro.txt_buscod.addKeyListener(tecla);
    this.frpro.txt_busdesc.addKeyListener(tecla);
    
    }
     public void iniciar(){
       SqlProductos.cargar("");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      // Boton Registrar Producto
      if(ae.getSource()== frpro.btnRegProducto){
        if(this.frpro.jTabbedPane1.getSelectedIndex()==2 || this.frpro.jTabbedPane1.getSelectedIndex()==3){
         frpro.jTabbedPane1.setSelectedIndex(1);
        }else{
        
            if(frpro.txt_cod.getText().equals("") || frpro.txt_desc.getText().equals("") || frpro.txt_costo.getText().equals("") ||frpro.txt_venta.getText().equals("") || frpro.txt_mayo.getText().equals("") || frpro.txt_descue.getText().equals("") || frpro.txt_iva.getText().equals("") || frpro.txt_obs.getText().equals("")){
       JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
       }else{
      if(sqlpro.existeProducto(frpro.txt_cod.getText()) == 0){
       pro.setCodigo(frpro.txt_cod.getText());
       pro.setDescripcion(frpro.txt_desc.getText());
       pro.setPrecio_costo(Float.parseFloat(frpro.txt_costo.getText()));
       pro.setPrecio_venta(Float.parseFloat(frpro.txt_venta.getText()));
       pro.setPrecio_mayor(Float.parseFloat(frpro.txt_mayo.getText()));
       pro.setDescuento(Float.parseFloat(frpro.txt_descue.getText()));
       pro.setIva(Integer.parseInt(frpro.txt_iva.getText()));
       pro.setStock(Integer.parseInt(frpro.txt_stock.getText()));
       pro.setObs(frpro.txt_obs.getText());
       pro.setId_proveedor(frpro.combo_pro.getSelectedItem().toString());
       pro.setId_marca(frpro.como_marca.getSelectedItem().toString());
       pro.setUnidad_med(frpro.combo_medida.getSelectedItem().toString());
       
       

      if(sqlpro.registrar(pro)){
       JOptionPane.showMessageDialog(null, "Registro Guardado");
         limpiar();
         SqlProductos.cargar("");
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Guardar");   
       
      }
      } else {

             JOptionPane.showMessageDialog(null, "El producto ya existe");

           }
        }
      }
    }
      
      // Boton Modificar Producto
      if(ae.getSource()== frpro.btnRegProducto){
         int fila = Productos.tabla_prod.getSelectedRow();
         
          if(fila<0){
          JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
           }else{
              
           if(this.frpro.jTabbedPane1.getSelectedIndex()==2 || this.frpro.jTabbedPane1.getSelectedIndex()==3){
            frpro.jTabbedPane1.setSelectedIndex(1);
            mostrar();
            }else{
              if(frpro.txt_cod.getText().equals("") || frpro.txt_desc.getText().equals("") || frpro.txt_costo.getText().equals("") ||frpro.txt_venta.getText().equals("") || frpro.txt_mayo.getText().equals("") || frpro.txt_descue.getText().equals("") || frpro.txt_iva.getText().equals("") || frpro.txt_obs.getText().equals("")){
       JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
       }else{
      if(sqlpro.existeProducto(frpro.txt_cod.getText()) == 0){
       pro.setCodigo(frpro.txt_cod.getText());
       pro.setDescripcion(frpro.txt_desc.getText());
       pro.setPrecio_costo(Float.parseFloat(frpro.txt_costo.getText()));
       pro.setPrecio_venta(Float.parseFloat(frpro.txt_venta.getText()));
       pro.setPrecio_mayor(Float.parseFloat(frpro.txt_mayo.getText()));
       pro.setDescuento(Float.parseFloat(frpro.txt_descue.getText()));
       pro.setIva(Integer.parseInt(frpro.txt_iva.getText()));
       pro.setStock(Integer.parseInt(frpro.txt_stock.getText()));
       pro.setObs(frpro.txt_obs.getText());
       pro.setId_proveedor(frpro.combo_pro.getSelectedItem().toString());
       pro.setId_marca(frpro.como_marca.getSelectedItem().toString());
       pro.setUnidad_med(frpro.combo_medida.getSelectedItem().toString());
       
       

      if(sqlpro.registrar(pro)){
       JOptionPane.showMessageDialog(null, "Registro Guardado");
      limpiar();
      SqlProductos.cargar("");
      }else{
      
       JOptionPane.showMessageDialog(null, "Error al Guardar");   
       
      }
      } else {

             JOptionPane.showMessageDialog(null, "El producto ya existe");

           }
        }
            
        }
      }
    }
      
      // Boton Eliminar Producto
      if(ae.getSource()== frpro.btnEliminar){
       int fila = Productos.tabla_prod.getSelectedRow();
       String ide = Productos.tabla_prod.getValueAt(fila, 0).toString();
        
       if(fila<0){
       JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
       }else{
       pro.setCodigo(ide);
       if(JOptionPane.showConfirmDialog(null, "Eliminar el registro?", "", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
       if(sqlpro.eliminar(pro)){
      JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
      SqlProductos.cargar("");
       }else {
       JOptionPane.showMessageDialog(null, "Error al eliminar", "Informacion", JOptionPane.OK_CANCEL_OPTION);
       }
      }
     }
    }
      
      // Boton Gestionar Categoria
      // Boton Gestionar Marca
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
            if(ke.getSource()==frpro.txt_buscod){
           SqlProductos.cargar(frpro.txt_buscod.getText());
            }
         
            if(ke.getSource()==frpro.txt_busdesc){
           SqlProductos.cargar(frpro.txt_busdesc.getText()); 
            }
        }
    };
    
    public void mostrar(){
    int fila = Productos.tabla_prod.getSelectedRow();
    frpro.txt_cod.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 0)));
    frpro.txt_desc.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 1)));
    frpro.txt_costo.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 2)));
    frpro.txt_venta.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 3)));
    frpro.txt_mayo.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 4)));
    frpro.txt_descue.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 5)));
    frpro.txt_iva.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 6)));
    frpro.txt_stock.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 7)));
    frpro.txt_obs.setText(String.valueOf(Productos.tabla_prod.getValueAt(fila, 8)));
    frpro.combo_pro.setSelectedItem(String.valueOf(Productos.tabla_prod.getValueAt(fila, 9)));
    frpro.como_marca.setSelectedItem(String.valueOf(Productos.tabla_prod.getValueAt(fila, 10)));
    frpro.combo_medida.setSelectedItem(String.valueOf(Productos.tabla_prod.getValueAt(fila, 11)));
    }
    
    void limpiar(){
     frpro.txt_cod.setText("");
    frpro.txt_desc.setText("");
    frpro.txt_costo.setText("");
    frpro.txt_venta.setText("");
    frpro.txt_mayo.setText("");
    frpro.txt_descue.setText("");
    frpro.txt_iva.setText("");
    frpro.txt_stock.setText("");
    frpro.txt_obs.setText("");
    frpro.combo_pro.setSelectedItem("");
    frpro.como_marca.setSelectedItem("");
    frpro.combo_medida.setSelectedItem("");
    }
}
