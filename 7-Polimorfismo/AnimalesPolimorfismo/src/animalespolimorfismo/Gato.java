
package animalespolimorfismo;


public class Gato extends Animal{
    
    
    @Override
    public void hacerSonido(){
        System.out.println("Miauuu! ");
    }
    
    
    @Override
    public void describirAnimal(){
        System.out.println("Esto es un gato y hace: ");
    }
}
