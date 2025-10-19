
package empleadospolimorfismo;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        
        EmpleadoPlanta jorge = new EmpleadoPlanta("Jorge", 2);
        EmpleadoPlanta raul = new EmpleadoPlanta("Raul", 5);
        EmpleadoTemporal cristian = new EmpleadoTemporal("Cristian", 168);
        EmpleadoTemporal giuliano = new EmpleadoTemporal("Giuliano", 148);
        
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(jorge);
        empleados.add(cristian);
        empleados.add(raul);
        empleados.add(giuliano);
        
        for (Empleado empleado : empleados) {
            
            System.out.println("Empleado: " + empleado.getNombre());
            
            if(empleado instanceof EmpleadoTemporal){
                System.out.println("Tipo: Temporal");
            }else if(empleado instanceof EmpleadoPlanta){
                System.out.println("Tipo: Planta");
            }
            
            System.out.println("Sueldo: $ " + empleado.calcularSueldo());
            System.out.println("--------------------------------");
        }
    }
    
}
