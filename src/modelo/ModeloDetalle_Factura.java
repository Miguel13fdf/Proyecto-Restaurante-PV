
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
import modelo.Clases.Detalle_Factura;


public class ModeloDetalle_Factura extends Detalle_Factura {
    ConectPG conpg = new ConectPG();
    PreparedStatement ps;

    // Setencias SQL
    public String LISTAR_DETA = "SELECT * FROM DetalleFactura"; 

    public String REGISTRAR = "INSERT INTO DetalleFactura(det_fac_id,det_fac_Subtotal,det_fac_cantidad,det_fac_en_id,det_pro_id,det_mesa_id) "
            + "VALUES(?,?,?,?,?)";

    public String ACTUALIZAR = "UPDATE DetalleFactura SET det_fac_id=?, =?,det_fac_Subtotal=?,det_fac_cantidad=?,det_fac_en_id=?,det_pro_id=?,det_mesa_id=?\n"
            + "	WHERE <det_Fac_id = ?>";

    public String ELIMINAR = "DELETE FROM DetalleFactura WHERE det_fac_id = ?";

    public String ELIMINAR_TODO = "DELETE FROM DetalleFactura";

    public ModeloDetalle_Factura() {
    }

    public ModeloDetalle_Factura(int det_Fac_id, int det_en_Fac_id, double de_Fac_subTotal, int det_pro_id, int det_mesa_id) {
        super(det_Fac_id, det_en_Fac_id, de_Fac_subTotal, det_pro_id, det_mesa_id);
    }

   

    

    public List<Detalle_Factura> Listar(String busca) {
        String sql = "";
        ResultSet rs = conpg.consulta(sql);
        List<Detalle_Factura> lista = new ArrayList<Detalle_Factura>();

        if (busca.equals("")) {
            sql = LISTAR_DETA;
        } else {
            sql = "select * from DetalleFactura where ";
            sql += "UPPER(det_fac_id) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(det_fac_subTotal) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(det_fac_cantidad) like UPPER('%" + busca + "%') ";
             sql += "OR UPPER(det_fac_en_id) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(det_pro_id) like UPPER('%" + busca + "%') ";
           sql += "OR UPPER(det_mesa_id) like UPPER('%" + busca + "%') ";
           
        }

        try {
            while (rs.next()) {
                Detalle_Factura deta = new Detalle_Factura();
                deta.setDet_fac_id(rs.getInt("det_fac_id"));
                deta.setDe_fac_subTotal(rs.getDouble("de_fac_subTotal"));
                deta.setDet_en_fac_id(rs.getInt("det_fac_en_id"));
                deta.setDet_pro_id(rs.getInt("det_pro_id"));
                deta.setDet_mesa_id(rs.getInt("det_mesa_id"));
                
                
                lista.add(deta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDetalle_Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDetalle_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException Registrar() {
        String sql = REGISTRAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getDet_fac_id());
            ps.setDouble(2, getDe_fac_subTotal());
            ps.setInt(2, getDet_en_fac_id());
            ps.setInt(3, getDet_pro_id());
            ps.setInt(4, getDet_mesa_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDetalle_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public SQLException Actualizar() {
        String sql = ACTUALIZAR;
        try {
             ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getDet_fac_id());
            ps.setDouble(2, getDe_fac_subTotal());
            ps.setInt(2, getDet_en_fac_id());
            ps.setInt(3, getDet_pro_id());
            ps.setInt(4, getDet_mesa_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDetalle_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        
        }
    }

    public SQLException Eliminar() {
        String sql = ELIMINAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getDet_fac_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDetalle_Factura.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModeloDetalle_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
}

