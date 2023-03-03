package controlador;

import java.awt.Color;
import javax.swing.ImageIcon;
import modelo.ModeloPersonal;
import vista.LoginView;

public class ControlLogin {

    private LoginView loginView;
    private ModeloPersonal mPersonal;

    public ControlLogin(LoginView loginView, ModeloPersonal mPersonal) {
        this.loginView = loginView;
        this.mPersonal = mPersonal;
    }

    public void IniciarControl() {
        loginView.setVisible(true);
        //Icono de app
        loginView.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LOGO_RESTAURANT_PROYECT.png")).getImage());
        loginView.setBackground(new Color(0, 0, 0, 0));
        loginView.setLocationRelativeTo(null);
    }
}
