
package tp1consig8;

import java.util.Scanner;

public class TP1Consig8 {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        /*System.out.println("Ingrese un número: ");
        int a = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero a dividir: ");
        int b = teclado.nextInt();
        
        double res = a / b;*/
        
        System.out.println("Ingrese un número: ");
        double a = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero a dividir: ");
        double b = teclado.nextInt();
        
        double res = a / b;
        
        System.out.println("El resultado de la operación es: " + res);
    }
    
}
