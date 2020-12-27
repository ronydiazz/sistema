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
    }
     public void iniciar(){
       SqlProductos.cargar("");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      // Boton Registrar Producto
      if(ae.getSource()== frpro.btnRegProducto){
      
      }
      
      // Boton Modificar Producto
      // Boton Eliminar Producto
      // Boton Gestionar Categoria
      // Boton Gestionar Marca
    }
    
}
