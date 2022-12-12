

package Modelo;

import Vista.BuscarCliente;
import Vista.Facturacion;
import static Vista.Facturacion.tabla_fact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class SqlFacturacion extends Conexion {
     DefaultTableModel model1;

//    public SqlFacturacion () {
//
//}
    
    public static void cargar(String valor, String valor2){
String mostrar="SELECT cod_producto, descripcion from productos where descripcion like '%"+valor+"%' or cod_producto like '%"+valor2+"%' order by id_producto ASC";


String []titulos={"CODIGO","DESCRIPCION"};
String []registros=new String[2];

DefaultTableModel model = new DefaultTableModel (null, titulos);

Conexion cc = new Conexion();
Connection cn=cc.getConexion();
try {

	Statement st =cn.createStatement();
	ResultSet rs= st.executeQuery(mostrar);
    while(rs.next()){

    registros[0]=rs.getString("cod_producto");
    registros[1]=rs.getString("descripcion");
    model.addRow(registros);
    }
    Facturacion.tabla_prod.setModel(model);
      Facturacion.tabla_prod.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Facturacion.tabla_prod.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(295);
} catch (SQLException ex) {
            Logger.getLogger(SqlFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  }  
 }

      public  void cargarfac(String valor){
String mostrar="SELECT stock, unidad_med, cod_producto, descripcion, precio_venta, iva,  precio_mayori, precio_cred from productos where cod_producto='"+valor+"' order by id_producto ASC";


model1=(DefaultTableModel)Facturacion.tabla_fact.getModel();

String []registros=new String[7];

Conexion cc = new Conexion();
Connection cn=cc.getConexion();
try {

	Statement st =cn.createStatement();
	ResultSet rs= st.executeQuery(mostrar);
    while(rs.next()){
 
    registros[0]="1";
    registros[1]=rs.getString("unidad_med");
    registros[2]=rs.getString("cod_producto");
    registros[3]=rs.getString("descripcion");
    
     if (Facturacion.combo_precio.getSelectedItem().equals("Precio venta")){
   registros[4]=rs.getString("precio_venta");
   }
       if (Facturacion.combo_precio.getSelectedItem().equals("Precio mayorista")){
      registros[4]=rs.getString("precio_mayori");
   }
   if (Facturacion.combo_precio.getSelectedItem().equals("Precio credito")){
      registros[4]=rs.getString("precio_cred");
   }
   // registros[5]=rs.getString("precio_costo");
    
    Float fcantidad=Float.valueOf(registros[0]);
//   Float fcantidad=(Float)registros[0];
    Float fprecio=Float.valueOf( registros[4]);
//    Float fprecio=(Float)registros[4];
    Float result=fcantidad*fprecio;
   String resultstring=String.valueOf(result);
    registros[5]=resultstring;
    registros[6]=rs.getString("iva");
    model1.addRow(registros);
 
    }
    proptabla(model1);
   
  } catch (SQLException ex) {
            Logger.getLogger(SqlFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  }  
 }
       public static void subtotal(){
            int fila = Facturacion.tabla_fact.getSelectedRow();
             String codigo;
           codigo=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 2));
          int icodigo=Integer.parseInt(codigo);
          
           String mostrar="SELECT stock from productos where cod_producto like '%"+icodigo+"%'  ";
          String []registros=new String[1];


    Conexion cc = new Conexion();
    Connection cn=cc.getConexion();
    try {

	Statement st =cn.createStatement();
	ResultSet rs= st.executeQuery(mostrar);
    while(rs.next()){  
    
    registros[0]=rs.getString("stock");
    
    }
   
     } catch (SQLException ex) {
            Logger.getLogger(SqlFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  } 
        
       
        String precio;
        String cantidad;
           cantidad=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 0));
       
        precio=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 4));  
        int fcantidad=Integer.parseInt(cantidad);
        int stock=Integer.parseInt(registros[0]);
        
      //  JOptionPane.showMessageDialog(null, registros[0]);
   //   if(fcantidad){
       if (fcantidad<=0){
        JOptionPane.showMessageDialog(null, "Cantidad no puede ser un numero negativo o igual a 0, sera devuelto el valor 1 por defecto ");
             Facturacion.tabla_fact.setValueAt(1, fila, 0);
             
              String  cantidadneg=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 0));
             
             int ncantidad=Integer.parseInt(cantidadneg);
                 Float fprecio=Float.valueOf(precio);
        
         Float result=ncantidad*fprecio;
   String resultstring=String.valueOf(result);
       
     Facturacion.tabla_fact.setValueAt(resultstring, fila, 5);
     
       }else if(stock>=fcantidad){
              
        Float fprecio=Float.valueOf(precio);
        
         Float result=fcantidad*fprecio;
   String resultstring=String.valueOf(result);
       
     Facturacion.tabla_fact.setValueAt(resultstring, fila, 5);
  //  mostrarsub=String.valueOf(Facturacion.tabla_fact.setValueAt(fila, 4));
       }else if (fcantidad>=0){
          JOptionPane.showMessageDialog(null, "La cantidad introducida supera el stock actual, sera devuelta la mayor cantidad");
            Facturacion.tabla_fact.setValueAt(registros[0], fila, 0);
        String  cantidadpos=String.valueOf(Facturacion.tabla_fact.getValueAt(fila, 0));
             
             int pcantidad=Integer.parseInt(cantidadpos);
                 Float fprecio=Float.valueOf(precio);
        
         Float result=pcantidad*fprecio;
   String resultstring=String.valueOf(result);
       
     Facturacion.tabla_fact.setValueAt(resultstring, fila, 5);
            
          }
       
     //  }
       }
      
        public static List mostrartxt(String valor){
         
    String mostrar="SELECT precio_costo, precio_venta, precio_mayori,  iva, "
            + "stock, obs, unidad_med, precio_cred from productos "
            + "WHERE cod_producto ='"+valor+"'";
    List listpro=new ArrayList(8);
          Conexion cc = new Conexion(); 
          Connection cn=cc.getConexion();
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next()){
                 productos prod = new productos();
                 prod.setPrecio_costo(rs.getFloat("precio_costo"));
                 prod.setPrecio_venta(rs.getFloat("precio_venta"));
                 prod.setPrecio_mayor(rs.getFloat("precio_mayori")); 
                 prod.setPrecio_credito(rs.getFloat("precio_cred"));   
                 prod.setIva(rs.getInt("iva")); 
                 prod.setStock(rs.getInt("stock")); 
                 prod.setObs(rs.getString("obs")); 
                 prod.setUnidad_med(rs.getString("unidad_med")); 
                 listpro.add(prod);
              }
        } catch (SQLException ex) {
            Logger.getLogger(SqlFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        } 
        finally{
    if(cn!=null){  
        try {  cn.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
       return listpro;
    }
        
        public static void proptabla(DefaultTableModel m){
            
            
            
            Facturacion.tabla_fact.setModel(m);
      Facturacion.tabla_fact.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = Facturacion.tabla_fact.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(60);
         columnModel.getColumn(1).setPreferredWidth(100);
         columnModel.getColumn(2).setPreferredWidth(100);
         columnModel.getColumn(3).setPreferredWidth(210);
         columnModel.getColumn(4).setPreferredWidth(100);
         columnModel.getColumn(5).setPreferredWidth(150);
         columnModel.getColumn(6).setPreferredWidth(55);
        }
        
           public void mostrarCliente_fac (String v) {

    String [] columnas ={"CODIGO","NOMBRE Y APELLIDO","RUC/CI"};
    Object[] obj= new Object[3];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
    
        Connection con = getConexion();
        String sql = "SELECT id_cliente, nombre_cli, cedula from cliente WHERE nombre_cli LIKE '%"+v+"%' or cedula LIKE '%"+v+"%' ORDER BY id_cliente ASC";

         try {

          Statement  ps = con.createStatement();
        ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {

           obj[0]=rs.getInt("id_cliente");
           obj[1]=rs.getString("nombre_cli");
           obj[2]=rs.getString("cedula");
         
             Tabla.addRow(obj);
            }
             BuscarCliente.tabla_cliente.setModel(Tabla);
             BuscarCliente.tabla_cliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = BuscarCliente.tabla_cliente.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(80);
         columnModel.getColumn(1).setPreferredWidth(300);
         columnModel.getColumn(2).setPreferredWidth(130);
      
        } catch (SQLException ex) {
            Logger.getLogger(SqlFacturacion.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }finally{
    if(con!=null){  
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
}
           
               public List mostrar_en_txt (String v) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT id_cliente, nombre_cli, cedula, celular,  direccion from cliente WHERE id_cliente ='"+v+"' ORDER BY id_cliente ASC";
        List aggcliente = new ArrayList(5);

         try {

            ps = con.prepareCall(sql);
         rs = ps.executeQuery();

            while (rs.next()) {

           cliente cli = new cliente();
           cli.setCodigo(rs.getInt("id_cliente"));
           cli.setNombre(rs.getString("nombre_cli"));
           cli.setCedula(rs.getString("cedula"));
           cli.setCelular(rs.getString("celular"));
           cli.setDireccion(rs.getString("direccion"));
           
           aggcliente.add(cli);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlFacturacion.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }finally{
    if(con!=null){  
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 }
  return aggcliente;
}
//      public static void  mo(DefaultTableModel m){
//      
//      DefaultTableModel model1;
//model1=(DefaultTableModel)Facturacion.tabla_fact.getModel();
//
//     
//      }
}

