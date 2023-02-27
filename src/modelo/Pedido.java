/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private int pe_id;
    private Date pe_fecha;
    private double pe_precio;
    private Boolean pe_pagado;
    private Boolean pe_confirmado;
    private Boolean pe_servicio;
    private int per_id;
    private int pe_cli_id;

    public Pedido() {
    }

    public Pedido(int pe_id, Date pe_fecha, double pe_precio, Boolean pe_pagado, Boolean pe_confirmado, Boolean pe_servicio, int per_id, int pe_cli_id) {
        this.pe_id = pe_id;
        this.pe_fecha = pe_fecha;
        this.pe_precio = pe_precio;
        this.pe_pagado = pe_pagado;
        this.pe_confirmado = pe_confirmado;
        this.pe_servicio = pe_servicio;
        this.per_id = per_id;
        this.pe_cli_id = pe_cli_id;
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
     * @return the pe_fecha
     */
    public Date getPe_fecha() {
        return pe_fecha;
    }

    /**
     * @param pe_fecha the pe_fecha to set
     */
    public void setPe_fecha(Date pe_fecha) {
        this.pe_fecha = pe_fecha;
    }

    /**
     * @return the pe_precio
     */
    public double getPe_precio() {
        return pe_precio;
    }

    /**
     * @param pe_precio the pe_precio to set
     */
    public void setPe_precio(double pe_precio) {
        this.pe_precio = pe_precio;
    }

    /**
     * @return the pe_pagado
     */
    public Boolean getPe_pagado() {
        return pe_pagado;
    }

    /**
     * @param pe_pagado the pe_pagado to set
     */
    public void setPe_pagado(Boolean pe_pagado) {
        this.pe_pagado = pe_pagado;
    }

    /**
     * @return the pe_confirmado
     */
    public Boolean getPe_confirmado() {
        return pe_confirmado;
    }

    /**
     * @param pe_confirmado the pe_confirmado to set
     */
    public void setPe_confirmado(Boolean pe_confirmado) {
        this.pe_confirmado = pe_confirmado;
    }

    /**
     * @return the pe_servicio
     */
    public Boolean getPe_servicio() {
        return pe_servicio;
    }

    /**
     * @param pe_servicio the pe_servicio to set
     */
    public void setPe_servicio(Boolean pe_servicio) {
        this.pe_servicio = pe_servicio;
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
     * @return the pe_cli_id
     */
    public int getPe_cli_id() {
        return pe_cli_id;
    }

    /**
     * @param pe_cli_id the pe_cli_id to set
     */
    public void setPe_cli_id(int pe_cli_id) {
        this.pe_cli_id = pe_cli_id;
    }
}
