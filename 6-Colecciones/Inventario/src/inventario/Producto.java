
package inventario;


public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("ID: " + id + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad + "\nCategoria: "+  categoria.name());
    }
    
    @Override
    public String toString() {
        return "{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
    
    
}
