
package utn28;

import java.util.Scanner;


public class TpUtn28 {

    /*
    Cálculo del Precio Final con impuesto y descuento.
    
    
    Crea un método calcularPrecioFinal(double impuesto, double
    descuento) que calcule el precio final de un producto en un e-commerce. La
    fórmula es:
    
    
    PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
    
    PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
    Descuento)
    
    
    Desde main(), solicita el precio base del producto, el porcentaje de
    impuesto y el porcentaje de descuento, llama al método y muestra el precio
    final.
    
    ---------------------------------------------------------------------------
    
    Ejemplo de entrada/salida:
    
    Ingrese el precio base del producto: 100
    Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
    Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
    El precio final del producto es: 105.0
    
  
    */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        
       
        
        System.out.println("Ingresa el precio base del producto.");
        double precioBase = input.nextDouble();
        
        System.out.println("Ingresa el impuesto en porcentaje: ");
        double impuesto = input.nextDouble();
        
        System.out.println("Ingresa el descuento en porcentaje: ");
        double descuento = input.nextDouble();
        
        
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double
    descuento){
        
        double PrecioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        
        return PrecioFinal;
    }
    
    }
