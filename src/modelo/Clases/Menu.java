package modelo.Clases;

public class Menu extends Consumision {

    private int me_id;
    private int me_con_id;
    private String me_descripcion;

    public Menu() {
        super();
    }

    public Menu(int me_id, int me_con_id, String me_descripcion, int con_id, double con_precio, Boolean con_servida, int con_cli_id) {
        super(con_id, con_precio, con_servida, con_cli_id);
        this.me_id = me_id;
        this.me_con_id = me_con_id;
        this.me_descripcion = me_descripcion;
    }

    public int getMe_id() {
        return me_id;
    }

    public void setMe_id(int me_id) {
        this.me_id = me_id;
    }

    public int getMe_con_id() {
        return me_con_id;
    }

    public void setMe_con_id(int me_con_id) {
        this.me_con_id = me_con_id;
    }

    public String getMe_descripcion() {
        return me_descripcion;
    }

    public void setMe_descripcion(String me_descripcion) {
        this.me_descripcion = me_descripcion;
    }
}