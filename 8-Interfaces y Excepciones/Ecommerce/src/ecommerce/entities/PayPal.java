package ecommerce.entities;

import ecommerce.interfaces.PagoConDescuento;

/**
 * Representa un medio de pago que puede ser utilizado para procesaor los pagos en el e-commerce.
 * * @author Saul
 * @version 1
 */

public class PayPal implements PagoConDescuento {

    // sobreescribre el metodo de la interfaz que implementa
    @Override
    public double aplicarDescuento(double total) {
        // calculamos el descuento, suponiendo que es del 5%
        double descuento = total * 0.05;
        System.out.println("Aplicando descuento por PayPal: ");
        // retornamos el valor con descuento aplicado
        return total - descuento;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por: " + monto);
        return true; // simula operacion exitosa
    }

    @Override
    public double calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
