
package controlador;

import Vista.BuscarCliente;
import Vista.Facturacion;
import static Vista.Facturacion.tabla_fact;
import Vista.Productos;
import Modelo.SqlFacturacion;
import Modelo.SqlUsuarios;
import Modelo.SqlVendedor;
import Modelo.cliente;
import Modelo.facturacion;
import Modelo.productos;
import Modelo.vendedor;
import Vista.BuscarVendedor;
import Vista.Vendedor;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ctrlVendedoragg implements ActionListener {
  //   Vendedor frvendedor= new Vendedor();
    private SqlVendedor sqlvend;
  //  private SqlUsuarios sqlUSU;
 
     private vendedor vend;
    private BuscarVendedor frBusVend;
//    SqlFacturacion sqlfac = new SqlFacturacion ();
//    SqlProveedor prove = new SqlProveedor ();
//    SqlMarca marca = new SqlMarca ();
    
    public ctrlVendedoragg (vendedor vend,SqlVendedor sqlvend , BuscarVendedor frBusVend){
  //, Facturacion frfac
    this.sqlvend=sqlvend;
    
     this.vend=vend;
    this.frBusVend=frBusVend;
    
  //  this.frfac=frfac;

     this.frBusVend.btnagg.addActionListener(this);
    
    frBusVend.txt_bus_ruc.addKeyListener(txtruc);
    frBusVend.txt_bus_cli.addKeyListener(txtnom);
    

    
     
}
    public void iniciar(){
       SqlVendedor.cargar_usu("");
    }
    
         KeyListener txtruc = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
              }

        @Override
        public void keyPressed(KeyEvent ke) {
         }

        @Override
        public void keyReleased(KeyEvent ke) {
            
     //     SqlFacturacion.cargar(frfac.txt_bus_pro.getText(),"");
            if(ke.getSource()==frBusVend.txt_bus_ruc){
           
            sqlvend.mostrarVendedor(frBusVend.txt_bus_ruc.getText());
           
       }

            
        }

       
    };
         
            KeyListener txtnom = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
              }

        @Override
        public void keyPressed(KeyEvent ke) {
         }

        @Override
        public void keyReleased(KeyEvent ke) {
            
   
         if(ke.getSource()==frBusVend.txt_bus_cli){
           
            sqlvend.mostrarVendedor(frBusVend.txt_bus_cli.getText());
           
       }
            
        }

       
    };
     
   @Override
   public void actionPerformed(ActionEvent ae) {
      // Boton agregar
   
    if(ae.getSource()==frBusVend.btnagg){
        mostrar_txt();
        Vendedor.frbusvendedor.dispose();
        Vendedor.frbusvendedor=null;
    // JOptionPane.showMessageDialog(null,"btn jeje");
      }
   }
    
   
   
    public void mostrar_txt(){
     int fila = BuscarVendedor.tabla_vendedor.getSelectedRow();
//     Facturacion frfacs= new Facturacion();

     if(fila>=0){
    String codigo;
    codigo=String.valueOf(BuscarVendedor.tabla_vendedor.getValueAt(fila, 0));
    List ls;
    
    try{
     //  JOptionPane.showMessageDialog( null , codigo);
        ls=sqlvend.mostrar_en_txt(codigo);
        for(int i = 0; i<ls.size();i++){
            
    vend= (vendedor) ls.get(i);
//    frfac.txt_num_cli.setText("num cl");
//    frfac.txt_nom_cli.setText("nombre");
//    frfac.txt_ruc.setText("ruc");
//    frfac.txt_tel.setText("tel");
//    frfac.txt_direc.setText("direc");
//frvendedor.txt_cod.setText(String.valueOf(vend.getId()));

// int fila = BuscarVendedor.tabla_vendedor.getSelectedRow();
    Vendedor.txt_nomp.setText(vend.getNombre());
    Vendedor.txt_email.setText(vend.getCorreo());
    
//    String resu=String.valueOf( BuscarVendedor.tabla_vendedor.getValueAt(fila, 4));
//    JOptionPane.showMessageDialog( null , resu);
  //   Vendedor.combo_tipo.setSelectedItem(String.valueOf( BuscarVendedor.tabla_vendedor.getValueAt(fila, 4)));
     Vendedor.combo_tipo.setSelectedItem(String.valueOf( vend.getNombre_est()));

  // JOptionPane.showMessageDialog(null,"metodo try catch mostrar_txt jeje");
        }
    }catch(HeadlessException e){
    System.out.println(e);
    }
     }
    }
    
    
     
    
//   public void Buscarcli(){
//   
//       BuscarCliente c= new BuscarCliente();
//       
//      String ci= c.txt_bus_ruc.getText();
//   sqlfac.mostrarCliente_fac(ci);
//   
//   
//   }
// /*
//	
//	// Validación de si una cadena es un número
//	public static boolean isNumeric(String cadena){
//		try {
//			Integer.parseInt(cadena);
//			return true;
//		} catch (NumberFormatException nfe){		
//			return false;
//		}
//	}
//
//       public void ajuste( TableModelEvent e ){
//
//        //solo si se edita la tabla
//        if ( e.getType() == TableModelEvent.UPDATE ) {
//
//            //se obtiene el modelo
//            TableModel modelo = ( (TableModel) ( e.getSource() ) );            
//            int fila = e.getFirstRow();
//            int columna = e.getColumn();
//          if ( columna == 5 ) {return;}
//
//             try {
////                    int filaa = Facturacion.tabla_prod.getSelectedRow();
////     
////       String p=   String.valueOf(Facturacion.tabla_prod.getValueAt(filaa, 0));
////                 
////       if(isNumeric(p)){
////       
////       }else{
////           JOptionPane.showMessageDialog( null , "Solo digitos numericos");
////        modelo.setValueAt( null , fila, columna); 
////       }
////
//      //obtiene valor de celda editable
//                int a =  ((Number) modelo.getValueAt(fila,columna)).intValue();
//                //obtiene valor de celda no editable
//                int b =  ((Number) modelo.getValueAt(fila,columna+1)).intValue();
//
//
//            } catch (NullPointerException ex) { /*...*/ }             
//        }
//    }
//      
////         boolean[] canEdit = new boolean [] {
////        true, false, false, false,
////    };
         
//        @Override
//    public void tableChanged(TableModelEvent tme) {
//      ajuste(tme);
//     //   tme.consume();
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


} 
       
//       public void subtotal(){
//       
//        int fila = Facturacion.tabla_fact.getSelectedRow();
//        String cantidad;
//        String precio;
//        cantidad=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 0));
//        precio=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 4));
//        
//        Float fcantidad=Float.valueOf(cantidad);
//        Float fprecio=Float.valueOf(precio);
//        
//       }

//       public void mostrar(){    
//    int fila = Facturacion.tabla_prod.getSelectedRow();
//    String codigo;
//    codigo=String.valueOf(Facturacion.tabla_prod.getValueAt(fila, 0));
//    List ls;
//    
//    try{
////        if(fila<0){
////        
////        }
//        ls=SqlFacturacion.mostrarP(codigo);
//        for(int i = 0; i<ls.size();i++){
// 
//    facturacion prod = new facturacion();
//    prod= (facturacion) ls.get(i);
//    fr.txt_cod.setText(prod.getCodigo());
//
//        }
//    }catch(Exception e){
//    System.out.println(e);
//    }
//    }
    
