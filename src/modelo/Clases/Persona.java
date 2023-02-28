
package modelo.Clases;

import java.awt.Image;
import java.io.FileInputStream;
import java.sql.Date;


public class Persona {
    private String idPersona;
    private String nombre;
    private String apellido;
    private String sexo;
    private Date fechaDeNacimiento;
    private String telefono;
    private double sueldo;
    private int cupo;
    private Image foto;
    private int largo;
    private FileInputStream imagen;
    public Persona() {
    }

    public Persona(String idPersona, String nombre, String apellido, String sexo, Date fechaDeNacimiento, String telefono, double sueldo, int cupo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.cupo = cupo;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }  

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }
    
}
