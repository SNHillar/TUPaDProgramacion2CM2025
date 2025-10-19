
package sistemadepagos;


public class TarjetaCredito implements Pagable{
    
    
    public void procesarPago(Pagable medio){
        
    }
    
    @Override
    public void pagar(){
        System.out.println("Pagando con tarjeta de credito.");
    }
}
