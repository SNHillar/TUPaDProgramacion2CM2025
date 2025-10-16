
package animalespolimorfismo;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        //instanciamos los animales
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        
        // los agregamos a la lista
        List<Animal> animales = new ArrayList<>();
        
        animales.add(perro);
        animales.add(vaca);
        animales.add(gato);
        
        // con foreach los recorremos y polimorfismo para hacer sonidos y descripcion
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("----------");
        }
    }
    
}
