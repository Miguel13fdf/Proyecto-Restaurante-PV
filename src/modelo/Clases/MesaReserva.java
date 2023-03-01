package modelo.Clases;

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

    public int getMe_re_me_id() {
        return me_re_me_id;
    }

    public void setMe_re_me_id(int me_re_me_id) {
        this.me_re_me_id = me_re_me_id;
    }

    public int getMes_re_id() {
        return mes_re_id;
    }

    public void setMes_re_id(int mes_re_id) {
        this.mes_re_id = mes_re_id;
    }

    public int getMe_re_re_id() {
        return me_re_re_id;
    }

    public void setMe_re_re_id(int me_re_re_id) {
        this.me_re_re_id = me_re_re_id;
    }

    public int getMesa_reserva_cantidad() {
        return mesa_reserva_cantidad;
    }

    public void setMesa_reserva_cantidad(int mesa_reserva_cantidad) {
        this.mesa_reserva_cantidad = mesa_reserva_cantidad;
    }

}
