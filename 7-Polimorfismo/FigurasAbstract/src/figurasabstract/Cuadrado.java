
package figurasabstract;


public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        double areaCuadrado = Math.pow(lado, 2); // o puede ser tambien lado * lado
        return areaCuadrado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
}
