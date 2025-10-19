
package animalespolimorfismo;


public class Perro extends Animal {
    
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau! Guau!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Esto es un perro y hace: ");
    }
    
}
