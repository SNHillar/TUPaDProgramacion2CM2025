package cursoprofesor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !this.cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }

    }

    public void listarCursos() {
    if (this.getCursos().isEmpty()) {
        System.out.println("La lista de cursos del profesor esta vacia.");
    } else {
        System.out.println("Los cursos de " + nombre + " son:");
        for (Curso curso : cursos) {
            System.out.println("- " + curso);
        }
    }
}

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }

}
