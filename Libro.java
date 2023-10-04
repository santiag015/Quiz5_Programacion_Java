public class Libro {
        /* Atributos */
        private String titulo;
        private String autor;
        private int numeroPaginas;
    
    
        /*
         * Metodo Constructor para incializar los atributos
         * 
         * @param titulo el titulo del libro
         * @param autor el autor del libro
         * @param numeroPaginas el numero de paginas del libro
         * 
         * Complejidad temporal: O(1) Operaicon de Tiempo Constante
         */
        public Libro(String titulo, String autor, int numeroPaginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.numeroPaginas = numeroPaginas;
        }
    
    
    
        /* Metodos Getters y Setters */
        
        /*
         * Metodo para obtener el titulo del libro
         * @return titulo muestra el titulo del libro
         */
        public String getTitulo() {
            return titulo;
        }
    
        /*
         * Metodo para establecer el titulo del libro
         * @param titulo establece el nuevo titulo del libro
         */
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        /*
         * Metodo para obtener el nombre del autor
         * @return autor muestra el nombre del autor
         */
        public String getAutor() {
            return autor;
        }
    
          /*
         * Metodo para establecer el nombre del autor
         * @param autor establece el nombre del autor
         * */
        public void setAutor(String autor) {
            this.autor = autor;
        }
    
        /*
         * Metodo para obtener el numero de paginas
         * @return numeroPaginas muestra el numero de paginas
         */
        public int getNumeroPaginas() {
            return numeroPaginas;
        }
    
        /*
         * Metodo para establecer el numero de paginas
         * @param numeroPaginas establece el numero de paginas
         */
        public void setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }
        
    
}
