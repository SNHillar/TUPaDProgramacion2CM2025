package ecommerce.entities;

/**
 * Representa un artículo individual que puede ser comprado en el e-commerce.
 * Cada producto tiene un nombre y un precio.
 * * @author Saul 
 * @version 1
 */

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
