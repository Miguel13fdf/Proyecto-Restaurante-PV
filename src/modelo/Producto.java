/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author USUARIO
 */
public class Producto extends  Consumision{
    private int pro_id_nombre;
    private String pro_nombre;
    private String pro_descripcion;
    private String pro_tipo;
    private int pro_con_id;

    public Producto() {
        super();
    }

    public Producto(int pro_id_nombre, String pro_nombre, String pro_descripcion, String pro_tipo, int pro_con_id) {
        this.pro_id_nombre = pro_id_nombre;
        this.pro_nombre = pro_nombre;
        this.pro_descripcion = pro_descripcion;
        this.pro_tipo = pro_tipo;
        this.pro_con_id = pro_con_id;
    }

    /**
     * @return the pro_id_nombre
     */
    public int getPro_id_nombre() {
        return pro_id_nombre;
    }

    /**
     * @param pro_id_nombre the pro_id_nombre to set
     */
    public void setPro_id_nombre(int pro_id_nombre) {
        this.pro_id_nombre = pro_id_nombre;
    }

    /**
     * @return the pro_nombre
     */
    public String getPro_nombre() {
        return pro_nombre;
    }

    /**
     * @param pro_nombre the pro_nombre to set
     */
    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    /**
     * @return the pro_descripcion
     */
    public String getPro_descripcion() {
        return pro_descripcion;
    }

    /**
     * @param pro_descripcion the pro_descripcion to set
     */
    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    /**
     * @return the pro_tipo
     */
    public String getPro_tipo() {
        return pro_tipo;
    }

    /**
     * @param pro_tipo the pro_tipo to set
     */
    public void setPro_tipo(String pro_tipo) {
        this.pro_tipo = pro_tipo;
    }

    /**
     * @return the pro_con_id
     */
    public int getPro_con_id() {
        return pro_con_id;
    }

    /**
     * @param pro_con_id the pro_con_id to set
     */
    public void setPro_con_id(int pro_con_id) {
        this.pro_con_id = pro_con_id;
    }
    
}
