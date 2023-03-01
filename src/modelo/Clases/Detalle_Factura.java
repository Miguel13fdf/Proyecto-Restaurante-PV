package modelo.Clases;

public class Detalle_Factura {

    private int det_fac_id;
    private int det_en_fac_id;
    private double de_fac_subTotal;
    private int det_pro_id;
    private int det_mesa_id;

    public Detalle_Factura() {
    }

    public Detalle_Factura(int det_fac_id, int det_en_fac_id, double de_fac_subTotal, int det_pro_id, int det_mesa_id) {
        this.det_fac_id = det_fac_id;
        this.det_en_fac_id = det_en_fac_id;
        this.de_fac_subTotal = de_fac_subTotal;
        this.det_pro_id = det_pro_id;
        this.det_mesa_id = det_mesa_id;
    }

    public int getDet_fac_id() {
        return det_fac_id;
    }

    public void setDet_fac_id(int det_fac_id) {
        this.det_fac_id = det_fac_id;
    }

    public int getDet_en_fac_id() {
        return det_en_fac_id;
    }

    public void setDet_en_fac_id(int det_en_fac_id) {
        this.det_en_fac_id = det_en_fac_id;
    }

    public double getDe_fac_subTotal() {
        return de_fac_subTotal;
    }

    public void setDe_fac_subTotal(double de_fac_subTotal) {
        this.de_fac_subTotal = de_fac_subTotal;
    }

    public int getDet_pro_id() {
        return det_pro_id;
    }

    public void setDet_pro_id(int det_pro_id) {
        this.det_pro_id = det_pro_id;
    }

    public int getDet_mesa_id() {
        return det_mesa_id;
    }

    public void setDet_mesa_id(int det_mesa_id) {
        this.det_mesa_id = det_mesa_id;
    }
}
