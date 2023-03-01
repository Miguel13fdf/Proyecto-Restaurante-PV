package modelo.Clases;

import java.sql.Date;

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

    public int getPe_id() {
        return pe_id;
    }

    public void setPe_id(int pe_id) {
        this.pe_id = pe_id;
    }

    public Date getPe_fecha() {
        return pe_fecha;
    }

    public void setPe_fecha(Date pe_fecha) {
        this.pe_fecha = pe_fecha;
    }

    public double getPe_precio() {
        return pe_precio;
    }

    public void setPe_precio(double pe_precio) {
        this.pe_precio = pe_precio;
    }

    public Boolean getPe_pagado() {
        return pe_pagado;
    }

    public void setPe_pagado(Boolean pe_pagado) {
        this.pe_pagado = pe_pagado;
    }

    public Boolean getPe_confirmado() {
        return pe_confirmado;
    }

    public void setPe_confirmado(Boolean pe_confirmado) {
        this.pe_confirmado = pe_confirmado;
    }

    public Boolean getPe_servicio() {
        return pe_servicio;
    }

    public void setPe_servicio(Boolean pe_servicio) {
        this.pe_servicio = pe_servicio;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public int getPe_cli_id() {
        return pe_cli_id;
    }

    public void setPe_cli_id(int pe_cli_id) {
        this.pe_cli_id = pe_cli_id;
    }
}
