package controlador;

import modelo.ModeloPersonal;
import vista.*;

public class ControlSplash {

    private CargarSplash cargarSplash;
    private SplashView splashView;

    public ControlSplash(SplashView splashView) {
        this.splashView = splashView;
    }

    public void IniciarControl() {
        splashView.setVisible(true);
        splashView.setLocationRelativeTo(null);
        cargarSplash = new CargarSplash(splashView.getProgress());
        cargarSplash.start();
        cargarSplash = null;

        splashView.getProgress().addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                if (splashView.getProgress().getValue() == splashView.getProgress().getMaximum()) {
                    ControlLogin CLogin = new ControlLogin(new LoginView(), new ModeloPersonal());
                    CLogin.IniciarControl();
                    splashView.dispose();
                }
            }
        });
    }
}
