
package tp1consig9;

import java.util.Scanner;

public class ErrorEjemplo {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");

        String nombre = scanner.nextLine(); // ERROR
        
        //El error estaba en el tipo de dato que se le estaba solicitando al usuario, 
        //nextInt() le pide un entero, pero la variable nombre es un String.

        System.out.println("Hola, " + nombre);

    }
}