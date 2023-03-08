
package modelo;

import Conexion.ConectPG;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Clases.Consumision;
import modelo.Clases.Persona;


public class ModeloConsumision extends Consumision {
    ConectPG conpg = new ConectPG();
    PreparedStatement ps;

    // Setencias SQL
    public String LISTAR_CO = "SELECT * FROM consumision"; 

    public String REGISTRAR = "INSERT INTO consumision(con_id, con_precio, con_servida, con_cli) "
            + "VALUES(?,?,?,?,?)";

    public String ACTUALIZAR = "UPDATE consumision SET con_id=?, con_precio=?, con_servida=?, con_cli=?\n"
            + "	WHERE <con_id = ?>";

    public String ELIMINAR = "DELETE FROM consumision WHERE con_id = ?";

    public String ELIMINAR_TODO = "DELETE FROM consumision";

    public ModeloConsumision() {
    }

    public ModeloConsumision(int con_id, double con_precio, Boolean con_servida, int con_cli_id) {
        super(con_id, con_precio, con_servida, con_cli_id);
    }

    

    public List<Consumision> Listar(String busca) {
        String sql = "";
        ResultSet rs = conpg.consulta(sql);
        List<Consumision> lista = new ArrayList<Consumision>();

        if (busca.equals("")) {
            sql = LISTAR_CO;
        } else {
            sql = "select * from consumision where ";
            sql += "UPPER(con_id) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(con_precio) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(con_servida) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(con_cli) like UPPER('%" + busca + "%') ";            
        }

        try {
            while (rs.next()) {
                Consumision con = new Consumision();
                con.setCon_id(rs.getInt("con_id"));
                con.setCon_precio(rs.getDouble("con_precio"));
                con.setCon_servida(rs.getBoolean("con_servida"));
                con.setCon_cli_id(rs.getInt("con_cli"));
                
                lista.add(con);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloConsumision.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloConsumision.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException Registrar() {
        String sql = REGISTRAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getCon_id());
            ps.setDouble(2, getCon_precio());
            ps.setBoolean(2, getCon_servida());
            ps.setInt(3, getCon_cli_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloConsumision.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public SQLException Actualizar() {
        String sql = ACTUALIZAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getCon_id());
            ps.setDouble(2, getCon_precio());
            ps.setBoolean(2, getCon_servida());
            ps.setInt(3, getCon_cli_id());
            ps.executeUpdate();
            ps.close();
        
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloConsumision.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        
        }
    }

    public SQLException Eliminar() {
        String sql = ELIMINAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getCon_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloConsumision.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModeloConsumision.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
}
