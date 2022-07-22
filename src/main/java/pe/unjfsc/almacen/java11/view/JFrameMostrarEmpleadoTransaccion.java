package pe.unjfsc.almacen.java11.view;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEEmpleadoTransaccion;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarEmpleadoHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarCargoEmpleado;

public class JFrameMostrarEmpleadoTransaccion extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameEmpleadoTransaccion");

    DefaultTableModel objDtm;
    ResultSet rsEmpleado;
    ResultSet rsCargo;
    int xidEmpleado;
    int xidcargo;

    CMCambiarEmpleadoHashSet oCMEmpleado = new CMCambiarEmpleadoHashSet();
    CMCambiarCargoEmpleado oCMCargo = new CMCambiarCargoEmpleado();
    boolean sw;

    public JFrameMostrarEmpleadoTransaccion() {
        initComponents();

        setSize(651, 499);
        //setVisible(true);
        setLocationRelativeTo(null);
        objDtm = (DefaultTableModel) tblRegistro.getModel();
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        txtnombemp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtapa = new javax.swing.JTextField();
        txtama = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbidcargo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 30));

        txtdni.setEditable(false);
        txtdni.setBackground(new java.awt.Color(255, 255, 255));
        txtdni.setBorder(null);
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        jLabel10.setText("DNI");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, 30));

        txtidempleado.setEditable(false);
        txtidempleado.setBackground(new java.awt.Color(255, 255, 255));
        txtidempleado.setBorder(null);
        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtidempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, 30));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DNI", "NOMBRE", "A PATERNO", "A MATERNO", "TELEFONO", "EMAIL", "PUESTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegistro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 450, 100));

        txtnombemp.setEditable(false);
        txtnombemp.setBackground(new java.awt.Color(255, 255, 255));
        txtnombemp.setBorder(null);
        jPanel1.add(txtnombemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, 30));

        jLabel11.setText("NOMBRE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));

        jLabel12.setText("A. PATERNO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 30));

        jLabel13.setText("A. MATERNO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 30));

        txtapa.setEditable(false);
        txtapa.setBackground(new java.awt.Color(255, 255, 255));
        txtapa.setBorder(null);
        jPanel1.add(txtapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, 30));

        txtama.setEditable(false);
        txtama.setBackground(new java.awt.Color(255, 255, 255));
        txtama.setBorder(null);
        jPanel1.add(txtama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, 30));

        jLabel14.setText("TELEFONO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, 30));

        txttelefono.setEditable(false);
        txttelefono.setBackground(new java.awt.Color(255, 255, 255));
        txttelefono.setBorder(null);
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, 30));

        txtmail.setEditable(false);
        txtmail.setBackground(new java.awt.Color(255, 255, 255));
        txtmail.setBorder(null);
        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 150, 30));

        jLabel15.setText("MAIL");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 60, 30));

        jLabel5.setText("CARGO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 60, 30));

        cbidcargo.setEnabled(false);
        jPanel1.add(cbidcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 100, 30));

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
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 110, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRABAJADORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 230, 30));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 130, 40));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, 40));

        jSeparator2.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator2.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 20));

        jSeparator3.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator3.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 20));

        jSeparator4.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator4.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, 20));

        jSeparator5.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator5.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 150, 20));

        jSeparator6.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator6.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, 20));

        jSeparator7.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator7.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 20));

        jSeparator8.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator8.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 120, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 490, 500));

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 60));

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
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 60));

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
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LOG.info("[FSI] Star boton Nuevo : ");
        habilitaControles(true);
        limpiarControles();
        sw = true;
        llenaComboCargo();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        LOG.info("[FSI] Star boton Editar : {}");
        habilitaControles(true);
        sw = false;
        llenaComboCargo();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LOG.info("[FSI] Star boton Eliminar : {}");
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (!txtidempleado.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {
                    CEEmpleadoTransaccion oEmpleado = new CEEmpleadoTransaccion();
                    oEmpleado.setIdEmpl(Integer.parseInt(txtidempleado.getText()));
                    oCMEmpleado.eliminarAlmacenCIC(oEmpleado);
                    limpiarControles();
                    JOptionPane.showMessageDialog(rootPane, "Registro borrado");
                    mostrarDatos();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        LOG.info("[FSI] Star boton Grabar : {}");

        //Verificar
        try {
            if (!txtdni.getText().isEmpty()) {
                CEEmpleadoTransaccion oEmpleado = new CEEmpleadoTransaccion();

                oEmpleado.setDniEmpl(txtdni.getText().trim());
                oEmpleado.setNombEmpl(txtnombemp.getText().toUpperCase().trim());
                oEmpleado.setApaEmpl(txtapa.getText().toUpperCase().trim());
                oEmpleado.setAmaEmpl(txtama.getText().toUpperCase().trim());
                oEmpleado.setTelfEmpl(txttelefono.getText().trim());
                oEmpleado.setMailEmpl(txtmail.getText().toUpperCase().trim());

                //CARGO Puesto
                obtenerIdpuesto();
                oEmpleado.setIdCargo(xidcargo);

                if (sw) {
                    oCMEmpleado.saveAlmacenCIC(oEmpleado);
                    LOG.info("[FSI] Dato Grabado : {}");
                } else {
                    oEmpleado.setIdEmpl(Integer.parseInt(txtidempleado.getText()));
                    oCMEmpleado.modificarAlmacenCIC(oEmpleado);
                    LOG.info("[FSI] Dato Editado : {}");
                }

                mostrarDatos();
            } else {
                LOG.info("[FSI] Error al ingreso de datos : {} ", txtidempleado.getText(), " - ", txtdni.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR: " + e);
        }
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        try {
            xidEmpleado = Integer.parseInt(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
            rsEmpleado.first();
            do {
                if (xidEmpleado == rsEmpleado.getInt(1)) {
                    txtidempleado.setText(rsEmpleado.getInt(1) + "");
                    txtdni.setText(rsEmpleado.getString(2));
                    txtnombemp.setText(rsEmpleado.getString(3));
                    txtapa.setText(rsEmpleado.getString(4));
                    txtama.setText(rsEmpleado.getString(5));
                    txttelefono.setText(rsEmpleado.getString(6));
                    txtmail.setText(rsEmpleado.getString(7));
                    cbidcargo.removeAllItems();
                    cbidcargo.addItem(rsEmpleado.getString(8));

                    rsEmpleado.last();
                }
            } while (rsEmpleado.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


    }//GEN-LAST:event_tblRegistroMouseClicked

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbidcargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtama;
    private javax.swing.JTextField txtapa;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnombemp;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
    private void habilitaControles(boolean b) {
        txtdni.setEditable(b);
        txtnombemp.setEditable(b);
        txtapa.setEditable(b);
        txtama.setEditable(b);
        txttelefono.setEditable(b);
        txtmail.setEditable(b);

        cbidcargo.setEnabled(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);

        btnSalir.setEnabled(!b);
        txtnombemp.requestFocus();
    }

    private void limpiarControles() {
        txtidempleado.setText(null);
        txtdni.setText(null);
        txtnombemp.setText(null);
        txtapa.setText(null);
        txtama.setText(null);
        txttelefono.setText(null);
        txtmail.setText(null);
        cbidcargo.removeAllItems();

    }

    private void limpiaJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void mostrarDatos() {
        limpiaJTable();
        try {
            rsEmpleado = oCMEmpleado.mostrar();
            while (rsEmpleado.next()) {
                Object registro[] = {rsEmpleado.getInt(1), rsEmpleado.getString(2), rsEmpleado.getString(3),
                    rsEmpleado.getString(4), rsEmpleado.getString(5), rsEmpleado.getString(6), rsEmpleado.getString(7), rsEmpleado.getString(8)};
                objDtm.addRow(registro);
            }
        } catch (Exception e) {
        }
    }

    private void llenaComboCargo() {
        try {

            rsCargo = oCMCargo.buscar("%");

            if (sw) {
                while (rsCargo.next()) {
                    cbidcargo.addItem(rsCargo.getString(2));
                }
            } else {
                String nombre = cbidcargo.getSelectedItem().toString();
                while (rsCargo.next()) {
                    if (!nombre.equals(rsCargo.getString(2))) {
                        cbidcargo.addItem(rsCargo.getString(2));
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR LLENACOMB: " + e);
        }
    }

    private void obtenerIdpuesto() {
        try {
            String nombre = cbidcargo.getSelectedItem().toString();
            rsCargo.first();

            do {
                if (nombre.equals(rsCargo.getString(2))) {
                    xidcargo = rsCargo.getInt(1);
                    rsCargo.last();
                }
            } while (rsCargo.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }
}
