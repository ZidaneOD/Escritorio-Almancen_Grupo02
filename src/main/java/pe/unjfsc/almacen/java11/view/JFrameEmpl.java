package pe.unjfsc.almacen.java11.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JFrameEmpl extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameEmpl");

    public JFrameEmpl() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblSalir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        btnEstadoTrans = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnMarca = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnEmpaquetado = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnCate = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnUM = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnSabor = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btnProducto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        BtntrasRegis = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-user-37.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Área de almacenaje");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/perfil1-modified (1).png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel3.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabel3.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, 180));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("son los más importantes.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 260, 30));

        jlblSalir.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jlblSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-exit-30.png"))); // NOI18N
        jlblSalir.setText("Cerrar Sesión");
        jlblSalir.setToolTipText("");
        jlblSalir.setFocusable(false);
        jlblSalir.setName(""); // NOI18N
        jlblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblSalirMouseClicked(evt);
            }
        });
        jPanel2.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 70));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuestros usuarios ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 220, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 260, 20));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ing. Juan Flores Cueto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 700));

        jSeparator2.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator2.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 610, 20));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstadoTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-central-air-conditioning-80.png"))); // NOI18N
        btnEstadoTrans.setContentAreaFilled(false);
        btnEstadoTrans.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstadoTrans.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnEstadoTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoTransActionPerformed(evt);
            }
        });
        jPanel8.add(btnEstadoTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 220, 90));

        jLabel9.setBackground(new java.awt.Color(58, 78, 121));
        jLabel9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 78, 121));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ESTADO DE LA TRANSACCIÓN");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("productos a ingresar al área de almacén.");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 30));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Creación y edición de los nuevos ");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 280, 170));

        jLabel10.setBackground(new java.awt.Color(58, 78, 121));
        jLabel10.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 78, 121));
        jLabel10.setText("PRODUCTO Y MÁS SERVICIOS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 410, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-brand-80.png"))); // NOI18N
        btnMarca.setContentAreaFilled(false);
        btnMarca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMarca.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaActionPerformed(evt);
            }
        });
        jPanel7.add(btnMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 90));

        jLabel15.setBackground(new java.awt.Color(58, 78, 121));
        jLabel15.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 78, 121));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MARCA");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Seguimiento de los productos");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 20));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("en almacén, hasta transporte.");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 20));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, 170));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpaquetado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-package-80.png"))); // NOI18N
        btnEmpaquetado.setContentAreaFilled(false);
        btnEmpaquetado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpaquetado.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnEmpaquetado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpaquetadoActionPerformed(evt);
            }
        });
        jPanel9.add(btnEmpaquetado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 90));

        jLabel18.setBackground(new java.awt.Color(58, 78, 121));
        jLabel18.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(58, 78, 121));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("EMPAQUETADO");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("sobre su ubicación actual.");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 190, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Detalles de los almacenes");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 190, 170));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-sorting-80.png"))); // NOI18N
        btnCate.setContentAreaFilled(false);
        btnCate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCate.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCateActionPerformed(evt);
            }
        });
        jPanel10.add(btnCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 100));

        jLabel21.setBackground(new java.awt.Color(58, 78, 121));
        jLabel21.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 78, 121));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("CATEGORIA");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("marcas de los proveedores.");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 190, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Creación, edición de los nuevas ");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 190, 180));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-ovality-sensor-80.png"))); // NOI18N
        btnUM.setContentAreaFilled(false);
        btnUM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUM.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUMActionPerformed(evt);
            }
        });
        jPanel11.add(btnUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 100));

        jLabel24.setBackground(new java.awt.Color(58, 78, 121));
        jLabel24.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(58, 78, 121));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("UNIDAD DE MEDIDA");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tipos de medida usados en almacen");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("para empaquetados.");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, 180));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-taste-80.png"))); // NOI18N
        btnSabor.setContentAreaFilled(false);
        btnSabor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSabor.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaborActionPerformed(evt);
            }
        });
        jPanel12.add(btnSabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 100));

        jLabel27.setBackground(new java.awt.Color(58, 78, 121));
        jLabel27.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(58, 78, 121));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("SABOR");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 30));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("marcas de los proveedores.");
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 190, 30));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Corbel", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Creación, edición de los nuevas ");
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 30));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 190, 180));

        jSeparator3.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator3.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 610, 20));

        jLabel12.setBackground(new java.awt.Color(58, 78, 121));
        jLabel12.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 78, 121));
        jLabel12.setText("PRODUCTO Y MÁS SERVICIOS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 410, 40));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-product-80.png"))); // NOI18N
        btnProducto.setContentAreaFilled(false);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel13.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 90));

        jLabel13.setBackground(new java.awt.Color(58, 78, 121));
        jLabel13.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 78, 121));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PRODUCTO A REGISTRAR");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Corbel", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("productos a ingresar al área de almacén.");
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 30));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Corbel", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Creación y edición de los nuevos ");
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 30));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 240, 170));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtntrasRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp/icons8-transaction-80.png"))); // NOI18N
        BtntrasRegis.setContentAreaFilled(false);
        BtntrasRegis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtntrasRegis.setMargin(new java.awt.Insets(4, 16, 4, 16));
        BtntrasRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtntrasRegisActionPerformed(evt);
            }
        });
        jPanel14.add(BtntrasRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 90));

        jLabel30.setBackground(new java.awt.Color(58, 78, 121));
        jLabel30.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(58, 78, 121));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("TRANSACCIÓN A REGISTRAR");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 30));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("productos a ingresar al área de almacén.");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 30));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Creación y edición de los nuevos ");
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 30));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 250, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 940, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSalirMouseClicked
        LOG.info("[FSI] Star boton Salir : ");
        try {
            dispose();
            JFrameLogin d = new JFrameLogin();
            d.setVisible(true);

        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
    }//GEN-LAST:event_jlblSalirMouseClicked

    private void btnEstadoTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoTransActionPerformed
        LOG.info("[FSI] Star boton ir a Estado de Transaccion : ");
        JFrameMostrarEstadoTransaccion a = new JFrameMostrarEstadoTransaccion();
        a.setVisible(true);
    }//GEN-LAST:event_btnEstadoTransActionPerformed

    private void btnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaActionPerformed
        LOG.info("[FSI] Star boton ir a Marca: ");
        JFrameMostrarMarcaProducto a = new JFrameMostrarMarcaProducto();
        a.setVisible(true);
    }//GEN-LAST:event_btnMarcaActionPerformed

    private void btnEmpaquetadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpaquetadoActionPerformed
        LOG.info("[FSI] Star boton ir a Empaquetado: ");
        JFrameMostrarEmpaqueProducto a = new JFrameMostrarEmpaqueProducto();
        a.setVisible(true);
    }//GEN-LAST:event_btnEmpaquetadoActionPerformed

    private void btnCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCateActionPerformed
        LOG.info("[FSI] Star boton ir a Categoria : ");
        JFrameMostrarCategoriaProducto a = new JFrameMostrarCategoriaProducto();
        a.setVisible(true);
    }//GEN-LAST:event_btnCateActionPerformed

    private void btnUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUMActionPerformed
        LOG.info("[FSI] Star boton ir a Unidad Medida : ");
        JFrameMostrarUnidadMedida a = new JFrameMostrarUnidadMedida();
        a.setVisible(true);
    }//GEN-LAST:event_btnUMActionPerformed

    private void btnSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaborActionPerformed
        LOG.info("[FSI] Star boton ir a Sabor: ");
        JFrameMostrarSabor a = new JFrameMostrarSabor();
        a.setVisible(true);
    }//GEN-LAST:event_btnSaborActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        LOG.info("[FSI] Star boton ir a Producto: ");
        JFrameMostrarProducto a = new JFrameMostrarProducto();
        a.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void BtntrasRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtntrasRegisActionPerformed
        LOG.info("[FSI] Star boton ir a Registro: ");
        JFrameMostrarTransaccion a = new JFrameMostrarTransaccion();
        a.setVisible(true);
    }//GEN-LAST:event_BtntrasRegisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtntrasRegis;
    private javax.swing.JButton btnCate;
    public javax.swing.JButton btnEmpaquetado;
    private javax.swing.JButton btnEstadoTrans;
    private javax.swing.JButton btnMarca;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnSabor;
    private javax.swing.JButton btnUM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlblSalir;
    // End of variables declaration//GEN-END:variables
}
