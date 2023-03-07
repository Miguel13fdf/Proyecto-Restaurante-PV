package controlador;

import CustomElements.Menu.EventMenuSelected;
import java.awt.Component;
import vista.*;
import vista.Main.*;

public class ControlMain {

    public MainView mainView;
    DashboardView dView;

    public ControlMain(MainView mainView) {
        this.mainView = mainView;
    }

    public void IniciarControl() {
        //<editor-fold defaultstate="collapsed" desc=" Proceso para mostrar correctamente el panel Main.">
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

        // --> Necesario para que se ejecute correctamente los paneles personalizados
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainView.setVisible(true);
            }
        });
        //</editor-fold>

        dView = new DashboardView();
        mainView.getTitleBar().initJFram(mainView);
        mainView.getMenu().addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu
            ) {
                System.out.println(index);
                switch (index) {
                    case 0:
                        showForm(new DashboardView());
                        break;
                    case 1:
                        showForm(new ClientesView());
                        break;
                    case 2:
                        showForm(new DashboardView());
                        break;
                    case 3:
                        showForm(new DashboardView());
                        break;
                    case 4:
                        showForm(new DashboardView());
                        break;
                    default:
                        System.out.println("No hay paginas que mostrar");
                }
            }
        }
        );
        mainView.getMenu().setSelectedIndex(0, 0);
        initCardData();
    }

    public void showForm(Component com) {
        mainView.getBody().removeAll();
        mainView.getBody().add(com);
        mainView.getBody().repaint();
        mainView.getBody().revalidate();
    }

    private void initCardData() {
//        dView.getCard1().setData(new ModelCard("Clientes", 5100, null));
//        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
//        dView.getCard2().setData(new ModelCard("Income", 2000, 60, icon2));
//        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
//        dView.getCard3().setData(new ModelCard("Expense", 3000, 80, icon3));
//        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.BUSINESS_CENTER, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
//        dView.getCard4().setData(new ModelCard("Other Income", 550, 95, icon4));
    }
}
