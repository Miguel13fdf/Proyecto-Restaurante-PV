package mvc;

import controlador.*;
import vista.*;

public class Mvc {

    public static void main(String[] args) {
//        ControlSplash CSplash = new ControlSplash(new SplashView());
//        CSplash.IniciarControl();

//        PREUBAS PREUBAS = new PREUBAS();
//        PREUBAS.setVisible(true);
        ControlMain cMain = new ControlMain(new MainView());
        cMain.IniciarControl();
    }

}
