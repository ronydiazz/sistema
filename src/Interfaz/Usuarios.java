

package Interfaz;

import controlador.ctrlUsuarios;
import javax.swing.JDialog;


public final class Usuarios extends JDialog {
public static Registro frregistro;
public static ctrlUsuarios ctrlusu;
    
    public  Usuarios(Menu frmenu, boolean modal) {
         super(frmenu, modal);
        initComponents();
         setLocationRelativeTo(null);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tablepane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_bus = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        panel_reg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        loginlogo12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        loginlogo6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panel_mod = new javax.swing.JPanel();
        loginlogo4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtConfirmarPassword1 = new javax.swing.JPasswordField();
        txtCorreo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        loginlogo13 = new javax.swing.JLabel();
        txtPasswordA1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtUsuario1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        loginlogo14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        loginlogo15 = new javax.swing.JLabel();
        loginlogo16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        loginlogo17 = new javax.swing.JLabel();
        combo_tipo1 = new javax.swing.JComboBox<>();
        loginlogo18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        jSeparator13 = new javax.swing.JSeparator();
        loginlogo19 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        txt_cod1 = new javax.swing.JTextField();
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

        tablepane.setBackground(new java.awt.Color(33, 45, 62));
        tablepane.setForeground(new java.awt.Color(255, 255, 255));

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
                        .addGap(0, 224, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablepane.addTab("Buscar", jPanel2);

        panel_reg.setBackground(new java.awt.Color(33, 45, 62));
        panel_reg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email_30px.png"))); // NOI18N
        panel_reg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 29, 40));

        txtConfirmarPassword.setBackground(new java.awt.Color(33, 45, 62));
        txtConfirmarPassword.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtConfirmarPassword.setForeground(new java.awt.Color(73, 181, 172));
        txtConfirmarPassword.setBorder(null);
        txtConfirmarPassword.setCaretColor(new java.awt.Color(73, 181, 172));
        panel_reg.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, 30));

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
        panel_reg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 250, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        panel_reg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 33, 35));

        jSeparator3.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator3.setForeground(new java.awt.Color(73, 181, 172));
        panel_reg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 290, 10));

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
        panel_reg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 230, -1));

        jSeparator4.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator4.setForeground(new java.awt.Color(73, 181, 172));
        panel_reg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 290, 10));

        loginlogo8.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo8.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo8.setText("CONFIRMAR CONTRASEÑA");
        panel_reg.add(loginlogo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        panel_reg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 29, -1));

        loginlogo9.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo9.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo9.setText("TIPO");
        panel_reg.add(loginlogo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        loginlogo10.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo10.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo10.setText("NOMBRE Y APELLIDO");
        panel_reg.add(loginlogo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        panel_reg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 29, 40));

        txtNombre.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(73, 181, 172));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(73, 181, 172));
        txtNombre.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtNombre.setSelectionColor(new java.awt.Color(33, 45, 62));
        panel_reg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 250, 30));

        jSeparator5.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator5.setForeground(new java.awt.Color(73, 181, 172));
        panel_reg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 290, 10));

        loginlogo11.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo11.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo11.setText("CORREO");
        panel_reg.add(loginlogo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        combo_tipo.setBackground(new java.awt.Color(33, 45, 62));
        combo_tipo.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        combo_tipo.setForeground(new java.awt.Color(255, 255, 255));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });
        panel_reg.add(combo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 190, 30));

        loginlogo12.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo12.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo12.setText("CONTRASEÑA");
        panel_reg.add(loginlogo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        panel_reg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 33, 30));

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
        panel_reg.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 240, 30));

        jSeparator6.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator6.setForeground(new java.awt.Color(73, 181, 172));
        panel_reg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 10));

        loginlogo6.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo6.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo6.setText("USUARIO");
        panel_reg.add(loginlogo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 115, 24));

        jSeparator7.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator7.setForeground(new java.awt.Color(73, 181, 172));
        panel_reg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 10));

        tablepane.addTab("Registrar", panel_reg);

        panel_mod.setBackground(new java.awt.Color(33, 45, 62));
        panel_mod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginlogo4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo4.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo4.setText("CODIGO:");
        panel_mod.add(loginlogo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 24));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email_30px.png"))); // NOI18N
        panel_mod.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 29, 40));

        txtConfirmarPassword1.setBackground(new java.awt.Color(33, 45, 62));
        txtConfirmarPassword1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtConfirmarPassword1.setForeground(new java.awt.Color(73, 181, 172));
        txtConfirmarPassword1.setBorder(null);
        txtConfirmarPassword1.setCaretColor(new java.awt.Color(73, 181, 172));
        panel_mod.add(txtConfirmarPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, 30));

        txtCorreo1.setBackground(new java.awt.Color(33, 45, 62));
        txtCorreo1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtCorreo1.setForeground(new java.awt.Color(73, 181, 172));
        txtCorreo1.setBorder(null);
        txtCorreo1.setCaretColor(new java.awt.Color(73, 181, 172));
        txtCorreo1.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtCorreo1.setSelectionColor(new java.awt.Color(33, 45, 62));
        txtCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo1ActionPerformed(evt);
            }
        });
        panel_mod.add(txtCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 250, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        panel_mod.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 33, 35));

        jSeparator8.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator8.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 10));

        jSeparator9.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator9.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 10));

        loginlogo13.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo13.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo13.setText("CONTRASEÑA ACTUAL");
        panel_mod.add(loginlogo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        txtPasswordA1.setBackground(new java.awt.Color(33, 45, 62));
        txtPasswordA1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtPasswordA1.setForeground(new java.awt.Color(73, 181, 172));
        txtPasswordA1.setBorder(null);
        txtPasswordA1.setCaretColor(new java.awt.Color(73, 181, 172));
        txtPasswordA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordA1ActionPerformed(evt);
            }
        });
        panel_mod.add(txtPasswordA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        panel_mod.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 30, 30));

        jSeparator10.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator10.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 290, 10));

        txtUsuario1.setBackground(new java.awt.Color(33, 45, 62));
        txtUsuario1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(73, 181, 172));
        txtUsuario1.setBorder(null);
        txtUsuario1.setCaretColor(new java.awt.Color(73, 181, 172));
        txtUsuario1.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtUsuario1.setSelectionColor(new java.awt.Color(33, 45, 62));
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });
        panel_mod.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 230, -1));

        jSeparator11.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator11.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 290, 10));

        loginlogo14.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo14.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo14.setText("CONFIRMAR CONTRASEÑA");
        panel_mod.add(loginlogo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        panel_mod.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 29, -1));

        loginlogo15.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo15.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo15.setText("TIPO");
        panel_mod.add(loginlogo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        loginlogo16.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo16.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo16.setText("NOMBRE Y APELLIDO");
        panel_mod.add(loginlogo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        panel_mod.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 29, 40));

        txtNombre1.setBackground(new java.awt.Color(33, 45, 62));
        txtNombre1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(73, 181, 172));
        txtNombre1.setBorder(null);
        txtNombre1.setCaretColor(new java.awt.Color(73, 181, 172));
        txtNombre1.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txtNombre1.setSelectionColor(new java.awt.Color(33, 45, 62));
        panel_mod.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 250, 30));

        jSeparator12.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator12.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 290, 10));

        loginlogo17.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo17.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo17.setText("CORREO");
        panel_mod.add(loginlogo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        combo_tipo1.setBackground(new java.awt.Color(33, 45, 62));
        combo_tipo1.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        combo_tipo1.setForeground(new java.awt.Color(255, 255, 255));
        combo_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        combo_tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipo1ActionPerformed(evt);
            }
        });
        panel_mod.add(combo_tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 240, 30));

        loginlogo18.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo18.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo18.setText("CONTRASEÑA");
        panel_mod.add(loginlogo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 41));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lock_25px.png"))); // NOI18N
        panel_mod.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 33, 35));

        txtPassword1.setBackground(new java.awt.Color(33, 45, 62));
        txtPassword1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(73, 181, 172));
        txtPassword1.setBorder(null);
        txtPassword1.setCaretColor(new java.awt.Color(73, 181, 172));
        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });
        panel_mod.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 240, 30));

        jSeparator13.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator13.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 270, 10));

        loginlogo19.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        loginlogo19.setForeground(new java.awt.Color(255, 255, 255));
        loginlogo19.setText("USUARIO");
        panel_mod.add(loginlogo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 115, 24));

        jSeparator14.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator14.setForeground(new java.awt.Color(73, 181, 172));
        panel_mod.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 10));

        txt_cod1.setEditable(false);
        txt_cod1.setBackground(new java.awt.Color(33, 45, 62));
        txt_cod1.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        txt_cod1.setForeground(new java.awt.Color(73, 181, 172));
        txt_cod1.setBorder(null);
        txt_cod1.setCaretColor(new java.awt.Color(73, 181, 172));
        txt_cod1.setDisabledTextColor(new java.awt.Color(33, 45, 62));
        txt_cod1.setSelectionColor(new java.awt.Color(33, 45, 62));
        txt_cod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod1ActionPerformed(evt);
            }
        });
        panel_mod.add(txt_cod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 20));

        tablepane.addTab("Modificar", panel_mod);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablepane)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablepane)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 720, 410));

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
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 150, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUsuarioActionPerformed

    }//GEN-LAST:event_btnRegUsuarioActionPerformed

    private void btnEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvActionPerformed
      
    }//GEN-LAST:event_btnEliminarProvActionPerformed

    private void btnModificarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProvActionPerformed

    }//GEN-LAST:event_btnModificarProvActionPerformed

    private void tabla_usuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuMouseClicked
 
    }//GEN-LAST:event_tabla_usuMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      Menu.frusuarios=null;
    }//GEN-LAST:event_formWindowClosing

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
 
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tabla_usuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_usuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_usuKeyPressed

    private void txt_busKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busKeyReleased

    }//GEN-LAST:event_txt_busKeyReleased

    private void txt_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busActionPerformed

    }//GEN-LAST:event_txt_busActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo1ActionPerformed

    private void txtPasswordA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordA1ActionPerformed

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void combo_tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipo1ActionPerformed

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed

    private void txt_cod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod1ActionPerformed

    
    
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
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Usuarios().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnEliminarProv;
    public javax.swing.JButton btnModificarProv;
    public javax.swing.JButton btnRegUsuario;
    public javax.swing.JComboBox<String> combo_tipo;
    public javax.swing.JComboBox<String> combo_tipo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel loginlogo10;
    private javax.swing.JLabel loginlogo11;
    private javax.swing.JLabel loginlogo12;
    private javax.swing.JLabel loginlogo13;
    private javax.swing.JLabel loginlogo14;
    private javax.swing.JLabel loginlogo15;
    private javax.swing.JLabel loginlogo16;
    private javax.swing.JLabel loginlogo17;
    private javax.swing.JLabel loginlogo18;
    private javax.swing.JLabel loginlogo19;
    private javax.swing.JLabel loginlogo4;
    private javax.swing.JLabel loginlogo6;
    private javax.swing.JLabel loginlogo8;
    private javax.swing.JLabel loginlogo9;
    public javax.swing.JPanel panel_mod;
    public javax.swing.JPanel panel_reg;
    public static javax.swing.JTable tabla_usu;
    public javax.swing.JTabbedPane tablepane;
    public javax.swing.JPasswordField txtConfirmarPassword;
    public javax.swing.JPasswordField txtConfirmarPassword1;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtCorreo1;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombre1;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JPasswordField txtPassword1;
    public javax.swing.JPasswordField txtPasswordA1;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JTextField txtUsuario1;
    public javax.swing.JTextField txt_bus;
    public javax.swing.JTextField txt_cod1;
    // End of variables declaration//GEN-END:variables

    
}
