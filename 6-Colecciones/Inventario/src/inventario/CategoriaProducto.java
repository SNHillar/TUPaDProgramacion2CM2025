
package inventario;


public enum CategoriaProducto {
    
    ALIMENTOS("Productos Comestibles"),
    ELECTRONICA("Dispositivos Electronicos"),
    ROPA("Prendas de Vestir"),
    HOGAR("Articulos para el Hogar"),;
    
    private final String DESCRIPCION; //mayus para final

    private CategoriaProducto(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    public String getDescripcion(){
        return DESCRIPCION;
    }
}
