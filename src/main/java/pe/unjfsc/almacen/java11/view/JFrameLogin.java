package pe.unjfsc.almacen.java11.view;

import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JFrameLogin extends javax.swing.JFrame {

    private static final Logger LOG = LoggerFactory.getLogger("JFrameLogin");

    JFrameAdmin admin;
    JFrameEmpl empl;

    public JFrameLogin() {
        admin = new JFrameAdmin();
        empl = new JFrameEmpl();
        initComponents();
        this.setSize(1002, 521);

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtsuario2 = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsuario2.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        txtsuario2.setForeground(new java.awt.Color(102, 102, 102));
        txtsuario2.setBorder(null);
        txtsuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 180, 50));

        txtContra.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        txtContra.setForeground(new java.awt.Color(102, 102, 102));
        txtContra.setBorder(null);
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, 50));

        jPanel2.setBackground(new java.awt.Color(24, 46, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn.setBackground(new java.awt.Color(255, 255, 255));
        btn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btn.setForeground(new java.awt.Color(255, 255, 255));
        btn.setText("INGRESAR");
        btn.setContentAreaFilled(false);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        jPanel2.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pass.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 40, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/usu.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 40, 60));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/Sin-título-1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        LOG.info("[FSI] Star boton Ingresar : ");
        try {

            String user = "admin";
            String contraseña = "admin";

            String user2 = "almacen";
            String contraseña2 = "almacen";

            String a = txtsuario2.getText();
            String b = txtContra.getText();

            if (a.equals("") && b.equals("")) {
                JOptionPane.showMessageDialog(null, "No registro datos", "Advertencia", JOptionPane.OK_OPTION);
            } else if (a.equals(user) && b.equals(contraseña)) {

                this.setVisible(false);
                admin.setVisible(true);

            } else if (a.equals(user2) && b.equals(contraseña2)) {
                this.setVisible(false);
                empl.setVisible(true);
            } else {
                txtsuario2.setText("");
                txtContra.setText("");
                txtsuario2.requestFocus();

                int op = JOptionPane.showConfirmDialog(rootPane, "El usuario o Contraseña es invalido." + "\n"
                        + "¿Desea continuar?", "Error", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (op == JOptionPane.YES_NO_OPTION) {
                    if (op == 0) {
                        txtsuario2.setText("");
                        txtContra.setText("");
                        txtsuario2.requestFocus();
                    }
                } else {
                    this.setVisible(false);
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("ERROr" + e);
        }
    }//GEN-LAST:event_btnActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LOG.info("[FSI] Star boton Salir : ");
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtsuario2;
    // End of variables declaration//GEN-END:variables
}
