
package tp1consig4;

import java.util.Scanner;

public class TP1Consig4 {
    
    
    public static void main(String[] args) {
       
        
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        
        System.out.println("El nombre ingresado es, " + nombre + " y tiene " + edad + " anios");
        
    }
    
}
