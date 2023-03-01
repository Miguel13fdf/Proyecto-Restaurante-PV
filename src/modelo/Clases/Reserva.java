package modelo.Clases;

import java.sql.Date;

public class Reserva {

    private int re_id;
    private Date re_fecha_registro;
    private Boolean re_finalizado;
    private int re_cliente_id;

    public Reserva() {
    }

    public Reserva(int re_id, Date re_fecha_registro, Boolean re_finalizado, int re_cliente_id) {
        this.re_id = re_id;
        this.re_fecha_registro = re_fecha_registro;
        this.re_finalizado = re_finalizado;
        this.re_cliente_id = re_cliente_id;
    }

    public int getRe_cliente_id() {
        return re_cliente_id;
    }

    public void setRe_cliente_id(int re_cliente_id) {
        this.re_cliente_id = re_cliente_id;
    }

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public Date getRe_fecha_registro() {
        return re_fecha_registro;
    }

    public void setRe_fecha_registro(Date re_fecha_registro) {
        this.re_fecha_registro = re_fecha_registro;
    }

    public Boolean getRe_finalizado() {
        return re_finalizado;
    }

    public void setRe_finalizado(Boolean re_finalizado) {
        this.re_finalizado = re_finalizado;
    }
}
