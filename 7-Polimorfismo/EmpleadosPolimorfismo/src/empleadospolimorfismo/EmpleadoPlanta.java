
package empleadospolimorfismo;


public class EmpleadoPlanta extends Empleado{
    
    private final double SUELDO_MENSUAL = 100000;
    private int antiguedad;

    public EmpleadoPlanta(String nombre, int antiguedad) {
        super(nombre);
        this.antiguedad = antiguedad;
    }
    
    @Override
    public double calcularSueldo(){
        double bonoPorAnio = 5000;
        double sueldo = SUELDO_MENSUAL + (antiguedad * bonoPorAnio);
        
        return sueldo;
    }
    
}
