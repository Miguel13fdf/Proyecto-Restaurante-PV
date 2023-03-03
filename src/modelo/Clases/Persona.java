package modelo.Clases;

public class Persona {
    
    private int per_id;
    private String per_ced;
    private String per_nombre;
    private String per_apellido1;
    private String per_apellido2;
    private String per_correo;
    private int per_persona;

    public Persona() {
    }

    public Persona(int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        this.per_id = per_id;
        this.per_ced = per_ced;
        this.per_nombre = per_nombre;
        this.per_apellido1 = per_apellido1;
        this.per_apellido2 = per_apellido2;
        this.per_correo = per_correo;
        this.per_persona = per_persona;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getPer_ced() {
        return per_ced;
    }

    public void setPer_ced(String per_ced) {
        this.per_ced = per_ced;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido1() {
        return per_apellido1;
    }

    public void setPer_apellido1(String per_apellido1) {
        this.per_apellido1 = per_apellido1;
    }

    public String getPer_apellido2() {
        return per_apellido2;
    }

    public void setPer_apellido2(String per_apellido2) {
        this.per_apellido2 = per_apellido2;
    }

    public String getPer_correo() {
        return per_correo;
    }

    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }

    public int getPer_persona() {
        return per_persona;
    }

    public void setPer_persona(int per_persona) {
        this.per_persona = per_persona;
    }
}
