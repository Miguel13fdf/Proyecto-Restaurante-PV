
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
import modelo.Clases.MenuProducto;

public class ModeloMenuProducto  extends MenuProducto {
  
    ConectPG conpg = new ConectPG();
    PreparedStatement ps;

    // Setencias SQL
    public String LISTAR_Mep = "SELECT * FROM menuproducto"; 

    public String REGISTRAR = "INSERT INTO menuproducto(menupro_id,menupro_con_id,menupro_cantidad,menupro_me_id) "
            + "VALUES(?,?,?,?,?)";

    public String ACTUALIZAR = "UPDATE menuproducto SET menupro_id=?, menupro_con_id=?, menupro_cantidad=?,menupro_me_id=?\n"
            + "	WHERE <con_id = ?>";

    public String ELIMINAR = "DELETE FROM menuproducto WHERE  menupro_id= ?";

    public String ELIMINAR_TODO = "DELETE FROM menuproducto";

    public ModeloMenuProducto() {
    }

    

    

    public List<MenuProducto> Listar(String busca) {
        String sql = "";
        ResultSet rs = conpg.consulta(sql);
        List<MenuProducto> lista = new ArrayList<MenuProducto>();

        if (busca.equals("")) {
            sql = LISTAR_Mep;
        } else {
            sql = "select * from consumision where ";
            sql += "UPPER(menupro_id) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(menupro_con_id) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(menupro_cantidad) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(menupro_me_id) like UPPER('%" + busca + "%') ";            
        }

        try {
            while (rs.next()) {
                MenuProducto mep = new MenuProducto();
                mep.setPro_me_id(rs.getInt("menupro_id"));
                mep.setProme_me_id(rs.getInt("menupro_con_id"));
                mep.setPro_me_cantidad(rs.getInt("menupro_cantidad"));
                mep.setProme_pro_id(rs.getInt("menupro_me_id"));
                
                lista.add(mep);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMenuProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMenuProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException Registrar() {
        String sql = REGISTRAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getPro_me_id());
            ps.setInt(2, getProme_me_id());
            ps.setInt(2, getPro_me_cantidad());
            ps.setInt(3, getProme_pro_id());
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
            ps.setInt(1, getPro_me_id());
            ps.setInt(2, getProme_me_id());
            ps.setInt(2, getPro_me_cantidad());
            ps.setInt(3, getProme_pro_id());
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
            ps.setInt(1, getPro_me_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMenuProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModeloMenuProducto.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
}
