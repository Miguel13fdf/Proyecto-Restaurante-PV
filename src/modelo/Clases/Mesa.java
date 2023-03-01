package modelo.Clases;

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

    public int getMe_id() {
        return me_id;
    }

    public void setMe_id(int me_id) {
        this.me_id = me_id;
    }

    public int getMe_capacidad() {
        return me_capacidad;
    }

    public void setMe_capacidad(int me_capacidad) {
        this.me_capacidad = me_capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getMe_disponibilidad() {
        return me_disponibilidad;
    }

    public void setMe_disponibilidad(Boolean me_disponibilidad) {
        this.me_disponibilidad = me_disponibilidad;
    }
}
