package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LoginView extends javax.swing.JFrame {
    public LoginView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ContentImagenes = new javax.swing.JPanel();
        jImageFPassword = new javax.swing.JLabel();
        jImageFAnimal = new javax.swing.JLabel();
        jImagenmorsa = new javax.swing.JLabel();
        jTextLoginTitle1 = new javax.swing.JLabel();
        jImageIconoLogin = new javax.swing.JLabel();
        jImageFondo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextLoginTitle = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        alertusuBtxt = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jlabelShowPassword = new javax.swing.JLabel();
        jlabelDismissPassword = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jTextFieldContraseña = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        alertContraBtxt = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContentImagenes.setOpaque(false);
        ContentImagenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ContentImagenes.add(jImageFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));
        ContentImagenes.add(jImageFAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 420, 300));
        ContentImagenes.add(jImagenmorsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 420, 300));

        jPanel1.add(ContentImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 1260, 300));

        jTextLoginTitle1.setBackground(new java.awt.Color(255, 255, 255));
        jTextLoginTitle1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jTextLoginTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jTextLoginTitle1.setText("Login de Usuario");
        jPanel1.add(jTextLoginTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 250, 30));

        jImageIconoLogin.setRequestFocusEnabled(false);
        jImageIconoLogin.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jImageIconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 40, 40));
        jPanel1.add(jImageFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 470));

        jPanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextLoginTitle.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jTextLoginTitle.setText("Ingresa tus Datos");
        jPanel2.add(jTextLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 190, 40));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("USUARIO");
        jPanel2.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        alertusuBtxt.setBackground(new java.awt.Color(255, 255, 255));
        alertusuBtxt.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        alertusuBtxt.setForeground(new java.awt.Color(255, 51, 51));
        alertusuBtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertusuBtxt.setText("Por favor, ingrese un usuario");
        jPanel2.add(alertusuBtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 20));

        jTextFieldUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUsuario.setText("Ingrese su nombre de usuario");
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMousePressed(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 300, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 300, 10));

        jlabelShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlabelShowPasswordMousePressed(evt);
            }
        });
        jPanel2.add(jlabelShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 265, 20, 20));

        jlabelDismissPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlabelDismissPasswordMousePressed(evt);
            }
        });
        jPanel2.add(jlabelDismissPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 265, 20, 20));

        passwordLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passwordLabel.setText("CONTRASEÑA");
        jPanel2.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jTextFieldContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldContraseña.setText("********");
        jTextFieldContraseña.setBorder(null);
        jTextFieldContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldContraseñaMousePressed(evt);
            }
        });
        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });
        jTextFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldContraseñaKeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 300, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 300, 10));

        alertContraBtxt.setBackground(new java.awt.Color(255, 255, 255));
        alertContraBtxt.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        alertContraBtxt.setForeground(new java.awt.Color(255, 51, 51));
        alertContraBtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertContraBtxt.setText("Por favor, ingrese una contraseña");
        jPanel2.add(alertContraBtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 180, 20));

        jButtonIniciarSesion.setBackground(new java.awt.Color(114, 71, 197));
        jButtonIniciarSesion.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSesion.setText("Iniciar Sesion");
        jButtonIniciarSesion.setActionCommand("");
        jButtonIniciarSesion.setBorder(null);
        jButtonIniciarSesion.setBorderPainted(false);
        jButtonIniciarSesion.setFocusPainted(false);
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 170, 40));

        jPanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 470, 470));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMousePressed
        if (jTextFieldUsuario.getText().equals("Ingrese su nombre de usuario")) {
            jTextFieldUsuario.setText("");
            jTextFieldUsuario.setForeground(Color.black);
        }
        if (String.valueOf(jTextFieldContraseña.getPassword()).isEmpty()) {
            jTextFieldContraseña.setText("********");
            jTextFieldContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldUsuarioMousePressed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jTextFieldContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaMousePressed
        if (String.valueOf(jTextFieldContraseña.getPassword()).equals("********")) {
            jTextFieldContraseña.setText("");
            jTextFieldContraseña.setForeground(Color.black);
        }
        if (jTextFieldUsuario.getText().isEmpty()) {
            jTextFieldUsuario.setText("Ingrese su nombre de usuario");
            jTextFieldUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jTextFieldContraseñaMousePressed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        // TODO add your handling code here:
//        ValidacionIniciarSesion();
        jTextFieldUsuario.setText("Angelcarde");
        jTextFieldContraseña.setText("angel1234");
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jTextFieldUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') {
//            ValidacionIniciarSesion();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyReleased

    private void jTextFieldContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') {
//            ValidacionIniciarSesion();
        }
    }//GEN-LAST:event_jTextFieldContraseñaKeyReleased

    private void jlabelShowPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelShowPasswordMousePressed
        // TODO add your handling code here:
        jTextFieldContraseña.setEchoChar((char) 0);
        jlabelShowPassword.setVisible(false);
        jlabelDismissPassword.setVisible(true);
    }//GEN-LAST:event_jlabelShowPasswordMousePressed

    private void jlabelDismissPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelDismissPasswordMousePressed
        // TODO add your handling code here:
        jTextFieldContraseña.setEchoChar('*');
        jlabelShowPassword.setVisible(true);
        jlabelDismissPassword.setVisible(false);
    }//GEN-LAST:event_jlabelDismissPasswordMousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentImagenes;
    private javax.swing.JLabel alertContraBtxt;
    private javax.swing.JLabel alertusuBtxt;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jImageFAnimal;
    private javax.swing.JLabel jImageFPassword;
    private javax.swing.JLabel jImageFondo;
    private javax.swing.JLabel jImageIconoLogin;
    private javax.swing.JLabel jImagenmorsa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel jTextLoginTitle;
    private javax.swing.JLabel jTextLoginTitle1;
    private javax.swing.JLabel jlabelDismissPassword;
    private javax.swing.JLabel jlabelShowPassword;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
