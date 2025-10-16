package cursoprofesor;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (profesor != null && profesor != this.profesor) {
            this.profesor = profesor;
            if (!profesor.getCursos().contains(this)) {
                profesor.agregarCurso(this);
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Lista de cursos: ");
        System.out.println("Codigo: " + codigo + "\nNombre: " + nombre + "\nProfesor: " + profesor.getNombre());
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre  + '}';
    }

}
