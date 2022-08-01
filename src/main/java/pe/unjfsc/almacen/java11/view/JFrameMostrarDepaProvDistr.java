package pe.unjfsc.almacen.java11.view;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.unjfsc.almacen.java11.entity.CEDepartamentoAlmacen;
import pe.unjfsc.almacen.java11.entity.CEDistritoAlmacen;
import pe.unjfsc.almacen.java11.entity.CEProvinciaAlmacen;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarDepartamentoAHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarDistritoAHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarProvinciaHashSet;

public class JFrameMostrarDepaProvDistr extends javax.swing.JFrame {

    DefaultTableModel objDtm;
    DefaultTableModel objDtm2;
    DefaultTableModel objDtm3;
    ResultSet rsDepartamento;
    ResultSet rsDistrito;
    ResultSet rsProvincia;

    int xidEmpleado;
    int xidcargo;
    int xiddepartamento, xidprovincia, xiddistrito;

    boolean sw;

    CMCambiarDepartamentoAHashSet oCMDepartamento = new CMCambiarDepartamentoAHashSet();
    CMCambiarDistritoAHashSet oCMDistrito = new CMCambiarDistritoAHashSet();
    CMCambiarProvinciaHashSet oCMProvincia = new CMCambiarProvinciaHashSet();

    public JFrameMostrarDepaProvDistr() {
        initComponents();
        setSize(967, 468);
        setLocationRelativeTo(null);
        objDtm = (DefaultTableModel) tbDepa.getModel();
        objDtm3 = (DefaultTableModel) tbProv.getModel();
        objDtm2 = (DefaultTableModel) tbDistrito.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombdistrito = new javax.swing.JTextField();
        txtiddistrito = new javax.swing.JTextField();
        cbidprovincia = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDistrito = new javax.swing.JTable();
        RB3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtnombprovincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtidprovincia = new javax.swing.JTextField();
        cbiddepart = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProv = new javax.swing.JTable();
        RB2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        tableDepart = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnombdepartamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtiddepartamento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDepa = new javax.swing.JTable();
        RB1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("ID");

        jLabel7.setText("NOMBRE");

        jLabel8.setText("PROVINCIA");

        txtnombdistrito.setEditable(false);

        txtiddistrito.setEditable(false);

        cbidprovincia.setEnabled(false);

        tbDistrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PROVINCIA", "DEPARTAMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDistrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDistritoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDistrito);

        buttonGroup1.add(RB3);
        RB3.setText("SELCCIONAR");
        RB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RB3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtiddistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombdistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbidprovincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtiddistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnombdistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbidprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RB3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 260, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("ID");

        txtnombprovincia.setEditable(false);

        jLabel9.setText("NOMBRE");

        txtidprovincia.setEditable(false);

        cbiddepart.setEnabled(false);

        jLabel11.setText("DEPARTAMENTO");

        tbProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DEPARTAMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProv);

        buttonGroup1.add(RB2);
        RB2.setText("SELECCIONAR");
        RB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbiddepart, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RB2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtnombprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbiddepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RB2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 280, 280));

        jPanel4.setBackground(new java.awt.Color(58, 78, 121));

        btnCancelar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, 40));

        tableDepart.setBackground(new java.awt.Color(255, 255, 255));
        tableDepart.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("ID");

        txtnombdepartamento.setEditable(false);
        txtnombdepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombdepartamentoActionPerformed(evt);
            }
        });

        jLabel10.setText("NOMBRE");

        txtiddepartamento.setEditable(false);

        tbDepa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDepa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDepa);

        buttonGroup1.add(RB1);
        RB1.setText("SELECCIONAR");
        RB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tableDepartLayout = new javax.swing.GroupLayout(tableDepart);
        tableDepart.setLayout(tableDepartLayout);
        tableDepartLayout.setHorizontalGroup(
            tableDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableDepartLayout.createSequentialGroup()
                .addGroup(tableDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableDepartLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(tableDepartLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(tableDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tableDepartLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtiddepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tableDepartLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(tableDepartLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(RB1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableDepartLayout.setVerticalGroup(
            tableDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableDepartLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(tableDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtiddepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(tableDepartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtnombdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RB1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(tableDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 280));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DEPARTAMENTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PROVINCIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("DISTRITO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, 40));

        jPanel6.setBackground(new java.awt.Color(58, 78, 121));

        btnGrabar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setBorderPainted(false);
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 130, 40));

        jPanel7.setBackground(new java.awt.Color(231, 96, 76));

        btnSalir.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sal.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 820, 470));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorderPainted(false);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 51));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 247, 150, 57));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 163, 150, 55));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habilitaControles(boolean b) {
        txtnombdepartamento.setEditable(b);
        txtnombdistrito.setEditable(b);
        txtnombprovincia.setEditable(b);

        cbiddepart.setEnabled(b);
        cbidprovincia.setEnabled(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);

        btnSalir.setEnabled(!b);

    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void RB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB1MouseClicked

        if (RB1.isSelected()) {
            limpiarControles();
            limpiaJTableDist();
            limpiaJTableProv();
            txtiddepartamento.setEditable(true);
            txtnombdepartamento.setEditable(true);
            txtidprovincia.setEditable(false);
            txtnombprovincia.setEditable(false);
            txtiddistrito.setEditable(false);
            txtnombdistrito.setEditable(false);
            cbiddepart.setEnabled(false);
            mostrarDepartamento();
        }


    }//GEN-LAST:event_RB1MouseClicked

    private void txtnombdepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombdepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombdepartamentoActionPerformed

    private void RB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB2MouseClicked

        if (RB2.isSelected()) {
            limpiarControles();
            limpiaJTable();
            limpiaJTableDist();

            txtiddepartamento.setEditable(false);
            txtnombdepartamento.setEditable(false);
            txtidprovincia.setEditable(true);
            txtnombprovincia.setEditable(true);
            txtiddistrito.setEditable(false);
            txtnombdistrito.setEditable(false);

            cbidprovincia.setEnabled(false);
            cbiddepart.setEnabled(true);

            cbiddepart.removeAllItems();
            llenaComboDepa();

            mostrarProvincia();

        }
    }//GEN-LAST:event_RB2MouseClicked

    private void RB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB3MouseClicked
        if (RB3.isSelected()) {
            limpiarControles();

            limpiaJTable();
            limpiaJTableProv();
            txtiddepartamento.setEditable(false);
            txtnombdepartamento.setEditable(false);
            txtidprovincia.setEditable(false);
            txtnombprovincia.setEditable(false);
            txtiddistrito.setEditable(true);
            txtnombdistrito.setEditable(true);
            cbidprovincia.setEnabled(true);
            cbiddepart.setEnabled(false);
            cbidprovincia.removeAllItems();
            llenaComboProv();

            mostrarDistrito();

        }
    }//GEN-LAST:event_RB3MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        //  habilitaControles(true);
        limpiarControles();
        sw = true;


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if (RB1.isSelected()) {

            System.out.println("Entrando a grabar DEPARTAMENTO");

            try {
                if (!txtnombdepartamento.getText().isEmpty()) {
                    CEDepartamentoAlmacen departamento = new CEDepartamentoAlmacen();

                    departamento.setNombDepa(txtnombdepartamento.getText().trim());

                    if (sw) {
                        oCMDepartamento.saveAlmacenCIC(departamento);
                        // LOG.info("[FSI] Dato Grabado : {}");
                        System.out.println("dato grabado");
                    } else {
                        departamento.setidDepartamento(Integer.parseInt(txtiddepartamento.getText()));
                        oCMDepartamento.modificarAlmacenCIC(departamento);
                        System.out.println(" DEPARTAMENTO EDITADO CON EXITO");
                        //LOG.info("[FSI] Dato Editado : {}");
                    }

                    mostrarDepartamento();
                } else {
                    //LOG.info("[FSI] Error al ingreso de datos : {} ", txtidempleado.getText(), " - ", txtdni.getText());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: " + e);
            }
        }
        if (RB2.isSelected()) {

            //   === aqui el grabrar de provincia ==
            System.out.println("Entrando a grabar PROVINCIA");
            try {
                if (!txtnombprovincia.getText().isEmpty()) {
                    CEProvinciaAlmacen provincia = new CEProvinciaAlmacen();

                    provincia.setNombProvincia(txtnombprovincia.getText().trim());
                    // DEPARTAMENTO
                    obtenerNombdepa();
                    provincia.setIdDepartamento(xiddepartamento);

                    if (sw) {
                        oCMProvincia.saveAlmacenCIC(provincia);
                        // LOG.info("[FSI] Dato Grabado : {}");
                        System.out.println("Provincia grabado");
                    } else {

                        provincia.setIdProvincia(Integer.parseInt(txtidprovincia.getText()));
                        oCMProvincia.modificarAlmacenCIC(provincia);
                        System.out.println(" PROVINCIA EDITADOA CON EXITO");
                        //LOG.info("[FSI] Dato Editado : {}");
                    }

                    mostrarProvincia();
                } else {
                    //LOG.info("[FSI] Error al ingreso de datos : {} ", txtidempleado.getText(), " - ", txtdni.getText());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: " + e);
            }

        }
        if (RB3.isSelected()) {
            System.out.println("Entrando a grabar DISTRITO");

            //   === aqui el grabrar de DISTRITOP ==
            try {
                if (!txtnombdistrito.getText().isEmpty()) {
                    CEDistritoAlmacen distrito = new CEDistritoAlmacen();

                    distrito.setNombDistrito(txtnombdistrito.getText().trim());
                    // DEPARTAMENTO
                    obtenerNombprov();
                    distrito.setIdProvincia(xidprovincia);

                    if (sw) {
                        oCMDistrito.saveAlmacenCIC(distrito);
                        // LOG.info("[FSI] Dato Grabado : {}");
                        System.out.println("Distrito grabado");
                    } else {
                           distrito.setIdDistrito(Integer.parseInt(txtiddistrito.getText()));
                        oCMDistrito.modificarAlmacenCIC(distrito);
                        System.out.println(" DIstrito EDITADOA CON EXITO");
                        //LOG.info("[FSI] Dato Editado : {}");

                    }

                    mostrarDistrito();
                } else {
                    //LOG.info("[FSI] Error al ingreso de datos : {} ", txtidempleado.getText(), " - ", txtdni.getText());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "ERROR: " + e);
            }

        }

    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (RB1.isSelected()) {
            limpiarControles();
            habilitaControles(true);
            sw = false;
        }
        if (RB2.isSelected()) {
           // limpiarControles();

            habilitaControles(true);
            sw = false;
            llenaComboDepa();
        }
        if (RB3.isSelected()) {
           // limpiarControles();

            habilitaControles(true);
            sw = false;
            llenaComboProv();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tbDepaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepaMouseClicked

        try {
            xiddepartamento = Integer.parseInt(tbDepa.getValueAt(tbDepa.getSelectedRow(), 0).toString());
            rsDepartamento.first();
            do {
                if (xiddepartamento == rsDepartamento.getInt(1)) {
                    txtiddepartamento.setText(rsDepartamento.getInt(1) + "");
                    txtnombdepartamento.setText(rsDepartamento.getString(2));

                    System.out.println("zi");
                    rsDepartamento.last();
                }
            } while (rsDepartamento.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


    }//GEN-LAST:event_tbDepaMouseClicked

    private void tbProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProvMouseClicked
        try {
            xidprovincia = Integer.parseInt(tbProv.getValueAt(tbProv.getSelectedRow(), 0).toString());
            rsProvincia.first();
            do {
                if (xidprovincia == rsProvincia.getInt(1)) {
                    txtidprovincia.setText(tbProv.getValueAt(tbProv.getSelectedRow(), 0).toString());
                    txtnombprovincia.setText(tbProv.getValueAt(tbProv.getSelectedRow(), 1).toString());
                    cbiddepart.removeAllItems();
                    cbiddepart.addItem(rsProvincia.getString(3));
                    rsProvincia.last();
                }
            } while (rsProvincia.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_tbProvMouseClicked

    private void tbDistritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDistritoMouseClicked
        try {
            xiddistrito = Integer.parseInt(tbDistrito.getValueAt(tbDistrito.getSelectedRow(), 0).toString());
            rsDistrito.first();
            do {
                if (xiddistrito == rsDistrito.getInt(1)) {
                    txtiddistrito.setText(tbDistrito.getValueAt(tbDistrito.getSelectedRow(), 0).toString());
                    txtnombdistrito.setText(tbDistrito.getValueAt(tbDistrito.getSelectedRow(), 1).toString());
                    cbidprovincia.removeAllItems();
                    cbidprovincia.addItem(rsDistrito.getString(3));
                    rsDistrito.last();
                }
            } while (rsDistrito.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_tbDistritoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (RB1.isSelected()) {
            try {
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (!txtiddepartamento.getText().isEmpty()) {
                    if (op == JOptionPane.YES_OPTION) {
                        CEDepartamentoAlmacen depa = new CEDepartamentoAlmacen();
                        depa.setidDepartamento(Integer.parseInt(txtiddepartamento.getText()));
                        oCMDepartamento.eliminarAlmacenCIC(depa);
                        limpiarControles();
                        JOptionPane.showMessageDialog(rootPane, "Registro borrado");
                        mostrarDepartamento();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }

        if (RB2.isSelected()) {
            try {
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (!txtidprovincia.getText().isEmpty()) {
                    if (op == JOptionPane.YES_OPTION) {
                        CEProvinciaAlmacen prov = new CEProvinciaAlmacen();
                        prov.setIdProvincia(Integer.parseInt(txtidprovincia.getText()));
                        oCMProvincia.eliminarAlmacenCIC(prov);
                        limpiarControles();
                        JOptionPane.showMessageDialog(rootPane, "Registro borrado");
                        mostrarProvincia();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }

        if (RB3.isSelected()) {
            try {
                int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (!txtiddistrito.getText().isEmpty()) {
                    if (op == JOptionPane.YES_OPTION) {
                        CEDistritoAlmacen dist = new CEDistritoAlmacen();
                        dist.setIdDistrito(Integer.parseInt(txtiddistrito.getText()));
                        oCMDistrito.eliminarAlmacenCIC(dist);
                        limpiarControles();
                        JOptionPane.showMessageDialog(rootPane, "Registro borrado");
                        mostrarDistrito();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void mostrarDepartamento() {
        limpiaJTable();

        try {
            rsDepartamento = oCMDepartamento.mostrar();
            while (rsDepartamento.next()) {
                Object registro[] = {rsDepartamento.getInt(1), rsDepartamento.getString(2)};
                objDtm.addRow(registro);
                System.out.println(registro);
            }
        } catch (Exception e) {
        }
    }

    private void limpiaJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void limpiaJTableProv() {
        while (objDtm3.getRowCount() > 0) {
            objDtm3.removeRow(0);
        }
    }

    private void limpiaJTableDist() {
        while (objDtm2.getRowCount() > 0) {
            objDtm2.removeRow(0);
        }
    }

    private void mostrarDistrito() {
        limpiaJTableDist();

        try {
            rsDistrito = oCMDistrito.mostrar();
            while (rsDistrito.next()) {
                Object registro[] = {rsDistrito.getInt(1), rsDistrito.getString(2), rsDistrito.getString(3), rsDistrito.getString(4)};
                objDtm2.addRow(registro);
                System.out.println(registro);
            }
        } catch (Exception e) {
        }
    }

    private void mostrarProvincia() {
        limpiaJTableProv();

        try {
            rsProvincia = oCMProvincia.mostrar();
            while (rsProvincia.next()) {
                Object registro[] = {rsProvincia.getInt(1), rsProvincia.getString(2), rsProvincia.getString(3)};
                objDtm3.addRow(registro);
                System.out.println(registro);
            }
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbiddepart;
    private javax.swing.JComboBox<String> cbidprovincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel tableDepart;
    private javax.swing.JTable tbDepa;
    private javax.swing.JTable tbDistrito;
    private javax.swing.JTable tbProv;
    private javax.swing.JTextField txtiddepartamento;
    private javax.swing.JTextField txtiddistrito;
    private javax.swing.JTextField txtidprovincia;
    private javax.swing.JTextField txtnombdepartamento;
    private javax.swing.JTextField txtnombdistrito;
    private javax.swing.JTextField txtnombprovincia;
    // End of variables declaration//GEN-END:variables

    private void llenaComboDepa() {

        try {

            rsDepartamento = oCMDepartamento.buscar("%");

            while (rsDepartamento.next()) {
                cbiddepart.addItem(rsDepartamento.getString(2));
            }

        } catch (Exception e) {
        }
    }

    private String obtenerNombdepa() {
        try {

            String nombre = cbiddepart.getSelectedItem().toString();

            rsDepartamento.first();

            do {
                if (nombre.equals(rsDepartamento.getString(2))) {
                    xiddepartamento = rsDepartamento.getInt(1);
                    rsDepartamento.last();
                }
            } while (rsDepartamento.next());
            return nombre;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(rootPane, e);
        }
        return null;

    }

    private String obtenerNombprov() {
        try {
            String nombre = cbidprovincia.getSelectedItem().toString();
            rsProvincia.first();

            do {
                if (nombre.equals(rsProvincia.getString(2))) {
                    xidprovincia = rsProvincia.getInt(1);
                    rsProvincia.last();
                }
            } while (rsProvincia.next());
            return nombre;
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(rootPane, e);
        }
        return null;
    }

    private void llenaComboProv() {

        try {
            rsProvincia = oCMProvincia.buscar("%");

            while (rsProvincia.next()) {
                cbidprovincia.addItem(rsProvincia.getString(2));
            }

        } catch (Exception e) {
        }
    }

    private void limpiarControles() {
        txtiddepartamento.setText(null);
        txtiddistrito.setText(null);
        txtidprovincia.setText(null);

        txtnombdepartamento.setText(null);
        txtnombprovincia.setText(null);
        txtnombdistrito.setText(null);
        cbiddepart.removeAllItems();
        cbidprovincia.removeAllItems();

    }
}
