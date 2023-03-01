package mvc;

import controlador.*;
import vista.*;

public class Mvc {

    public static void main(String[] args) {
        SplashView splash = new SplashView();
        ControlSplash CSplash = new ControlSplash(splash);
        CSplash.IniciarControl();
    }

}
