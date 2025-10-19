package ecommerce.entities;

import ecommerce.interfaces.Notificable;
import ecommerce.interfaces.Pagable;
import ecommerce.interfaces.Pago;
import ecommerce.interfaces.PagoConDescuento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa la entidad del pedido, maneja los productos y el cliente dentro
 * del pedido
 *
 * * @author Saul
 * @version 1
 */
public class Pedido implements Pagable, Notificable {

    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /**
     @param p un Producto y los agrega a la lista de product's
     */

    public void agregarProductos(Producto p) {
        this.productos.add(p);
    }

    public List<Producto> getProcutos() {
        return Collections.unmodifiableList(productos);
    }

    public void setProcutos(List<Producto> procutos) {
        this.productos = procutos;
    }

    @Override
    public double calcularTotal() {
        // Recorremos la lista hasta el final, obtenemos el precio de cada producto y lo acumulamos en un total
        double total = 0;
        int i = 0;
        while (i < productos.size()) {
            Producto producto = productos.get(i);
            total += producto.getPrecio();
            i++;
        }
        System.out.println("El precio total es: " + total);
        // retornamos el total del precio
        return total;
    }
    
    
    public boolean finalizarPedido(Pago metodoPago) {
        double totalAPagar = calcularTotal();
        // Si el metodo de pago, es una instancia de PagoConDescuento, le aplica el metodo aplicarDescuento, y sigue su camino
        if (metodoPago instanceof PagoConDescuento pagoDescuento) {
            totalAPagar = pagoDescuento.aplicarDescuento(totalAPagar);
        }
        
        //Procesamos el pago, y enviamos una notificacion al cliente
        if (metodoPago.procesarPago(totalAPagar)) {
            cliente.enviarNotificacion("Su pedido ha sido procesado exitosamente por: " + totalAPagar);
            return true;
        } else {
            cliente.enviarNotificacion("ERROR: No se ha podido procesar el pago por: " + totalAPagar);
            return false;
        }
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
