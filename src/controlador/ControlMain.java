package controlador;

import CustomElements.Menu.EventMenuSelected;
import CustomElements.ModelCard;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import vista.Components.*;
import vista.*;
import vista.Main.*;

public class ControlMain {

    public MainView mainView;
    private Header header;
    DashboardView dView = new DashboardView();

    public ControlMain(MainView mainView) {
        this.mainView = mainView;
    }

    public void IniciarControl() {
        mainView.getContentPane().setBackground(Color.black);
        header = new Header();
        mainView.repaint();
        mainView.setVisible(true);

        mainView.getTitleBar().initJFram(mainView);
        mainView.getMenu().addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                System.out.println(index);
                if (index == 0 && indexSubMenu == 0) {
//                    showForm(dView);
                } else {
//                    showForm(new Form_Empty(index + " " + indexSubMenu));
                }
            }
        });
        mainView.getMenu().setSelectedIndex(0, 0);
        mainView.setTitle("Restaurant Project - MVC - M3A");
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
