package vista;

import Modelo.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel Cardenas
 */
public class VistaLogin extends javax.swing.JFrame {
    // Angelcarde - angel1234
    //---> Si cerro sesion con esto dejamos de usar al anterior.

    private ImageIcon iFondo = new ImageIcon("src\\Imagenes\\Login\\fondo.png"),
            idFondos1 = new ImageIcon("src\\Imagenes\\Login\\imagen1.png"),
            idiconoLogin = new ImageIcon("src\\Imagenes\\Login\\logoLogin.png"),
            fotoAnimal3 = new ImageIcon("src\\Imagenes\\CatAnimales.jpg"),
            showPassword = new ImageIcon("src\\Imagenes\\Login\\eye-open1.png"),
            imagenJirafa = new ImageIcon("src\\Imagenes\\JirafaPro.jpg");

    //Se usara para obtener los datos desde otras interfaces
    public VistaLogin() {
        initComponents();
        //Icono de app
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/Logo App Zoologico.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        crarImagenesDeLaInterfaz();
        alertusuBtxt.setVisible(false);
        alertContraBtxt.setVisible(false);
    }

    public void crarImagenesDeLaInterfaz() {
        jlabelShowPassword.setIcon(EscalarImagen(showPassword, jlabelShowPassword));
        showPassword = new ImageIcon("src\\Imagenes\\Login\\eye-close.png");
        jlabelDismissPassword.setIcon(EscalarImagen(showPassword, jlabelDismissPassword));
        jImagenmorsa.setIcon(EscalarImagen(fotoAnimal3, jImagenmorsa));
        jImageFAnimal.setIcon(EscalarImagen(imagenJirafa, jImageFAnimal));
        jPanelFondo.setBackground(Color.WHITE);
        jImageFondo.setIcon(EscalarImagen(iFondo, jImageFondo));
        jImageFPassword.setIcon(EscalarImagen(idFondos1, jImageFPassword));
        jImageIconoLogin.setIcon(EscalarImagen(idiconoLogin, jImageIconoLogin));
        jlabelDismissPassword.setVisible(false);
    }

    public ImageIcon EscalarImagen(ImageIcon imagenATransformar, JLabel tamañoPanel) {
        ImageIcon imagenEscalada = new ImageIcon(imagenATransformar.getImage().getScaledInstance(tamañoPanel.getWidth(),
                tamañoPanel.getHeight(), Image.SCALE_AREA_AVERAGING));
        return imagenEscalada;
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
        jPanel2.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 170, 40));

        jPanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 470, 470));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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