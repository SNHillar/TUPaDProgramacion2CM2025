package ecommerce.entities;

import ecommerce.interfaces.Pago;

/**
 * Representa un medio de pago que puede ser utilizado para procesaor los pagos en el e-commerce.
 * * @author Saul
 * @version 1
 */

public class TarjetaDeCredito implements Pago{

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de credito por: " + monto );
        return true; // simula operación exitosa
    }

    @Override
    public double calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
