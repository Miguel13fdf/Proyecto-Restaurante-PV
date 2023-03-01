package modelo.Clases;

import java.sql.Date;

public class Encabezado_Factura {

    private int en_fac_id;
    private Date en_fac_fecha;
    private double en_fac_total;
    private double en_fac_Iva;
    private String en_fac_forma_de_pago;
    private int id_cliente;

    public Encabezado_Factura() {
    }

    public Encabezado_Factura(int en_fac_id, Date en_fac_fecha, double en_fac_total, double en_fac_Iva, String en_fac_forma_de_pago, int id_cliente) {
        this.en_fac_id = en_fac_id;
        this.en_fac_fecha = en_fac_fecha;
        this.en_fac_total = en_fac_total;
        this.en_fac_Iva = en_fac_Iva;
        this.en_fac_forma_de_pago = en_fac_forma_de_pago;
        this.id_cliente = id_cliente;
    }

    public int getEn_fac_id() {
        return en_fac_id;
    }

    public void setEn_fac_id(int en_fac_id) {
        this.en_fac_id = en_fac_id;
    }

    public Date getEn_fac_fecha() {
        return en_fac_fecha;
    }

    public void setEn_fac_fecha(Date en_fac_fecha) {
        this.en_fac_fecha = en_fac_fecha;
    }

    public double getEn_fac_total() {
        return en_fac_total;
    }

    public void setEn_fac_total(double en_fac_total) {
        this.en_fac_total = en_fac_total;
    }

    public double getEn_fac_Iva() {
        return en_fac_Iva;
    }

    public void setEn_fac_Iva(double en_fac_Iva) {
        this.en_fac_Iva = en_fac_Iva;
    }

    public String getEn_fac_forma_de_pago() {
        return en_fac_forma_de_pago;
    }

    public void setEn_fac_forma_de_pago(String en_fac_forma_de_pago) {
        this.en_fac_forma_de_pago = en_fac_forma_de_pago;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
