package bibliotecalibros;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("1", "No se", "Cualquiera");
        Autor autor2 = new Autor("2", "No se x2", "Cualquiera x2");
        Autor autor3 = new Autor("3", "No se x3", "Cualquiera x3");

        //instanciamos nuestra biblioteca
        Biblioteca biblioteca = new Biblioteca("Mi biblioteca");
        
        //agregamos libros cuales quiera para ver funcionamiento
        biblioteca.agregarLibro("1242", "Cenicienta", 1990, autor);
        biblioteca.agregarLibro("1531", "Blanca Nieves", 1998, autor2);
        biblioteca.agregarLibro("1924", "Los 3 chanchitos", 1963, autor3);
        biblioteca.agregarLibro("9285", "Rapuncel", 1923, autor2);
        biblioteca.agregarLibro("1254", "Peter pan", 1958, autor);
        biblioteca.listarLibros();

        biblioteca.buscarLibroPorIsbn("1242");
        //mostramos la cantidad de libros
        biblioteca.obtenerCantidad();
        //eliminanos un libro y mostramos la info de la lista
        System.out.println("");
        //despues de eliminar, muestra nuevamente la lista de libros
        biblioteca.eliminarLibro("1531");

        biblioteca.mostrarAutoresDisponibles();
    }

}
