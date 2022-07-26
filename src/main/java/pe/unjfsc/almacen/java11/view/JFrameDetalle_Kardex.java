package pe.unjfsc.almacen.java11.view;

import conexion.ConMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
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
        setLocationRelativeTo(null);
        setSize(870, 489);
        objDtm = (DefaultTableModel) tblRegistro.getModel();
        objButtonGroup.add(rbdAlmacen);
        objButtonGroup.add(rbdEstado);
        objButtonGroup.add(rbdFecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rbdAlmacen = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cmbEstado = new javax.swing.JComboBox<>();
        rbdEstado = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        dadinicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        dadfinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        rbdFecha = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cmbAlmacen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbdAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        rbdAlmacen.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        rbdAlmacen.setText("Almacen");
        rbdAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdAlmacenActionPerformed(evt);
            }
        });
        jPanel4.add(rbdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 80, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        cmbEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        rbdEstado.setBackground(new java.awt.Color(255, 255, 255));
        rbdEstado.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        rbdEstado.setText("Estado");
        rbdEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdEstadoActionPerformed(evt);
            }
        });
        jPanel4.add(rbdEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

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
                .addContainerGap(20, Short.MAX_VALUE))
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

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        rbdFecha.setBackground(new java.awt.Color(255, 255, 255));
        rbdFecha.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        rbdFecha.setText("Fecha");
        rbdFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdFechaActionPerformed(evt);
            }
        });
        jPanel4.add(rbdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        cmbAlmacen.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(cmbAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 830, 150));

        btnBuscar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-20.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 140, 40));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setText("INFORMES DE LOS TRABAJADORES DEL ÁREA DE ALMACÉN");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 500, 60));

        jPanel5.setBackground(new java.awt.Color(58, 78, 121));

        btnImprimir.setBackground(new java.awt.Color(51, 51, 51));
        btnImprimir.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-print-24.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorderPainted(false);
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 150, 50));

        jPanel6.setBackground(new java.awt.Color(58, 78, 121));

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-24.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 490));

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
        cmbAlmacen.removeAllItems();

    }//GEN-LAST:event_rbdEstadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        if (rbdFecha.isSelected() == true) {
            try {
                String fechaInicio = objSimpleDateFormat.format(dadinicio.getDate());
                String fechaFinal = objSimpleDateFormat.format(dadfinal.getDate());

                Connection cn = ConMySQL.getInstance().getConnection();
                String direccion = System.getProperty("user.dir") + "\\src\\main\\java\\reporte\\reporteDetalleFecha.jrxml";
                JasperReport reporte = JasperCompileManager.compileReport(direccion);
                Map parametro = new HashMap();

                parametro.put("fechini", fechaInicio);
                parametro.put("fechfin", fechaFinal);

                JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametro, cn);
                JasperViewer view = new JasperViewer(mostrarReporte, false);
                //view.setTitle("Reporte Detalle Kardex - Fecha");
                view.setExtendedState(MAXIMIZED_BOTH);
                view.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        if (rbdAlmacen.isSelected() == true) {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Desea un diagrama del informe?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                try {
                    String almacen = cmbAlmacen.getSelectedItem().toString();

                    Connection cn = ConMySQL.getInstance().getConnection();
                    String direccion = System.getProperty("user.dir") + "\\src\\main\\java\\reporte\\reporteDetalleOrigen.jrxml";
                    JasperReport reporte = JasperCompileManager.compileReport(direccion);
                    Map parametro = new HashMap();

                    parametro.put("xalmacen", almacen);

                    JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametro, cn);
                    JasperViewer view = new JasperViewer(mostrarReporte, false);
                    //view.setTitle("Reporte Detalle Kardex - Fecha");
                    view.setExtendedState(MAXIMIZED_BOTH);
                    view.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            } else {
                try {
                    String almacen = cmbAlmacen.getSelectedItem().toString();

                    Connection cn = ConMySQL.getInstance().getConnection();
                    String direccion = System.getProperty("user.dir") + "\\src\\main\\java\\reporte\\reporteDetalleAlmacen.jrxml";
                    JasperReport reporte = JasperCompileManager.compileReport(direccion);
                    Map parametro = new HashMap();

                    parametro.put("xalmacen", almacen);

                    JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametro, cn);
                    JasperViewer view = new JasperViewer(mostrarReporte, false);
                    //view.setTitle("Reporte Detalle Kardex - Fecha");
                    view.setExtendedState(MAXIMIZED_BOTH);
                    view.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            }

        }
        if (rbdEstado.isSelected() == true) {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Desea un diagrama del informe?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                try {

                    Connection cn = ConMySQL.getInstance().getConnection();
                    String direccion = System.getProperty("user.dir") + "\\src\\main\\java\\reporte\\reporteDetalleEstadoEstado.jrxml";
                    JasperReport reporte = JasperCompileManager.compileReport(direccion);
                    Map parametro = new HashMap();
                    parametro.put("xnada", "a");
                    JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametro, cn);
                    JasperViewer view = new JasperViewer(mostrarReporte, false);
                    //view.setTitle("Reporte Detalle Kardex - Fecha");
                    view.setExtendedState(MAXIMIZED_BOTH);
                    view.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            } else {
                try {
                    String estado = cmbEstado.getSelectedItem().toString();

                    Connection cn = ConMySQL.getInstance().getConnection();
                    String direccion = System.getProperty("user.dir") + "\\src\\main\\java\\reporte\\reporteDetalleEstado.jrxml";
                    JasperReport reporte = JasperCompileManager.compileReport(direccion);
                    Map parametro = new HashMap();

                    parametro.put("xestado", estado);

                    JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametro, cn);
                    JasperViewer view = new JasperViewer(mostrarReporte, false);
                    //view.setTitle("Reporte Detalle Kardex - Fecha");
                    view.setExtendedState(MAXIMIZED_BOTH);
                    view.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }

        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAlmacen;
    private javax.swing.JComboBox<String> cmbEstado;
    private com.toedter.calendar.JDateChooser dadfinal;
    private com.toedter.calendar.JDateChooser dadinicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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

}
