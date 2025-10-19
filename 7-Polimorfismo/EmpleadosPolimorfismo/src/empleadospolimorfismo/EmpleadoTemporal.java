
package empleadospolimorfismo;


public class EmpleadoTemporal extends Empleado {
    
    
    private final double VALOR_FIJO_HORA = 2200;
    private double horasTrabajadas;

    public EmpleadoTemporal(String nombre, double horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo(){
        double extra = 0;
        double sueldo = VALOR_FIJO_HORA * horasTrabajadas;
        if(horasTrabajadas > 160){
            extra = sueldo * 0.10;
        }
        
        return sueldo + extra;
    }
    
}
