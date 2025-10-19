
package sistemadepagos;



public class Main {

    public static void main(String[] args) {
        
        Pagable visa = new TarjetaCredito();
        Pagable transf = new Transferencia();
        Pagable efete = new Efectivo();
        
        
        
        ProcesadorDePagos.procesarPago(visa);
        ProcesadorDePagos.procesarPago(transf);
        ProcesadorDePagos.procesarPago(efete);
    }
    
}
