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
public class Mesa {
    private int me_id;
    private int me_capacidad;
    private String estado;
    private Boolean me_disponibilidad;

    public Mesa() {
    }

    public Mesa(int me_id, int me_capacidad, String estado, Boolean me_disponibilidad) {
        this.me_id = me_id;
        this.me_capacidad = me_capacidad;
        this.estado = estado;
        this.me_disponibilidad = me_disponibilidad;
    }

    /**
     * @return the me_id
     */
    public int getMe_id() {
        return me_id;
    }

    /**
     * @param me_id the me_id to set
     */
    public void setMe_id(int me_id) {
        this.me_id = me_id;
    }

    /**
     * @return the me_capacidad
     */
    public int getMe_capacidad() {
        return me_capacidad;
    }

    /**
     * @param me_capacidad the me_capacidad to set
     */
    public void setMe_capacidad(int me_capacidad) {
        this.me_capacidad = me_capacidad;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the me_disponibilidad
     */
    public Boolean getMe_disponibilidad() {
        return me_disponibilidad;
    }

    /**
     * @param me_disponibilidad the me_disponibilidad to set
     */
    public void setMe_disponibilidad(Boolean me_disponibilidad) {
        this.me_disponibilidad = me_disponibilidad;
    }
}
