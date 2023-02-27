/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.Image;
import java.io.FileInputStream;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Personal extends Persona{
    private int pe_id;
    private String pe_usuario;
    private String pe_contraseña;
    private double pe_sueldo;
    private String pe_cargo;
    private Date pe_hora_entrada;
    private Date pe_hora_salida;
    private int pe_id_plat;
      //Foto
    private Image pe_foto;
    //Guardar la foto
     private FileInputStream pe_imagen;
    private int pe_largo;

    public Personal() {
        super();
    }

    public Personal(int pe_id, String pe_usuario, String pe_contraseña, double pe_sueldo, String pe_cargo, Date pe_hora_entrada, Date pe_hora_salida, int pe_id_plat, Image pe_foto, FileInputStream pe_imagen, int pe_largo, int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
        this.pe_id = pe_id;
        this.pe_usuario = pe_usuario;
        this.pe_contraseña = pe_contraseña;
        this.pe_sueldo = pe_sueldo;
        this.pe_cargo = pe_cargo;
        this.pe_hora_entrada = pe_hora_entrada;
        this.pe_hora_salida = pe_hora_salida;
        this.pe_id_plat = pe_id_plat;
        this.pe_foto = pe_foto;
        this.pe_imagen = pe_imagen;
        this.pe_largo = pe_largo;
    }

    /**
     * @return the pe_id
     */
    public int getPe_id() {
        return pe_id;
    }

    /**
     * @param pe_id the pe_id to set
     */
    public void setPe_id(int pe_id) {
        this.pe_id = pe_id;
    }

    /**
     * @return the pe_usuario
     */
    public String getPe_usuario() {
        return pe_usuario;
    }

    /**
     * @param pe_usuario the pe_usuario to set
     */
    public void setPe_usuario(String pe_usuario) {
        this.pe_usuario = pe_usuario;
    }

    /**
     * @return the pe_contraseña
     */
    public String getPe_contraseña() {
        return pe_contraseña;
    }

    /**
     * @param pe_contraseña the pe_contraseña to set
     */
    public void setPe_contraseña(String pe_contraseña) {
        this.pe_contraseña = pe_contraseña;
    }

    /**
     * @return the pe_sueldo
     */
    public double getPe_sueldo() {
        return pe_sueldo;
    }

    /**
     * @param pe_sueldo the pe_sueldo to set
     */
    public void setPe_sueldo(double pe_sueldo) {
        this.pe_sueldo = pe_sueldo;
    }

    /**
     * @return the pe_cargo
     */
    public String getPe_cargo() {
        return pe_cargo;
    }

    /**
     * @param pe_cargo the pe_cargo to set
     */
    public void setPe_cargo(String pe_cargo) {
        this.pe_cargo = pe_cargo;
    }

    /**
     * @return the pe_hora_entrada
     */
    public Date getPe_hora_entrada() {
        return pe_hora_entrada;
    }

    /**
     * @param pe_hora_entrada the pe_hora_entrada to set
     */
    public void setPe_hora_entrada(Date pe_hora_entrada) {
        this.pe_hora_entrada = pe_hora_entrada;
    }

    /**
     * @return the pe_hora_salida
     */
    public Date getPe_hora_salida() {
        return pe_hora_salida;
    }

    /**
     * @param pe_hora_salida the pe_hora_salida to set
     */
    public void setPe_hora_salida(Date pe_hora_salida) {
        this.pe_hora_salida = pe_hora_salida;
    }

    /**
     * @return the pe_id_plat
     */
    public int getPe_id_plat() {
        return pe_id_plat;
    }

    /**
     * @param pe_id_plat the pe_id_plat to set
     */
    public void setPe_id_plat(int pe_id_plat) {
        this.pe_id_plat = pe_id_plat;
    }

    /**
     * @return the pe_foto
     */
    public Image getPe_foto() {
        return pe_foto;
    }

    /**
     * @param pe_foto the pe_foto to set
     */
    public void setPe_foto(Image pe_foto) {
        this.pe_foto = pe_foto;
    }

    /**
     * @return the pe_imagen
     */
    public FileInputStream getPe_imagen() {
        return pe_imagen;
    }

    /**
     * @param pe_imagen the pe_imagen to set
     */
    public void setPe_imagen(FileInputStream pe_imagen) {
        this.pe_imagen = pe_imagen;
    }

    /**
     * @return the pe_largo
     */
    public int getPe_largo() {
        return pe_largo;
    }

    /**
     * @param pe_largo the pe_largo to set
     */
    public void setPe_largo(int pe_largo) {
        this.pe_largo = pe_largo;
    }
    
}
