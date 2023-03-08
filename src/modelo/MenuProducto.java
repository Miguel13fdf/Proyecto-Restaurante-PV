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
public class MenuProducto {
    private int pro_me_id;
    private int pro_me_cantidad;
    private int prome_me_id;
    private int prome_pro_id;

    public MenuProducto() {
    }

    public MenuProducto(int pro_me_id, int pro_me_cantidad, int prome_me_id, int prome_pro_id) {
        this.pro_me_id = pro_me_id;
        this.pro_me_cantidad = pro_me_cantidad;
        this.prome_me_id = prome_me_id;
        this.prome_pro_id = prome_pro_id;
    }

    /**
     * @return the pro_me_id
     */
    public int getPro_me_id() {
        return pro_me_id;
    }

    /**
     * @param pro_me_id the pro_me_id to set
     */
    public void setPro_me_id(int pro_me_id) {
        this.pro_me_id = pro_me_id;
    }

    /**
     * @return the pro_me_cantidad
     */
    public int getPro_me_cantidad() {
        return pro_me_cantidad;
    }

    /**
     * @param pro_me_cantidad the pro_me_cantidad to set
     */
    public void setPro_me_cantidad(int pro_me_cantidad) {
        this.pro_me_cantidad = pro_me_cantidad;
    }

    /**
     * @return the prome_me_id
     */
    public int getProme_me_id() {
        return prome_me_id;
    }

    /**
     * @param prome_me_id the prome_me_id to set
     */
    public void setProme_me_id(int prome_me_id) {
        this.prome_me_id = prome_me_id;
    }

    /**
     * @return the prome_pro_id
     */
    public int getProme_pro_id() {
        return prome_pro_id;
    }

    /**
     * @param prome_pro_id the prome_pro_id to set
     */
    public void setProme_pro_id(int prome_pro_id) {
        this.prome_pro_id = prome_pro_id;
    }
    
}
