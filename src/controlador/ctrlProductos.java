/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaz.Productos;
import Interfaz.Usuarios;
import Modelo.SqlCategoria;
import Modelo.SqlMarca;
import Modelo.SqlProductos;
import Modelo.SqlProveedor;
import Modelo.SqlUsuarios;
import Modelo.productos;
import Modelo.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ctrlProductos implements ActionListener {

    private productos pro;
    private SqlProductos sqlpro;
    private Productos frpro;
    SqlCategoria cate = new SqlCategoria ();
    SqlProveedor prove = new SqlProveedor ();
    SqlMarca marca = new SqlMarca ();
    
    public ctrlProductos (productos pro, SqlProductos sqlpro, Productos frpro){
    this.pro=pro;
    this.sqlpro=sqlpro;
    this.frpro=frpro;
    this.frpro.btnBuscar.addActionListener(this);
    this.frpro.btnRegProducto.addActionListener(this);
    this.frpro.btnModificar.addActionListener(this);
    this.frpro.btnEliminar.addActionListener(this);
    this.frpro.btnCategoria.addActionListener(this);
    this.frpro.btnMarca.addActionListener(this);
    this.frpro.txt_buscod.addKeyListener(tecla);
    this.frpro.txt_busdesc.addKeyListener(tecla);
  //  this.frpro.Pane_Prod.addChangeListener(evt);
    }

 
   public void iniciar(){
       SqlProductos.cargar("");
       frpro.Pane_Prod.setEnabledAt(1, false);
       frpro.Pane_Prod.setEnabledAt(2, false);
       frpro.Pane_Prod.setEnabledAt(3, false);
    }
     
   ActionEvent ae;
   @Override
   public void actionPerformed(ActionEvent ae) {
      // Boton Buscar
      if(ae.getSource()==frpro.btnBuscar){
      buscar();
      }
      // Boton Registrar 
       if(ae.getSource()== frpro.btnRegProducto){
          
       registrar();
    }
      
      // Boton Modificar Producto
      if(ae.getSource()== frpro.btnModificar){
        modificar();
    }
      
      // Boton Eliminar Producto
      if(ae.getSource()== frpro.btnEliminar){
          eliminar();
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
    String codigo;
    codigo=String.valueOf(Productos.tabla_prod.getValueAt(fila, 0));
    List ls;
    
    try{
        ls=SqlProductos.mostrarP(codigo);
        for(int i = 0; i<ls.size();i++){
 
    productos prod = new productos();
    prod= (productos) ls.get(i);
    frpro.txt_cod.setText(prod.getCodigo());
    frpro.txt_desc.setText(prod.getDescripcion());
    frpro.txt_costo.setText(Float.toString(prod.getPrecio_costo()));
    frpro.txt_venta.setText(Float.toString(prod.getPrecio_venta()));
    frpro.txt_mayo.setText(Float.toString(prod.getPrecio_mayor()));
    frpro.txt_descue.setText(Float.toString(prod.getDescuento()));
    frpro.txt_iva.setText(Integer.toString(prod.getIva()));
    frpro.txt_stock.setText(Integer.toString(prod.getStock()));
    frpro.txt_obs.setText(prod.getObs());
    frpro.combo_pro.setSelectedItem(prod.getId_proveedor());
    frpro.como_marca.setSelectedItem(prod.getId_marca());
     frpro.combo_cate.setSelectedItem(prod.getId_categoria());
    frpro.combo_medida.setSelectedItem(prod.getUnidad_med());
        }
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
   void limpiar(){
    // form registrar guardar
    frpro.txt_cod.setText("");
    frpro.txt_desc.setText("");
    frpro.txt_costo.setText("");
    frpro.txt_venta.setText("");
    frpro.txt_mayo.setText("");
    frpro.txt_descue.setText("");
    frpro.txt_iva.setText("");
    frpro.txt_stock.setText("");
    frpro.txt_obs.setText("");
    frpro.como_marca.removeAllItems();
    frpro.combo_cate.removeAllItems();
    frpro.combo_pro.removeAllItems();
    //form buscar
    frpro.txt_busdesc.setText("");
    frpro.txt_buscod.setText("");
    
   //  frpro.como_marca.removeActionListener();
    // modificar();
  //   JOptionPane.showMessageDialog(null,"Probando si llama el metodo limpiar si es que aprieto el botono registrar()");
//     frpro.combo_medida.setSelectedIndex(0);
//    frpro.combo_pro.setSelectedIndex(0);
//    frpro.como_marca.setSelectedIndex(0);
//    frpro.combo_medida.setSelectedIndex(0);
    
//     frpro.combo_pro.addItem("");
//    frpro.como_marca.addItem("");
//    frpro.combo_medida.addItem("");
    }
    
   public void registrar(){
     if(this.frpro.Pane_Prod.getSelectedIndex()==0 ||this.frpro.Pane_Prod.getSelectedIndex()==2 || this.frpro.Pane_Prod.getSelectedIndex()==3){
         frpro.Pane_Prod.setSelectedIndex(1);
         limpiar();
      cate.consultar_categoria(frpro.combo_cate);
    prove.consultar_proveedores(frpro.combo_pro);
     marca.consultar_marca(frpro.como_marca);
          frpro.Pane_Prod.setEnabledAt(0, false);
          frpro.Pane_Prod.setEnabledAt(1, true);
          frpro.Pane_Prod.setEnabledAt(2, false);
          frpro.Pane_Prod.setEnabledAt(3, false);
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
      // frpro.combo_pro.addItem("Seleccione una opción");
       pro.setId_proveedor(frpro.combo_pro.getSelectedItem().toString());
     //  frpro.como_marca.addItem("Seleccione una opción");
       pro.setId_marca(frpro.como_marca.getSelectedItem().toString());
   //    frpro.combo_cate.addItem("Seleccione una opción");
       pro.setId_categoria(frpro.combo_cate.getSelectedItem().toString());
     //  frpro.combo_medida.addItem("Seleccione una opción");
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
   
   public void modificar(){
  int fila = Productos.tabla_prod.getSelectedRow();
         
          if(fila<0){
          JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
          frpro.Pane_Prod.setSelectedIndex(0);
           frpro.Pane_Prod.setEnabledAt(0, true);
          frpro.Pane_Prod.setEnabledAt(1, false);
          frpro.Pane_Prod.setEnabledAt(2, false);
          frpro.Pane_Prod.setEnabledAt(3, false);
           }else{
              
           if(this.frpro.Pane_Prod.getSelectedIndex()==0 ||this.frpro.Pane_Prod.getSelectedIndex()==2 || this.frpro.Pane_Prod.getSelectedIndex()==3){
            frpro.Pane_Prod.setSelectedIndex(1);
          frpro.Pane_Prod.setEnabledAt(0, false);
          frpro.Pane_Prod.setEnabledAt(1, true);
          frpro.Pane_Prod.setEnabledAt(2, false);
          frpro.Pane_Prod.setEnabledAt(3, false);
          limpiar();
           cate.consultar_categoria(frpro.combo_cate);
    prove.consultar_proveedores(frpro.combo_pro);
    marca.consultar_marca(frpro.como_marca);
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
       pro.setId_categoria(frpro.combo_cate.getSelectedItem().toString());
       pro.setUnidad_med(frpro.combo_medida.getSelectedItem().toString());
       
       

      if(sqlpro.modificar(pro)){
       JOptionPane.showMessageDialog(null, "Registro Guardado");
    
      SqlProductos.cargar("");
        limpiar();
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
   
   public void eliminar(){
     int fila = Productos.tabla_prod.getSelectedRow();
     
       if(fila<0){
       JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
       frpro.Pane_Prod.setSelectedIndex(0);
       }else{
           String ide = Productos.tabla_prod.getValueAt(fila, 0).toString();
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

   public void buscar(){
        if(this.frpro.Pane_Prod.getSelectedIndex()==1 ||this.frpro.Pane_Prod.getSelectedIndex()==2 || this.frpro.Pane_Prod.getSelectedIndex()==3){
         frpro.Pane_Prod.setSelectedIndex(0);
        SqlProductos.cargar("");
          frpro.Pane_Prod.setEnabledAt(0, true);
          frpro.Pane_Prod.setEnabledAt(1, false);
          frpro.Pane_Prod.setEnabledAt(2, false);
          frpro.Pane_Prod.setEnabledAt(3, false);
        }
   }
   
       /*
    ChangeListener evt= new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent ce) {
            
        if(ce.getSource()== frpro.Pane_Prod){
       if(frpro.Pane_Prod.getSelectedIndex()==0 ||frpro.Pane_Prod.getSelectedIndex()==2 || frpro.Pane_Prod.getSelectedIndex()==3){
   frpro.combo_pro.removeAllItems();
   // JOptionPane.showMessageDialog(null,"estas en la pestaña buscar o categoria o marca");
       }else{
       // JOptionPane.showMessageDialog(null,"registro");
//     if(ae.getSource()!=frpro.btnModificar){
//       limpiar();
//      }
       }
      }
     }
    };
   */ 
}
