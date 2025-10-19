package cursoprofesor;

public class Main {

    public static void main(String[] args) {

        Universidad utn = new Universidad("UTN");

        Profesor profe1 = new Profesor("1", "Jorge", "Bases de Datos");
        Profesor profe2 = new Profesor("2", "Jose", "Data");
        Profesor profe3 = new Profesor("3", "Daniel", "Programacion 2");

        Curso spring = new Curso("2323", "Spring Boot");
        Curso mongoDB = new Curso("2575", "mongoDB");
        Curso grafana = new Curso("1275", "Grafana");
        Curso python = new Curso("2575", "Python");
        Curso mysql = new Curso("2575", "MySql");

        System.out.println("Agregamos a los profesores a la Universidad");
        utn.agregarProfesor(profe3);
        utn.agregarProfesor(profe2);
        utn.agregarProfesor(profe1);
        System.out.println("================================");

        System.out.println("Agregamos los cursos a la Universidad");
        utn.agregarCurso(mysql);
        utn.agregarCurso(spring);
        utn.agregarCurso(mongoDB);
        utn.agregarCurso(grafana);
        utn.agregarCurso(python);
        System.out.println("================================");

        System.out.println("Asignamos curso 2323 al profersor 1");
        utn.asignarProfesorACurso("2323", "1");
        System.out.println("================================");

        System.out.println("Listamos los cursos del profesor 1");
        profe1.listarCursos();
        System.out.println("================================");

        System.out.println("Listamos todos los cursos de la universidad");
        utn.listarCursos();

        System.out.println("Listamos todos los profesores de la universidad");
        utn.listarProfesores();
        System.out.println("================================");

        System.out.println("Eliminamos el curso 2323");
        utn.eliminarCurso("2323");
        System.out.println("================================");

        System.out.println("Listamos los cursos del profesor 1");
        profe1.listarCursos();
        System.out.println(profe1);
    }

}
