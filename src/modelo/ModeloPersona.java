package modelo;

import Conexion.ConectPG;
import java.sql.PreparedStatement;
import modelo.Clases.Persona;

public class ModeloPersona extends Persona {

    ConectPG cpg = new ConectPG();
    PreparedStatement ps;

    public ModeloPersona() {
    }

    public ModeloPersona(int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
    }

//    public static void listar(String busca) {
//        String sql = "";
//        if (busca.equals("")) {
//            sql = UsuariosCod.LISTAR_US;
//        } else {
//            sql = "SELECT * FROM usuarios WHERE (codigo_us like'" + busca + "%' or nombre_us like'" + busca + "%') "
//                    + " order by nombre_us";
//        }
//        String datos[] = new String[5];
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                datos[0] = rs.getString("codigo_us");
//                datos[1] = rs.getString("nombre_us");
//                datos[2] = rs.getString("sexo_us");
//                datos[3] = rs.getString("tipo_us");
//                datos[4] = rs.getString("pass");
//                modelo.addRow(datos);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(OpcionesUs.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//    public static int registrar(UsuariosCod uc) {
//        int rsu = 0;
//        String sql = UsuariosCod.REGISTRAR;
//        try {
//            ps = cn.prepareStatement(sql);
//            ps.setString(1, uc.getPrimaryKey());
//            ps.setString(2, uc.getNombre());
//            ps.setString(3, uc.getSexo());
//            ps.setString(4, uc.getTipouser());
//            ps.setString(5, uc.getPassword());
//            rsu = ps.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(sql);
//        return rsu;
//    }
//
//    public static int actualizar(UsuariosCod uc) {
//        int rsu = 0;
//        String sql = UsuariosCod.ACTUALIZAR;
//        try {
//            ps = cn.prepareStatement(sql);
//            ps.setString(1, uc.getNombre());
//            ps.setString(2, uc.getSexo());
//            ps.setString(3, uc.getTipouser());
//            ps.setString(4, uc.getPassword());
//            ps.setString(5, uc.getPrimaryKey());
//            rsu = ps.executeUpdate();
//        } catch (SQLException ex) {
//        }
//        System.out.println(sql);
//        return rsu;
//    }
//
//    public static int eliminar(String id) {
//        int rsu = 0;
//        String sql = UsuariosCod.ELIMINAR;
//
//        try {
//            ps = cn.prepareStatement(sql);
//            ps.setString(1, id);
//            rsu = ps.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(sql);
//        return rsu;
//    }
//
//    public static int eliminaTodos() {
//        int rsu = 0;
//        String sql = UsuariosCod.ELIMINAR_TODO;
//        try {
//            ps = cn.prepareStatement(sql);
//            rsu = ps.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(sql);
//        return rsu;
//    }
}