
package controlador;

import javax.swing.JProgressBar;

public class CargarSplash extends Thread {
    JProgressBar progress;
    
    public CargarSplash(JProgressBar progress){
        super();
        this.progress = progress; 
    }
    
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            progress.setValue(i);
            pausa(30);
        }
    }
    public void pausa(int mlSeg){
        try {
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            
        }
    }
}
