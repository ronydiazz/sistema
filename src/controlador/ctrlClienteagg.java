
package controlador;

import Vendedor.BuscarCliente;
import Vendedor.Facturacion;
import static Vendedor.Facturacion.tabla_fact;
import Vendedor.Productos;
import Modelo.SqlFacturacion;
import Modelo.cliente;
import Modelo.facturacion;
import Modelo.productos;
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


public class ctrlClienteagg implements ActionListener {
       private Facturacion frfac;
    private SqlFacturacion sqlfac;
 
     private cliente cli;
    private BuscarCliente frcli;
//    SqlFacturacion sqlfac = new SqlFacturacion ();
//    SqlProveedor prove = new SqlProveedor ();
//    SqlMarca marca = new SqlMarca ();
    
    public ctrlClienteagg (cliente cli,SqlFacturacion sqlfac , BuscarCliente frcli){
  //, Facturacion frfac
    this.sqlfac=sqlfac;
    
     this.cli=cli;
    this.frcli=frcli;
    
  //  this.frfac=frfac;

     this.frcli.btnagg.addActionListener(this);
    
    frcli.txt_bus_ruc.addKeyListener(txtruc);
    frcli.txt_bus_cli.addKeyListener(txtnom);
    

    
     
}
    public void iniciar(){
       sqlfac.mostrarCliente_fac("");
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
            if(ke.getSource()==frcli.txt_bus_ruc){
           
            sqlfac.mostrarCliente_fac(frcli.txt_bus_ruc.getText());
           
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
            
   
         if(ke.getSource()==frcli.txt_bus_cli){
           
            sqlfac.mostrarCliente_fac(frcli.txt_bus_cli.getText());
           
       }
            
        }

       
    };
     
   @Override
   public void actionPerformed(ActionEvent ae) {
      // Boton agregar
   
    if(ae.getSource()==frcli.btnagg){
        mostrar_txt();
        Facturacion.frclientee.dispose();
        Facturacion.frclientee=null;
    // JOptionPane.showMessageDialog(null,"btn jeje");
      }
   }
    
   
   
    public void mostrar_txt(){
     int fila = BuscarCliente.tabla_cliente.getSelectedRow();
//     Facturacion frfacs= new Facturacion();

     if(fila>=0){
    String codigo;
    codigo=String.valueOf(BuscarCliente.tabla_cliente.getValueAt(fila, 0));
    List ls;
    
    try{
       
        ls=sqlfac.mostrar_en_txt(codigo);
        for(int i = 0; i<ls.size();i++){
            
    cli= (cliente) ls.get(i);
//    frfac.txt_num_cli.setText("num cl");
//    frfac.txt_nom_cli.setText("nombre");
//    frfac.txt_ruc.setText("ruc");
//    frfac.txt_tel.setText("tel");
//    frfac.txt_direc.setText("direc");
    Facturacion.txt_num_cli.setText(Integer.toString(cli.getCodigo()));
    Facturacion.txt_nom_cli.setText(cli.getNombre());
    Facturacion.txt_ruc.setText(cli.getCedula());
    Facturacion.txt_tel.setText(cli.getCelular());
    Facturacion.txt_direc.setText(cli.getDireccion());
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
    
