package mvc;

import controlador.*;
import modelo.ModeloPersonal;
import vista.*;
import vista.Main.DashboardView;

public class Mvc {

    public static void main(String[] args) {
//        ControlSplash CSplash = new ControlSplash(new SplashView());
//        CSplash.IniciarControl();
        CargarMasRapido();
    }

    private static void CargarMasRapido() {
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
        ControlMain cMain = new ControlMain(new MainView(), new DashboardView());
        cMain.IniciarControl();
    }

}
