
package animalespolimorfismo;


public class Vaca extends Animal {
    
    
    @Override
    public void hacerSonido(){
        System.out.println("Muuuuuuuu");
    }
    
    
    @Override
    public void describirAnimal(){
        System.out.println("Esto es una vaca y hace: ");
    }
}
