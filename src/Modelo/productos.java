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
public class productos {
    
    private int id;
    private String codigo;
    private String descripcion;
    private float precio_costo;
    private float precio_venta;
    private float precio_mayor;
    private float descuento;
    private int iva;
    private int stock;
    private String obs;
    private String fecha;
    private String id_proveedor;
    private String id_marca;
    private String unidad_med;
    private String id_categoria;

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(float precio_costo) {
        this.precio_costo = precio_costo;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public float getPrecio_mayor() {
        return precio_mayor;
    }

    public void setPrecio_mayor(float precio_mayor) {
        this.precio_mayor = precio_mayor;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getId_marca() {
        return id_marca;
    }

    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
    }

    public String getUnidad_med() {
        return unidad_med;
    }

    public void setUnidad_med(String unidad_med) {
        this.unidad_med = unidad_med;
    }
}
