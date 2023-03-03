package vista;

import CustomElements.Login.swing.Button;
import CustomElements.Login.swing.PasswordField;
import CustomElements.Login.swing.TextField;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(952, 623));

        background1.setBlur(panel);

        panel.setOpaque(false);

        titletxt.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titletxt.setForeground(new java.awt.Color(255, 255, 255));
        titletxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titletxt.setText("Iniciar Sesion");

        passwordField1.setHint("Contraseña");

        userTextField.setHint("Nombre De Usuario");

        InicIarSBtn.setForeground(new java.awt.Color(255, 255, 255));
        InicIarSBtn.setText("Iniciar Sesion");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(InicIarSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(titletxt)
                .addGap(18, 18, 18)
                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(InicIarSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        background1.add(panel);
        panel.setBounds(310, 130, 330, 334);

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
    private CustomElements.Login.Background background1;
    private javax.swing.JPanel panel;
    private CustomElements.Login.swing.PasswordField passwordField1;
    private javax.swing.JLabel titletxt;
    private CustomElements.Login.swing.TextField userTextField;
    // End of variables declaration//GEN-END:variables
}
