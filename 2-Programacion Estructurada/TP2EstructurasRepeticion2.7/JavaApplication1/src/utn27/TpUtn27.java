
package utn27;

import java.util.Scanner;


public class TpUtn27 {

    /*
    
    Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
    usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
    hasta que ingrese un valor válido.
    
    Ejemplo de entrada/salida:
    
    Ingrese una nota (0-10): 15
    Error: Nota inválida. Ingrese una nota entre 0 y 10.
    
    Ingrese una nota (0-10): -2
    Error: Nota inválida. Ingrese una nota entre 0 y 10.
    
    Ingrese una nota (0-10): 8
    Nota guardada correctamente
  
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int nota;
        
        do {
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = teclado.nextInt();
            if(nota < 0 || nota > 10) {
                System.out.println("Nota invalida, por favor ingrese una nota entre 0 y 10.");
            }
        } while(nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente: " + nota);
    }
    
}
