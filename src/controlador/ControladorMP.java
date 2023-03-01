package controlador;

import modelo.ModeloPersona;
import vista.VistaPersonas;
import vista.VistaPrincipal;

/**
 *
 * @author alejo
 */
public class ControladorMP {

    VistaPrincipal vistaPrincipal;

    public ControladorMP(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }

    public void iniciaControl() {
        vistaPrincipal.getMnPersonas().addActionListener(l -> crudPersona());
        vistaPrincipal.getBtnPersonas().addActionListener(l -> crudPersona());
    }

    private void crudPersona() {
        //Instancio las clases del Modelo y la Vista.
        VistaPersonas vistaCrudPersona = new VistaPersonas();
        ModeloPersona modeloCrudPersona = new ModeloPersona();
        //Agregar Vista Personas al Desktop Pane.
        vistaPrincipal.getjDesktopPane1().add(vistaCrudPersona);
//        ControlPersona controladorCrudPersona = new ControlPersona(modeloCrudPersona, vistaCrudPersona);
//        controladorCrudPersona.iniciacontrol();//Empezamos las escuchas a los eventos de la vista, Listeners.
    }

    public void ControladorPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }

}
