
package figurasabstract;

import java.util.ArrayList;
import java.util.List;


public class Main {

   
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo("circulo1", 3.1);
        Circulo circulo2 = new Circulo("circulo2", 5.3);
        Cuadrado cuadrado = new Cuadrado("cuadrado1", 4);
        Cuadrado cuadrado2 = new Cuadrado("cuadrado2", 7);
        
        
        List<Figura> figuras = new ArrayList<>();
        
        figuras.add(circulo);
        figuras.add(circulo2);
        figuras.add(cuadrado);
        figuras.add(cuadrado2);
        
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre());
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("---------------------------");
        }
    }
    
}
