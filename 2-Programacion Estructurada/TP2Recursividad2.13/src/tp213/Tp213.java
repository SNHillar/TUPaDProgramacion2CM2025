
package tp213;

public class Tp213 {
    
    /*
    a. Declare e inicialice un array con los precios de algunos productos.
    
    b. Use una función recursiva para mostrar los precios originales.
    
    c. Modifique el precio de un producto específico.
    
    d. Use otra función recursiva para mostrar los valores modificados.
    
    
    Salida esperada:
    Precios originales:
    Precio: $199.99
    Precio: $299.5
    Precio: $149.75
    Precio: $399.0
    Precio: $89.99
    Precios modificados:
    Precio: $199.99
    Precio: $299.5
    Precio: $129.99
    Precio: $399.0
    Precio: $89.99

    */
    
    public static void main(String[] args) {

        double precios [] = {40.00, 20.00, 50.00, 199.00}; // inicializamos el array con elementos dentro.
        
        System.out.println("Lista original: ");
        funcionRecursiva(precios, 0);
        
        precios [1] = 25.00;
        precios [3] = 15.00;
        
        
        System.out.println("\nSe realizo una modificacion de los precios: ");
        
        funcionRecursiva(precios, 0); // inicializamos i en 0, para el primer elemento del vector.
    }
    
    static void funcionRecursiva(double precios [], int i){
        
        
        if (i >= precios.length){
            return;
        }
        
        System.out.println("Los precios son: " + precios[i]);
        funcionRecursiva(precios, i + 1);
    }
}