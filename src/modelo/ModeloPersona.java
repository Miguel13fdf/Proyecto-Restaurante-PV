package modelo;

import modelo.Clases.Persona;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
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

/**
 *
 * @author monge
 */
public class ModeloPersona extends Persona {

    public ModeloPersona() {
    }
      ConectPG cpg=new ConectPG();

    public ModeloPersona(String idPersona, String nombre, String apellido, String sexo, Date fechaDeNacimiento, String telefono, double sueldo, int cupo ) {
        super(idPersona, nombre, apellido, sexo, fechaDeNacimiento, telefono, sueldo, cupo);
    }

    public List<Persona> listaPersonas() {
        try {
            //Me retorna un "List" de "persona"
            List<Persona> lista = new ArrayList<>();

            String sql = "select idpersona,nombres,apellidos,fechadenacimiento, telefono,sexo,cupos, sueldo, foto  from persona";
            //agregar foto para quitar error
            ConectPG conpg = new ConectPG();
            ResultSet rs = conpg.consulta(sql); //La consulta nos devuelve un "ResultSet"
            //crear bytea con array de bytes
            byte[] bytea;
            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de las personas
                Persona persona = new Persona();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                persona.setIdPersona(rs.getString("idpersona"));
                persona.setNombre(rs.getString("nombres"));
                persona.setApellido(rs.getString("apellidos"));
                persona.setFechaDeNacimiento(rs.getDate("fechadenacimiento"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setSexo(rs.getString("sexo"));
                persona.setCupo(rs.getInt("cupos"));
                persona.setSueldo(rs.getDouble("sueldo"));
                bytea=rs.getBytes("foto");
                 if (bytea!=null){
                 //Decodificando del formato de la base.(Base64)               
                    //bytea=Base64.decode(bytea,0,bytea.length);
                try {
                    persona.setFoto(obtenerfoto(bytea));
                } catch (IOException ex) {
                    Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                

                lista.add(persona); //Agrego los datos a la lista
            }

            //Cierro la conexion a la BD
            rs.close();
            //Retorno la lista
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
public Image obtenerfoto(byte[]bytes) throws IOException{
    ByteArrayInputStream byta = new ByteArrayInputStream(bytes);
    //recorrer todos los bytes del array 
    Iterator it = ImageIO.getImageReadersByFormatName("png");
    ImageReader red= (ImageReader) it.next();
    Object src = byta;
    ImageInputStream inus=ImageIO.createImageInputStream(src);
    red.setInput(inus,true);
    ImageReadParam para = red.getDefaultReadParam();
    para.setSourceSubsampling(1, 1, 0, 0);
    return red.read(0,para);
}
    public boolean crearPersonaByte(){
        try {
            String sql;
            
            sql="INSERT INTO persona (idpersona,nombres,apellidos,sexo,fechadenacimiento,telefono,cupos,sueldo,foto)";
            sql+="VALUES(?,?,?,?,?,?,?,?,?)";
            ConectPG conpg = new ConectPG();
            PreparedStatement ps = conpg.getCon().prepareStatement(sql);
            ps.setString(1, getIdPersona());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4,getSexo());
            ps.setDate(5, getFechaDeNacimiento());
            ps.setString(6,getTelefono());
            ps.setInt(7, getCupo());
            ps.setDouble(8,getSueldo());
            ps.setBinaryStream(9, getImagen(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }public boolean editarPersonaByte(){
          try {
            String sql;
            
            sql="UPDATE persona SET nombres=?,apellidos=?,sexo=?,fechadenacimiento=?,telefono=?,cupos=?,sueldo=?,foto=? Where idpersona=?";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setDate(4, getFechaDeNacimiento());
            ps.setString(5,getTelefono());
            ps.setString(3,getSexo());
            ps.setDouble(7,getSueldo());
            ps.setInt(6, getCupo());
            ps.setBinaryStream(8, getImagen(), getLargo());
            ps.setString(9, getIdPersona());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }

    public SQLException modificarPersonaDB() { //modificamos la instancia en la BD

        String sql = "UPDATE persona SET nombres='" + getNombre() + "', apellidos='" + getApellido() + "', fechanacimiento='" + getFechaDeNacimiento() + "', telefono='" + getTelefono() + "', sexo='" + getSexo() + "', sueldo=" + getSueldo() + ", cupo=" + getCupo() + ", foto=null WHERE idpersona = '" + getIdPersona() + "';";
            ConectPG conpg = new ConectPG();

        

        SQLException ex = conpg.accion(sql); //Devuelve un valor de tipo "SQLException". Si devuelve 'null' esta bien, caso contrario me retornara la excepcion.
        return ex;
    }

    public SQLException eliminarPersonaDB() { //eliminas la instancia en la BD

        String sql = "DELETE FROM persona WHERE idpersona = '" + getIdPersona() + "';";

        ConectPG conpg = new ConectPG();

        SQLException ex = conpg.accion(sql); //Devuelve un valor de tipo "SQLException". Si devuelve 'null' esta bien, caso contrario me retornara la excepcion.
        return ex;
    }

    
}
