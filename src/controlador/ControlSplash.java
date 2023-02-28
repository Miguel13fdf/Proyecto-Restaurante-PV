package controlador;

import javax.swing.JProgressBar;
import vista.*;

public class ControlSplash extends Thread {

    private SplashView splashView;
    JProgressBar progress;

    public ControlSplash(SplashView splashView) {
        this.splashView = splashView;
        this.progress = progress;
    }

    public void IniciarControl() {
        
        splashView.getProgress().addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                if (splashView.getProgress().getValue() == splashView.getProgress().getMaximum()) {
                    VistaPrincipal vp = new VistaPrincipal();
                    vp.setVisible(true);
                    splashView.dispose();
                }
            }
        });
        
        splashView.setLocationRelativeTo(null);
        Cargar(splashView.getProgress());
        start();
        splashView.setLocationRelativeTo(null);
    }

    public void Cargar(JProgressBar progress) {
        this.progress = progress;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            progress.setValue(i);
            pausa(30);
        }
    }

    public void pausa(int mlSeg) {
        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {
            System.out.println("Error al intentar pausar. Error:" + e);
        }
    }
}
