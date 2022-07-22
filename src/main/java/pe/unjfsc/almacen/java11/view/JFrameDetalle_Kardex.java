package pe.unjfsc.almacen.java11.view;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarAlmacen;

import pe.unjfsc.almacen.java11.model.imp.CMCambiarDetalleHashSet;

public class JFrameDetalle_Kardex extends javax.swing.JFrame {

    ButtonGroup objButtonGroup = new ButtonGroup();

    ResultSet rsDetalle;
    ResultSet rsEstado;
    ResultSet rsAlmacen;

    DefaultTableModel objDtm;
    CMCambiarDetalleHashSet oCMCDetalle = new CMCambiarDetalleHashSet();
    CMCambiarAlmacen oCMAlmacen = new CMCambiarAlmacen();
    SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    String xidalmacen;
    String xidestado;

    boolean sw;

    public JFrameDetalle_Kardex() {
        initComponents();
        setSize(867, 417);
        objDtm = (DefaultTableModel) tblRegistro.getModel();
        objButtonGroup.add(rbdAlmacen);
        objButtonGroup.add(rbdEstado);
        objButtonGroup.add(rbdFecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        rbdFecha = new javax.swing.JRadioButton();
        rbdAlmacen = new javax.swing.JRadioButton();
        rbdEstado = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        dadinicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        dadfinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbAlmacen = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cmbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDKARDEX", "FECHA", "ORIGEN", "DESTINO", "PRODUCTO", "DESCRIPCIÓN", "DNI", "NOMBRE", "APELLIDOS", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        rbdFecha.setText("Fecha");
        rbdFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdFechaActionPerformed(evt);
            }
        });

        rbdAlmacen.setText("Almacen");
        rbdAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdAlmacenActionPerformed(evt);
            }
        });

        rbdEstado.setText("Estado");
        rbdEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdEstadoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dadinicio.setEnabled(false);

        jLabel1.setText("FECHA INCIO");

        dadfinal.setEnabled(false);

        jLabel2.setText("FECHA TERMINO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(dadinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbAlmacen.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(cmbAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbdFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbdAlmacen)
                                    .addComponent(rbdEstado))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(61, 61, 61)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbdFecha)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbdAlmacen)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(rbdEstado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            limpiaJTable();
            if (rbdFecha.isSelected() == true) {

                String fechaInicio = objSimpleDateFormat.format(dadinicio.getDate());
                String fechaFinal = objSimpleDateFormat.format(dadfinal.getDate());

                rsDetalle = oCMCDetalle.buscarPorFecha(fechaInicio, fechaFinal);

                while (rsDetalle.next()) {
                    Object[] registro = {rsDetalle.getInt(1), rsDetalle.getString(2), rsDetalle.getString(3), rsDetalle.getString(4), rsDetalle.getString(5),
                        rsDetalle.getString(6), rsDetalle.getString(7), rsDetalle.getString(8), rsDetalle.getString(9), rsDetalle.getString(10)

                    };

                    objDtm.addRow(registro);
                }
            }
            if (rbdAlmacen.isSelected() == true) {

                rsDetalle = oCMCDetalle.buscarPorAlmacen(cmbAlmacen.getSelectedItem().toString());

                while (rsDetalle.next()) {
                    Object[] registro = {rsDetalle.getInt(1), rsDetalle.getString(2), rsDetalle.getString(3), rsDetalle.getString(4), rsDetalle.getString(5),
                        rsDetalle.getString(6), rsDetalle.getString(7), rsDetalle.getString(8), rsDetalle.getString(9), rsDetalle.getString(10)

                    };

                    objDtm.addRow(registro);
                }
            }
            if (rbdEstado.isSelected() == true) {

                rsDetalle = oCMCDetalle.buscarPorEstado(cmbEstado.getSelectedItem().toString());

                while (rsDetalle.next()) {
                    Object[] registro = {rsDetalle.getInt(1), rsDetalle.getString(2), rsDetalle.getString(3), rsDetalle.getString(4), rsDetalle.getString(5),
                        rsDetalle.getString(6), rsDetalle.getString(7), rsDetalle.getString(8), rsDetalle.getString(9), rsDetalle.getString(10)

                    };
                    objDtm.addRow(registro);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbdFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdFechaActionPerformed
        dadinicio.setEnabled(true);
        dadfinal.setEnabled(true);

        cmbAlmacen.setEnabled(false);
        cmbEstado.setEnabled(false);

        cmbAlmacen.removeAllItems();
        cmbEstado.removeAllItems();
    }//GEN-LAST:event_rbdFechaActionPerformed

    private void rbdAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdAlmacenActionPerformed

        cmbAlmacen.setEnabled(true);

        dadinicio.setEnabled(false);
        dadfinal.setEnabled(false);

        cmbEstado.setEnabled(false);
        cmbAlmacen.removeAllItems();
        llenaComboAlmacen();
        cmbEstado.removeAllItems();
    }//GEN-LAST:event_rbdAlmacenActionPerformed

    private void rbdEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdEstadoActionPerformed

        cmbAlmacen.setEnabled(false);

        dadinicio.setEnabled(false);
        dadfinal.setEnabled(false);

        cmbEstado.setEnabled(true);
        cmbEstado.removeAllItems();
        llenaComboEstado();
        cmbAlmacen.removeAllItems();

    }//GEN-LAST:event_rbdEstadoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrameDetalle_Kardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDetalle_Kardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDetalle_Kardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDetalle_Kardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDetalle_Kardex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbAlmacen;
    private javax.swing.JComboBox<String> cmbEstado;
    private com.toedter.calendar.JDateChooser dadfinal;
    private com.toedter.calendar.JDateChooser dadinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbdAlmacen;
    private javax.swing.JRadioButton rbdEstado;
    private javax.swing.JRadioButton rbdFecha;
    private javax.swing.JTable tblRegistro;
    // End of variables declaration//GEN-END:variables

    private void limpiaJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void llenaComboAlmacen() {
        try {

            rsAlmacen = oCMAlmacen.buscar("%");

            while (rsAlmacen.next()) {
                cmbAlmacen.addItem(rsAlmacen.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR LLENACOMB: " + e);
        }
    }

    private void obtenerIdAlmacen() {
        try {
            String nombre = cmbAlmacen.getSelectedItem().toString();
            rsAlmacen.first();

            do {
                if (nombre.equals(rsAlmacen.getString(2))) {
                    xidalmacen = rsAlmacen.getString(2);
                    rsAlmacen.last();
                }
            } while (rsAlmacen.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }

    private void llenaComboEstado() {
        try {

            rsEstado = oCMAlmacen.buscarEstado("%");

            while (rsEstado.next()) {
                cmbEstado.addItem(rsEstado.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR LLENACOMB: " + e);
        }
    }

    private void obtenerIdAlmacenB() {
        try {
            String nombre = cmbEstado.getSelectedItem().toString();
            rsEstado.first();

            do {
                if (nombre.equals(rsEstado.getString(2))) {
                    xidestado = rsEstado.getString(2);
                    rsEstado.last();
                }
            } while (rsEstado.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }
}
