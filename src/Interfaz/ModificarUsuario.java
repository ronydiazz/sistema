/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.SqlUsuarios;
import Modelo.hash;
import Modelo.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author rony
 */
public class ModificarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public ModificarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    //    txt_cod.setEnabled(false);

    }

    /**
     * This method is called from within the construccomwchaator to initialize
     * the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginlogo = new javax.swing.JLabel();
        loginlogo1 = new javax.swing.JLabel();
        loginlogo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginlogo4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginlogo3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        loginlogo7 = new javax.swing.JLabel();
        txtPasswordA = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        loginlogo8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginlogo9 = new javax.swing.JLabel();
        loginlogo10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        loginlogo11 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        loginlogo12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        loginlogo6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_cod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));

        loginlogo.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        loginlogo.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo.setText("FACTURACION");

        loginlogo1.setBackground(new java.awt.Color(255, 255, 255));
        loginlogo1.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        loginlogo1.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo1.setText("E");

        loginlogo2.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        loginlogo2.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo2.setText("INVENTARIO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PcMonitor.png"))); // NOI18N

        loginlogo4.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        loginlogo4.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo4.setText("SISTEMA DE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(loginlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(loginlogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(loginlogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(loginlogo2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(loginlogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginlogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginlogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginlogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 670));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlogo3.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo3.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo3.setText("CODIGO:");
        jPanel2.add(loginlogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 115, 24));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email_30px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 29, 40));

        txtConfirmarPassword.setBackground(new java.awt.Color(33, 45, 62));
        txtConfirmarPassword.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtConfirmarPassword.setForeground(new java.awt.Color(73, 181, 172));
        txtConfirmarPassword.setBorder(null);
        txtConfirmarPassword.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 340, -1));

        txtCorreo.setBackground(new java.awt.Color(33, 45, 62));
        txtCorreo.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(73, 181, 172));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 181, 172));
        txtCorreo.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtCorreo.setSelectionColor(new java.awt.Color(33, 45, 62));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 330, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 33, 35));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 382, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 10));

        loginlogo7.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo7.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo7.setText("CONTRASEÑA ACTUAL");
        jPanel2.add(loginlogo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 41));

        txtPasswordA.setBackground(new java.awt.Color(33, 45, 62));
        txtPasswordA.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtPasswordA.setForeground(new java.awt.Color(73, 181, 172));
        txtPasswordA.setBorder(null);
        txtPasswordA.setCaretColor(new java.awt.Color(73, 181, 172));
        txtPasswordA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordAActionPerformed(evt);
            }
        });
        jPanel2.add(txtPasswordA, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, 340, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 33, 35));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 382, 10));

        txtUsuario.setBackground(new java.awt.Color(33, 45, 62));
        txtUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(73, 181, 172));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(73, 181, 172));
        txtUsuario.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtUsuario.setSelectionColor(new java.awt.Color(33, 45, 62));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 339, 30));

        jSeparator4.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator4.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 382, 10));

        loginlogo8.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo8.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo8.setText("CONFIRMAR CONTRASEÑA");
        jPanel2.add(loginlogo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 29, -1));

        loginlogo9.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo9.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo9.setText("TIPO");
        jPanel2.add(loginlogo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        loginlogo10.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo10.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo10.setText("NOMBRE && APELLIDO");
        jPanel2.add(loginlogo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 29, 40));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(73, 181, 172));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(73, 181, 172));
        txtNombre.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtNombre.setSelectionColor(new java.awt.Color(33, 45, 62));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 330, 30));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator5.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 382, 10));

        loginlogo11.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo11.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo11.setText("CORREO");
        jPanel2.add(loginlogo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        combo_tipo.setBackground(new java.awt.Color(33, 45, 62));
        combo_tipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        combo_tipo.setForeground(new java.awt.Color(255, 255, 255));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });
        jPanel2.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 310, 30));

        btnModificar.setBackground(new java.awt.Color(33, 45, 62));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 260, 50));

        loginlogo12.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo12.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo12.setText("CONTRASEÑA");
        jPanel2.add(loginlogo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 41));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 33, 35));

        txtPassword.setBackground(new java.awt.Color(33, 45, 62));
        txtPassword.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(73, 181, 172));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(73, 181, 172));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 340, -1));

        jSeparator6.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator6.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 382, 10));

        loginlogo6.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo6.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo6.setText("USUARIO");
        jPanel2.add(loginlogo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 115, 24));

        jSeparator7.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator7.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 378, 10));

        txt_cod.setEditable(false);
        txt_cod.setBackground(new java.awt.Color(33, 45, 62));
        txt_cod.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txt_cod.setForeground(new java.awt.Color(73, 181, 172));
        txt_cod.setBorder(null);
        txt_cod.setCaretColor(new java.awt.Color(73, 181, 172));
        txt_cod.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txt_cod.setSelectionColor(new java.awt.Color(33, 45, 62));
        txt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codActionPerformed(evt);
            }
        });
        jPanel2.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 440, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();
        usuarios mod1 = new usuarios();
        String pas_act = new String(txtPasswordA.getPassword());
        String pass_actual = hash.sha1(pas_act);
        String pass = new String(txtPassword.getPassword());
        String passCon = new String(txtConfirmarPassword.getPassword());
        String nuevoPass = hash.sha1(pass);
  
        if (txtUsuario.getText().equals("") || passCon.equals("") || txtNombre.getText().equals("") || txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            
        } else {
            mod1.setUsuario(txtUsuario.getText());
            mod1.setPassword(pass_actual);
            
            if(modSql.contraseña_actual(mod1)){
                
               if (pass.equals(passCon)) {
                    if (modSql.esEmail(txtCorreo.getText())) {
                        mod.setUsuario(txtUsuario.getText());
                        mod.setPassword(nuevoPass);
                        mod.setNombre(txtNombre.getText());
                        mod.setCorreo(txtCorreo.getText());
                        
                         if(combo_tipo.getSelectedItem().toString().equals("Administrador")){
                       mod.setId_tipo(1);
                       }else{
                       mod.setId_tipo(2);
                       }
                     
                        mod.setId(Integer.parseInt(txt_cod.getText()));

                        if (modSql.modificar(mod)) {
                            JOptionPane.showMessageDialog(null, "Modificación Guardada");

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                        }
                    } else {
                         JOptionPane.showMessageDialog(null,"El correo electronico no es valido");
                    }
            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coiciden");
            } 
        } else {

                JOptionPane.showMessageDialog(null, "Las contranseña actual es incorrecta");
            } 
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    public static javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel loginlogo;
    private javax.swing.JLabel loginlogo1;
    private javax.swing.JLabel loginlogo10;
    private javax.swing.JLabel loginlogo11;
    private javax.swing.JLabel loginlogo12;
    private javax.swing.JLabel loginlogo2;
    private javax.swing.JLabel loginlogo3;
    private javax.swing.JLabel loginlogo4;
    private javax.swing.JLabel loginlogo6;
    private javax.swing.JLabel loginlogo7;
    private javax.swing.JLabel loginlogo8;
    private javax.swing.JLabel loginlogo9;
    public static javax.swing.JPasswordField txtConfirmarPassword;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JPasswordField txtPasswordA;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txt_cod;
    // End of variables declaration//GEN-END:variables
}
