package ecommerce.interfaces;

public interface Pago extends Pagable {
    public boolean procesarPago(double monto);
}
