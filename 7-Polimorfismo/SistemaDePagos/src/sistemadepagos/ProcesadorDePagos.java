
package sistemadepagos;

public class ProcesadorDePagos {
    
    // lo hacemos statico para no instanciar el obj
    public static void procesarPago(Pagable medio){
        medio.pagar();
    }
    
}
