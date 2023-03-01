package modelo.Clases;

public class Consumision {

    private int con_id;
    private double con_precio;
    private Boolean con_servida;
    private int con_cli_id;

    public Consumision() {
    }

    public Consumision(int con_id, double con_precio, Boolean con_servida, int con_cli_id) {
        this.con_id = con_id;
        this.con_precio = con_precio;
        this.con_servida = con_servida;
        this.con_cli_id = con_cli_id;
    }

    public int getCon_id() {
        return con_id;
    }

    public void setCon_id(int con_id) {
        this.con_id = con_id;
    }

    public double getCon_precio() {
        return con_precio;
    }

    public void setCon_precio(double con_precio) {
        this.con_precio = con_precio;
    }

    public Boolean getCon_servida() {
        return con_servida;
    }

    public void setCon_servida(Boolean con_servida) {
        this.con_servida = con_servida;
    }

    public int getCon_cli_id() {
        return con_cli_id;
    }

    public void setCon_cli_id(int con_cli_id) {
        this.con_cli_id = con_cli_id;
    }
}
