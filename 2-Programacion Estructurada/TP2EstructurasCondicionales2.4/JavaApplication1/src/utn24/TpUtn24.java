
package utn24;

import java.util.Scanner;


public class TpUtn24 {

    /*Escribe un programa que solicite al usuario el precio de un producto y
    su categoría (A, B o C).
    
    Luego, aplique los siguientes descuentos:
    
    Categoría A: 10% de descuento
    Categoría B: 15% de descuento
    Categoría C: 20% de descuento
    
    El programa debe mostrar el precio original, el descuento aplicado y el
    precio final
    
    Ejemplo de entrada/salida:
    Ingrese el precio del producto: 1000
    Ingrese la categoría del producto (A, B o C): B
    Descuento aplicado: 15%
    Precio final: 850.0

    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese el precio del producto: ");
        double precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ahora ingrese su categoria, A, B, o C: ");
        String categ = input.nextLine().toUpperCase(); // pasamos a upper por el case sensitive.
        
        switch(categ){
            case "A":
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: " + (precio - precio * 0.10));
                break;
            case "B":
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + (precio - precio * 0.15 ));
                break;
            case "C":
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: " + (precio - precio * 0.20 ));
                break;
        default:
                System.out.println("Opcion invalida.");        
        }  
        
        
        
    }
    
}
