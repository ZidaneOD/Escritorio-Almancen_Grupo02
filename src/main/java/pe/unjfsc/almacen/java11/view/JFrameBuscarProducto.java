package pe.unjfsc.almacen.java11.view;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarProductoHashSet;

public class JFrameBuscarProducto extends javax.swing.JFrame {

    CMCambiarProductoHashSet oCMProducto = new CMCambiarProductoHashSet();
    ResultSet rsProducto;
    DefaultTableModel objDtm;

    public JFrameBuscarProducto() {
        initComponents();
        objDtm = (DefaultTableModel) tblRegistro.getModel();
        setSize(872, 338);
        setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCIÓN", "CATEGORIA", "SABOR", "MARCA", "PESO", "UNIDAD M", "PRESxEMPAQ", "UNIDADxEMP", "EMPAQUE", "UND PROD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese producto a buscar:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased

        try {
            limpiarJTable();
            if (!txtBuscarProducto.getText().isEmpty()) {
                String nombre = txtBuscarProducto.getText().trim();
                rsProducto = oCMProducto.buscar(nombre);
                while (rsProducto.next()) {
                    Object[] registro = {rsProducto.getInt(1), rsProducto.getString(2),
                        rsProducto.getString(3), rsProducto.getString(4), rsProducto.getString(5),
                        rsProducto.getString(6), rsProducto.getString(7),
                        rsProducto.getString(8), rsProducto.getString(9), rsProducto.getString(10), rsProducto.getString(11), rsProducto.getString(12)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            JFrameMostrarTransaccion.txtidproducto.setText(String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString()));
            JFrameMostrarTransaccion.txtnombrep.setText(
                    String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 3).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 5).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 2).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 4).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 11).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 10).toString())
                    + "x"
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 8).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 9).toString()) + " "
                    + "x"
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 6).toString()) + " "
                    + String.valueOf(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 7).toString())
            );
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtBuscarProducto;
    // End of variables declaration//GEN-END:variables
 private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }
}
