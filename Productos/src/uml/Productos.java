/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author Edgar
 */
public class Productos {
    private int codProducto;
    private String nombre;
    private String marca;
    private float costo;
    private float precioventa;

    public Productos() {
    }

    public Productos(int codProducto, String nombre, String marca, float costo, float precioventa) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.precioventa = precioventa;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }
    
    
    
}
