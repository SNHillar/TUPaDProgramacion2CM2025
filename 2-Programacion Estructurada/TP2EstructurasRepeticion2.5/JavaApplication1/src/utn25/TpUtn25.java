
package utn25;

import java.util.Scanner;


public class TpUtn25 {

    /*
    
    Escribe un programa que solicite números al usuario y sume solo los
    números pares. El ciclo debe continuar hasta que el usuario ingrese el número
    0, momento en el que se debe mostrar la suma total de los pares ingresados.
    
    
    Ejemplo de entrada/salida:
    
    Ingrese un número (0 para terminar): 4
    Ingrese un número (0 para terminar): 7
    Ingrese un número (0 para terminar): 2
    Ingrese un número (0 para terminar): 0
    La suma de los números pares es: 6


    */
    public static void main(String[] args) {    
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un numero a sumar, para salir, ingrese 0: ");
        int num = input.nextInt();
        
        int suma = 0;
        
        while (num != 0){
            
            if (num % 2 == 0){
                suma += num;   
            }
            System.out.println("Ingresa otro numero (0 para terminar): ");
            num = input.nextInt();
        }
        System.out.println("El resultado es: " + suma);
    }
    
}
