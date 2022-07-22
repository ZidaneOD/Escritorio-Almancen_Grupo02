package pe.unjfsc.almacen.java11.view;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEUbicacionAlmacen;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarDepartamentoAHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarDistritoAHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarProvinciaHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarUbicacionAHashSet;

public class JFrameMostrarUbicacionAlmacen extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarUbicacionAlmacen");

    DefaultTableModel objDtm;
    ResultSet rsUnidadm;
    ResultSet rsDistrito;
    ResultSet rsProvincia;
    ResultSet rsDepartamento;
    int xidunidadm, xiddistrito, xiddepartamento, xidprovincia;
    CMCambiarUbicacionAHashSet oCMUnidad = new CMCambiarUbicacionAHashSet();
    CMCambiarDepartamentoAHashSet oCMDepartamento = new CMCambiarDepartamentoAHashSet();
    CMCambiarProvinciaHashSet oCMProvincia = new CMCambiarProvinciaHashSet();
    CMCambiarDistritoAHashSet oCMDistrito = new CMCambiarDistritoAHashSet();
    boolean sw;

    public JFrameMostrarUbicacionAlmacen() {
        initComponents();
        this.setSize(691, 489);
        this.setLocationRelativeTo(null);
        objDtm = (DefaultTableModel) tblRegistro.getModel();
        mostrarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        cbProvincia = new javax.swing.JComboBox<>();
        cbDistrito = new javax.swing.JComboBox<>();
        txtNombubicacion = new javax.swing.JTextField();
        txtIdubicacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnMore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jLabel3.setText("DIRECCION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        jLabel4.setText("DEPARTAMENTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        jLabel5.setText("PROVINCIA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 30));

        jLabel6.setText("DISTRITO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 70, 30));

        cbDepartamento.setEnabled(false);
        cbDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbDepartamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbDepartamentoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbDepartamentoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbDepartamentoMouseReleased(evt);
            }
        });
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });
        cbDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbDepartamentoKeyReleased(evt);
            }
        });
        jPanel1.add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 90, 30));

        cbProvincia.setEnabled(false);
        cbProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbProvinciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbProvinciaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbProvinciaMousePressed(evt);
            }
        });
        cbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProvinciaActionPerformed(evt);
            }
        });
        cbProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbProvinciaKeyReleased(evt);
            }
        });
        jPanel1.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, 30));

        cbDistrito.setEnabled(false);
        cbDistrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbDistritoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbDistritoMouseEntered(evt);
            }
        });
        jPanel1.add(cbDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, 30));

        txtNombubicacion.setEditable(false);
        jPanel1.add(txtNombubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, 30));

        txtIdubicacion.setEditable(false);
        jPanel1.add(txtIdubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 30));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DIRECCIÓN", "DISTRITO", "PROVINCIA", "DEPARTAMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane1.setViewportView(tblRegistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 126));

        btnMore.setText("MORE");
        jPanel1.add(btnMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 70, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("UBICACION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 100, 30));

        jPanel2.setBackground(new java.awt.Color(231, 96, 76));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, 40));

        jPanel4.setBackground(new java.awt.Color(58, 78, 121));

        btnGrabar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setBorderPainted(false);
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 150, 40));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 520, 490));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 70));

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
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 70));

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
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LOG.info("[FSI] Star boton Nuevo : ");
        habilitaControles(true);
        limpiarControles();
        sw = true;
        llenaComboDepa();
        llenaComboProv();
        llenaComboDist();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        LOG.info("[FSI] Star boton Editar : {}");
        habilitaControles(true);
        sw = false;
        cbDepartamento.removeAllItems();
        cbDepartamento.removeAllItems();
        cbDepartamento.removeAllItems();
        llenaComboDepa();
        llenaComboDepa();
        llenaComboProv();
        llenaComboDist();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LOG.info("[FSI] Star boton Eliminar : {}");
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (!txtIdubicacion.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {
                    CEUbicacionAlmacen oUnidad = new CEUbicacionAlmacen();
                    oUnidad.setIdUbicacion(Integer.parseInt(txtIdubicacion.getText()));
                    oCMUnidad.eliminarAlmacenCIC(oUnidad);
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
        try {

            //Verificar
            if (!txtNombubicacion.getText().isEmpty()) {
                CEUbicacionAlmacen oUbicacion = new CEUbicacionAlmacen();
                oUbicacion.setNombUbic(txtNombubicacion.getText().toUpperCase());
                oUbicacion.setIdDistrito(cbDistrito.getSelectedIndex());
                //distrito combo
                obtenerIddistrito();
                oUbicacion.setIdDistrito(xiddistrito);

                if (sw) {
                    oCMUnidad.saveAlmacenCIC(oUbicacion);
                    LOG.info("[FSI] Dato Grabado : {}");
                } else {
                    oUbicacion.setIdUbicacion(Integer.parseInt(txtIdubicacion.getText()));
                    oCMUnidad.modificarAlmacenCIC(oUbicacion);
                    LOG.info("[FSI] Dato Editado : {}");
                }

                mostrarDatos();
            } else {
                LOG.info("[FSI] Error al ingreso de datos : {} ", txtIdubicacion.getText(), " - ", txtNombubicacion.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        try {
            xidunidadm = Integer.parseInt(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
            rsUnidadm.first();
            do {
                if (xidunidadm == rsUnidadm.getInt(1)) {
                    txtIdubicacion.setText(rsUnidadm.getInt(1) + "");
                    txtNombubicacion.setText(rsUnidadm.getString(2));

                    cbDistrito.removeAllItems();
                    cbDistrito.addItem(rsUnidadm.getString(3));

                    cbProvincia.removeAllItems();
                    cbProvincia.addItem(rsUnidadm.getString(4));

                    cbDepartamento.removeAllItems();
                    cbDepartamento.addItem(rsUnidadm.getString(5));
                    rsUnidadm.last();
                }
            } while (rsUnidadm.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }//GEN-LAST:event_tblRegistroMouseClicked

    private void cbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentoActionPerformed

    }//GEN-LAST:event_cbDepartamentoActionPerformed

    private void cbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProvinciaActionPerformed

    }//GEN-LAST:event_cbProvinciaActionPerformed

    private void cbDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDepartamentoMouseClicked

        cbDepartamento.removeAllItems();
        llenaComboDepa();

    }//GEN-LAST:event_cbDepartamentoMouseClicked

    private void cbProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbProvinciaMouseClicked

        cbProvincia.removeAllItems();
        llenaComboProv();

    }//GEN-LAST:event_cbProvinciaMouseClicked

    private void cbDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbDepartamentoKeyReleased

    }//GEN-LAST:event_cbDepartamentoKeyReleased

    private void cbProvinciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbProvinciaKeyReleased

    }//GEN-LAST:event_cbProvinciaKeyReleased

    private void cbDepartamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDepartamentoMousePressed

    }//GEN-LAST:event_cbDepartamentoMousePressed

    private void cbProvinciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbProvinciaMousePressed

    }//GEN-LAST:event_cbProvinciaMousePressed

    private void cbProvinciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbProvinciaMouseEntered


    }//GEN-LAST:event_cbProvinciaMouseEntered

    private void cbDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDepartamentoMouseEntered

    }//GEN-LAST:event_cbDepartamentoMouseEntered

    private void cbDistritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDistritoMouseEntered


    }//GEN-LAST:event_cbDistritoMouseEntered

    private void cbDepartamentoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDepartamentoMouseReleased

    }//GEN-LAST:event_cbDepartamentoMouseReleased

    private void cbDistritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDistritoMouseClicked

        cbDistrito.removeAllItems();
        llenaComboDist();

    }//GEN-LAST:event_cbDistritoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnMore;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JComboBox<String> cbDistrito;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtIdubicacion;
    private javax.swing.JTextField txtNombubicacion;
    // End of variables declaration//GEN-END:variables
    private void habilitaControles(boolean b) {
        txtNombubicacion.setEditable(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);

        btnSalir.setEnabled(!b);
        cbDepartamento.setEnabled(b);
        cbDistrito.setEnabled(b);
        cbProvincia.setEnabled(b);
        txtNombubicacion.requestFocus();
    }

    private void limpiarControles() {
        txtIdubicacion.setText(null);
        txtNombubicacion.setText(null);

        cbDistrito.removeAllItems();
        cbProvincia.removeAllItems();
        cbDepartamento.removeAllItems();

    }

    private void limpiaJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void mostrarDatos() {
        limpiaJTable();
        try {
            rsUnidadm = oCMUnidad.mostrar();
            while (rsUnidadm.next()) {
                Object registro[] = {rsUnidadm.getInt(1), rsUnidadm.getString(2), rsUnidadm.getString(3),
                    rsUnidadm.getString(4), rsUnidadm.getString(5)};
                objDtm.addRow(registro);
            }
        } catch (Exception e) {
        }
    }

    private void llenaComboDist() {
        try {

            rsDistrito = oCMDistrito.buscar(obtenerNombprov());

            while (rsDistrito.next()) {
                cbDistrito.addItem(rsDistrito.getString(2));
            }

        } catch (Exception e) {
        }
    }

    private void obtenerIddistrito() {
        try {
            String nombre = cbDistrito.getSelectedItem().toString();
            rsDistrito.first();

            do {
                if (nombre.equals(rsDistrito.getString(2))) {
                    xiddistrito = rsDistrito.getInt(1);
                    rsDistrito.last();
                }
            } while (rsDistrito.next());

        } catch (Exception e) {
        }
    }

    private void llenaComboProv() {
        try {
            rsProvincia = oCMProvincia.buscar(obtenerNombdepa());

            while (rsProvincia.next()) {
                cbProvincia.addItem(rsProvincia.getString(2));
            }

        } catch (Exception e) {
        }
    }

    private String obtenerNombprov() {
        try {
            String nombre = cbProvincia.getSelectedItem().toString();
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

    private void llenaComboDepa() {
        try {

            rsDepartamento = oCMDepartamento.buscar("%");

            while (rsDepartamento.next()) {
                cbDepartamento.addItem(rsDepartamento.getString(2));
            }

        } catch (Exception e) {
        }
    }

    private String obtenerNombdepa() {
        try {

            String nombre = cbDepartamento.getSelectedItem().toString();

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

}
