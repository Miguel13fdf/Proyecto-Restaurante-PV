/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControlPersona;
import controlador.ControladorMP;
import modelo.ModeloPersona;
import vista.VistaPersonas;
import vista.VistaPrincipal;


/**
 *
 * @author monge
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPrincipal vista = new VistaPrincipal();
        
        
        ControladorMP control = new ControladorMP(vista);
        control.iniciaControl();
    }
    
}
