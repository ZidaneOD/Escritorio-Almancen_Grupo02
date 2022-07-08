
package pe.unjfsc.almacen.java11.view;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JFrameAdmin extends javax.swing.JFrame {
    
    private static final Logger LOG = LoggerFactory.getLogger("JFrameAdmin");
    
    public JFrameAdmin() {
        initComponents();
        this.setSize(930, 711);
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
        jPanel3 = new javax.swing.JPanel();
        btnPuesto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnDisPrv = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnEmpleado = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnAlmacen = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnUbicación = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

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
        jLabel2.setText("Administración");
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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 250, 30));

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
        jPanel2.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 260, 70));

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuestros usuarios ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 210, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 260, 20));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ing. Gustavo Durand Vasquez");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 710));

        jSeparator2.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator2.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 610, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-market-80.png"))); // NOI18N
        btnPuesto.setContentAreaFilled(false);
        btnPuesto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPuesto.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestoActionPerformed(evt);
            }
        });
        jPanel3.add(btnPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel12.setBackground(new java.awt.Color(58, 78, 121));
        jLabel12.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 78, 121));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PUESTOS");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Creación, edición de los nuevos y");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("antiguos puestos de empleo.");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 240, 180));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDisPrv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-country-80.png"))); // NOI18N
        btnDisPrv.setContentAreaFilled(false);
        btnDisPrv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisPrv.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnDisPrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisPrvActionPerformed(evt);
            }
        });
        jPanel8.add(btnDisPrv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel9.setBackground(new java.awt.Color(58, 78, 121));
        jLabel9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 78, 121));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DEP. - PROV. - DIST.");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("del Perú.");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Reconocimiento de las ubicaciones");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 240, 180));

        jLabel10.setBackground(new java.awt.Color(58, 78, 121));
        jLabel10.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 78, 121));
        jLabel10.setText("EMPLEADOS Y USUARIOS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 300, 40));

        jSeparator3.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator3.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 610, 20));

        jLabel15.setBackground(new java.awt.Color(58, 78, 121));
        jLabel15.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 78, 121));
        jLabel15.setText("ALMACÉN Y UBICACIÓN");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 300, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-users-80.png"))); // NOI18N
        btnEmpleado.setContentAreaFilled(false);
        btnEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleado.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        jPanel9.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel16.setBackground(new java.awt.Color(58, 78, 121));
        jLabel16.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 78, 121));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("EMPLEADOS");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("antiguos empleados.");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Creación, edición de los nuevos y");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 240, 180));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-store-80.png"))); // NOI18N
        btnAlmacen.setContentAreaFilled(false);
        btnAlmacen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlmacen.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        jPanel10.add(btnAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel18.setBackground(new java.awt.Color(58, 78, 121));
        jLabel18.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(58, 78, 121));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ALMACÉN");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("antiguos almacenes.");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Creación, edición de los nuevos y");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 240, 180));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUbicación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/icons8-atm-location-80.png"))); // NOI18N
        btnUbicación.setContentAreaFilled(false);
        btnUbicación.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUbicación.setMargin(new java.awt.Insets(4, 16, 4, 16));
        btnUbicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbicaciónActionPerformed(evt);
            }
        });
        jPanel11.add(btnUbicación, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 100));

        jLabel21.setBackground(new java.awt.Color(58, 78, 121));
        jLabel21.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 78, 121));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("UBICACIÓN");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("de los almacenes.");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Creación de las nuevas ubicaciones");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 240, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSalirMouseClicked
       LOG.info("[FSI] Star boton Salir: ");
        try {
             dispose();
             JFrameLogin d= new JFrameLogin();
            d.setVisible(true);
             
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
    }//GEN-LAST:event_jlblSalirMouseClicked

    private void btnDisPrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisPrvActionPerformed
        LOG.info("[FSI] Star boton ir a distrito-provincia-departamento : ");
        JFrameMostrarDepaProvDistr a= new JFrameMostrarDepaProvDistr();
        a.setVisible(true);
    }//GEN-LAST:event_btnDisPrvActionPerformed

    private void btnPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestoActionPerformed
        LOG.info("[FSI] Star boton ir a Puesto : ");
        JFrameMostrarCargoEmpleado b= new JFrameMostrarCargoEmpleado();
        b.setVisible(true);
    }//GEN-LAST:event_btnPuestoActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
       LOG.info("[FSI] Star boton ir a Empleado : ");
        JFrameMostrarEmpleadoTransaccion b= new JFrameMostrarEmpleadoTransaccion();
        b.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
       LOG.info("[FSI] Star boton ir a Almacén : ");
        JFrameMostrarAlmacen b= new JFrameMostrarAlmacen();
        b.setVisible(true);
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnUbicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbicaciónActionPerformed
       LOG.info("[FSI] Star boton ir a ubicacion : ");
        JFrameMostrarUbicacionAlmacen b= new JFrameMostrarUbicacionAlmacen();
        b.setVisible(true);
    }//GEN-LAST:event_btnUbicaciónActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnDisPrv;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnPuesto;
    private javax.swing.JButton btnUbicación;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlblSalir;
    // End of variables declaration//GEN-END:variables
}
