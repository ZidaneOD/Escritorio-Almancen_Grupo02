package pe.unjfsc.almacen.java11.view;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CETransaccion;
import pe.unjfsc.almacen.java11.entity.CESDetalle;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarDetalleHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarAlmacen;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarTransaccionHashSet;

public class JFrameMostrarKardex extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameTransaccion");

    DefaultTableModel objDtm;
    DefaultTableModel objDtmProduc;

    CMCambiarAlmacen oCMAlmacen = new CMCambiarAlmacen();
    CMCambiarTransaccionHashSet oCMTransaccion = new CMCambiarTransaccionHashSet();
    CMCambiarDetalleHashSet oCMDetalle = new CMCambiarDetalleHashSet();
    boolean sw;

    ResultSet rsKardex;

    ResultSet rsAlmacena;
    ResultSet rsAlmacenb;
    int xidAlmacena;
    int xidAlmacenb;

    public JFrameMostrarKardex() {
        initComponents();
        setSize(998, 701);
        //setVisible(true);
        setLocationRelativeTo(null);

        objDtmProduc = (DefaultTableModel) tblRegistro.getModel();
        objDtm = (DefaultTableModel) tblmostrar.getModel();
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnombrep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbidalmacenA = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbidalmacenB = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblmostrar = new javax.swing.JTable();
        btnBuscarEmpleado = new javax.swing.JButton();
        txtidtransaccion = new javax.swing.JTextField();
        txtidEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnRecibido = new javax.swing.JButton();
        btnEnviado = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarP = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnEliminarP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 30));

        jLabel10.setText("ALMACEN A");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 30));

        txtnombrep.setEditable(false);
        txtnombrep.setBackground(new java.awt.Color(255, 255, 255));
        txtnombrep.setBorder(null);
        txtnombrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrepActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 320, 30));

        jLabel11.setText("NOMBRE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, 30));

        jLabel12.setText("ESTADO ACTUAL DEL KARDEX: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 190, 40));

        cbidalmacenA.setEnabled(false);
        jPanel1.add(cbidalmacenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 170, 30));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRegistro);
        if (tblRegistro.getColumnModel().getColumnCount() > 0) {
            tblRegistro.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 530, 100));

        jPanel4.setBackground(new java.awt.Color(231, 96, 76));

        btnSalir.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sal.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 140, 40));

        jLabel14.setText("ALMACEN B");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 30));

        cbidalmacenB.setEnabled(false);
        jPanel1.add(cbidalmacenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, 30));

        tblmostrar.setFont(new java.awt.Font("Corbel", 0, 11)); // NOI18N
        tblmostrar.setForeground(new java.awt.Color(51, 51, 51));
        tblmostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "FECHA", "ORIGEN", "DESTINO", "EMPLEADO", "APELLIDOS", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblmostrar);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 760, 120));

        btnBuscarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-20.png"))); // NOI18N
        btnBuscarEmpleado.setText("Search");
        btnBuscarEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarEmpleado.setContentAreaFilled(false);
        btnBuscarEmpleado.setEnabled(false);
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 70, 30));

        txtidtransaccion.setEditable(false);
        txtidtransaccion.setBackground(new java.awt.Color(255, 255, 255));
        txtidtransaccion.setBorder(null);
        txtidtransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtidtransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 200, 30));

        txtidEmpleado.setEditable(false);
        txtidEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtidEmpleado.setBorder(null);
        txtidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtidEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 180, 30));

        jLabel13.setText("PRODUCTO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 30));

        txtidproducto.setEditable(false);
        txtidproducto.setBackground(new java.awt.Color(255, 255, 255));
        txtidproducto.setBorder(null);
        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 210, 30));

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-plus-20.png"))); // NOI18N
        btnBuscarProducto.setText("More");
        btnBuscarProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarProducto.setContentAreaFilled(false);
        btnBuscarProducto.setEnabled(false);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 70, 30));

        btnAnular.setBackground(new java.awt.Color(255, 255, 255));
        btnAnular.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnAnular.setForeground(new java.awt.Color(51, 51, 51));
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cancel-20.png"))); // NOI18N
        btnAnular.setText("ANULAR");
        btnAnular.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAnular.setContentAreaFilled(false);
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 100, 40));

        btnRecibido.setBackground(new java.awt.Color(255, 255, 255));
        btnRecibido.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnRecibido.setForeground(new java.awt.Color(51, 51, 51));
        btnRecibido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-received-20.png"))); // NOI18N
        btnRecibido.setText("RECIBIDO");
        btnRecibido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRecibido.setContentAreaFilled(false);
        btnRecibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 110, 40));

        btnEnviado.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviado.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnEnviado.setForeground(new java.awt.Color(51, 51, 51));
        btnEnviado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-send-20.png"))); // NOI18N
        btnEnviado.setText("ENVIADO");
        btnEnviado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEnviado.setContentAreaFilled(false);
        btnEnviado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 100, 40));

        jSeparator5.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator5.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 200, 30));

        jSeparator6.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator6.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 180, 20));

        jSeparator7.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator7.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 210, 20));

        jSeparator8.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator8.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 320, 20));

        jLabel15.setText("AGREGAR EMPLEADO: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 130, 30));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));

        btnAgregarP.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarP.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarP.setText("Agregar Producto");
        btnAgregarP.setBorderPainted(false);
        btnAgregarP.setContentAreaFilled(false);
        btnAgregarP.setEnabled(false);
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarP, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, 40));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

        btnEliminarP.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarP.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarP.setText("Eliminar Producto");
        btnEliminarP.setBorderPainted(false);
        btnEliminarP.setContentAreaFilled(false);
        btnEliminarP.setEnabled(false);
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminarP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 700));

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 60));

        btnCancelar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 60));

        btnGrabar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 70));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KARDEX");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrepActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LOG.info("[FSI] Star boton Nuevo : ");
        habilitaControles(true);
        limpiarControles();
        sw = true;
        llenaComboCargoA();
        llenaComboCargoB();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        LOG.info("[FSI] Star boton Grabar : {}");
        try {
            int xidfactura = 0;
            CETransaccion oTransaccion = new CETransaccion();
            //COMBO ORIGEN
            obtenerIdAlmacenA();
            oTransaccion.setIdorigen(xidAlmacena);
            obtenerIdAlmacenB();
            oTransaccion.setIddest(xidAlmacenb);
            oTransaccion.setIdEmpleado(Integer.parseInt(txtidEmpleado.getText()));
            oCMTransaccion.saveAlmacenCIC(oTransaccion);
            xidfactura = oCMTransaccion.obtenerIdKardex();
            /**
             * ************************Detalle del Kardex *****************
             */
            int filas = objDtmProduc.getRowCount();
            for (int i = 0; i < filas; i++) {

                CESDetalle oDetalle = new CESDetalle();
                oDetalle.setIdkardex(xidfactura);
                oDetalle.setIdporducto(Integer.parseInt(tblRegistro.getValueAt(i, 0).toString()));

                System.out.println(i + "- xidfactura" + xidfactura + " " + oDetalle.getIdkardex() + " " + oDetalle.getIdporducto());

                oCMDetalle.saveAlmacenCIC(oDetalle);
            }
            mostrarDatos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        mostrarDatos();
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtidtransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtransaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtransaccionActionPerformed

    private void txtidEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidEmpleadoActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        JFrameBuscarProducto a = new JFrameBuscarProducto();
        a.setVisible(true);

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        objDtmProduc.removeRow(tblRegistro.getSelectedRow());

    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        LOG.info("[FSI] Star boton Agregar : {}");
        int cont = 0;
        int idproducto = Integer.parseInt(txtidproducto.getText());
        boolean sw = false;
        Object[] registro = {txtidproducto.getText(), txtnombrep.getText()};

        if (objDtmProduc.getRowCount() == 0) {
            objDtmProduc.addRow(registro);

        } else {
            while (cont < objDtmProduc.getRowCount()) {
                if (idproducto == Integer.parseInt(objDtmProduc.getValueAt(cont, 0).toString())) {
                    sw = true;
                    JOptionPane.showMessageDialog(rootPane, "El registro ya existe");
                    cont = objDtmProduc.getRowCount();
                }
                cont++;
            }
            if (!sw) {
                objDtmProduc.addRow(registro);
            }
        }
        txtidproducto.setText(null);
        txtnombrep.setText(null);
    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        JFrameBuscarEmpleado a = new JFrameBuscarEmpleado();
        a.setVisible(true);

    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        LOG.info("[FSI] Star boton Anular : {}");
        try {
            int idkardex = 0;
            idkardex = Integer.parseInt(tblmostrar.getValueAt(tblmostrar.getSelectedRow(), 0).toString());

            if (idkardex > 0) {
                oCMDetalle.modificarAAnulado(idkardex, 4);
                mostrarDatos();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibidoActionPerformed
        LOG.info("[FSI] Star boton Recibido : {}");
        try {
            int idkardex = 0;
            idkardex = Integer.parseInt(tblmostrar.getValueAt(tblmostrar.getSelectedRow(), 0).toString());

            if (idkardex > 0) {
                oCMDetalle.modificarARecibido(idkardex, 2);
                mostrarDatos();

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnRecibidoActionPerformed

    private void btnEnviadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviadoActionPerformed
        LOG.info("[FSI] Star boton Enviado : {}");
        try {
            int idkardex = 0;
            idkardex = Integer.parseInt(tblmostrar.getValueAt(tblmostrar.getSelectedRow(), 0).toString());

            if (idkardex > 0) {
                oCMDetalle.modificarARecibido(idkardex, 1);
                mostrarDatos();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEnviadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnEnviado;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRecibido;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbidalmacenA;
    private javax.swing.JComboBox<String> cbidalmacenB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTable tblmostrar;
    public static javax.swing.JTextField txtidEmpleado;
    public static javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtidtransaccion;
    public static javax.swing.JTextField txtnombrep;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {

        cbidalmacenA.setEnabled(b);
        cbidalmacenA.setEnabled(b);
        cbidalmacenB.setEnabled(b);

        btnBuscarEmpleado.setEnabled(b);
        btnBuscarProducto.setEnabled(b);
        btnAgregarP.setEnabled(b);
        btnEliminarP.setEnabled(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);

        btnSalir.setEnabled(!b);
    }

    private void limpiarControles() {
        txtnombrep.setText(null);
        txtidEmpleado.setText(null);
        txtidproducto.setText(null);
        txtidtransaccion.setText(null);

        cbidalmacenA.removeAllItems();
        cbidalmacenB.removeAllItems();
        while (objDtmProduc.getRowCount() > 0) {
            objDtmProduc.removeRow(0);
        }

    }

    private void limpiaJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }

    }

    private void mostrarDatos() {
        limpiaJTable();
        try {
            rsKardex = oCMTransaccion.mostrar();
            while (rsKardex.next()) {
                Object registro[] = {rsKardex.getInt(1), rsKardex.getDate(2), rsKardex.getString(3),
                    rsKardex.getString(4), rsKardex.getString(5), rsKardex.getString(6), rsKardex.getString(7)};
                objDtm.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void llenaComboCargoA() {
        try {

            rsAlmacena = oCMAlmacen.buscar("%");

            if (sw) {
                while (rsAlmacena.next()) {
                    cbidalmacenA.addItem(rsAlmacena.getString(2));
                }
            } else {
                String nombre = cbidalmacenA.getSelectedItem().toString();
                while (rsAlmacena.next()) {
                    if (!nombre.equals(rsAlmacena.getString(2))) {
                        cbidalmacenA.addItem(rsAlmacena.getString(2));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR LLENACOMB: " + e);
        }
    }

    private void obtenerIdAlmacenA() {
        try {
            String nombre = cbidalmacenA.getSelectedItem().toString();
            rsAlmacena.first();

            do {
                if (nombre.equals(rsAlmacena.getString(2))) {
                    xidAlmacena = rsAlmacena.getInt(1);
                    rsAlmacena.last();
                }
            } while (rsAlmacena.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }

    private void llenaComboCargoB() {
        try {

            rsAlmacenb = oCMAlmacen.buscar("%");

            if (sw) {
                while (rsAlmacenb.next()) {
                    cbidalmacenB.addItem(rsAlmacenb.getString(2));
                }
            } else {
                String nombre = cbidalmacenB.getSelectedItem().toString();
                while (rsAlmacenb.next()) {
                    if (!nombre.equals(rsAlmacenb.getString(2))) {
                        cbidalmacenB.addItem(rsAlmacenb.getString(2));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR LLENACOMB: " + e);
        }
    }

    private void obtenerIdAlmacenB() {
        try {
            String nombre = cbidalmacenB.getSelectedItem().toString();
            rsAlmacenb.first();

            do {
                if (nombre.equals(rsAlmacenb.getString(2))) {
                    xidAlmacenb = rsAlmacenb.getInt(1);
                    rsAlmacenb.last();
                }
            } while (rsAlmacenb.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }

}
