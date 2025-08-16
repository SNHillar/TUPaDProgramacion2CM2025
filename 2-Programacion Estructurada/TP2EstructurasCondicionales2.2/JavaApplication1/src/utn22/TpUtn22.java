
package utn22;

import java.util.Scanner;


public class TpUtn22 {

    
    public static void main(String[] args) {
        /*
        Determinar el Mayor de Tres Números.
        Escribe un programa en Java que pida al usuario tres números enteros y
        determine cuál es el mayor.
        */
        
        System.out.println("Ingrese un número: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        System.out.println("Ingrese un número: ");
        int b = scan.nextInt();
        
        System.out.println("Ingrese un número: ");
        int c = scan.nextInt();
        
        if (a > b && a > c){
            System.out.println("El mayor es a, que es: " + a);
        }else{
            if (b > c){
                System.out.println("El mayor es b, que es: " + b);
            }else{
                System.out.println("El mayor es c, que es: " + c);
            }
        }
        
        
    }
    
}
