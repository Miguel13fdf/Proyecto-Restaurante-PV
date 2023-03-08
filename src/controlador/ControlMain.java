package controlador;

import CustomElements.Menu.EventMenuSelected;
import CustomElements.ModelCard;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import javax.swing.ImageIcon;
import modelo.ModeloPersona;
import vista.*;
import vista.Components.*;
import vista.Main.*;

public class ControlMain {

    public MainView mainView;
    DashboardView dView;
    String enlacePaginaWeb = "https://www.cupcakesandbreakfast.com/";

    public ControlMain(MainView mainView, DashboardView dView) {
        this.mainView = mainView;
        this.dView = dView;
    }

    public void IniciarControl() {
        mainView.setVisible(true);
        mainView.setTitle("Restaurant App");
        mainView.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/LOGO_RESTAURANT_PROYECT.png")).getImage());
        dView = new DashboardView();
        mainView.getTitleBar().initJFram(mainView);

        //<editor-fold defaultstate="collapsed" desc=" Darle acción a los botones del menu.">
        mainView.getMenu().addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu
            ) {
                System.out.println("Panel seleccionado: " + index);
                switch (index) {
                    case 0:
                        showForm(dView);
                        mainView.getHeader1().getTitleTXT().setText("Dasboard");
                        break;
                    case 1:
                        mainView.getHeader1().getTitleTXT().setText("Clientes");
                        break;
                    case 2:
                        showForm(new DashboardView());
                        mainView.getHeader1().getTitleTXT().setText("Reportes");
                        break;
                    case 3:
                        Crud_View crud_View = new Crud_View();
                        showForm(crud_View);
                        ControlPersona cPersona = new ControlPersona(new ModeloPersona(), crud_View, new Update_Personal(mainView, true), mainView);
                        cPersona.iniciarControl();
                        mainView.getHeader1().getTitleTXT().setText("Personal");
                        break;
                    case 4:
                        showForm(new DashboardView());
                        mainView.getHeader1().getTitleTXT().setText("Menu");
                        break;
                    case 5:
                        showForm(new DashboardView());
                        mainView.getHeader1().getTitleTXT().setText("Reserva");
                        break;
                    case 6:
                        showForm(new DashboardView());
                        mainView.getHeader1().getTitleTXT().setText("Pedidos");
                        break;
                    case 7:
                        showForm(new DashboardView());
                        mainView.getHeader1().getTitleTXT().setText("Acerca Del Proyecto");
                        break;
                    default:
                        System.out.println("No hay paginas que mostrar");
                }
            }
        }
        );
        //</editor-fold>
        
        mainView.getMenu().setSelectedIndex(0, 0);
        Slide_1 slide_1 = new Slide_1();
        slide_1.getLink_BTN().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    // Abre el enlace en el navegador predeterminado
                    Desktop.getDesktop().browse(new URI(enlacePaginaWeb));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        dView.getSlideshow().initSlideshow(slide_1, new Slide_1());

        initCardData();
    }

    public void showForm(Component com) {
        mainView.getBody().removeAll();
        mainView.getBody().add(com);
        mainView.getBody().repaint();
        mainView.getBody().revalidate();
    }

    private void initCardData() {
        dView.getCard1().setData(new ModelCard("Clientes", 200, null));
//        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.MONETIZATION_ON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        dView.getCard2().setData(new ModelCard("Miembros", 10, null));
//        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.SHOPPING_BASKET, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        dView.getCard3().setData(new ModelCard("Ventas Del Dia", 50, null));
//        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.BUSINESS_CENTER, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        dView.getCard4().setData(new ModelCard("Productos", 100, null));
    }
}
