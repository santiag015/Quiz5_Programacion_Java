import java.util.LinkedList;

public class Biblioteca {
    /*
     * Declaracion e inicializacion de lista para almacenar objetos
     * 
     * Complejidad Computacional: O(1) Operacion de Tiempo Constante
     */
    LinkedList <Libro> librosDisponibles = new LinkedList<Libro>();

    /*
     * Metodo constructor para registar el libro
     * 
     * Complejidad temporal: O(1) Operacion de Tiempo Constante
     */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }



    /*
    * Metodo Constructor para buscar el libro
    *
    * @param libro1 obtiene el numero de libro disponible
    * @return libro1 muestra la informacion del libro
    * @return null no retorna nada
    * 
    * Complejidad temporal: O(N) Operacion de Tiempo lineal
    */
    public Libro buscarLibro(String titulo) {
        for (int i = 0; i < librosDisponibles.size(); i += 1) {
            Libro libro1 = librosDisponibles.get(i);
            if (titulo.equals(libro1.getTitulo())) {
                return libro1;
            }
        } 
        return null;
    }

    /*
     * Metodo Constructor para obtener los libros disponibles
     * @return librosDisponibles muestra todos los libros disponibles
     * 
     * Complejidad temporal: O(1) Operacion de Tiempo Constante 
     */
    public LinkedList<Libro> getlibrosDisponibles() {
        return librosDisponibles;
    }

}
