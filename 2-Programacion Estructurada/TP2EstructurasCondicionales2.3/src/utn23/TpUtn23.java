
package utn23;

import java.util.Scanner;


public class TpUtn23 {

    /*Escribe un programa en Java que solicite al usuario su edad y clasifique su
    etapa de vida según la siguiente tabla:
    
    Menor de 12 años: "Niño"
    Entre 12 y 17 años: "Adolescente"
    Entre 18 y 59 años: "Adulto"
    60 años o más: "Adulto mayor"

    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad < 0){
            System.out.println("Si tenes menos de 0, es que aun ni naciste probablemente.");
        }else{
            if(edad < 12){
            System.out.println("Ninio.");
        } else if(edad >= 13 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59){
            System.out.println("Adulto.");
        } else{
            System.out.println("Adulto mayor.");
        }
        }
        
        
    }
    
}
