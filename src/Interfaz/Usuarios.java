/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.hash;
import Modelo.SqlUsuarios;
import Modelo.usuarios;
import Modelo.Conexion;
import controlador.ctrlUsuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author DELL
 */
public final class Usuarios extends javax.swing.JFrame {
public static ModificarUsuario frmodificar;
public static Registro frregistro;
public static ctrlUsuarios ctrlusu;
SqlUsuarios usuario = new SqlUsuarios();
usuarios usu = new usuarios();

    /**
     * Creates new form Proveedor
     */
    public Usuarios() {
        initComponents();
         setLocationRelativeTo(null);
         
//         tablaUsuario();
//         propiedadesTabla();
//         
         
//if(JFrame){}
//    }
//public void cerrar(){
//try{
//addWindowListener}
//catch(Exception e){
//    System.out.println(e);
//}
Usuarios u = new Usuarios();
ctrlUsuarios ctr= new ctrlUsuarios(usu, usuario, u);
ctr.cargar("");
u.setVisible(true);

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_bus = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        loginlogo3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        loginlogo7 = new javax.swing.JLabel();
        txtPasswordA = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        loginlogo8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loginlogo9 = new javax.swing.JLabel();
        loginlogo10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        loginlogo11 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        loginlogo12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        loginlogo6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_cod = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnEliminarProv = new javax.swing.JButton();
        btnModificarProv = new javax.swing.JButton();
        btnRegUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(33, 45, 62));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(33, 45, 62));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));

        tabla_usu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuMouseClicked(evt);
            }
        });
        tabla_usu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_usuKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usu);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar usuario:");

        txt_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busActionPerformed(evt);
            }
        });
        txt_bus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busKeyReleased(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel2);

        jPanel3.setBackground(new java.awt.Color(33, 45, 62));

        jPanel6.setBackground(new java.awt.Color(33, 45, 62));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlogo3.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo3.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo3.setText("CODIGO:");
        jPanel6.add(loginlogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email_30px.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 29, 40));

        txtConfirmarPassword.setBackground(new java.awt.Color(33, 45, 62));
        txtConfirmarPassword.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtConfirmarPassword.setForeground(new java.awt.Color(73, 181, 172));
        txtConfirmarPassword.setBorder(null);
        txtConfirmarPassword.setCaretColor(new java.awt.Color(73, 181, 172));
        jPanel6.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, -1));

        txtCorreo.setBackground(new java.awt.Color(33, 45, 62));
        txtCorreo.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(73, 181, 172));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 181, 172));
        txtCorreo.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtCorreo.setSelectionColor(new java.awt.Color(33, 45, 62));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel6.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 250, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 33, 35));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 10));

        loginlogo7.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo7.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo7.setText("CONTRASEÑA ACTUAL");
        jPanel6.add(loginlogo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

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
        jPanel6.add(txtPasswordA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 30, 30));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 290, 10));

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
        jPanel6.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 230, -1));

        jSeparator4.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator4.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 290, 10));

        loginlogo8.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo8.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo8.setText("CONFIRMAR CONTRASEÑA");
        jPanel6.add(loginlogo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 29, -1));

        loginlogo9.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo9.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo9.setText("TIPO");
        jPanel6.add(loginlogo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        loginlogo10.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo10.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo10.setText("NOMBRE Y APELLIDO");
        jPanel6.add(loginlogo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 29, 40));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(73, 181, 172));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(73, 181, 172));
        txtNombre.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtNombre.setSelectionColor(new java.awt.Color(33, 45, 62));
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 250, 30));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator5.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 290, 10));

        loginlogo11.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo11.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo11.setText("CORREO");
        jPanel6.add(loginlogo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        combo_tipo.setBackground(new java.awt.Color(33, 45, 62));
        combo_tipo.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        combo_tipo.setForeground(new java.awt.Color(255, 255, 255));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });
        jPanel6.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 240, 30));

        btnModificar.setBackground(new java.awt.Color(33, 45, 62));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel6.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 260, 50));

        loginlogo12.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo12.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo12.setText("CONTRASEÑA");
        jPanel6.add(loginlogo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 41));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 33, 35));

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
        jPanel6.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, -1));

        jSeparator6.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator6.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 270, 10));

        loginlogo6.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo6.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo6.setText("USUARIO");
        jPanel6.add(loginlogo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 115, 24));

        jSeparator7.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator7.setForeground(new java.awt.Color(73, 181, 172));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 10));

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
        jPanel6.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Registrar/Modificar", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 630, 460));

        jPanel5.setBackground(new java.awt.Color(33, 45, 62));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminarProv.setBackground(new java.awt.Color(33, 45, 62));
        btnEliminarProv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarProv.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProv.setText("Eliminar ");
        btnEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvActionPerformed(evt);
            }
        });

        btnModificarProv.setBackground(new java.awt.Color(33, 45, 62));
        btnModificarProv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificarProv.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProv.setText("Modificar ");
        btnModificarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProvActionPerformed(evt);
            }
        });

        btnRegUsuario.setBackground(new java.awt.Color(33, 45, 62));
        btnRegUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegUsuario.setText("Registrar");
        btnRegUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 150, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUsuarioActionPerformed
//        if(frregistro== null)
//        {
//        frregistro= new Registro();
//        frregistro.setVisible(true);
//        }
//        
    }//GEN-LAST:event_btnRegUsuarioActionPerformed

    private void btnEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvActionPerformed
        // TODO add your handling code here:
        /*
          SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();
        
        
        int fila= tabla_usu.getSelectedRow();
    //    txt_ide.setText(String.valueOf(tabla_usu.getValueAt(fila, 0)));
    //    String ide = String.valueOf(tabla_usu.getValueAt(fila, 0));
       int ide = (int)tabla_usu.getValueAt(fila, 0);
    //    int id = Integer.parseInt(ide);
         
      //  JOptionPane.showMessageDialog(this, ide+id);
        DefaultTableModel Tabla = new DefaultTableModel();
        try {
            if(fila<0){
            JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
           
            }else {
                 mod.setId(ide);
                if(JOptionPane.showConfirmDialog(this, "¿Eliminar el registro?", "",
                        JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                if(modSql.eliminarUsuario(mod)){
                    
                           
                JOptionPane.showMessageDialog(this, "Eliminado correctamente", "Información", JOptionPane.OK_OPTION);
      //          Tabla.removeRow(fila);
                tablaUsuario();
                          propiedadesTabla();
                }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar", "Información", JOptionPane.OK_CANCEL_OPTION);
                }
                }
            }
            
     
        }catch (Exception e){
        e.printStackTrace();
         JOptionPane.showMessageDialog(null, e);
        }
        */
    }//GEN-LAST:event_btnEliminarProvActionPerformed

    private void btnModificarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProvActionPerformed
     
        
        if(frmodificar== null){
       frmodificar= new ModificarUsuario();
       
       frmodificar.setVisible(true);
      // selectTabla();
       }




    }//GEN-LAST:event_btnModificarProvActionPerformed

    private void tabla_usuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuMouseClicked
 
   //     selectTabla();
        
        
    }//GEN-LAST:event_tabla_usuMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Menu.frusuarios=null;
    }//GEN-LAST:event_formWindowClosing

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
//        tablaUsuario();
//        propiedadesTabla();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tabla_usuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_usuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_usuKeyPressed

    private void txt_busKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busKeyReleased
        // TODO add your handling code here:
        ctrlusu.cargar(txt_bus.getText());
    }//GEN-LAST:event_txt_busKeyReleased

    private void txt_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busActionPerformed

    }//GEN-LAST:event_txt_busActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtPasswordAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //   Usuarios us = new Usuarios();
        /*
        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();
        usuarios mod1 = new usuarios();
        String pas_act = new String(txtPasswordA.getPassword());
        String pass_actual = hash.sha1(pas_act);
        String pass = new String(txtPassword.getPassword());
        String passCon = new String(txtConfirmarPassword.getPassword());
        String nuevoPass = hash.sha1(pass);
        //    int fila= tabla_usu.getSelectedRow();

        //      if(fila<0){
            //            JOptionPane.showMessageDialog(this, "Seleccione alguna fila");

            //      }else {
            if (txtUsuario.getText().equals("") || passCon.equals("") || txtNombre.getText().equals("") || txtCorreo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

            } else {
                //        mod1.setUsuario(txtUsuario.getText());
                mod1.setId(Integer.parseInt(txt_cod.getText()));
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
                                //tablaUsuario();
                                //   us.propiedadesTabla();

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
            //   }
        */
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codActionPerformed

    
    public void tablaUsuario(){
        SqlUsuarios sqlusu = new SqlUsuarios();
        usuarios usus = new usuarios();
    String [] columnas ={"ID","USUARIO","NOMBRE","CORREO","TIPO"};
    Object[] obj= new Object[5];
    DefaultTableModel Tabla = new DefaultTableModel(null, columnas);
    List ls;
    try{
    ls= usuario.mostrarUsuarios();
    
    for (int i=0;i<ls.size(); i++){
        
        usu =  (usuarios) ls.get(i);
        obj[0] = usu.getId();
        obj[1] = usu.getUsuario();
        obj[2] = usu.getNombre();
        obj[3] = usu.getCorreo();
        obj[4] = usu.getNombre_tipo();    
        Tabla.addRow(obj);
    }
   tabla_usu.setModel(Tabla);
   }catch (Exception e){
 //  e.printStackTrace();
   System.out.println(e);
   }

/*
       try{
       DefaultTableModel Tabla = new DefaultTableModel();
       tabla_usu.setModel(Tabla);
       

      }catch (Exception e){
    //  e.printStackTrace();
       System.out.println(e);
  }
*/
    }
    
    void cargar(String valor){
         
    String mostrar="SELECT id_usuario, usuario, nombre, correo, nombreTipo from usuarios inner join tipo_usuario on usuarios.id_tipo=tipo_usuario.id_tipousuario WHERE nombre LIKE '%"+valor+"%'";
    String []titulos={"ID","USUARIO","NOMBRE","CORREO","TIPO"};
    String []Registros=new String[5];
   DefaultTableModel model= new DefaultTableModel(null,titulos);
  
        try {
          Conexion cc = new Conexion(); 
          Connection cn=cc.getConexion();
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("id_usuario");
                  Registros[1]= rs.getString("usuario");
                  Registros[2]= rs.getString("nombre");
                  Registros[3]= rs.getString("correo");
                  Registros[4]= rs.getString("nombreTipo");        
                  model.addRow(Registros);
              }
              tabla_usu.setModel(model);
              tabla_usu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = tabla_usu.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(50);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
         columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(200);
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
    
    public void propiedadesTabla(){
             tabla_usu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         TableColumnModel columnModel = tabla_usu.getColumnModel();
         columnModel.getColumn(0).setPreferredWidth(50);
         columnModel.getColumn(1).setPreferredWidth(150);
         columnModel.getColumn(2).setPreferredWidth(200);
         columnModel.getColumn(3).setPreferredWidth(200);
         columnModel.getColumn(4).setPreferredWidth(200);
    }
    
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnEliminarProv;
    private javax.swing.JButton btnModificar;
    public javax.swing.JButton btnModificarProv;
    public javax.swing.JButton btnRegUsuario;
    public javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel loginlogo10;
    private javax.swing.JLabel loginlogo11;
    private javax.swing.JLabel loginlogo12;
    private javax.swing.JLabel loginlogo3;
    private javax.swing.JLabel loginlogo6;
    private javax.swing.JLabel loginlogo7;
    private javax.swing.JLabel loginlogo8;
    private javax.swing.JLabel loginlogo9;
    public static javax.swing.JTable tabla_usu;
    public javax.swing.JPasswordField txtConfirmarPassword;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JPasswordField txtPasswordA;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JTextField txt_bus;
    public javax.swing.JTextField txt_cod;
    // End of variables declaration//GEN-END:variables

    
}
