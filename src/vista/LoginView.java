package vista;

import CustomElements.Login.Background;
import CustomElements.Login.swing.Button;
import CustomElements.Login.swing.PasswordField;
import CustomElements.Login.swing.TextField;
import javax.swing.JLabel;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    public JLabel getAlertpswtxt() {
        return alertpswtxt;
    }

    public void setAlertpswtxt(JLabel alertpswtxt) {
        this.alertpswtxt = alertpswtxt;
    }

    public JLabel getAlertusutxt() {
        return alertusutxt;
    }

    public void setAlertusutxt(JLabel alertusutxt) {
        this.alertusutxt = alertusutxt;
    }

    public Button getInicIarSBtn() {
        return InicIarSBtn;
    }

    public void setInicIarSBtn(Button InicIarSBtn) {
        this.InicIarSBtn = InicIarSBtn;
    }

    public PasswordField getPasswordField() {
        return passwordField1;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField1 = passwordField;
    }

    public TextField getUserTextField() {
        return userTextField;
    }

    public void setUserTextField(TextField userTextField) {
        this.userTextField = userTextField;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new CustomElements.Login.Background();
        panel = new javax.swing.JPanel();
        titletxt = new javax.swing.JLabel();
        passwordField1 = new CustomElements.Login.swing.PasswordField();
        userTextField = new CustomElements.Login.swing.TextField();
        InicIarSBtn = new CustomElements.Login.swing.Button();
        alertusutxt = new javax.swing.JLabel();
        alertpswtxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(952, 623));

        background1.setBlur(panel);

        panel.setOpaque(false);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titletxt.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titletxt.setForeground(new java.awt.Color(255, 255, 255));
        titletxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titletxt.setText("Iniciar Sesion");
        panel.add(titletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 73, 162, -1));

        passwordField1.setHint("Contraseña");
        panel.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 183, 220, -1));

        userTextField.setHint("Nombre De Usuario");
        panel.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 123, 220, -1));

        InicIarSBtn.setForeground(new java.awt.Color(255, 255, 255));
        InicIarSBtn.setText("Iniciar Sesion");
        panel.add(InicIarSBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, -1));

        alertusutxt.setBackground(new java.awt.Color(255, 255, 255));
        alertusutxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        alertusutxt.setForeground(new java.awt.Color(255, 51, 51));
        alertusutxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertusutxt.setText("ALERTA");
        panel.add(alertusutxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 161, 220, -1));

        alertpswtxt.setBackground(new java.awt.Color(255, 255, 255));
        alertpswtxt.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        alertpswtxt.setForeground(new java.awt.Color(255, 51, 51));
        alertpswtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertpswtxt.setText("ALERTA");
        panel.add(alertpswtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 221, 229, -1));

        background1.add(panel);
        panel.setBounds(310, 130, 330, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomElements.Login.swing.Button InicIarSBtn;
    private javax.swing.JLabel alertpswtxt;
    private javax.swing.JLabel alertusutxt;
    private CustomElements.Login.Background background1;
    private javax.swing.JPanel panel;
    private CustomElements.Login.swing.PasswordField passwordField1;
    private javax.swing.JLabel titletxt;
    private CustomElements.Login.swing.TextField userTextField;
    // End of variables declaration//GEN-END:variables
}
