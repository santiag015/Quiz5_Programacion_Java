public class Principal {
    public static void main(String[] args) {

        /*
         * Se declara un objeto para inializar la clase biblioteca
         * 
         * Complejidad Computacional: o(1) Operacion de Tiempo Constante
         */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        /*
         * Complejidad temporal: 0(1) Tiempo Constante
         */
        Libro libro1 = new Libro("Cien años de soledad","Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "“Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

    }
     
}

