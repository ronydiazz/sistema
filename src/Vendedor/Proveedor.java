//
package Vendedor;

import javax.swing.JDialog;



public final class Proveedor extends JDialog {

    public Proveedor(Menu frmenu, boolean modal) {
        super(frmenu, modal);
        initComponents();
        
         setLocationRelativeTo(null);
      //   tablaProveedor();
       //  cargar("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelPestaña = new javax.swing.JTabbedPane();
        Pbuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_busdesc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_prov = new javax.swing.JTable();
        Preg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nomp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cont = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cont2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_sitio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_direc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_cod1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nomp1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_cont1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cont3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_sitio1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_email1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_direc1 = new javax.swing.JTextField();
        PanelBoton = new javax.swing.JPanel();
        btnRegProv = new javax.swing.JButton();
        btnModificarProv = new javax.swing.JButton();
        btnEliminarProv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(33, 45, 62));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PanelPestaña.setBackground(new java.awt.Color(33, 45, 62));

        Pbuscar.setBackground(new java.awt.Color(33, 45, 62));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar proveedor:");

        txt_busdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busdescKeyReleased(evt);
            }
        });

        tabla_prov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_prov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_provMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_prov);

        javax.swing.GroupLayout PbuscarLayout = new javax.swing.GroupLayout(Pbuscar);
        Pbuscar.setLayout(PbuscarLayout);
        PbuscarLayout.setHorizontalGroup(
            PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbuscarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_busdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PbuscarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PbuscarLayout.setVerticalGroup(
            PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbuscarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_busdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(339, Short.MAX_VALUE))
            .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbuscarLayout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        PanelPestaña.addTab("Buscar", Pbuscar);

        Preg.setBackground(new java.awt.Color(33, 45, 62));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");

        txt_cod.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cod.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Prov:");

        txt_nomp.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_nomp.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_nomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nompActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contacto:");

        txt_cont.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cont.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contacto 2:");

        txt_cont2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cont2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cont2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Sitio Web:");

        txt_sitio.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_sitio.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_sitio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sitioActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E-mail:");

        txt_email.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_email.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dirección:");

        txt_direc.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_direc.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_direc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PregLayout = new javax.swing.GroupLayout(Preg);
        Preg.setLayout(PregLayout);
        PregLayout.setHorizontalGroup(
            PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PregLayout.createSequentialGroup()
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PregLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_nomp, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PregLayout.createSequentialGroup()
                            .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_cont2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_cont, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel12)
                        .addGap(23, 23, 23)
                        .addComponent(txt_direc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel14)
                        .addGap(23, 23, 23)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel13)
                        .addGap(20, 20, 20)
                        .addComponent(txt_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PregLayout.setVerticalGroup(
            PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PregLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(txt_sitio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(txt_nomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(txt_direc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cont2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        PanelPestaña.addTab("Registrar", Preg);

        jPanel3.setBackground(new java.awt.Color(33, 45, 62));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código:");

        txt_cod1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cod1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre del Prov:");

        txt_nomp1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_nomp1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_nomp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomp1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contacto:");

        txt_cont1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cont1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cont1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cont1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contacto 2:");

        txt_cont3.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cont3.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cont3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sitio Web:");

        txt_sitio1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_sitio1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_sitio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sitio1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("E-mail:");

        txt_email1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_email1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Dirección:");

        txt_direc1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_direc1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_direc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direc1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cod1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_nomp1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_cont3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel17)
                        .addGap(23, 23, 23)
                        .addComponent(txt_direc1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel16)
                        .addGap(23, 23, 23)
                        .addComponent(txt_email1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel15)
                        .addGap(20, 20, 20)
                        .addComponent(txt_sitio1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(txt_sitio1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16))
                    .addComponent(txt_email1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(txt_nomp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(txt_direc1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cont1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cont3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        PanelPestaña.addTab("Modificar", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPestaña)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPestaña)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, 420));

        PanelBoton.setBackground(new java.awt.Color(33, 45, 62));
        PanelBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRegProv.setBackground(new java.awt.Color(33, 45, 62));
        btnRegProv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegProv.setForeground(new java.awt.Color(255, 255, 255));
        btnRegProv.setText("Registrar");
        btnRegProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProvActionPerformed(evt);
            }
        });

        btnModificarProv.setBackground(new java.awt.Color(33, 45, 62));
        btnModificarProv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificarProv.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProv.setText("Modificar");
        btnModificarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProvActionPerformed(evt);
            }
        });

        btnEliminarProv.setBackground(new java.awt.Color(33, 45, 62));
        btnEliminarProv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarProv.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProv.setText("Eliminar ");
        btnEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnModificarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegProv, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnEliminarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnRegProv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnModificarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEliminarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jPanel1.add(PanelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 160, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProvActionPerformed
       
  
    }//GEN-LAST:event_btnRegProvActionPerformed

    private void btnEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvActionPerformed

    }//GEN-LAST:event_btnEliminarProvActionPerformed

    private void btnModificarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProvActionPerformed

   
    }//GEN-LAST:event_btnModificarProvActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handliang code here:
     
        Menu.frproveedor=null;
    }//GEN-LAST:event_formWindowClosing

    private void txt_busdescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busdescKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busdescKeyReleased

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codActionPerformed

    private void txt_nompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nompActionPerformed

    private void txt_contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contActionPerformed

    private void txt_cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cont2ActionPerformed

    private void txt_sitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sitioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sitioActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_direcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direcActionPerformed

    private void txt_cod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod1ActionPerformed

    private void txt_nomp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomp1ActionPerformed

    private void txt_cont1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cont1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cont1ActionPerformed

    private void txt_cont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cont3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cont3ActionPerformed

    private void txt_sitio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sitio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sitio1ActionPerformed

    private void txt_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email1ActionPerformed

    private void txt_direc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direc1ActionPerformed

    private void tabla_provMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_provMouseClicked

    }//GEN-LAST:event_tabla_provMouseClicked
    
 
    
   
    
    
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Proveedor().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBoton;
    public javax.swing.JTabbedPane PanelPestaña;
    private javax.swing.JPanel Pbuscar;
    private javax.swing.JPanel Preg;
    public javax.swing.JButton btnEliminarProv;
    public javax.swing.JButton btnModificarProv;
    public javax.swing.JButton btnRegProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_prov;
    public javax.swing.JTextField txt_busdesc;
    public javax.swing.JTextField txt_cod;
    public javax.swing.JTextField txt_cod1;
    public javax.swing.JTextField txt_cont;
    public javax.swing.JTextField txt_cont1;
    public javax.swing.JTextField txt_cont2;
    public javax.swing.JTextField txt_cont3;
    public javax.swing.JTextField txt_direc;
    public javax.swing.JTextField txt_direc1;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_email1;
    public javax.swing.JTextField txt_nomp;
    public javax.swing.JTextField txt_nomp1;
    public javax.swing.JTextField txt_sitio;
    public javax.swing.JTextField txt_sitio1;
    // End of variables declaration//GEN-END:variables
}
