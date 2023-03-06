package modelo;

import Conexion.ConectPG;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import modelo.Clases.Personal;
import org.postgresql.util.Base64;

public class ModeloPersonal extends Personal {

    ConectPG conpg = new ConectPG();
    PreparedStatement ps;

    // Setencias SQL
    public String LISTAR_PE = "SELECT * FROM persona, personal"; // ORDER BY nombre_us

    public String REGISTRAR = "INSERT INTO personal (pe_usuario \"pe_contraseña\", pe_cargo, pe_sueldo, pe_hora_de_entrada, pe_hora_de_salida, id_per, plat_id, pe_largo, pe_foto)"
            + "VALUES(?,?,?,?,?)";

    public String ACTUALIZAR = "UPDATE personal SET pe_usuario=?, \"pe_contraseña\"=?, pe_cargo=?, pe_sueldo=?, pe_hora_de_entrada=?, pe_hora_de_salida=?, id_per=?,plat_id=?,pe_largo=?=?\n"
            + "	WHERE <per_id = ?>";

    public String ELIMINAR = "DELETE FROM personal WHERE pe_id = ?";

    public String ELIMINAR_TODO = "DELETE FROM personal";

    public ModeloPersonal() {
    }

    public ModeloPersonal(int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
    }

    public List<Personal> Listar(String busca) {
        String sql = "";
        ResultSet rs = conpg.consulta(sql);
        List<Personal> lista = new ArrayList<Personal>();

        if (busca.equals("")) {
            sql = LISTAR_PE;
        } else {
            sql = "select * from personal where ";
            sql += "UPPER(pe_usuario) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(\"pe_contraseña\") like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(pe_cargo) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(pe_sueldo) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(pe_hora_de_entrada) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(pe_hora_de_salida) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(id_per) like UPPER('%" + busca + "%') ";
            sql += "OR UPPER(plat_id) like UPPER('%" + busca + "%') ";
        }

        try {
            while (rs.next()) {
                Personal personal = new Personal();
                personal.setPe_id(rs.getInt("pe_id"));
                personal.setPe_usuario(rs.getString("pe_usuario"));
                personal.setPe_contraseña(rs.getString("\"pe_contraseña\""));
                personal.setPe_cargo(rs.getString("pe_cargo"));
                personal.setPe_sueldo(rs.getDouble("pe_sueldo"));
                personal.setPe_hora_entrada(rs.getDate("pe_hora_de_entrada"));
                personal.setPe_hora_salida(rs.getDate("pe_hora_de_salida"));
                personal.setPe_id_pe(rs.getInt("id_per"));
                byte[] bf = rs.getBytes("pe_foto");
                if (bf != null) {
                    bf = Base64.decode(bf, 0, bf.length);
                    try {
                        personal.setPe_foto(obtenerImagen(bf));
                    } catch (IOException ex) {
                        personal.setPe_foto(null);
                        Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    personal.setPe_foto(null);
                }
                lista.add(personal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException Registrar() {
        String fotoP = null;

        BufferedImage img = imgBimage(getPe_foto());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(img, "PNG", bos);
            byte[] imgb = bos.toByteArray();
            fotoP = Base64.encodeBytes(imgb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String sql = REGISTRAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getPe_id());
            ps.setString(2, getPe_usuario());
            ps.setString(2, getPe_contraseña());
            ps.setString(3, getPe_cargo());
            ps.setString(4, String.valueOf(getPe_sueldo()));
            ps.setString(5, String.valueOf(getPe_hora_entrada()));
            ps.setString(6, String.valueOf(getPe_hora_salida()));
            ps.setString(7, String.valueOf(getPe_id_pe()));
            ps.setString(8, fotoP);
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    public SQLException Actualizar() {
        String fotoP = null;
        if (getPe_foto() != null) {
            BufferedImage img = imgBimage(getPe_foto());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            try {
                ImageIO.write(img, "PNG", bos);
                byte[] imgb = bos.toByteArray();
                fotoP = Base64.encodeBytes(imgb);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        String sql = ACTUALIZAR;
        try {
            ps = conpg.getCon().prepareStatement(sql);
            ps.setInt(1, getPe_id());
            ps.setString(2, getPe_usuario());
            ps.setString(2, getPe_contraseña());
            ps.setString(3, getPe_cargo());
            ps.setString(4, String.valueOf(getPe_sueldo()));
            ps.setString(5, String.valueOf(getPe_hora_entrada()));
            ps.setString(6, String.valueOf(getPe_hora_salida()));
            ps.setString(7, String.valueOf(getPe_id_pe()));
            ps.setString(8, fotoP);
            ps.executeUpdate();
            ps.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModeloPersonal.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }

    private BufferedImage imgBimage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage bi = new BufferedImage(
                img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGR = bi.createGraphics();
        bGR.drawImage(img, 0, 0, null);
        bGR.dispose();
        return bi;
    }

    private Image obtenerImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;

        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);

        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);

        return reader.read(0, param);
    }
}
