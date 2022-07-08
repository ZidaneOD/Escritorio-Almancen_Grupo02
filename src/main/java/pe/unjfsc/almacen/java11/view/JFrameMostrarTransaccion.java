package pe.unjfsc.almacen.java11.view;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CETransaccion;
import pe.unjfsc.almacen.java11.logical.CLVariacionTransaccion;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarTransaccionHashSet;

public class JFrameMostrarTransaccion extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameTransaccion");

    private HashSet<CETransaccion> oHsData;
    private CICambioAlmacen oCIAlmacen;
    CETransaccion oTransaccion;
    CMCambiarTransaccionHashSet oCMTransaccion;
    boolean sw;

    public JFrameMostrarTransaccion() {
        initComponents();
        oCMTransaccion = new CMCambiarTransaccionHashSet();
        oTransaccion = new CETransaccion();
        setSize(621, 479);
        //setVisible(true);
        setLocationRelativeTo(null);

        String[] aTitulo = {"CODIGO", "ALMACEN", "PRODUCTO", "EMPLEADO", "ESTADO"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblRegistro.setModel(oModel);
    }

    private Object[][] loadData() {
        oCIAlmacen = oCMTransaccion;
        oHsData = oCIAlmacen.consultAllAlmacenCIC();

        CLVariacionTransaccion oLogicalTransaccion = new CLVariacionTransaccion();
        return oLogicalTransaccion.convertHashSetArray(oHsData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtidtransaccion = new javax.swing.JTextField();
        cbidproducto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbidempleado = new javax.swing.JComboBox<>();
        cbidestado = new javax.swing.JComboBox<>();
        cbidalmacen = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 30));

        jLabel10.setText("ALMACEN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, 30));

        txtidtransaccion.setEditable(false);
        txtidtransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtidtransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 170, 30));

        cbidproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "93132401", "93132555" }));
        cbidproducto.setEnabled(false);
        jPanel1.add(cbidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, 30));

        jLabel11.setText("PRODUCTO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, 30));

        jLabel12.setText("EMPLEADO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, 30));

        jLabel13.setText("ESTADO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 100, 30));

        cbidempleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EM01", "EM02", "EM03", "EM04", "EM05" }));
        cbidempleado.setEnabled(false);
        jPanel1.add(cbidempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, 30));

        cbidestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ES001", "ES002" }));
        cbidestado.setEnabled(false);
        jPanel1.add(cbidestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, 30));

        cbidalmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALM01", "ALM02" }));
        cbidalmacen.setEnabled(false);
        jPanel1.add(cbidalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblRegistro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 400, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("TRANSACCIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 12, -1, -1));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 110, 40));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, 40));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 450, 480));

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
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, 60));

        btnEliminar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, 60));

        btnEditar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidtransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtransaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtransaccionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LOG.info("[FSI] Star boton Nuevo : ");
        habilitaControles(true);
        limpiarControles();
        sw = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LOG.info("[FSI] Star boton Eliminar : {}");
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (!txtidtransaccion.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {

                    oCMTransaccion.eliminarAlmacenCIC(txtidtransaccion.getText());
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
        if (!txtidtransaccion.getText().isEmpty()) {

            oTransaccion.setIdTransaccion(txtidtransaccion.getText());
            oTransaccion.setIdAlmacen(cbidalmacen.getSelectedItem().toString());
            oTransaccion.setIdProducto(cbidproducto.getSelectedItem().toString());
            oTransaccion.setIdEmpleado(cbidempleado.getSelectedItem().toString());
            oTransaccion.setIdEstado(cbidestado.getSelectedItem().toString());

            if (sw) {
                oCMTransaccion.saveAlmacenCIC(oTransaccion);
                LOG.info("[FSI] Dato Grabado : {}");
            } else {
                oCMTransaccion.modificarAlmacenCIC(new CETransaccion(txtidtransaccion.getText(), cbidalmacen.getSelectedItem().toString(), cbidproducto.getSelectedItem().toString(), cbidempleado.getSelectedItem().toString(), cbidestado.getSelectedItem().toString()));
                LOG.info("[FSI] Dato Editado : {}");
            }

            mostrarDatos();
        } else {
            LOG.info("[FSI] Error al ingreso de datos : {} ", txtidtransaccion.getText(), " - ", cbidalmacen.getSelectedItem().toString());
        }
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        LOG.info("[FSI] Star boton Editar : {}");
        habilitaControles(true);
        sw = false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbidalmacen;
    private javax.swing.JComboBox<String> cbidempleado;
    private javax.swing.JComboBox<String> cbidestado;
    private javax.swing.JComboBox<String> cbidproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtidtransaccion;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
        txtidtransaccion.setEditable(b);
        cbidalmacen.setEnabled(b);
        cbidproducto.setEnabled(b);
        cbidempleado.setEnabled(b);
        cbidestado.setEnabled(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);

        btnSalir.setEnabled(!b);
        txtidtransaccion.requestFocus();
    }

    private void limpiarControles() {
        txtidtransaccion.setText(null);
        cbidalmacen.setSelectedIndex(1);
        cbidproducto.setSelectedIndex(1);
        cbidempleado.setSelectedIndex(1);
        cbidestado.setSelectedIndex(1);
    }

    private void mostrarDatos() {
        String[] aTitulo = {"CODIGO", "ALMACEN", "PRODUCTO", "EMPLEADO", "ESTADO"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblRegistro.setModel(oModel);
    }
}
