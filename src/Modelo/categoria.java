/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class categoria {
    
    private int id_categoria;
    private String descripcion_c;
    private String fecha_cate;
    private int estado;
    private String nombre_est;

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion_c() {
        return descripcion_c;
    }

    public void setDescripcion_c(String descripcion_c) {
        this.descripcion_c = descripcion_c;
    }

    public String getFecha_cate() {
        return fecha_cate;
    }

    public void setFecha_cate(String fecha_cate) {
        this.fecha_cate = fecha_cate;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre_est() {
        return nombre_est;
    }

    public void setNombre_est(String nombre_est) {
        this.nombre_est = nombre_est;
    }
    
}
