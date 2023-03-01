package modelo;

import java.awt.Image;
import java.sql.Date;
import modelo.Clases.Personal;

public class ModeloPersonal extends Personal {

    public ModeloPersonal() {
    }

    public ModeloPersonal(int pe_id, String pe_usuario, String pe_contraseña, double pe_sueldo, String pe_cargo, Date pe_hora_entrada, Date pe_hora_salida, int pe_id_plat, Image pe_foto, int pe_largo, int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(pe_id, pe_usuario, pe_contraseña, pe_sueldo, pe_cargo, pe_hora_entrada, pe_hora_salida, pe_id_plat, pe_foto, pe_largo, per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
    }

}
