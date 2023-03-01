package modelo.Clases;

public class MenuProducto {

    private int pro_me_id;
    private int pro_me_cantidad;
    private int prome_me_id;
    private int prome_pro_id;

    public MenuProducto() {
    }

    public MenuProducto(int pro_me_id, int pro_me_cantidad, int prome_me_id, int prome_pro_id) {
        this.pro_me_id = pro_me_id;
        this.pro_me_cantidad = pro_me_cantidad;
        this.prome_me_id = prome_me_id;
        this.prome_pro_id = prome_pro_id;
    }

    public int getPro_me_id() {
        return pro_me_id;
    }

    public void setPro_me_id(int pro_me_id) {
        this.pro_me_id = pro_me_id;
    }

    public int getPro_me_cantidad() {
        return pro_me_cantidad;
    }

    public void setPro_me_cantidad(int pro_me_cantidad) {
        this.pro_me_cantidad = pro_me_cantidad;
    }

    public int getProme_me_id() {
        return prome_me_id;
    }

    public void setProme_me_id(int prome_me_id) {
        this.prome_me_id = prome_me_id;
    }

    public int getProme_pro_id() {
        return prome_pro_id;
    }

    public void setProme_pro_id(int prome_pro_id) {
        this.prome_pro_id = prome_pro_id;
    }

}
