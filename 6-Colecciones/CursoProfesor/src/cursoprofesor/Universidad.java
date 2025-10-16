package cursoprofesor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Curso> cursos = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = cursos;
        this.profesores = profesores;
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Profesor> getProfesores() {
        return Collections.unmodifiableList(profesores);
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    
    public void agregarCurso(Curso curso){
        if(curso != null && !curso.getCodigo().equals(curso)){
            cursos.add(curso);
        }
    }
    
    public void agregarProfesor(Profesor profesor){
        if(profesor != null && !profesor.getId().equals(profesor)){
            profesores.add(profesor);
        }
    }
    
    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorEncontrado = null;
        int i = 0;
        while (i < profesores.size() && profesorEncontrado == null) {
            Profesor profesor = this.profesores.get(i);
            if (profesor.getId().equalsIgnoreCase(id)) {
                System.out.println("Profesor encontrado: " + profesor);
                return profesor;
            }
            i++;
        }
        System.out.println("No se encontró el profesor con id: " + id);
        return profesorEncontrado;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        int i = 0;
        while (i < cursos.size() && cursoEncontrado == null) {
            Curso curso = this.cursos.get(i);
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Curso Encontrado: " + curso);
                return curso;
            }
            i++;
        }
        System.out.println("No se encontro el curso con codigo: " + codigo);
        return cursoEncontrado;
    }

    public void asignarProfesorACurso(String codigo, String idProfesor) {
        Curso cursoAsignar = buscarCursoPorCodigo(codigo);
        Profesor profeAsignado = buscarProfesorPorId(idProfesor);
        if (cursoAsignar == null) {
            System.out.println("No se encontró un curso con el código: " + codigo);
            return;
        }

        if (profeAsignado == null) {
            System.out.println("No se encontró un profesor con el ID: " + idProfesor);
            return;
        }

        cursoAsignar.setProfesor(profeAsignado); // Esto ya asegura la bidireccionalidad si setProfesor está bien implementado
        System.out.println("Profesor asignado correctamente al curso.");
    }

    public void eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        Profesor profesor = cursoAEliminar.getProfesor();
        if (profesor != null) {
            profesor.getCursos().remove(cursoAEliminar); // Eliminar el curso de la lista del profesor
        }

        cursoAEliminar.setProfesor(null); //  Romper vínculo desde el curso
        System.out.println(cursoAEliminar + " eliminado correctamente.");

    }

    public void eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        for (Curso curso : cursos) {
            if (curso.getProfesor() != null && curso.getProfesor().equals(profesorAEliminar)) {
                curso.setProfesor(null); // Esto también debería quitar el curso de la lista del profesor si querés limpieza total
            }
            profesores.remove(profesorAEliminar);
            System.out.println("Profesor eliminado correctamente: " + profesorAEliminar.getNombre());
        }

    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", cursos=" + cursos + ", profesores=" + profesores + '}';
    }

}
