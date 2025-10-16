
package sistemadepagos;


public class Transferencia implements Pagable{
    
    
    public void procesarPago(Pagable medio){
        
    }
    
    @Override
    public void pagar(){
        System.out.println("Pagando con transferencia.");
    }
}
