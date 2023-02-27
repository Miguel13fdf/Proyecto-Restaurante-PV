/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private int per_id;
    private String per_ced;
    private String per_nombre;
    private String per_apellido1;
    private String per_apellido2;
    private String per_correo;
    private int per_persona;

    public Persona() {
    }

    public Persona(int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        this.per_id = per_id;
        this.per_ced = per_ced;
        this.per_nombre = per_nombre;
        this.per_apellido1 = per_apellido1;
        this.per_apellido2 = per_apellido2;
        this.per_correo = per_correo;
        this.per_persona = per_persona;
    }

    /**
     * @return the per_id
     */
    public int getPer_id() {
        return per_id;
    }

    /**
     * @param per_id the per_id to set
     */
    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    /**
     * @return the per_ced
     */
    public String getPer_ced() {
        return per_ced;
    }

    /**
     * @param per_ced the per_ced to set
     */
    public void setPer_ced(String per_ced) {
        this.per_ced = per_ced;
    }

    /**
     * @return the per_nombre
     */
    public String getPer_nombre() {
        return per_nombre;
    }

    /**
     * @param per_nombre the per_nombre to set
     */
    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    /**
     * @return the per_apellido1
     */
    public String getPer_apellido1() {
        return per_apellido1;
    }

    /**
     * @param per_apellido1 the per_apellido1 to set
     */
    public void setPer_apellido1(String per_apellido1) {
        this.per_apellido1 = per_apellido1;
    }

    /**
     * @return the per_apellido2
     */
    public String getPer_apellido2() {
        return per_apellido2;
    }

    /**
     * @param per_apellido2 the per_apellido2 to set
     */
    public void setPer_apellido2(String per_apellido2) {
        this.per_apellido2 = per_apellido2;
    }

    /**
     * @return the per_correo
     */
    public String getPer_correo() {
        return per_correo;
    }

    /**
     * @param per_correo the per_correo to set
     */
    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }

    /**
     * @return the per_persona
     */
    public int getPer_persona() {
        return per_persona;
    }

    /**
     * @param per_persona the per_persona to set
     */
    public void setPer_persona(int per_persona) {
        this.per_persona = per_persona;
    }
    
}
