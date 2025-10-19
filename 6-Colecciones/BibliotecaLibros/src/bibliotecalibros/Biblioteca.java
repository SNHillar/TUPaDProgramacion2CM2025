package bibliotecalibros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        //verificamos que no nos pasen null como autor
        if (autor != null) {
            //creamos un libro
            Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
            //bandera para ver si existe ya en el array
            boolean yaExiste = false;
            int i = 0;
            while (i < libros.size() && !yaExiste) {
                //adoptamos el indice del array con el iterador
                Libro libroExistente = this.libros.get(i);
                //si lo que hay en el getter es igual al isbn que nos llega por parametro
                if (libroExistente.getIsbn().equalsIgnoreCase(isbn)) {
                    yaExiste = true;
                    return;
                }
                i++;
            }
            //si no existe, lo agregamos al array
            if (!yaExiste) {
                libros.add(libro);
            } else {
                System.out.println("El libro con isbn " + isbn + " que intentas agregar, ya existe");
            }
        } else {
            System.out.println("No se puede agregar un libro sin autor.");
        }
    }

    public void obtenerCantidad() {
        //corrobora si el array esta vacio
        if (libros.isEmpty()) {
            System.out.println("La lista de libros está vacía.");
        }
        System.out.println("La cantidad de Libros es: " + libros.size());
    }

    public void eliminarLibro(String isbn) {
        //instanciamos el libro a eliminar, y buscamos su isbn con el metodo
        Libro libroABorrar = buscarLibroPorIsbn(isbn);
        System.out.println("Libro eliminado.");
        this.libros.remove(libroABorrar);
        System.out.println("Ahora la lista de libros es: ");
        //listamos luego de borrar con el metodo
        listarLibros();
    }

    public void mostrarAutoresDisponibles() {
        for (Libro libro : libros) {
            System.out.println(libro.getAutor());
        }
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        int i = 0;
        Libro libroEncontrado = null;
        //si el iterador es menor al indice de la lista y dif de null entra en el bucle
        while (i < libros.size() && libroEncontrado == null) {
            Libro libro = this.libros.get(i);
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Libro encontrado: " + libro);
                return libro;
            }
            i++;
        }
        System.out.println("No se encontro el libro con isbn: " + isbn);
        return libroEncontrado;
    }
}
