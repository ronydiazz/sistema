/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.SqlUsuarios;
import controlador.hash;
import controlador.usuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author rony
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
 //       editarTipo();

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
        loginlogo5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        loginlogo7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
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
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 640));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlogo3.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo3.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo3.setText("USUARIO");
        jPanel2.add(loginlogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 115, 24));

        loginlogo5.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo5.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo5.setText("REGISTRO");
        jPanel2.add(loginlogo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 9, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email_30px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 437, 29, 40));

        txtConfirmarPassword.setBackground(new java.awt.Color(33, 45, 62));
        txtConfirmarPassword.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtConfirmarPassword.setForeground(new java.awt.Color(73, 181, 172));
        txtConfirmarPassword.setBorder(null);
        txtConfirmarPassword.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel2.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 263, 340, -1));

        txtCorreo.setBackground(new java.awt.Color(33, 45, 62));
        txtCorreo.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(73, 181, 172));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 181, 172));
        txtCorreo.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtCorreo.setSelectionColor(new java.awt.Color(33, 45, 62));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 440, 330, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 33, 35));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 382, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 378, 10));

        btnRegistrar.setBackground(new java.awt.Color(73, 181, 172));
        btnRegistrar.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Registrar.png"))); // NOI18N
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setFocusable(false);
        btnRegistrar.setRequestFocusEnabled(false);
        btnRegistrar.setVerifyInputWhenFocusTarget(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 274, 50));

        loginlogo7.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo7.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo7.setText("CONTRASEÑA");
        jPanel2.add(loginlogo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 41));

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
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, 340, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 33, 35));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 382, 10));

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
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 339, 30));

        jSeparator4.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator4.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 382, 10));

        loginlogo8.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo8.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo8.setText("CONFIRMAR CONTRASEÑA");
        jPanel2.add(loginlogo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 29, -1));

        loginlogo9.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo9.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo9.setText("TIPO");
        jPanel2.add(loginlogo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        loginlogo10.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo10.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo10.setText("NOMBRE && APELLIDO");
        jPanel2.add(loginlogo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 357, 29, 40));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(73, 181, 172));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(73, 181, 172));
        txtNombre.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtNombre.setSelectionColor(new java.awt.Color(33, 45, 62));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 360, 330, 30));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator5.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 382, 10));

        loginlogo11.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        loginlogo11.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo11.setText("CORREO");
        jPanel2.add(loginlogo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        combo_tipo.setBackground(new java.awt.Color(33, 45, 62));
        combo_tipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        combo_tipo.setForeground(new java.awt.Color(255, 255, 255));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        jPanel2.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 310, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
  //  Usuarios u = new Usuarios();
        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();

        String pass = new String(txtPassword.getPassword());
        String passCon = new String(txtConfirmarPassword.getPassword());

        if (txtUsuario.getText().equals("") || passCon.equals("") || txtNombre.getText().equals("") || txtCorreo.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        } else {

            if (pass.equals(passCon)) {

                if (modSql.existeUsusario(txtUsuario.getText()) == 0) {

                    if (modSql.esEmail(txtCorreo.getText())) {

                        String nuevoPass = hash.sha1(pass);

                        mod.setUsuario(txtUsuario.getText());
                        mod.setPassword(nuevoPass);
                        mod.setNombre(txtNombre.getText());
                        mod.setCorreo(txtCorreo.getText());
                       if(combo_tipo.getSelectedItem().toString().equals("Administrador")){
                       mod.setId_tipo(1);
                       }else{
                       mod.setId_tipo(2);
                       }
                        

                        if (modSql.registrar(mod)) {
                         //   Menu.frregistro=null;
                            JOptionPane.showMessageDialog(null, "Registro guardado");
                            
                            
//                            u.tablaUsuario();
//                           u.propiedadesTabla();
                           limpiar();

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                        }
                    } else {
                         JOptionPane.showMessageDialog(null,"El correo electronico no es valido");
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "El usuario ya existe");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contranseñas no coiciden");
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       IniciarSesion.frmReg= null;
      Usuarios.frregistro=null;
    }//GEN-LAST:event_formWindowClosing

    
//    public void editarTipo(){
//        usuarios u = new usuarios();
//        SqlUsuarios sqlu = new SqlUsuarios();
//        u.setId_tipo("1");
//    if(u==true){
//    combo_tipo.setEnabled(true);
//    }else{
//        combo_tipo.setEnabled(false);
//    }
//    }
    public void limpiar(){
    this.txtConfirmarPassword.setText("");
    this.txtCorreo.setText("");
    this.txtNombre.setText("");
    this.txtPassword.setText("");
    this.txtUsuario.setText("");
    
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    public static javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel loginlogo;
    private javax.swing.JLabel loginlogo1;
    private javax.swing.JLabel loginlogo10;
    private javax.swing.JLabel loginlogo11;
    private javax.swing.JLabel loginlogo2;
    private javax.swing.JLabel loginlogo3;
    private javax.swing.JLabel loginlogo4;
    private javax.swing.JLabel loginlogo5;
    private javax.swing.JLabel loginlogo7;
    private javax.swing.JLabel loginlogo8;
    private javax.swing.JLabel loginlogo9;
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
