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
public class Cliente extends Persona{
    private int cli_id;
    private String cli_direccion;
    private String cli_telefono;

    public Cliente() {
        super();
    }

    public Cliente(int cli_id, String cli_direccion, String cli_telefono, int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
        this.cli_id = cli_id;
        this.cli_direccion = cli_direccion;
        this.cli_telefono = cli_telefono;
    }
    

    /**
     * @return the cli_id
     */
    public int getCli_id() {
        return cli_id;
    }

    /**
     * @param cli_id the cli_id to set
     */
    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    /**
     * @return the cli_direccion
     */
    public String getCli_direccion() {
        return cli_direccion;
    }

    /**
     * @param cli_direccion the cli_direccion to set
     */
    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    /**
     * @return the cli_telefono
     */
    public String getCli_telefono() {
        return cli_telefono;
    }

    /**
     * @param cli_telefono the cli_telefono to set
     */
    public void setCli_telefono(String cli_telefono) {
        this.cli_telefono = cli_telefono;
    }
    
}
