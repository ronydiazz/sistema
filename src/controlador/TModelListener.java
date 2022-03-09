/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


/**
 *
 * @author DELL
 */
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
/**
 *
 */
public class TModelListener implements TableModelListener  {

    /**
 * @param e TableModelEvent
 */
    public void ajuste( TableModelEvent e ){

        //solo si se edita la tabla
        if ( e.getType() == TableModelEvent.UPDATE ) {

            //se obtiene el modelo
            TableModel modelo = ( (TableModel) ( e.getSource() ) );            
            int fila = e.getFirstRow();
            int columna = e.getColumn();
            if ( columna == 3 ) {return;}

             try {                
                 //obtiene valor de celda editable
                int a = ((Number) modelo.getValueAt(fila,columna)).intValue();
                //obtiene valor de celda no editable
                int b = ((Number) modelo.getValueAt(fila,columna+1)).intValue();

                //restricción
                if( a <= 0){
                   JOptionPane.showMessageDialog( null , "Error: El valor debe ser enterio positivo.");
                   modelo.setValueAt( null , fila, columna); 
                   modelo.setValueAt( null , fila, columna+2); 
                   return;
                }

                modelo.setValueAt( a + b , fila, columna+2);

            } catch (NullPointerException ex) { /*...*/ }             
        }
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        ajuste( e );
    }

}
