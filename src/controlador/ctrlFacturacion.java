
package controlador;

import Vista.BuscarCliente;
import Vista.Facturacion;
import static Vista.Facturacion.tabla_fact;
import Vista.Productos;
import Modelo.SqlFacturacion;
import Modelo.SqlProveedor;
import Modelo.SqlVendedor;
import Modelo.cliente;
import Modelo.facturacion;
import Modelo.productos;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ctrlFacturacion implements ActionListener {
     private facturacion fac;
    private SqlFacturacion sqlfac;
    private Facturacion frfac;
    
     private cliente cli;
    private BuscarCliente frcli;
    
     SqlVendedor sqlvend = new SqlVendedor ();
//    SqlFacturacion sqlfac = new SqlFacturacion ();
//    SqlProveedor prove = new SqlProveedor ();
//    SqlMarca marca = new SqlMarca ();
    
//   public static ctrlClienteagg ctrcli2;
//    public static Facturacion frfacturacionn;
    //SqlFacturacion factura = new SqlFacturacion();
    
    public ctrlFacturacion (facturacion fac, SqlFacturacion sqlfac, Facturacion frfac){
    this.fac=fac;
    this.sqlfac=sqlfac;
    this.frfac=frfac;
    
//     this.cli=cli;
//    this.frcli=frcli;
    
      this.frfac.btnAgregar.addActionListener(this);
      this.frfac.btnQuitar.addActionListener(this);
    //  this.frfac.btnBuscarcli.addActionListener(this);
      this.frfac.txt_bus_pro.addKeyListener(tecla);
 //     Facturacion.tabla_fact.addKeyListener(teclatab);
      this.frfac.check_cod.addActionListener(this);
      this.frfac.check_desc.addActionListener(this);
        this.frfac.combo_precio.addActionListener(this);
      
      //comentar
//        this.frcli.btnagg.addActionListener(this);
      
    Facturacion.tabla_prod.addMouseListener(mous);
        Facturacion.tabla_fact.addMouseListener(mousfac);
    Facturacion.tabla_fact.addKeyListener(entertab);
    
    
//    frcli.txt_bus_ruc.addKeyListener(txtruc);
//    frcli.txt_bus_cli.addKeyListener(txtnom);
    

     
}
    public void iniciar(){
        SqlFacturacion.cargar("","");
        
          sqlvend.consultar_vendedor(frfac.combo_vendedor);
//       frfac.Pane_Prod.setEnabledAt(1, false);
//       frpro.Pane_Prod.setEnabledAt(2, false);
//       frpro.Pane_Prod.setEnabledAt(3, false);
    }
    
     MouseListener mous= new MouseListener() {
       
        @Override
        public void mouseClicked(MouseEvent me) {
 
     mostrar();
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
     MouseListener mousfac= new MouseListener() {
       
        @Override
        public void mouseClicked(MouseEvent me) {
 
             SqlFacturacion.subtotal();
             total();
             iva5();
             iva10();
             iva();
             
             
        
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
    
     KeyListener tecla = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {
              }

        @Override
        public void keyPressed(KeyEvent ke) {
         }

        @Override
        public void keyReleased(KeyEvent ke) {
            
     //     SqlFacturacion.cargar(frfac.txt_bus_pro.getText(),"");
            if(frfac.check_cod.isSelected()){
           
            SqlFacturacion.cargar(null,frfac.txt_bus_pro.getText());
           
       }
   if(frfac.check_desc.isSelected()){
           
            SqlFacturacion.cargar(frfac.txt_bus_pro.getText(),null);
           
       }
            
        }

       
    };

     KeyListener entertab = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent ke) {

        }

        @Override
        public void keyPressed(KeyEvent ke) {
         
//
         }

        @Override
        public void keyReleased(KeyEvent ke) {
     
         SqlFacturacion.subtotal();
         total();
         iva5();         
         iva10();
         iva();
           
        }

       
    };
      

     
   @Override
   public void actionPerformed(ActionEvent ae) {
      // Boton agregar
      if(ae.getSource()==frfac.btnAgregar){

       int fila = Facturacion.tabla_prod.getSelectedRow();
       if(fila>=0){
       String p=   String.valueOf(Facturacion.tabla_prod.getValueAt(fila, 0));

       sqlfac.cargarfac(p);
       total();
       iva5();
       iva10();
       iva();
       count();
       }
      }
      
       if(ae.getSource()==frfac.check_cod){
           
           // SqlFacturacion.cargar(frfac.txt_bus_pro.getText(),"");
           
           frfac.check_desc.setSelected(false);
       }
   if(ae.getSource()==frfac.check_desc){
           
       //     SqlFacturacion.cargar("",frfac.txt_bus_pro.getText());
          frfac.check_cod.setSelected(false);
       }
   
   if(ae.getSource()==frfac.btnQuitar){
       
       quitar();
      

       }
   
   if(ae.getSource()==frfac.btnBuscarcli){
       
   //Buscarcli();
     
//     if(frcli== null){
//       frcli = new BuscarCliente(frfacturacionn, true);
//          ctrcli2= new ctrlClienteagg(cli, factura, frcli);
//          ctrcli2.iniciar();
//
//        frcli.setVisible(true);
//        
//        }
   
   
//frcli.setVisible(true);
       }
//    if(ae.getSource()==frcli.btnagg){
//        mostrar_txt();
//      }
//  if(ae.getSource()==frfac.combo_precio){
//          
//combo_precio();
//
//// frpro.txt_obs.requestFocus();
//      }
//      
   }
  
   
     
     public void mostrar(){    
    int fila = Facturacion.tabla_prod.getSelectedRow();
    String codigo;
    codigo=String.valueOf(Facturacion.tabla_prod.getValueAt(fila, 0));
    List ls;
    try{
//        if(fila<0){
//        
//        }
        ls=SqlFacturacion.mostrartxt(codigo);
        for(int i = 0; i<ls.size();i++){
 
      productos prod = new productos();
    prod= (productos) ls.get(i);
 
    frfac.txt_precio_costo.setText(Float.toString(prod.getPrecio_costo()));
    frfac.txt_precio_venta.setText(Float.toString(prod.getPrecio_venta()));
    frfac.txt_precio_mayo.setText(Float.toString(prod.getPrecio_mayor()));
    frfac.txt_precio_cred.setText(Float.toString(prod.getPrecio_credito()));
    frfac.txt_iva.setText(Integer.toString(prod.getIva()));
    frfac.txt_stock.setText(Integer.toString(prod.getStock()));
    frfac.txt_obs.setText(prod.getObs());
    frfac.txt_unidad.setText(prod.getUnidad_med());
        }
    }catch(Exception e){
    System.out.println(e);
    }
    }
       
     public void total (){
//   DecimalFormatSymbols qp = new DecimalFormatSymbols(); 
//   qp.setDecimalSeparator('.');
//   
//   DecimalFormat formato1=new DecimalFormat("#.##",qp);
   
      float t=0;
      float p=0;
   
      if(Facturacion.tabla_fact.getRowCount()>0){
       
      for(int i=0;i<Facturacion.tabla_fact.getRowCount();i++){
       
      p=Float.parseFloat(Facturacion.tabla_fact.getValueAt(i, 5).toString());
      t+=p;
     

       }
       frfac.txt_total.setText(String.valueOf(t));

      }else if(Facturacion.tabla_fact.getRowCount()==0){
      
       frfac.txt_total.setText("");
       frfac.txt_total_iva.setText("");
       frfac.txt_iva5.setText("");
       frfac.txt_iva10.setText("");
      }

    }
     
     public void iva (){
  
  float t5=0;
   float t10=0;
   float resul=0;
   DecimalFormatSymbols p = new DecimalFormatSymbols(); 
   p.setDecimalSeparator('.');
   
   DecimalFormat formato1=new DecimalFormat("#.##",p);
   
   t5=Float.parseFloat(frfac.txt_iva5.getText());
   t10=Float.parseFloat(frfac.txt_iva10.getText());
   resul=t5+t10;
   //resul=Math.round(t5+t10);
     float n=(float) Math.round(resul*100)/100;
      frfac.txt_total_iva.setText(String.valueOf(n));


}
     public void iva5 (){
  
//  int t=0;
   int p=0;
   float t=0;
   float tsum=0;
   float t5=0;
   
     DecimalFormatSymbols pp = new DecimalFormatSymbols(); 
   pp.setDecimalSeparator('.');
   
   DecimalFormat formato1=new DecimalFormat("#.##",pp);
   
   
   if(Facturacion.tabla_fact.getRowCount()>0){
   for(int i=0;i<Facturacion.tabla_fact.getRowCount() ;i++){
     p=Integer.parseInt(Facturacion.tabla_fact.getValueAt(i, 6).toString());
     t=Float.parseFloat(Facturacion.tabla_fact.getValueAt(i, 5).toString());
     
     if (p==5){
         
      tsum+=t;
      
      t5=tsum/21;
     }
     
   }
   float n=(float) Math.round(t5*100)/100;
 //     frfac.txt_iva5.setText(formato1.format(t5));
      frfac.txt_iva5.setText(String.valueOf(n));
     

}
}
     public void iva10 (){
  
//  int t=0;
   int p=0;
   float t=0;
   float tsum=0;
   float t10=0;
    DecimalFormatSymbols pp = new DecimalFormatSymbols(); 
   pp.setDecimalSeparator('.');
   
   DecimalFormat formato1=new DecimalFormat("#.##",pp);
   
   
   if(Facturacion.tabla_fact.getRowCount()>0){
   for(int i=0;i<Facturacion.tabla_fact.getRowCount() ;i++){
     p=Integer.parseInt(Facturacion.tabla_fact.getValueAt(i, 6).toString());
     t=Float.parseFloat(Facturacion.tabla_fact.getValueAt(i, 5).toString());
     
     if (p==10){
         
        tsum+=t;
      
      t10=tsum/11;
     
     }
     
   }
    // (t10*100.0)/100.0))
    float n=(float) Math.round(t10*100)/100;
     // frfac.txt_iva10.setText(String.valueOf(formato1.format(t10)));
      frfac.txt_iva10.setText(String.valueOf(n));
     // JOptionPane.showMessageDialog(null, n);

}
}
     public void count (){
     
     int cant=Facturacion.tabla_fact.getRowCount();
     
     Facturacion.lblcant.setText("   "+String.valueOf(cant));
     }
    
     
   public void quitar(){
       DefaultTableModel   model=(DefaultTableModel) Facturacion.tabla_fact.getModel();
        int fila = Facturacion.tabla_fact.getSelectedRow();
         if(fila>=0){
        
       if(JOptionPane.showConfirmDialog(null, "Quitar Producto", "Aviso", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){

      model.removeRow(fila);

       count();
       iva5();
       iva10();
       iva();
        total();
       }  else {
       JOptionPane.showMessageDialog(null, "No se ha quitado ningun producto", "Informacion", JOptionPane.OK_CANCEL_OPTION);
         
       }
       }else{
         
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
         }
   
   }
//   public void combo_precio (){
//   //Precio venta, Precio mayorista, Precio credito
//   
//   
//   //    Facturacion.tabla_fact.setValueAt(resultstring, fila, 5);
//   
//   if (frfac.combo_precio.getSelectedItem().equals("Precio venta")){
//   
//   }
//   if (frfac.combo_precio.getSelectedItem().equals("Precio mayorista")){
//   
//   }
//   if (frfac.combo_precio.getSelectedItem().equals("Precio credito")){
//   
//   }
//   
//   }
   

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
    
