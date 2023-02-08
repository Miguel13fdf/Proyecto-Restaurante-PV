/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import modelo.ConectPG;
import modelo.ModeloPersona;
import modelo.Persona;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.VistaPersonas;

/**
 *
 * @author joelu
 */
public class ControlPersona {

    private ModeloPersona modelo;
    private VistaPersonas vista;
    private JFileChooser jf;
    
    public ControlPersona(ModeloPersona modelo, VistaPersonas vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        //Hacer visible la vista
    }

    public void iniciacontrol() {
        //Estar a la escuha de todos los elementos de vista
        //boton actualizar
        vista.getBtnActualizar().addActionListener(l -> cargaPersonas());        
        vista.getBtnCrear().addActionListener(l -> abrirDialogo(1));
        vista.getBtnEditar().addActionListener(l -> abrirDialogo(2));
        vista.getBtnacep().addActionListener(l -> crearEditarPersona());
        vista.getBtnexaminar().addActionListener(l -> examinarfoto());
       vista.getBtnEliminar().addActionListener(l ->EliminarDatos());
       vista.getBtnImprimir().addActionListener(l->imprimirPersonas());
//dentro de los parentesis puede hacer un
//                vista.getBtnActualizar().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
    }

    public void examinarfoto() {
        jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jf.showOpenDialog(vista);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image img = ImageIO.read(jf.getSelectedFile()).getScaledInstance(vista.getLabelfoto().getWidth(), vista.getLabelfoto().getHeight(), Image.SCALE_DEFAULT);
                Icon icn = new ImageIcon(img);
                vista.getLabelfoto().setIcon(icn);
                vista.getLabelfoto().updateUI();
                
            } catch (IOException ex) {
                Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void cargaPersonas() {
        //Control para consultar al modelo
        // y luego en la vista
        List<Persona> listap = modelo.listaPersonas();
        DefaultTableModel mPersona;
        mPersona = (DefaultTableModel) vista.getTbPersona().getModel();
        mPersona.setNumRows(0); //limpiar la tabla
        vista.getTbPersona().setDefaultRenderer(Object.class, new ImagenTabla());//La manera de renderizar la tabla.
        vista.getTbPersona().setRowHeight(100);

        Holder<Integer> i = new Holder<>(0);
        listap.stream().forEach(pe->{
            
            mPersona.addRow(new Object[9]);//Creo una fila vacia/
            vista.getTbPersona().setValueAt(pe.getIdPersona(), i.value, 0);
            vista.getTbPersona().setValueAt(pe.getNombre(), i.value, 1);
            vista.getTbPersona().setValueAt(pe.getApellido(), i.value, 2);
            vista.getTbPersona().setValueAt(pe.getSexo(), i.value, 3);
            vista.getTbPersona().setValueAt(pe.getFechaDeNacimiento(), i.value, 4);
            vista.getTbPersona().setValueAt(pe.getTelefono(), i.value, 5);
             vista.getTbPersona().setValueAt(pe.getSueldo(), i.value, 7);
            vista.getTbPersona().setValueAt(pe.getCupo(), i.value, 6);

            Image foto=pe.getFoto();
            if(foto!=null){
            
                Image nimg= foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono=new ImageIcon(nimg);
                DefaultTableCellRenderer renderer= new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vista.getTbPersona().setValueAt(new JLabel(icono), i.value, 8);
                
            }else{
                 vista.getTbPersona().setValueAt(null, i.value, 8);
            }
            
            i.value++;
//           String[] filap={pe.getIdPersona(),pe.getNombres(),pe.getApellidos(),"25"}; 
//           tblModel.addRow(filap);
        });                 
        
    }

    private void abrirDialogo(int ce) {
        String title;
        if (ce == 1) {
            title = "crear nueva persona";
            vista.getJdialogcrud().setName("crear");
        } else {
            title = "Editar Persona";
            vista.getJdialogcrud().setName("editar");
            SacarDatos();
            vista.getId().setEditable(false);
            
        }
        vista.getJdialogcrud().setLocationRelativeTo(vista);
        vista.getJdialogcrud().setSize(800, 600);
        vista.getJdialogcrud().setTitle(title);
        vista.getJdialogcrud().setVisible(true);
        
    }

    private void crearEditarPersona() {
        ModeloPersona persona = new ModeloPersona();
        if (vista.getJdialogcrud().getName() == "crear") {
            persona = (ModeloPersona) crear_persona();
            //ingresar imagen en la base de datos
            try {
                FileInputStream ima = new FileInputStream(jf.getSelectedFile());
                int ancho =(int) jf.getSelectedFile().length();
                persona.setImagen(ima);
                persona.setLargo(ancho);
            } catch (FileNotFoundException e) {
            }
            if (persona.crearPersonaByte()) {
                vista.getJdialogcrud().setVisible(false);
                
                JOptionPane.showMessageDialog(vista, "Persona Creada Satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo crear la persona");
            }
            
        }else{
            if (vista.getJdialogcrud().getName() == "editar") {
                  
                   persona = (ModeloPersona) crear_persona();
//                   try {
//                       //Foto
//                       FileInputStream img = new FileInputStream(jfc.getSelectedFile());
//                       int largo = (int) jfc.getSelectedFile().length();
//                       persona.setImagen(img);
//                       persona.setLargo(largo);
//                   } catch (FileNotFoundException ex) {
//                       Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
//                   }
                   if(persona.editarPersonaByte()){
                        vista.getJdialogcrud().setVisible(false);
                        limpiardialogo();
                     JOptionPane.showMessageDialog(vista, "Persona Editada Satisfactoriamente");
                   }else{
                       JOptionPane.showMessageDialog(vista, "No se pudo editar la persona"); 
                   }
               }
        }
    }
    private void limpiardialogo(){
           vista.getId().setText("");
           vista.getNombres().setText("");
           vista.getApellidos().setText("");
           vista.getTelefono().setText("");
           vista.getSueldo().setText("");
           vista.getjDateChooser1().setDate(null);
           vista.getRbtnfem().setSelected(false);
           vista.getRbtnmas().setSelected(false);
       }
    private ModeloPersona crear_persona() {
        ModeloPersona person = new ModeloPersona();
        String id = vista.getId().getText();
        String nombre = vista.getNombres().getText();
        String apellidos = vista.getApellidos().getText();
        String sexo = null;
        if (vista.getRbtnfem().isSelected()) {
            sexo = "femenino";
            
        } else {
            if (vista.getRbtnmas().isSelected()) {
                sexo = "masculino";
            }
        }
        
        Date fechanacimiento = Date.valueOf(((JTextField) vista.getjDateChooser1().getDateEditor().getUiComponent()).getText());
        String telefono = vista.getTelefono().getText();
        double sueldo = Double.parseDouble(vista.getSueldo().getText());
        int cupo = Integer.parseInt(vista.getCupos().getText());
        
        person.setIdPersona(id);
        person.setNombre(nombre);
        person.setApellido(apellidos);
        person.setSexo(sexo);
        person.setFechaDeNacimiento(fechanacimiento);
        person.setTelefono(telefono);
        person.setCupo(cupo);
        person.setSueldo(sueldo);        
//        person.setImagen(imagen);
        return person;
        
    }
    private void SacarDatos() {
        int fila = vista.getTbPersona().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            String id = vista.getTbPersona().getValueAt(fila, 0).toString();
            String nombres = vista.getTbPersona().getValueAt(fila, 1).toString();
            String Apellidos = vista.getTbPersona().getValueAt(fila, 2).toString();

            String sexo = vista.getTbPersona().getValueAt(fila, 3).toString();
            String telefono = vista.getTbPersona().getValueAt(fila, 5).toString();
            Date fechanacimineto = Date.valueOf(vista.getTbPersona().getValueAt(fila, 4).toString());
            double sueldo = Double.parseDouble(vista.getTbPersona().getValueAt(fila, 6).toString());
            int cupo = Integer.parseInt(vista.getTbPersona().getValueAt(fila, 7).toString());
            
            vista.getId().setText(id);
            vista.getNombres().setText(nombres);
            vista.getTelefono().setText(telefono);
            vista.getApellidos().setText(Apellidos);
            vista.getjDateChooser1().setDate(fechanacimineto);
            vista.getSueldo().setText(String.valueOf(sueldo));
            vista.getCupos().setText(String.valueOf(cupo));
            vista.getSueldo().setText(String.valueOf(sueldo));
            if (sexo.equals("Masculino")) {
                vista.getRbtnmas().setSelected(true);
            } else {
                vista.getRbtnfem().setSelected(true);
            }
            vista.getJdialogcrud().setVisible(true);
        }
              
       }
    private void EliminarDatos(){
            ModeloPersona personaEliminada=new ModeloPersona();
            int fila = vista.getTbPersona().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila a eliminar");
        } else {

            int response = JOptionPane.showConfirmDialog(vista, "¿Estas seguro de eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                String cedula;
                cedula = vista.getTbPersona().getValueAt(fila, 0).toString();
                personaEliminada.setIdPersona(cedula);

                if (personaEliminada.eliminarPersonaDB()==null) {
                    JOptionPane.showMessageDialog(null, "La persona fue eliminada exitosamente");
                    cargaPersonas();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La persona no se pudo eliminar");
                }
            }
        }
       }
    private void imprimirPersonas(){
        ConectPG cpg=new ConectPG();
        try {
            JasperReport jr = (JasperReport)JRLoader.loadObject(getClass().getResource("/vista/reportes/Blank_A4.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(
                    jr,
            null,cpg.getCon());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     
}
