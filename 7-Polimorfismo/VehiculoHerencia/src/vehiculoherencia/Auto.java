
package vehiculoherencia;


public class Auto extends Vehiculo {
    
    private String cantidadPuertas;

    public Auto(String marca, String modelo, String cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("La marca del auto es: " + super.getMarca() + " modelo: " + super.getModelo() + " y tiene: " + cantidadPuertas + " puertas.");
    }
    
}
