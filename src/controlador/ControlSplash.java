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
                    //<editor-fold defaultstate="collapsed" desc=" Proceso para mostrar correctamente el panel Main.">
                    // Se utiliza Nimbus ya que este permite el correcto funcionamiento de los elemetos personalizados swing
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>
                    ControlLogin CLogin = new ControlLogin(new LoginView(), new ModeloPersonal());
                    CLogin.IniciarControl();
                    splashView.dispose();
                }
            }
        });
    }
}
