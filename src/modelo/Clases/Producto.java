package modelo.Clases;

public class Producto extends Consumision {

    private int pro_id_nombre;
    private String pro_nombre;
    private String pro_descripcion;
    private String pro_tipo;
    private int pro_con_id;

    public Producto() {
        super();
    }

    public Producto(int pro_id_nombre, String pro_nombre, String pro_descripcion, String pro_tipo, int pro_con_id) {
        this.pro_id_nombre = pro_id_nombre;
        this.pro_nombre = pro_nombre;
        this.pro_descripcion = pro_descripcion;
        this.pro_tipo = pro_tipo;
        this.pro_con_id = pro_con_id;
    }

    public int getPro_id_nombre() {
        return pro_id_nombre;
    }

    public void setPro_id_nombre(int pro_id_nombre) {
        this.pro_id_nombre = pro_id_nombre;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public String getPro_tipo() {
        return pro_tipo;
    }

    public void setPro_tipo(String pro_tipo) {
        this.pro_tipo = pro_tipo;
    }

    public int getPro_con_id() {
        return pro_con_id;
    }

    public void setPro_con_id(int pro_con_id) {
        this.pro_con_id = pro_con_id;
    }

}
