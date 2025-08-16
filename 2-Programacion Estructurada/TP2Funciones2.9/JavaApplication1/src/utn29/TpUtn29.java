
package utn29;

import java.util.Scanner;


public class TpUtn29 {

    /*
    a. 
    
    calcularCostoEnvio(double peso, String zona): Calcula el costo de
    envío basado en la zona de envío (Nacional o Internacional) y el peso del
    paquete.
    Nacional: $5 por kg
    Internacional: $10 por kg
    
    
    b. 
    
    calcularTotalCompra(double precioProducto, double
    costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
    el costo de envío.
    
    
    Desde main(), solicita el peso del paquete, la zona de envío y el precio
    del producto. Luego, muestra el total a pagar.
    
    
    Ejemplo de entrada/salida:
    
    
    Ingrese el precio del producto: 50
    Ingrese el peso del paquete en kg: 2
    Ingrese la zona de envío (Nacional/Internacional): Nacional
    El costo de envío es: 10.0
    El total a pagar es: 60.0

    */
    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del paquete: ");
        double precio = input.nextDouble();
        
        
        System.out.println("Ingrese el peso del paquete: ");
        double peso = input.nextDouble();
        
        System.out.println("Ingrese la zona de envio '(Nacional/Internacional)': ");
        input.nextLine();
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("Costo del envio es: " + costoEnvio);
        
        
        double totalFinal = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El total a pagar es: " + totalFinal);
        
    }
    
    
    static double calcularCostoEnvio(double peso, String zona){
        
        double costo = 0;
        
        if ("Nacional".equals(zona)){
            costo = peso * 5 ;
            
        }else if("Inernacional".equals(zona)){
            costo = peso * 10 ;
        }
        return costo;
        
    }
    
    static double calcularTotalCompra(double precioProducto, double
    costoEnvio){
        
        double precioFinal = precioProducto + costoEnvio;
        
        return precioFinal;
    }
    
    }
