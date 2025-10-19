package ecommerce.interfaces;

public interface PagoConDescuento extends Pago {
    public double aplicarDescuento(double total);   
}
