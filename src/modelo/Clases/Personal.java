package modelo.Clases;

import java.awt.Image;
import java.sql.Date;

public class Personal extends Persona {

    // Setencias SQL
    
    public static String LISTAR_US = "SELECT * FROM usuarios ORDER BY nombre_us";
    
    public static String REGISTRAR = "INSERT INTO usuarios(codigo_us, nombre_us, sexo_us, tipo_us, pass) "
            + "VALUES(?,?,?,?,?)";
    
    public static String ACTUALIZAR = "UPDATE usuarios SET "
                + "nombre_us=?, "
                + "sexo_us=?, "
                + "tipo_us=?, "
                + "pass=? WHERE codigo_us=?";
    
    public static String ELIMINAR = "DELETE FROM usuarios WHERE codigo_us = ?";
    
    public static String ELIMINAR_TODO = "DELETE FROM usuarios";
    
 
    private int pe_id;
    private String pe_usuario;
    private String pe_contraseña;
    private double pe_sueldo;
    private String pe_cargo;
    private Date pe_hora_entrada;
    private Date pe_hora_salida;
    private int pe_id_plat;
    //Foto
    private Image pe_foto;
    private int pe_largo;

    public Personal() {
        super();
    }

    public Personal(int pe_id, String pe_usuario, String pe_contraseña, double pe_sueldo, String pe_cargo, Date pe_hora_entrada, Date pe_hora_salida, int pe_id_plat, Image pe_foto, int pe_largo, int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
        this.pe_id = pe_id;
        this.pe_usuario = pe_usuario;
        this.pe_contraseña = pe_contraseña;
        this.pe_sueldo = pe_sueldo;
        this.pe_cargo = pe_cargo;
        this.pe_hora_entrada = pe_hora_entrada;
        this.pe_hora_salida = pe_hora_salida;
        this.pe_id_plat = pe_id_plat;
        this.pe_foto = pe_foto;
        this.pe_largo = pe_largo;
    }

    public int getPe_id() {
        return pe_id;
    }

    public void setPe_id(int pe_id) {
        this.pe_id = pe_id;
    }

    public String getPe_usuario() {
        return pe_usuario;
    }

    public void setPe_usuario(String pe_usuario) {
        this.pe_usuario = pe_usuario;
    }

    public String getPe_contraseña() {
        return pe_contraseña;
    }

    public void setPe_contraseña(String pe_contraseña) {
        this.pe_contraseña = pe_contraseña;
    }

    public double getPe_sueldo() {
        return pe_sueldo;
    }

    public void setPe_sueldo(double pe_sueldo) {
        this.pe_sueldo = pe_sueldo;
    }

    public String getPe_cargo() {
        return pe_cargo;
    }

    public void setPe_cargo(String pe_cargo) {
        this.pe_cargo = pe_cargo;
    }

    public Date getPe_hora_entrada() {
        return pe_hora_entrada;
    }

    public void setPe_hora_entrada(Date pe_hora_entrada) {
        this.pe_hora_entrada = pe_hora_entrada;
    }

    public Date getPe_hora_salida() {
        return pe_hora_salida;
    }

    public void setPe_hora_salida(Date pe_hora_salida) {
        this.pe_hora_salida = pe_hora_salida;
    }

    public int getPe_id_plat() {
        return pe_id_plat;
    }

    public void setPe_id_plat(int pe_id_plat) {
        this.pe_id_plat = pe_id_plat;
    }

    public Image getPe_foto() {
        return pe_foto;
    }

    public void setPe_foto(Image pe_foto) {
        this.pe_foto = pe_foto;
    }

    public int getPe_largo() {
        return pe_largo;
    }

    public void setPe_largo(int pe_largo) {
        this.pe_largo = pe_largo;
    }
}