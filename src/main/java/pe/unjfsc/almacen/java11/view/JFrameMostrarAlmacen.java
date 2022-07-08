package pe.unjfsc.almacen.java11.view;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEAlmacen;
import pe.unjfsc.almacen.java11.logical.CLVariacionAlmacen;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarAlmacen;

public class JFrameMostrarAlmacen extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarAlmacen");

    private HashSet<CEAlmacen> oHsData;
    private CICambioAlmacen oCIAlmacen;
    CEAlmacen oAlmacen;
    CMCambiarAlmacen oCMAlmacen;
    boolean sw;

    public JFrameMostrarAlmacen() {
        initComponents();
        oCMAlmacen = new CMCambiarAlmacen();
        oAlmacen = new CEAlmacen();
        setSize(559, 408);
        //setVisible(true);
        setLocationRelativeTo(null);

        String[] aTitulo = {"CODIGO", "NOMBRE", "UBICACIÓN"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblRegistro.setModel(oModel);
    }

    private Object[][] loadData() {
        oCIAlmacen = oCMAlmacen;
        oHsData = oCIAlmacen.consultAllAlmacenCIC();

        CLVariacionAlmacen oLogicalAlmacen = new CLVariacionAlmacen();
        return oLogicalAlmacen.convertHashSetArray(oHsData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnombalmacen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidalmacen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        cbidubicacion = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(231, 96, 76));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
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
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 120, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel4.setText(" ID                         :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, 30));

        txtnombalmacen.setEditable(false);
        txtnombalmacen.setBackground(new java.awt.Color(255, 255, 255));
        txtnombalmacen.setForeground(new java.awt.Color(102, 102, 102));
        txtnombalmacen.setBorder(null);
        jPanel1.add(txtnombalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, 30));

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel10.setText("NOMBRE            :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, 30));

        txtidalmacen.setEditable(false);
        txtidalmacen.setBackground(new java.awt.Color(255, 255, 255));
        txtidalmacen.setForeground(new java.awt.Color(102, 102, 102));
        txtidalmacen.setBorder(null);
        txtidalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidalmacenActionPerformed(evt);
            }
        });
        jPanel1.add(txtidalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, 30));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegistro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, 100));

        cbidubicacion.setForeground(new java.awt.Color(102, 102, 102));
        cbidubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UB001", "UB002" }));
        cbidubicacion.setEnabled(false);
        jPanel1.add(cbidubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 30));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setText("UBICACION        :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 30));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALMACEN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 220, 50));

        jSeparator14.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator14.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, 20));

        jSeparator13.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator13.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, 20));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));

        btnGrabar.setBackground(new java.awt.Color(204, 204, 255));
        btnGrabar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setBorder(null);
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
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 40));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 255));
        btnCancelar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
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
            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 400, 410));

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(null);
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, 60));

        btnEditar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 160, 60));

        btnEliminar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidalmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidalmacenActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        txtidalmacen.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
        txtnombalmacen.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 1).toString());
        cbidubicacion.setSelectedItem(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        LOG.info("[FSI] Star boton Editar : {}");
        habilitaControles(true);
        sw = false;
    }//GEN-LAST:event_btnEditarActionPerformed

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
            if (!txtidalmacen.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {

                    oCMAlmacen.eliminarAlmacenCIC(txtidalmacen.getText());
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
        if (!txtidalmacen.getText().isEmpty()) {

            oAlmacen.setIdAlmacen(txtidalmacen.getText());
            oAlmacen.setNombAlm(txtnombalmacen.getText());
            oAlmacen.setIdUbicacion(cbidubicacion.getSelectedItem().toString());

            if (sw) {
                oCMAlmacen.saveAlmacenCIC(oAlmacen);
                LOG.info("[FSI] Dato Grabado : {}");
            } else {
                oCMAlmacen.modificarAlmacenCIC(new CEAlmacen(txtidalmacen.getText(), txtnombalmacen.getText(), cbidubicacion.getSelectedItem().toString()));
                LOG.info("[FSI] Dato Editado : {}");
            }

            mostrarDatos();
        } else {
            LOG.info("[FSI] Error al ingreso de datos : {} ", txtidalmacen.getText(), " - ", txtnombalmacen.getText());
        }
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnGrabarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbidubicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtidalmacen;
    private javax.swing.JTextField txtnombalmacen;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
        txtidalmacen.setEditable(b);
        txtnombalmacen.setEditable(b);
        cbidubicacion.setEnabled(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);

        btnSalir.setEnabled(!b);
        txtidalmacen.requestFocus();
    }

    private void limpiarControles() {
        txtidalmacen.setText(null);
        txtnombalmacen.setText(null);
        cbidubicacion.setSelectedIndex(1);
    }

    private void mostrarDatos() {
        String[] aTitulo = {"CODIGO", "NOMBRE", "UBICACIÓN"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblRegistro.setModel(oModel);
    }
}
