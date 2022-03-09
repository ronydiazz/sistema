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
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @web http://jc-mouse.net/
 * @author Mouse
 */
public class CellRenderer extends DefaultTableCellRenderer {

    private Font bold = new Font("Arial", Font.BOLD, 12);

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

        if (value == null) {
            this.setBackground(new Color(255, 0, 0));
            this.setText(null);
       //      JOptionPane.showMessageDialog( null , "Solo digitos numericos");

        } else {
            this.setText("" + Integer.valueOf(value.toString()));
            this.setBackground(new Color(0, 255, 0));
        }

        this.setForeground((selected) ? new Color(0, 0, 255) : new Color(0, 110, 10));
        this.setFont(bold);
        return this;
    }
}
