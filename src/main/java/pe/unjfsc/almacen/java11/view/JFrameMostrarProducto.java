package pe.unjfsc.almacen.java11.view;

import java.awt.Image;
import java.io.File;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.unjfsc.almacen.java11.entity.CEProducto;
import pe.unjfsc.almacen.java11.logical.CLVariacionProducto;
import pe.unjfsc.almacen.java11.model.CICambioAlmacen;
import pe.unjfsc.almacen.java11.model.imp.CMCambiarProductoHashSet;

public class JFrameMostrarProducto extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameMostrarProducto");

    private HashSet<CEProducto> oHsData;
    private CICambioAlmacen oCIAlmacen;
    CEProducto oAlmacen;
    CMCambiarProductoHashSet oCMAlmacen;
    boolean sw;

    public JFrameMostrarProducto() {
        initComponents();
        oCMAlmacen = new CMCambiarProductoHashSet();
        oAlmacen = new CEProducto();
        setSize(880, 651);
        //setVisible(true);
        setLocationRelativeTo(null);

        String[] aTitulo = {"CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "SABOR", "MARCA", "PESO P.", "UN. MED.", "PREST X EMP", "UNDxEMP", "EMPAQUE", "UNIDAD", "IMG"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblRegistro.setModel(oModel);

    }

    private Object[][] loadData() {
        oCIAlmacen = oCMAlmacen;
        oHsData = oCIAlmacen.consultAllAlmacenCIC();

        CLVariacionProducto oLogicalProducto = new CLVariacionProducto();
        return oLogicalProducto.convertHashSetArray(oHsData);
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
        txtimg = new javax.swing.JTextField();
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

        cbidcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CA001", "CA002", "CA003" }));
        cbidcategoria.setEnabled(false);
        jPanel1.add(cbidcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 30));

        cbidmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MR001", "MR002", "MR003", "MR004" }));
        cbidmarca.setEnabled(false);
        jPanel1.add(cbidmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 30));

        cbidsabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S001", "S002", "S003", "S004", "S005" }));
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

        cbidunidadm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN001", "UN002", "UN003" }));
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

        cbidempaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EM001", "EM002", "EM003", "EM004" }));
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

        txtimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimgActionPerformed(evt);
            }
        });
        jPanel1.add(txtimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 87, -1));

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
            if (!txtidproducto.getText().isEmpty()) {
                if (op == JOptionPane.YES_OPTION) {

                    oCMAlmacen.eliminarAlmacenCIC(txtidproducto.getText());
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
        if (!txtidproducto.getText().isEmpty()) {

            oAlmacen.setIdProducto(txtidproducto.getText());
            oAlmacen.setNombProd(txtnombre.getText());
            oAlmacen.setDescProd(txtdescripcion.getText());

            oAlmacen.setIdCategoria(cbidcategoria.getSelectedItem().toString());
            oAlmacen.setIdSabor(cbidsabor.getSelectedItem().toString());
            oAlmacen.setIdMarca(cbidmarca.getSelectedItem().toString());

            oAlmacen.setPesoProd(Double.parseDouble(txtpeso.getText()));
            oAlmacen.setIdUnidadM(cbidunidadm.getSelectedItem().toString());
            oAlmacen.setPresxe(Integer.parseInt(txtpresentxemp.getText()));

            oAlmacen.setUndpxc(txtunxemp.getText());
            oAlmacen.setIdEmpaque(cbidempaque.getSelectedItem().toString());
            oAlmacen.setUnidad(Integer.parseInt(txtunidad.getText()));

            oAlmacen.setImagProd(txtimg.getText());

            Image foto = getToolkit().getImage(txtimg.getText());
            foto = foto.getScaledInstance(151, 166, Image.SCALE_DEFAULT);
            jblImagen.setIcon(new ImageIcon(foto));

            if (sw) {
                oCMAlmacen.saveAlmacenCIC(oAlmacen);
                LOG.info("[FSI] Dato Grabado : {}");
            } else {
                oCMAlmacen.modificarAlmacenCIC(new CEProducto(
                        txtidproducto.getText(),
                        txtnombre.getText(),
                        txtdescripcion.getText(),
                        cbidcategoria.getSelectedItem().toString(),
                        cbidsabor.getSelectedItem().toString(),
                        cbidmarca.getSelectedItem().toString(),
                        Double.parseDouble(txtpeso.getText()),
                        cbidunidadm.getSelectedItem().toString(),
                        Integer.parseInt(txtpresentxemp.getText()),
                        txtunxemp.getText(),
                        cbidempaque.getSelectedItem().toString(),
                        Integer.parseInt(txtunidad.getText()),
                        txtimg.getText()
                ));
                LOG.info("[FSI] Dato Editado : {}");
            }

            mostrarDatos();
        } else {
            LOG.info("[FSI] Error al ingreso de datos : {} ", txtidproducto.getText(), " - ", txtnombre.getText());
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

    private void txtimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimgActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG", "jpg", "jpeg");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");

        //RUTA DE LAS IMAGENES
        File ruta = new File("C:\\Users\\zidan\\Documents\\NetBeansProjects\\GRUPO04ALMC_2\\src\\main\\java\\imagenes");

        System.out.println("ruta" + new File(".").getAbsolutePath());
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            txtimg.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtimg.getText());
            foto = foto.getScaledInstance(151, 166, Image.SCALE_DEFAULT);
            jblImagen.setIcon(new ImageIcon(foto));
        }

    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked

        txtidproducto.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
        txtnombre.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 1).toString());
        txtdescripcion.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 2).toString());
        cbidcategoria.setSelectedItem(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 3).toString());
        cbidsabor.setSelectedItem(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 4).toString());
        cbidmarca.setSelectedItem(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 5).toString());
        txtpeso.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 6).toString());
        cbidunidadm.setSelectedItem(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 7).toString());
        txtpresentxemp.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 8).toString());
        txtunxemp.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 9).toString());
        cbidempaque.setSelectedItem(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 10).toString());
        txtunidad.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 11).toString());
        txtimg.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 12).toString());

        Image foto = getToolkit().getImage(txtimg.getText());
        foto = foto.getScaledInstance(151, 166, Image.SCALE_DEFAULT);
        jblImagen.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_tblRegistroMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameMostrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMostrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMostrarProducto().setVisible(true);
            }
        });
    }

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
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtimg;
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

        cbidcategoria.setSelectedIndex(0);
        cbidempaque.setSelectedIndex(0);
        cbidmarca.setSelectedIndex(0);
        cbidsabor.setSelectedIndex(0);
        cbidunidadm.setSelectedIndex(0);
    }

    private void mostrarDatos() {
        String[] aTitulo = {"CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "SABOR", "MARCA", "PESO P.", "UN. MED.", "PREST X EMP", "UNDxEMP", "EMPAQUE", "UNIDAD", "IMG"};
        DefaultTableModel oModel = new DefaultTableModel(loadData(), aTitulo);

        tblRegistro.setModel(oModel);
    }

}
