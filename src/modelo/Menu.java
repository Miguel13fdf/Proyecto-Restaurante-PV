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
public class Menu extends Consumision{
    private int me_id;
    private int me_con_id;
    private String me_descripcion;

    public Menu() {
        super();
    }

    public Menu(int me_id, int me_con_id, String me_descripcion, int con_id, double con_precio, Boolean con_servida, int con_cli_id) {
        super(con_id, con_precio, con_servida, con_cli_id);
        this.me_id = me_id;
        this.me_con_id = me_con_id;
        this.me_descripcion = me_descripcion;
    }
    

    
    /**
     * @return the me_id
     */
    public int getMe_id() {
        return me_id;
    }

    /**
     * @param me_id the me_id to set
     */
    public void setMe_id(int me_id) {
        this.me_id = me_id;
    }

    /**
     * @return the me_con_id
     */
    public int getMe_con_id() {
        return me_con_id;
    }

    /**
     * @param me_con_id the me_con_id to set
     */
    public void setMe_con_id(int me_con_id) {
        this.me_con_id = me_con_id;
    }

    /**
     * @return the me_descripcion
     */
    public String getMe_descripcion() {
        return me_descripcion;
    }

    /**
     * @param me_descripcion the me_descripcion to set
     */
    public void setMe_descripcion(String me_descripcion) {
        this.me_descripcion = me_descripcion;
    }
}
