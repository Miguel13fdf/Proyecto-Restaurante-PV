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
public class MesaReserva {
    private int me_re_me_id;
    private int mes_re_id;
    private int me_re_re_id;
    private int mesa_reserva_cantidad;

    public MesaReserva() {
    }

    public MesaReserva(int me_re_me_id, int mes_re_id, int me_re_re_id, int mesa_reserva_cantidad) {
        this.me_re_me_id = me_re_me_id;
        this.mes_re_id = mes_re_id;
        this.me_re_re_id = me_re_re_id;
        this.mesa_reserva_cantidad = mesa_reserva_cantidad;
    }

    /**
     * @return the me_re_me_id
     */
    public int getMe_re_me_id() {
        return me_re_me_id;
    }

    /**
     * @param me_re_me_id the me_re_me_id to set
     */
    public void setMe_re_me_id(int me_re_me_id) {
        this.me_re_me_id = me_re_me_id;
    }

    /**
     * @return the mes_re_id
     */
    public int getMes_re_id() {
        return mes_re_id;
    }

    /**
     * @param mes_re_id the mes_re_id to set
     */
    public void setMes_re_id(int mes_re_id) {
        this.mes_re_id = mes_re_id;
    }

    /**
     * @return the me_re_re_id
     */
    public int getMe_re_re_id() {
        return me_re_re_id;
    }

    /**
     * @param me_re_re_id the me_re_re_id to set
     */
    public void setMe_re_re_id(int me_re_re_id) {
        this.me_re_re_id = me_re_re_id;
    }

    /**
     * @return the mesa_reserva_cantidad
     */
    public int getMesa_reserva_cantidad() {
        return mesa_reserva_cantidad;
    }

    /**
     * @param mesa_reserva_cantidad the mesa_reserva_cantidad to set
     */
    public void setMesa_reserva_cantidad(int mesa_reserva_cantidad) {
        this.mesa_reserva_cantidad = mesa_reserva_cantidad;
    }
    
}
