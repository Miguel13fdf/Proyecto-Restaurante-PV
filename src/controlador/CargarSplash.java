package controlador;

import javax.swing.JProgressBar;

// Clase encargada de hacer la animación de la barra de cargando en el splash.
public class CargarSplash extends Thread {

    JProgressBar progress;

    public CargarSplash(JProgressBar progress) {
        super();
        this.progress = progress;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            progress.setValue(i);
            pausa(18);
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
