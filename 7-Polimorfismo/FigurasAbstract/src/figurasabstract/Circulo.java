
package figurasabstract;


public class Circulo extends Figura {
    
    private double radio;

    public Circulo(String nombre, double radio ) {
        super(nombre);
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea(){
        double pi = Math.PI;
        double areaCirculo = pi * Math.pow(radio, 2);
        
        return areaCirculo;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    
}
