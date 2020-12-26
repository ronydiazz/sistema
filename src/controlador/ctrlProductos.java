/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Interfaz.Usuarios;
import Modelo.SqlUsuarios;
import Modelo.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ctrlProductos implements ActionListener {

    private usuarios usu;
    private SqlUsuarios sqlusu;
    private Usuarios frusu;
    
    public ctrlProductos (usuarios usu, SqlUsuarios sqlusu, Usuarios frusu){
    this.usu=usu;
    this.sqlusu=sqlusu;
    this.frusu=frusu;
    }
     public void iniciar(){
    //   cargar("");
   //   bloqueoform();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      
    }
    
}
