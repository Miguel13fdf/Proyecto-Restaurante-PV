package controlador;

import vista.Main.DashboardView;
import CustomElements.Menu.EventMenuSelected;
import java.awt.Color;
import java.awt.Component;
import vista.*;
import vista.Components.*;

public class ControlMain {

    public MainView mainView;
    private Header header;

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
                    showForm(new DashboardView());
                } else {
//                    showForm(new Form_Empty(index + " " + indexSubMenu));
                }
            }
        });
//        mainView.getBody().add(header);
        mainView.getMenu().setSelectedIndex(0, 0);
        mainView.setTitle("Restaurant Project - MVC - M3A");
    }

    public void showForm(Component com) {
        mainView.getBody().removeAll();
        mainView.getBody().add(com);
        mainView.getBody().repaint();
        mainView.getBody().revalidate();
    }
}
