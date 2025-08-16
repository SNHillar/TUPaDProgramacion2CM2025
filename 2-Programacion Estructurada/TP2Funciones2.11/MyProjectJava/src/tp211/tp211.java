package tp211;

import java.util.Scanner;



public class tp211 {
    
static double entrada = 0.10;
    /*
    Cálculo de descuento especial usando variable global.
    
    
    Declara una variable global Ejemplo de entrada/salida: = 0.10.
    
    Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para
    calcular el descuento especial del 10%.
    
    
    Dentro del método, declara una variable local descuentoAplicado, almacena
    el valor del descuento y muestra el precio final con descuento.
    
    
    Ejemplo de entrada/salida:
    
    
    Ingrese el precio del producto: 200
    El descuento especial aplicado es: 20.0
    El precio final con descuento es: 180.0
    */

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        double descuentoAplicado = calcularDescuentoEspecial(precioProducto);
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        
        double precioFinal = precioProducto - descuentoAplicado;
        System.out.println("El precio final con descuento es: " + precioFinal);
        
        
    }
    
    static double calcularDescuentoEspecial(double precio){
        
        double descuentoEspecial = (precio * entrada);
        
        return descuentoEspecial;
    }
}