package modelo;

import Conexion.ConectPG;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Clases.Persona;

public class ModeloPersona extends Persona {

    ConectPG conpg = new ConectPG();
    PreparedStatement ps;

    // Setencias SQL
    public String LISTAR_PE = "SELECT * FROM persona"; // ORDER BY nombre_us

    public String REGISTRAR = "INSERT INTO persona(codigo_us, nombre_us, sexo_us, tipo_us, pass) "
            + "VALUES(?,?,?,?,?)";

    public String ACTUALIZAR = "UPDATE persona SET per_cedula=?, per_nombre=?, per_apellido1=?, per_apellido2=?, per_correo=?, per_edad=?\n"
            + "	WHERE <per_id = ?>";

    public String ELIMINAR = "DELETE FROM persona WHERE per_id = ?";

    public String ELIMINAR_TODO = "DELETE FROM persona";

    public ModeloPersona() {
    }

    public ModeloPersona(int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_Edad, int per_persona) {
        super(per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_Edad, per_persona);
    }

    public List<Persona> Listar(String busca) {
        String sql = "";

        if (busca.equals("")) {
            sql = LISTAR_PE;
        } else {
            sql = "select * from persona where ";
            sql += "UPPER(per_cedula) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(per_nombre) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(per_apellido1) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(per_apellido2) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(per_correo) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(per_edad) like UPPER('%" + busca + "%') ";
        }

        ResultSet rs = conpg.consulta(sql);
        List<Persona> lista = new ArrayList<Persona>();
        try {
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setPer_id(rs.getInt("per_id"));
                persona.setPer_ced(rs.getString("per_cedula"));
                persona.setPer_nombre(rs.getString("per_nombre"));
                persona.setPer_apellido1(rs.getString("per_apellido1"));
                persona.setPer_apellido2(rs.getString("per_apellido2"));
                persona.setPer_correo(rs.getString("per_correo"));
                lista.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException Registrar() {
        String sql = REGISTRAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getPer_id());
            ps.setString(2, getPer_ced());
            ps.setString(2, getPer_nombre());
            ps.setString(3, getPer_apellido1());
            ps.setString(4, getPer_apellido2());
            ps.setString(5, getPer_correo());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public SQLException Actualizar() {
        String sql = ACTUALIZAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getPer_id());
            ps.setString(2, getPer_ced());
            ps.setString(2, getPer_nombre());
            ps.setString(3, getPer_apellido1());
            ps.setString(4, getPer_apellido2());
            ps.setString(5, getPer_correo());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public SQLException Eliminar() {
        String sql = ELIMINAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getPer_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public SQLException EliminarTodo() {
        String sql = ELIMINAR_TODO;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
}
