
package modelo;

import Conexion.ConectPG;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Clases.Consumision;
import modelo.Clases.Encabezado_Factura;


public class ModeloEncabezado_Factura  extends Encabezado_Factura{
     ConectPG conpg = new ConectPG();
    PreparedStatement ps;

    // Setencias SQL
    public String LISTAR_ENCA = "SELECT * FROM encabezadofactura"; 

    public String REGISTRAR = "INSERT INTO encabezadofacura(en_fac_id,en_fac_fecha,enfac_total,en_fac_iva,en_fac_fomra_de_pago,en_fac_ruc,id_cliente) "
            + "VALUES(?,?,?,?,?)";

    public String ACTUALIZAR = "UPDATE encabezadofactura SET en_fac_id=?, en_fac_fecha=?, enfac_total=?, en_fac_ivai=?,en_fac_fomra_de_pago=?,en_fac_ruc=?,id_cliente\n"
            + "	WHERE <en_fac_id = ?>";

    public String ELIMINAR = "DELETE FROM encabezadofactura WHERE en_fac_id = ?";

    public String ELIMINAR_TODO = "DELETE FROM encabezadofactura";
            
     public ModeloEncabezado_Factura(int en_fac_id, Date en_fac_fecha, double en_fac_total, double en_fac_Iva, String en_fac_forma_de_pago, int id_cliente) {
        super(en_fac_id, en_fac_fecha, en_fac_total, en_fac_Iva, en_fac_forma_de_pago, id_cliente);
    }
        
    public List<Encabezado_Factura> Listar(String busca) {
        String sql = "";
        ResultSet rs = conpg.consulta(sql);
        List<Encabezado_Factura> lista = new ArrayList<Encabezado_Factura>();

        if (busca.equals("")) {
            sql = LISTAR_ENCA;
        } else {
            sql = "select * from Encabezado_Factura where ";
            sql += "UPPER(en_fac_id) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(en_fac_fecha) like UPPER('%" + busca + "%') ";
             sql += "OR UPPER(en_fac_total) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(en_fac_Iva) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(en_fac_fomra_de_pago) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(id_cliente) like UPPER('%" + busca + "%') ";            
        }

        try {
            while (rs.next()) {
                Encabezado_Factura enca = new Encabezado_Factura();
                enca.setEn_fac_id(rs.getInt("en_fac_id"));
                enca.setEn_fac_fecha(rs.getDate("en_fac_fecha"));
                enca.setEn_fac_total(rs.getDouble("en_fac_total"));
                enca.setEn_fac_Iva(rs.getDouble("en_fac_iva"));
                enca.setEn_fac_forma_de_pago(rs.getNString("en_fac_fomra_de_pago"));
                enca.setId_cliente(rs.getInt("id_cliente"));
                lista.add(enca);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEncabezado_Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEncabezado_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException Registrar() {
        String sql = REGISTRAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1,getEn_fac_id());
            ps.setDate(2, getEn_fac_fecha());
            ps.setDouble(2, getEn_fac_total());
            ps.setDouble(3, getEn_fac_Iva());
            ps.setString(3, getEn_fac_forma_de_pago());
            ps.setInt(4, getId_cliente());
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
            ps.setInt(1,getEn_fac_id());
            ps.setDate(2, getEn_fac_fecha());
            ps.setDouble(2, getEn_fac_total());
            ps.setDouble(3, getEn_fac_Iva());
            ps.setString(3, getEn_fac_forma_de_pago());
            ps.setInt(4, getId_cliente());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEncabezado_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        
        }
    }

    public SQLException Eliminar() {
        String sql = ELIMINAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getEn_fac_id());
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloEncabezado_Factura.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModeloEncabezado_Factura.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
}
