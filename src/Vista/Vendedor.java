//
package Vista;

import Modelo.SqlVendedor;
import Modelo.vendedor;
import controlador.ctrlCliente;
import controlador.ctrlVendedoragg;
import javax.swing.JDialog;



public final class Vendedor extends JDialog {
public static BuscarVendedor frbusvendedor;
public static Vendedor frvendedorr;
  public static ctrlVendedoragg ctrvend;

SqlVendedor vendedor = new SqlVendedor();
            
     vendedor vend = new vendedor ();  

    public Vendedor(Menu frmenu, boolean modal) {
        super(frmenu, modal);
    //    PanelPestaña.setEnabledAt(0, false);
   
        initComponents();
        //iniciar();
         setLocationRelativeTo(null);
         combo_tipo.setEnabled(false);
         combo_estado1.setEnabled(false);
         
//         txt_nomp.setEnabled(false);
//         txt_nomp2.setEnabled(false);
//         txt_email.setEnabled(false);
//         txt_email2.setEnabled(false);
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
        txt_bus_ci = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_vendedor = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_bus_nom = new javax.swing.JTextField();
        Preg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nomp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ci = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_direc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_comision = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txt_obs = new javax.swing.JTextField();
        btnbuscarusu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_usu = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_cod2 = new javax.swing.JTextField();
        combo_estado1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_comision1 = new javax.swing.JTextField();
        txt_salario1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_email2 = new javax.swing.JTextField();
        txt_direc2 = new javax.swing.JTextField();
        txt_obs1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_celular2 = new javax.swing.JTextField();
        txt_ci2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_nomp2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_usu1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PanelBoton = new javax.swing.JPanel();
        btnReg = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

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
        jLabel2.setText("Buscar por Cedula:");

        txt_bus_ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bus_ciKeyReleased(evt);
            }
        });

        tabla_vendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_vendedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_vendedor);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar por Nombre:");

        txt_bus_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bus_nomKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PbuscarLayout = new javax.swing.GroupLayout(Pbuscar);
        Pbuscar.setLayout(PbuscarLayout);
        PbuscarLayout.setHorizontalGroup(
            PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbuscarLayout.createSequentialGroup()
                .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PbuscarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_bus_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_bus_nom))
                    .addGroup(PbuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PbuscarLayout.setVerticalGroup(
            PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbuscarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_bus_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(PbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_bus_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
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
        jLabel3.setText("Nombre y Apellido:");

        txt_nomp.setEditable(false);
        txt_nomp.setEnabled(false);
        txt_nomp.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_nomp.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_nomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nompActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CI-Ruc:");

        txt_ci.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_ci.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Celular:");

        txt_celular.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_celular.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celularActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Salario:");

        txt_salario.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_salario.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E-mail:");

        txt_email.setEditable(false);
        txt_email.setEnabled(false);
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

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tipo:");

        txt_comision.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_comision.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_comision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comisionActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Comisón:");

        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Administrador", "Usuario" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Observación:");

        txt_obs.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_obs.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_obs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_obsActionPerformed(evt);
            }
        });

        btnbuscarusu.setBackground(new java.awt.Color(33, 45, 62));
        btnbuscarusu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscarusu.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarusu.setText("B");
        btnbuscarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarusuActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Obs: Para modificar usuario/nombre/tipo/email debe ser realizado en el modulo de usuarios");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuario:");

        txt_usu.setEditable(false);
        txt_usu.setEnabled(false);
        txt_usu.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_usu.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PregLayout = new javax.swing.GroupLayout(Preg);
        Preg.setLayout(PregLayout);
        PregLayout.setHorizontalGroup(
            PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PregLayout.createSequentialGroup()
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PregLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_obs, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PregLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_direc, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PregLayout.createSequentialGroup()
                        .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addComponent(txt_celular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PregLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnbuscarusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PregLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(txt_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(58, 58, 58)
                        .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txt_comision, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PregLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        PregLayout.setVerticalGroup(
            PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PregLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel18)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_comision, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(23, 23, 23)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        PanelPestaña.addTab("Registrar", Preg);

        jPanel3.setBackground(new java.awt.Color(33, 45, 62));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Código:");

        txt_cod2.setEditable(false);
        txt_cod2.setEnabled(false);
        txt_cod2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_cod2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_cod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod2ActionPerformed(evt);
            }
        });

        combo_estado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Administrador", "Usuario" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Estado:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Comisón:");

        txt_comision1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_comision1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_comision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comision1ActionPerformed(evt);
            }
        });

        txt_salario1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_salario1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_salario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salario1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Salario:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("E-mail:");

        txt_email2.setEditable(false);
        txt_email2.setEnabled(false);
        txt_email2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_email2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email2ActionPerformed(evt);
            }
        });

        txt_direc2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_direc2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_direc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direc2ActionPerformed(evt);
            }
        });

        txt_obs1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_obs1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_obs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_obs1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Observación:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Dirección:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Celular:");

        txt_celular2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_celular2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_celular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celular2ActionPerformed(evt);
            }
        });

        txt_ci2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_ci2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_ci2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ci2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CI-Ruc:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Nombre y Apellido:");

        txt_nomp2.setEditable(false);
        txt_nomp2.setEnabled(false);
        txt_nomp2.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_nomp2.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_nomp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomp2ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Obs: Para modificar usuario/nombre/tipo/email debe ser realizado en el modulo de usuarios");

        txt_usu1.setEditable(false);
        txt_usu1.setEnabled(false);
        txt_usu1.setMinimumSize(new java.awt.Dimension(6, 25));
        txt_usu1.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_usu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usu1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuario:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_obs1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_direc2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_nomp2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel27))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_celular2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_ci2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_cod2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_usu1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_salario1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txt_email2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txt_comision1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(combo_estado1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_usu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21)
                    .addComponent(combo_estado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txt_comision1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ci2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel23)
                    .addComponent(txt_salario1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_celular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel24)
                    .addComponent(txt_email2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_direc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_obs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 950, 480));

        PanelBoton.setBackground(new java.awt.Color(33, 45, 62));
        PanelBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnReg.setBackground(new java.awt.Color(33, 45, 62));
        btnReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 255, 255));
        btnReg.setText("Registrar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(33, 45, 62));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(33, 45, 62));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(33, 45, 62));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonLayout = new javax.swing.GroupLayout(PanelBoton);
        PanelBoton.setLayout(PanelBotonLayout);
        PanelBotonLayout.setHorizontalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReg, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanelBotonLayout.setVerticalGroup(
            PanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jPanel1.add(PanelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 200, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
       
  
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

   
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handliang code here:
     
        Menu.frvendedor=null;
    }//GEN-LAST:event_formWindowClosing

    private void tabla_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_vendedorMouseClicked

    }//GEN-LAST:event_tabla_vendedorMouseClicked

    private void txt_bus_ciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bus_ciKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bus_ciKeyReleased

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codActionPerformed

    private void txt_nompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nompActionPerformed

    private void txt_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciActionPerformed

    private void txt_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celularActionPerformed

    private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_direcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direcActionPerformed

    private void txt_bus_nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bus_nomKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bus_nomKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txt_comisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comisionActionPerformed

    private void txt_obsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_obsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_obsActionPerformed

    private void txt_cod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod2ActionPerformed

    private void txt_comision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comision1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comision1ActionPerformed

    private void txt_salario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salario1ActionPerformed

    private void txt_email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email2ActionPerformed

    private void txt_direc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direc2ActionPerformed

    private void txt_obs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_obs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_obs1ActionPerformed

    private void txt_celular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celular2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celular2ActionPerformed

    private void txt_ci2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ci2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ci2ActionPerformed

    private void txt_nomp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomp2ActionPerformed

    private void btnbuscarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarusuActionPerformed
        // TODO add your handling code here:
              if(frbusvendedor == null){
         //  frusuarios = new Usuarios();
       // frusuarios.setVisible(true);
 
   frbusvendedor = new BuscarVendedor(frvendedorr, true);
   ctrvend= new ctrlVendedoragg(vend, vendedor, frbusvendedor);

  ctrvend.iniciar();
frbusvendedor.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnbuscarusuActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void txt_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuActionPerformed

    private void txt_usu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usu1ActionPerformed
    
 
    
   
    
    
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
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnReg;
    public javax.swing.JButton btnbuscarusu;
    public static javax.swing.JComboBox<String> combo_estado1;
    public static javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    public static javax.swing.JTable tabla_vendedor;
    public javax.swing.JTextField txt_bus_ci;
    public javax.swing.JTextField txt_bus_nom;
    public javax.swing.JTextField txt_celular;
    public javax.swing.JTextField txt_celular2;
    public javax.swing.JTextField txt_ci;
    public javax.swing.JTextField txt_ci2;
    public javax.swing.JTextField txt_cod;
    public javax.swing.JTextField txt_cod2;
    public javax.swing.JTextField txt_comision;
    public javax.swing.JTextField txt_comision1;
    public javax.swing.JTextField txt_direc;
    public javax.swing.JTextField txt_direc2;
    public static javax.swing.JTextField txt_email;
    public static javax.swing.JTextField txt_email2;
    public static javax.swing.JTextField txt_nomp;
    public static javax.swing.JTextField txt_nomp2;
    public javax.swing.JTextField txt_obs;
    public javax.swing.JTextField txt_obs1;
    public javax.swing.JTextField txt_salario;
    public javax.swing.JTextField txt_salario1;
    public static javax.swing.JTextField txt_usu;
    public static javax.swing.JTextField txt_usu1;
    // End of variables declaration//GEN-END:variables
}
