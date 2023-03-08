package controlador;

import CustomElements.Menu.SystemColor;
import CustomElements.SearchBar.*;
import java.awt.Color;
import modelo.*;
import modelo.Clases.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import vista.Components.MssDialog;
import vista.Main.Crud_View;
import vista.Main.Update_Personal;
import vista.MainView;

// NOTAS UTILES: Presiona Crlt + H para reemplazar todas las ocurrencias
public class ControlPersona {

    private ModeloPersona mPersona;
    private Validaciones validaciones = new Validaciones();
    private String criterio = "", mssDEError = "";
    private int id_personal = -1;
    private List<Persona> listaPersonas;
    private Crud_View personaView;
    private Update_Personal up_Pers_View;
    // Necesario para que el messDialog calcule las dimensiones de toda la interfaz.
    private MainView mView;

    public ControlPersona(ModeloPersona mPersona, Crud_View personaView, Update_Personal up_Pers_View, MainView mView) {
        this.mPersona = mPersona;
        this.personaView = personaView;
        this.up_Pers_View = up_Pers_View;
        this.mView = mView;
    }

    //<editor-fold defaultstate="collapsed" desc=" Iniciar Control.">
    public void iniciarControl() {
        CargarDatos();

        //<editor-fold defaultstate="collapsed" desc=" Add listeners MOUSE LISTENER.">
        personaView.getAddBtn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirPanelDialog(1);
            }
        });
        personaView.getEditBtn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar();
            }
        });
        personaView.getDeleteBtn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminar();
            }
        });

        personaView.getSearchBar().addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                try {
                    for (int i = 1; i <= 100; i++) {
                        personaView.getjLabelSinCoincidencias().setVisible(true);
                        personaView.getjLabelSinCoincidencias().setForeground(SystemColor.MAIN_COLOR_2);
                        personaView.getjLabelSinCoincidencias().setText("Cargando " + i + "%");
                        Thread.sleep(6);
                    }
                    call.done();
                    personaView.getjLabelSinCoincidencias().setVisible(false);
                    Buscar();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {
                System.out.println("La busqueda fue cancelada");
            }
        });
        //</editor-fold>

        // --> Desactivar elementos que van a estar ocultos al principio
        personaView.getjLabelSinCoincidencias().setVisible(false);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Mostrar resultado de la busqueda.">
    public void LlenarTablaBusqueda() {

        DefaultTableModel mTablaModel = new DefaultTableModel(new Object[]{"ID", "Cedula", "Nombre", "Apellidos", "Correo", "Edad", "Cargo", "Foto"}, 0);
        personaView.getTable1().setModel(mTablaModel);

        listaPersonas = mPersona.Listar(criterio);

        if (!listaPersonas.isEmpty()) {
            listaPersonas.stream().forEach(pe -> {
                String[] filaNueva = {String.valueOf(pe.getPer_id()), pe.getPer_ced(), pe.getPer_nombre(),
                    pe.getPer_apellido1() + pe.getPer_apellido2(), pe.getPer_correo(), String.valueOf(pe.getPer_Edad())};
                mTablaModel.addRow(filaNueva);
            });
        } else {
            personaView.getjLabelSinCoincidencias().setForeground(Color.RED);
            personaView.getjLabelSinCoincidencias().setText("No hay coincidencias");
            personaView.getjLabelSinCoincidencias().setVisible(true);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Se llenaran todos los datos en la tabla.">
    public void CargarDatos() {
        DefaultTableModel mTablaModel = new DefaultTableModel(new Object[]{"ID", "Cedula", "Nombre", "Apellidos", "Correo", "Edad", "Cargo", "Foto"}, 0);
        personaView.getTable1().setModel(mTablaModel);

        listaPersonas = mPersona.Listar("");

        listaPersonas.stream().forEach(pe -> {
            String[] filaNueva = {String.valueOf(pe.getPer_id()), pe.getPer_ced(), pe.getPer_nombre(),
                pe.getPer_apellido1() + pe.getPer_apellido2(), pe.getPer_correo(), String.valueOf(pe.getPer_Edad())};
            mTablaModel.addRow(filaNueva);
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Mostrar Panel y ajustes del mismo.">
    private void AbrirPanelDialog(int opcion) {
        up_Pers_View.getCancelBtn().addActionListener(l -> cancelar());
        if (opcion == 1) {
            mostrarDialogoCrearPersona();
        } else {
            MssDialog mssDialog = new MssDialog(mView);
            if (id_personal == -1) {
                mssDialog.showMessage("Selecciona un elemento", "Aun no ha seleccionado una fila.", MssDialog.MssType.Error);
                return;
            } else {
                mostrarDialogoEditarPersona();
                id_personal = 0;
            }
        }
    }
//

    private void mostrarDialogoCrearPersona() {
        String titulo = "Crear Persona";
        up_Pers_View.setName("C");
//        limpiarDatos();
        mostrarDialogo(titulo);
    }

    private void mostrarDialogoEditarPersona() {
        String titulo = "Editar Persona";
        up_Pers_View.setName("E");
        mostrarDialogo(titulo);
    }

    private void mostrarDialogo(String titulo) {
        // ActivarJdialog
        up_Pers_View.setSize(900, 600);
        up_Pers_View.setLocationRelativeTo(null);
        up_Pers_View.setTitle(titulo);
        up_Pers_View.setVisible(true);
    }

    private void cancelar() {
        up_Pers_View.dispose();
        id_personal = -1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Insertar Datos.">
    public void Insertar() {
        ModeloPersona MPersona = new ModeloPersona();
        MPersona = RecuperarDatos(MPersona, false);

        if (!mssDEError.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error al crear al Persona!\n"
                    + "Por favor corriga estos errores:" + mssDEError,
                    "Error al crear al Persona", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (MPersona.Registrar() == null) {
            JOptionPane.showMessageDialog(null,
                    "Persona creada satisfactoriamente.");

            CargarDatos();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear al Persona!\n"
                    + "¡¡Error al intentar crear al camionero!!",
                    "Error al crear al Persona", JOptionPane.ERROR_MESSAGE);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Modificar Datos.">
    public void Modificar() {
        MssDialog mssDialog = new MssDialog(mView);
        if (id_personal == -1) {
            mssDialog.showMessage("Selecciona un elemento", "Aun no ha seleccionado una fila.", MssDialog.MssType.Error);
            return;
        }

        ModeloPersona MPersona = new ModeloPersona();
        MPersona = RecuperarDatos(MPersona, true);
        MPersona.setPer_id(listaPersonas.get(id_personal).getPer_id());

        if (MPersona.Actualizar() == null) {
            JOptionPane.showMessageDialog(null,
                    "Persona modificado satisfactoriamente.");
            CargarDatos();
            LimpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar al Persona!\n"
                    + "Por favor corriga estos errores:",
                    "Error al crear al Persona", JOptionPane.ERROR_MESSAGE);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Eliminar Datos.">
    public void Eliminar() {
        MssDialog mssDialog = new MssDialog(mView);
        if (id_personal == -1) {
            mssDialog.showMessage("Selecciona un elemento", "Aun no ha seleccionado una fila.", MssDialog.MssType.Error);
        } else {
            mssDialog.showMessage("Estas seguro?", "Una vez que lo borres no podras recuperar los datos.", MssDialog.MssType.Pregunta);
            if (mssDialog.getMessageType() == MssDialog.MessageType.OK) {
                String cedula;
                cedula = personaView.getTable1().getValueAt(id_personal, 0).toString();
                mPersona.setPer_id(Integer.parseInt(cedula));

                if (mPersona.Eliminar() == null) {
                    mssDialog.showMessage("Se elimino correctamente", "La persona fue eliminada correctamente.", MssDialog.MssType.TodoBien);
                    if (mssDialog.getMessageType() == MssDialog.MessageType.OK) {
                        CargarDatos();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La persona no se pudo eliminar");
                }
            }
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Recuperar Datos.">
    public ModeloPersona RecuperarDatos(ModeloPersona MPe, boolean isUpdate) {
//        mssDEError = "";
//        if (isUpdate) {
//            MPe.setPer_id(listaPersonas.get(seleccionado).getPer_id());
//        } else {
//            boolean ValiCRepetida = !MPe.ListarCamioneros(personaView.getjFieldDNI().getText()).isEmpty();
//            if (ValiCRepetida) {
//
////            } else {
//                mssDEError += "\n - La cedula ingresada ya existe";
//                return null;
//            }
//        }
//        MPe.setDni(personaView.getjFieldDNI().getText());
//        if (!personaView.getjFieldNombre().getText().isEmpty()) {
//            MPe.setNombre(personaView.getjFieldNombre().getText());
//        } else {
//            mssDEError += "\n - Ingrese un nombre.";
//            return null;
//        }
//
//        if (!personaView.getjFieldtelefono().getText().isEmpty()) {
//            MPe.setTelefono(personaView.getjFieldtelefono().getText());
//        } else {
//            mssDEError += "\n - Ingrese un numero de telefono.";
//            return null;
//        }
//
//        if (!personaView.getjFieldsueldo().getText().isEmpty()) {
//            MPe.setSueldo((Double.parseDouble(personaView.getjFieldsueldo().getText())));
//        } else {
//            mssDEError += "\n - Ingrese un valor para el sueldo.";
//            return null;
//        }
//
//        if (validaciones.isValidEmail(personaView.getJfieldcorreo().getText().trim())) {
//            MPe.setCorreo(personaView.getJfieldcorreo().getText().trim());
//        } else {
//            mssDEError += "\n - Ingrese un correo valido";
//            return null;
//        }
//
//        MPe.setPoblacion(personaView.getjSpinnerPoblacion().getValue().toString());
//
//        MPe.setId_Direccion((listaDirecciones.get(personaView.getjCBoxIDDirecciones().getSelectedIndex()).getId()));
        return MPe;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Otros metodos secundarios.">
    public void MostrarDatos() {
//        personaView.getjLabelID().setText(String.valueOf(listaPersonas.get(seleccionado).getId()));
//        personaView.getjFieldDNI().setText(listaPersonas.get(seleccionado).getDni());
//        personaView.getjFieldNombre().setText(listaPersonas.get(seleccionado).getNombre());
//        personaView.getjFieldtelefono().setText(listaPersonas.get(seleccionado).getTelefono());
//        personaView.getjSpinnerPoblacion().setValue(Double.parseDouble(listaPersonas.get(seleccionado).getPoblacion()));
//        personaView.getjCBoxIDDirecciones().setSelectedItem(listaPersonas.get(seleccionado).getId_Direccion());
//        personaView.getjFieldsueldo().setText(String.valueOf(listaPersonas.get(seleccionado).getSueldo()));
//        personaView.getJfieldcorreo().setText(String.valueOf(listaPersonas.get(seleccionado).getCorreo()));
    }

    public void LimpiarDatos() {
//        personaView.getjFieldDNI().setText("");
//        personaView.getjFieldNombre().setText("");
//        personaView.getjFieldtelefono().setText("");
//        personaView.getjSpinnerPoblacion().setValue(1);
//        personaView.getjFieldsueldo().setText("");
//        personaView.getjCBoxIDDirecciones().setSelectedIndex(0);
    }

    public void Buscar() {
        criterio = personaView.getSearchBar().getText().trim();

        if (!criterio.equals("")) {
            LlenarTablaBusqueda();
        } else {
            personaView.getjLabelSinCoincidencias().setVisible(false);
            CargarDatos();
        }
    }

    private void ObtenerIDTable() {
        id_personal = personaView.getTable1().convertRowIndexToModel(personaView.getTable1().getSelectedRow());
        personaView.getTable1().removeAll();
        MostrarDatos();
    }
    //</editor-fold>
}
