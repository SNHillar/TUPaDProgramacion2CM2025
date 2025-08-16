package tp212;

import java.util.Scanner;



public class tp212 {
    /*
    Modificación de un array de precios y visualización de resultados.
    Crea un programa que:
    
    
    a. Declare e inicialice un array con los precios de algunos productos.
    
    b. Muestre los valores originales de los precios.
    
    c. Modifique el precio de un producto específico.
    
    d. Muestre los valores modificados.
    
    
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
    
    
    Conceptos Clave Aplicados:
    ✔ Uso de arrays (double[]) para almacenar valores.
    ✔ Recorrido del array con for-each para mostrar valores.
    ✔ Modificación de un valor en un array mediante un índice.
    ✔ Reimpresión del array después de la modificación.
    */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double[] preciosOriginales = new double [6];
        
        for ( int i = 0 ; i < preciosOriginales.length; i++ ){
            
            System.out.println("Ingrese el precio en la posicion " + i + ":");
            preciosOriginales[i] = Double.parseDouble(input.nextLine());
            
            
        }
        
        for (double precio : preciosOriginales){
            System.out.println("Los precios originales son: $" + precio);
        }
        
        System.out.println("Ingrese una posicion de precio a modificar, del 0 al 5");
        int indice = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el nuevo precio: ");
        double nuevoPrecio = Double.parseDouble(input.nextLine());
        
        preciosOriginales[indice] = nuevoPrecio;
        
        
        for (double precio : preciosOriginales){
            System.out.println("Los precios modificados son: $" + precio);
        }
        

    }
    
    
}