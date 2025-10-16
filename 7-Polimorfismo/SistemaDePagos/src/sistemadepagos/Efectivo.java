
package sistemadepagos;


public class Efectivo implements Pagable{
    
    @Override
    public void pagar(){
        System.out.println("Pago en efectivo.");
    }
}
