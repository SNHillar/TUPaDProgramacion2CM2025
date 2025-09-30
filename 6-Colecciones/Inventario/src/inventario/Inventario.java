
package inventario;

import java.util.ArrayList;
import java.util.List;


public class Inventario {
    
    private List<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        if(p != null && !productos.contains(p)){
            productos.add(p);
        }
    }
    
    public void listarProductos(){
        for(Producto p : productos){
            System.out.println(p);
        }
    }
    
    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while(i < productos.size() && productoEncontrado == null){
            Producto producto = this.productos.get(i);
            if(producto.getId().equalsIgnoreCase(id)){
                System.out.println("Producto Encontrado: " + producto);
                return producto;
            }
            i++;
        }
        System.out.println("No se encontro el producto con id: " + id);
        return productoEncontrado;
    }
    
    
    public void eliminarProducto(String id){
        Producto productoABorrar = buscarProductoPorId(id);
        System.out.println("Producto Eliminado.");
        this.productos.remove(productoABorrar);
    }
    
    public void actualizarStock(String id, int cantidad){
        
        Producto productoStockActualizar = buscarProductoPorId(id);
        
        if(productoStockActualizar != null){
            int nuevoStock = productoStockActualizar.getCantidad() + cantidad;
        
            if(nuevoStock < 0){
                System.out.println("No hay suficiente stock para descontar " + (-cantidad) + " unidades.\nEl stock actual es: " + productoStockActualizar.getCantidad());
            }else{
                productoStockActualizar.setCantidad(nuevoStock);
                System.out.println("Prodcuto actualizado, nuevo stock: " + nuevoStock);
            }
        }else{
            System.out.println("No se encontró el producto con id: " + id);
        }
    }
    
    
    public void obtenerTotalStock(){
        for(Producto p : productos){
            System.out.println("Producto: " + p.getNombre() + " ------------ Stock: " + p.getCantidad());
        }
    }
    
    
    public void obtenerProductoConMayorStock(){
        
    }
    
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
    if (categoria != null) {
        boolean encontrado = false; // solo por si no encuentra nada
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                System.out.println(p);
                encontrado = true; 
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoría: " + categoria.getDescripcion());
        }
    } else {
        System.out.println("La categoría es nula.");
    }
}
}
