package ecommerce.entities;

import ecommerce.interfaces.Notificable;

public class Cliente implements Notificable{
    
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificacion a: " + nombre + ": " + mensaje);
    }
    
    
}
