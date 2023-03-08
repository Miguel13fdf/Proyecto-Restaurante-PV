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
public class Consumision {
    private int con_id;
    private double con_precio;
    private Boolean con_servida;
    private int con_cli_id;

    public Consumision() {
    }

    public Consumision(int con_id, double con_precio, Boolean con_servida, int con_cli_id) {
        this.con_id = con_id;
        this.con_precio = con_precio;
        this.con_servida = con_servida;
        this.con_cli_id = con_cli_id;
    }
    

    /**
     * @return the con_id
     */
    public int getCon_id() {
        return con_id;
    }

    /**
     * @param con_id the con_id to set
     */
    public void setCon_id(int con_id) {
        this.con_id = con_id;
    }

    /**
     * @return the con_precio
     */
    public double getCon_precio() {
        return con_precio;
    }

    /**
     * @param con_precio the con_precio to set
     */
    public void setCon_precio(double con_precio) {
        this.con_precio = con_precio;
    }

    /**
     * @return the con_servida
     */
    public Boolean getCon_servida() {
        return con_servida;
    }

    /**
     * @param con_servida the con_servida to set
     */
    public void setCon_servida(Boolean con_servida) {
        this.con_servida = con_servida;
    }

    /**
     * @return the con_cli_id
     */
    public int getCon_cli_id() {
        return con_cli_id;
    }

    /**
     * @param con_cli_id the con_cli_id to set
     */
    public void setCon_cli_id(int con_cli_id) {
        this.con_cli_id = con_cli_id;
    }
    
}
