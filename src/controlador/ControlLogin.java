package controlador;

import java.awt.Color;
import javax.swing.ImageIcon;
import modelo.ModeloPersonal;
import vista.LoginView;
import vista.MainView;

public class ControlLogin {

    private LoginView loginView;
    private ModeloPersonal mPersonal;

    public ControlLogin(LoginView loginView, ModeloPersonal mPersonal) {
        this.loginView = loginView;
        this.mPersonal = mPersonal;
    }

    public void IniciarControl() {
        loginView.setTitle("Login");
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
        loginView.getAlertusutxt().setText("");
        loginView.getAlertpswtxt().setText("");
        loginView.getInicIarSBtn().addActionListener(l -> IniciarSesion());
        //Icono de app
        loginView.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LOGO_RESTAURANT_PROYECT.png")).getImage());
        loginView.setBackground(new Color(0, 0, 0, 0));
    }

    public void IniciarSesion() {
        // El método grabFocus() se utiliza en este código para mover el foco de entrada del usuario al campo de texto que requiere atención.

        loginView.getAlertusutxt().setText("");
        loginView.getAlertpswtxt().setText("");

        boolean action = true;
        if (loginView.getUserTextField().getText().equals("")) {
            loginView.getAlertusutxt().setText("Por favor, ingresa un nombre de usuario.");
            loginView.getUserTextField().grabFocus();
            action = false;
        }
        if (String.valueOf(loginView.getPasswordField().getPassword()).equals("")) {
            loginView.getAlertpswtxt().setText("Por favor, ingresa una contraseña.");
            if (action) {
                loginView.getUserTextField().grabFocus();
            }
            action = false;
        }

        if (action) {
            ControlMain cMain = new ControlMain(new MainView());
            cMain.IniciarControl();
        }
    }
}
