package mvc;

import controlador.*;
import vista.*;
import vista.Main.DashboardView;

public class Mvc {

    public static void main(String[] args) {
        ControlSplash CSplash = new ControlSplash(new SplashView());
        CSplash.IniciarControl();
//        ControlMain cMain = new ControlMain(new MainView(), new DashboardView());
//        cMain.IniciarControl();
    }

}
