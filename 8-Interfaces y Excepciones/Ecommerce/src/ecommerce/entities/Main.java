package ecommerce.entities;

import ecommerce.interfaces.Pago;
import ecommerce.interfaces.PagoConDescuento;

public class Main {

    public static void main(String[] args) {
        Cliente saul = new Cliente("Saul");
        Cliente gene = new Cliente("Genesis");

        Pago visa = new TarjetaDeCredito();
        PagoConDescuento paypal = new PayPal();

        Producto pc = new Producto("Mi pc gamer", 600.000);
        Producto mouse = new Producto("Logitech", 140.000);
        Producto pc2 = new Producto("Mi pc gamer 2", 600.000);
        Producto mouse2 = new Producto("Razer", 140.000);

        Pedido pedido = new Pedido(saul);
        Pedido pedido2 = new Pedido(gene);

        pedido.agregarProductos(pc);
        pedido.agregarProductos(mouse);
        pedido.finalizarPedido(visa);
        System.out.println("");

        pedido2.agregarProductos(pc2);
        pedido2.agregarProductos(mouse2);

        pedido2.finalizarPedido(paypal);
        System.out.println("");

    }

}
