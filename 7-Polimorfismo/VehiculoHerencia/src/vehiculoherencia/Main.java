
package vehiculoherencia;


public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo("Plantilla", "Generica");
        Auto yaris = new Auto("Toyota", "Yaris", "5");
        
        vehiculo.mostrarInfo();
        yaris.mostrarInfo();
    }
    
}
