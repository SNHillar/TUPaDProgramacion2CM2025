
package javaapplication1;

import java.util.Scanner;


public class TpUtn21 {

    
    public static void main(String[] args) {
        /*Escribe un programa en Java que solicite al usuario un año y determine si es
        bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        divisible por 400.
        */
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        
        if (!(num % 400 == 0)){
            if (num % 4 == 0 && num % 100 != 0) {
                System.out.println("El anio es biciesto.");
            } else {
                System.out.println("El anio no es biciesto.");
            }
        }
    }
    
}
