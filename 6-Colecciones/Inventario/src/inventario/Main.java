
package inventario;


public class Main {
    
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario(); // Instanciamos un inventario que va a contener los productos
        
        // instanciamos 5 productos
        Producto fideos = new Producto("1", "Fideos ABC", 2500.00, 10, CategoriaProducto.ALIMENTOS);
        Producto lavarropas = new Producto("2", "Draen", 800000.00, 5, CategoriaProducto.ELECTRONICA);
        Producto remera = new Producto("3", "Keni", 25000.00, 20, CategoriaProducto.ROPA);
        Producto arroz = new Producto("5", "Gallina", 550.00, 40, CategoriaProducto.ALIMENTOS);
        Producto platos = new Producto("4", "Rigollo", 1000.00, 8, CategoriaProducto.HOGAR);
        
        // agregamos los pruductos al inventario con el metodo
        inventario.agregarProducto(fideos);
        inventario.agregarProducto(lavarropas);
        inventario.agregarProducto(arroz);
        inventario.agregarProducto(platos);
        inventario.agregarProducto(remera);
//        inventario.eliminarProducto("3");
        System.out.println("");
        inventario.listarProductos();
        System.out.println("");
        inventario.actualizarStock("1", -3);
        inventario.actualizarStock("5", 5);
        System.out.println("");
        inventario.listarProductos();
        System.out.println("");
        inventario.obtenerTotalStock();
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        inventario.obtenerProductoConMayorStock();
        
        inventario.filtrarProductosPorPrecio(2000, 800000);
        
        
        inventario.mostrarCategoriasDisponibles();
    }
    
}
