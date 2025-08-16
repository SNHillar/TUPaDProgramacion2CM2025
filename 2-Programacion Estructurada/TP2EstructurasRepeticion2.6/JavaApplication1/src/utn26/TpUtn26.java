
package utn26;

import java.util.Scanner;


public class TpUtn26 {

    /*
    
    Contador de Positivos, Negativos y Ceros (for).
    Escribe un programa que pida al usuario ingresar 10 números enteros y
    cuente cuántos son positivos, negativos y cuántos son ceros.
    
    Ejemplo de entrada/salida:
    Ingrese el número 1: -5
    Ingrese el número 2: 3
    Ingrese el número 3: 0
    Ingrese el número 4: -1
    Ingrese el número 5: 6
    Ingrese el número 6: 0
    Ingrese el número 7: 9
    Ingrese el número 8: -3
    Ingrese el número 9: 4
    Ingrese el número 10: -8
    
    Resultados:
    Positivos: 4
    Negativos: 4
    Ceros: 2

    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int positivos = 0;
        int ceros = 0;
        int negativos = 0;
        
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("Ingrese el numero " + i + ":");
            int num = input.nextInt();
            if(num == 0){
                ceros ++;
            }else if (num > 0){
                positivos++;
            }else{
                negativos++;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}
