package pe.unjfsc.almacen.java11.view;

import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEProducto;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarCategoria;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarEmpaqueProductoHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarMarcaProductoHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarProductoHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarSaborProductoHashSet;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarUnidadMedidaHashSet;

public class JFrameMostrarProducto extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarProducto");

    DefaultTableModel objDtm;
    ResultSet rsProducto;
    ResultSet rsCategoria;
    ResultSet rsMarca;
    ResultSet rsSabor;
    ResultSet rsUnidadM;
    ResultSet rsEmpaque;
    int xidCategoria, xidMarca, xidSabro, xidUnidadM, xidEmpaque, xidProducto;
    boolean sw;

    CMCambiarProductoHashSet oCMProducto = new CMCambiarProductoHashSet();
    CMCambiarCategoria oCategoria = new CMCambiarCategoria();
    CMCambiarMarcaProductoHashSet oMarca = new CMCambiarMarcaProductoHashSet();
    CMCambiarSaborProductoHashSet oSabor = new CMCambiarSaborProductoHashSet();
    CMCambiarUnidadMedidaHashSet oUnidad = new CMCambiarUnidadMedidaHashSet();
    CMCambiarEmpaqueProductoHashSet oEmpaque = new CMCambiarEmpaqueProductoHashSet();

    public JFrameMostrarProducto() {
        initComponents();

        setSize(880, 651);
        //setVisible(true);
        setLocationRelativeTo(null);

        objDtm = (DefaultTableModel) tblRegistro.getModel();
        mostrarDatos();

    }

    private void mostrarDatos() {
        limpiaJTable();
        try {
            rsProducto = oCMProducto.mostrar();
            while (rsProducto.next()) {
                Object registro[] = {rsProducto.getInt(1), rsProducto.getString(2), rsProducto.getString(3),
                    rsProducto.getString(4), rsProducto.getString(5), rsProducto.getString(6), rsProducto.getString(7),
                    rsProducto.getString(8), rsProducto.getString(9), rsProducto.getString(10), rsProducto.getString(11),
                    rsProducto.getString(12)};
                objDtm.addRow(registro);
                System.out.println("OBJET>" + registro);
            }
        } catch (Exception e) {
        }
    }

    private void limpiaJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        txtdescripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbidcategoria = new javax.swing.JComboBox<>();
        cbidmarca = new javax.swing.JComboBox<>();
        cbidsabor = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbidunidadm = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtpresentxemp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbidempaque = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtunidad = new javax.swing.JTextField();
        jblImagen = new javax.swing.JLabel();
        btnseleccionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtunxemp = new javax.swing.JTextField();
        txtURLimg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
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
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        txtnombre.setEditable(false);
        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(null);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, 30));

        jLabel10.setText("NOMBRE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        txtidproducto.setEditable(false);
        txtidproducto.setBackground(new java.awt.Color(255, 255, 255));
        txtidproducto.setBorder(null);
        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 30));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "SABOR", "MARCA", "PESO", "UNIDAD_M", "PRES EMPAQUE", "UNIDAD_EMPAQUE", "EMPAQUE", "UNIDAD_PRO"
            }
        ));
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRegistro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 630, 140));

        txtdescripcion.setEditable(false);
        txtdescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtdescripcion.setBorder(null);
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, 30));

        jLabel11.setText("DESCRIPCION");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        jLabel12.setText("CATEGORIA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 30));

        jLabel13.setText("SABOR");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 70, 30));

        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, 30));

        cbidcategoria.setEnabled(false);
        jPanel1.add(cbidcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 30));

        cbidmarca.setEnabled(false);
        jPanel1.add(cbidmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 30));

        cbidsabor.setEnabled(false);
        jPanel1.add(cbidsabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 110, 30));

        jLabel14.setText("PESO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        txtpeso.setEditable(false);
        txtpeso.setBackground(new java.awt.Color(255, 255, 255));
        txtpeso.setBorder(null);
        jPanel1.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 30));

        jLabel15.setText("UNIDAD M.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 60, 30));

        cbidunidadm.setEnabled(false);
        jPanel1.add(cbidunidadm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 110, 30));

        jLabel2.setText("PRESENT X EMPAQUE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, 30));

        txtpresentxemp.setEditable(false);
        txtpresentxemp.setBackground(new java.awt.Color(255, 255, 255));
        txtpresentxemp.setBorder(null);
        jPanel1.add(txtpresentxemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 30));

        jLabel16.setText("EMPAQUE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 30));

        cbidempaque.setEnabled(false);
        jPanel1.add(cbidempaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 130, 30));

        jLabel3.setText("UNIDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, 30));

        txtunidad.setEditable(false);
        txtunidad.setBackground(new java.awt.Color(255, 255, 255));
        txtunidad.setBorder(null);
        jPanel1.add(txtunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 120, 30));

        jblImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 160, 200));

        btnseleccionar.setText("SELECCIONAR IMG.");
        btnseleccionar.setEnabled(false);
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 151, -1));

        jLabel7.setText("UNxEMP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 70, 30));

        txtunxemp.setEditable(false);
        txtunxemp.setBackground(new java.awt.Color(255, 255, 255));
        txtunxemp.setBorder(null);
        jPanel1.add(txtunxemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 120, 30));

        txtURLimg.setEditable(false);
        txtURLimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtURLimgActionPerformed(evt);
            }
        });
        jPanel1.add(txtURLimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 87, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, -1));

        jPanel4.setBackground(new java.awt.Color(231, 96, 76));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 130, 40));

        jPanel3.setBackground(new java.awt.Color(58, 78, 121));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 140, 40));

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
            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, 40));

        jSeparator2.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator2.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 120, 30));

        jSeparator3.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator3.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, 30));

        jSeparator4.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator4.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 200, 30));

        jSeparator5.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator5.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, 30));

        jSeparator6.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator6.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, 30));

        jSeparator7.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator7.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 120, 30));

        jSeparator8.setBackground(new java.awt.Color(58, 78, 121));
        jSeparator8.setForeground(new java.awt.Color(58, 78, 121));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 690, 650));

        jPanel2.setBackground(new java.awt.Color(58, 78, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 70));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 70));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LOG.info("[FSI] Star boton Nuevo : ");
        habilitaControles(true);
        limpiarControles();
        sw = true;
        llenaComboCategoria();
        llenaComboMarca();
        llenaComboEmpaque();
        llenaComboSabor();
        llenaComboUnidadM();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LOG.info("[FSI] Star boton Cancelar : ");
        habilitaControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LOG.info("[FSI] Star boton Eliminar : PRODUCTO ");
   
        try {
            int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (!txtidproducto.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {
                    CEProducto producto = new CEProducto();
                    producto.setIdProducto(Integer.parseInt(txtidproducto.getText()));
                    oCMProducto.eliminarAlmacenCIC(producto);
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
            if (!txtnombre.getText().isEmpty()) {
                CEProducto oProducto = new CEProducto();
                oProducto.setNombProd(txtnombre.getText().toUpperCase());
                oProducto.setDescProd(txtdescripcion.getText().toUpperCase());
                oProducto.setPesoProd(Double.parseDouble(txtpeso.getText()));
                oProducto.setPresxe(Integer.parseInt(txtpresentxemp.getText()));
                oProducto.setUndpxc(txtunxemp.getText().toUpperCase());
                oProducto.setUnidad(Integer.parseInt(txtunidad.getText().toUpperCase()));

                //CATEGORIA COMBO
                obtenerCategoria();
                oProducto.setIdCategoria(xidCategoria);

                //MARCA COMBO
                obtenerMarca();
                oProducto.setIdMarca(xidMarca);

                //SABOR COMBO
                obtenerSabor();
                oProducto.setIdSabor(xidSabro);

                //UNIDADM COMBO
                obtenerUnidadM();
                oProducto.setIdUnidadM(xidUnidadM);

                //EMPAQUE COMBO
                obtenerEmpaque();
                oProducto.setIdEmpaque(xidEmpaque);

                // imagen
                oProducto.setImagProd(txtURLimg.getText());

                Image foto = getToolkit().getImage(txtnombre.getText());
                foto = foto.getScaledInstance(187, 203, Image.SCALE_DEFAULT);
                jblImagen.setIcon(new ImageIcon(foto));
                rsProducto.last();

                if (sw) {
                    oCMProducto.saveAlmacenCIC(oProducto);
                    LOG.info("[FSI] Dato Grabado : {}");
                } else {
                    oProducto.setIdProducto(Integer.parseInt(txtidproducto.getText()));
                    oCMProducto.modificarAlmacenCIC(oProducto);
                    LOG.info("[FSI] Dato Editado : {}");
                }

                mostrarDatos();
            } else {
                LOG.info("[FSI] Error al ingreso de datos : {} ", txtidproducto.getText(), " - ", txtdescripcion.getText());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR " + e);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        habilitaControles(false);
        limpiarControles();

    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        LOG.info("[FSI] Star boton Editar : {}");
        habilitaControles(true);
        sw = false;
        llenaComboCategoria();
        llenaComboMarca();
        llenaComboEmpaque();
        llenaComboSabor();
        llenaComboUnidadM();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LOG.info("[FSI] Star boton salir : ");

        int op = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtURLimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtURLimgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURLimgActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG", "jpg", "jpeg");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");

        //RUTA DE LAS IMAGENES
        String directorio = System.getProperty("user.dir") + "\\src\\main\\resources\\productos_de_almacen";
        File ruta = new File(directorio);
        System.out.println(directorio);

        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            txtURLimg.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtURLimg.getText());
            foto = foto.getScaledInstance(160, 200, Image.SCALE_DEFAULT);
            jblImagen.setIcon(new ImageIcon(foto));
        }


    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked

        try {

            xidProducto = Integer.parseInt(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
            rsProducto.first();
            do {
                if (xidProducto == rsProducto.getInt(1)) {

                    txtidproducto.setText(String.valueOf(rsProducto.getInt(1)));
                    txtnombre.setText(rsProducto.getString(2));
                    txtdescripcion.setText(rsProducto.getString(3));
                    cbidcategoria.removeAllItems();
                    cbidcategoria.addItem(rsProducto.getString(4));
                    cbidmarca.removeAllItems();
                    cbidmarca.addItem(rsProducto.getString(6));
                    txtpeso.setText(rsProducto.getString(7));
                    cbidunidadm.removeAllItems();
                    cbidunidadm.addItem(rsProducto.getString(8));
                    txtpresentxemp.setText(rsProducto.getString(9));
                    txtunxemp.setText(rsProducto.getString(10));
                    txtunidad.setText(String.valueOf(rsProducto.getString(12)));

                    cbidsabor.removeAllItems();
                    cbidsabor.addItem(rsProducto.getString(5));

                    cbidempaque.removeAllItems();
                    cbidempaque.addItem(rsProducto.getString(11));

                    txtURLimg.setText(rsProducto.getString(13));
                    Image foto = getToolkit().getImage(txtURLimg.getText());
                    foto = foto.getScaledInstance(187, 203, Image.SCALE_DEFAULT);
                    jblImagen.setIcon(new ImageIcon(foto));

                    rsProducto.last();
                }

            } while (rsProducto.next());

        } catch (Exception e) {
        }

    }//GEN-LAST:event_tblRegistroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JComboBox<String> cbidcategoria;
    private javax.swing.JComboBox<String> cbidempaque;
    private javax.swing.JComboBox<String> cbidmarca;
    private javax.swing.JComboBox<String> cbidsabor;
    private javax.swing.JComboBox<String> cbidunidadm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JLabel jblImagen;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtURLimg;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtpresentxemp;
    private javax.swing.JTextField txtunidad;
    private javax.swing.JTextField txtunxemp;
    // End of variables declaration//GEN-END:variables

    private void habilitaControles(boolean b) {
        txtidproducto.setEditable(b);
        txtnombre.setEditable(b);
        txtdescripcion.setEditable(b);
        txtpeso.setEditable(b);
        txtpresentxemp.setEditable(b);
        txtunidad.setEditable(b);
        txtunxemp.setEditable(b);

        cbidcategoria.setEnabled(b);
        cbidempaque.setEnabled(b);
        cbidmarca.setEnabled(b);
        cbidsabor.setEnabled(b);
        cbidunidadm.setEnabled(b);
        btnseleccionar.setEnabled(b);

        btnGrabar.setEnabled(b);
        btnCancelar.setEnabled(b);

        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);

        btnSalir.setEnabled(!b);
        txtidproducto.requestFocus();
    }

    private void limpiarControles() {

        txtidproducto.setText(null);
        txtnombre.setText(null);
        txtdescripcion.setText(null);
        txtpeso.setText(null);
        txtpresentxemp.setText(null);
        txtunidad.setText(null);
        txtunxemp.setText(null);
        txtURLimg.setText(null);

        cbidcategoria.removeAllItems();
        cbidempaque.removeAllItems();
        cbidmarca.removeAllItems();
        cbidsabor.removeAllItems();
        cbidunidadm.removeAllItems();
    }

    public void llenaComboCategoria() {
        System.out.println("Metodo llenar combo categoria");

        try {

            rsCategoria = oCategoria.buscar2("%");
            System.out.println(rsCategoria);

            if (sw) {
                while (rsCategoria.next()) {
                    cbidcategoria.addItem(rsCategoria.getString(2));
                    System.out.println(rsCategoria.getString(2));
                }
            } else {
                String nombre = cbidcategoria.getSelectedItem().toString();
                while (rsCategoria.next()) {
                    if (!nombre.equals(rsCategoria.getString(2))) {
                        cbidcategoria.addItem(rsCategoria.getString(2));
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    private void obtenerCategoria() {
        try {
            String nombre = cbidcategoria.getSelectedItem().toString();
            rsCategoria.first();

            do {
                if (nombre.equals(rsCategoria.getString(2))) {
                    xidCategoria = rsCategoria.getInt(1);
                    rsCategoria.last();
                }
            } while (rsCategoria.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }

    public void llenaComboMarca() {
        System.out.println("Metodo llenar combo Marca");

        try {

            rsMarca = oMarca.buscar("%");
            System.out.println(rsMarca);

            if (sw) {
                while (rsMarca.next()) {
                    cbidmarca.addItem(rsMarca.getString(2));
                    System.out.println(rsMarca.getString(2));
                }
            } else {
                String nombre = cbidmarca.getSelectedItem().toString();
                while (rsMarca.next()) {
                    if (!nombre.equals(rsMarca.getString(2))) {
                        cbidmarca.addItem(rsMarca.getString(2));
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    public void llenaComboSabor() {
        System.out.println("Metodo llenar combo sabor");

        try {

            rsSabor = oSabor.buscar("%");
            System.out.println(oSabor);

            if (sw) {
                while (rsSabor.next()) {
                    cbidsabor.addItem(rsSabor.getString(2));
                    System.out.println(rsSabor.getString(2));
                }
            } else {
                String nombre = cbidsabor.getSelectedItem().toString();
                while (rsSabor.next()) {
                    if (!nombre.equals(rsSabor.getString(2))) {
                        cbidsabor.addItem(rsSabor.getString(2));
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    public void llenaComboUnidadM() {
        System.out.println("Metodo llenar combo UnidadM");

        try {

            rsUnidadM = oUnidad.buscar("%");
            System.out.println(rsUnidadM);

            if (sw) {
                while (rsUnidadM.next()) {
                    cbidunidadm.addItem(rsUnidadM.getString(2));
                    System.out.println(rsUnidadM.getString(2));
                }
            } else {
                String nombre = cbidunidadm.getSelectedItem().toString();
                while (rsUnidadM.next()) {
                    if (!nombre.equals(rsUnidadM.getString(2))) {
                        cbidunidadm.addItem(rsUnidadM.getString(2));
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    public void llenaComboEmpaque() {
        System.out.println("Metodo llenar combo Empaque");

        try {

            rsEmpaque = oEmpaque.buscar("%");
            System.out.println(rsEmpaque);

            if (sw) {
                while (rsEmpaque.next()) {
                    cbidempaque.addItem(rsEmpaque.getString(2));
                    System.out.println(rsEmpaque.getString(2));
                }
            } else {
                String nombre = cbidempaque.getSelectedItem().toString();
                while (rsEmpaque.next()) {
                    if (!nombre.equals(rsEmpaque.getString(2))) {
                        cbidempaque.addItem(rsEmpaque.getString(2));
                    }
                }
            }

        } catch (Exception e) {
        }
    }

    private void obtenerMarca() {

        try {
            String nombre = cbidmarca.getSelectedItem().toString();
            rsMarca.first();

            do {
                if (nombre.equals(rsMarca.getString(2))) {
                    xidMarca = rsMarca.getInt(1);
                    rsMarca.last();
                }
            } while (rsMarca.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }

    private void obtenerSabor() {
        try {
            String nombre = cbidsabor.getSelectedItem().toString();
            rsSabor.first();

            do {
                if (nombre.equals(rsSabor.getString(2))) {
                    xidSabro = rsSabor.getInt(1);
                    rsSabor.last();
                }
            } while (rsSabor.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }

    }

    private void obtenerUnidadM() {

        try {
            String nombre = cbidunidadm.getSelectedItem().toString();
            rsUnidadM.first();

            do {
                if (nombre.equals(rsUnidadM.getString(2))) {
                    xidUnidadM = rsUnidadM.getInt(1);
                    rsUnidadM.last();
                }
            } while (rsUnidadM.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }

    }

    private void obtenerEmpaque() {

        try {
            String nombre = cbidempaque.getSelectedItem().toString();
            rsEmpaque.first();

            do {
                if (nombre.equals(rsEmpaque.getString(2))) {
                    xidEmpaque = rsEmpaque.getInt(1);
                    rsSabor.last();
                }
            } while (rsEmpaque.next());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR OBTENER: " + e);
        }
    }

}
