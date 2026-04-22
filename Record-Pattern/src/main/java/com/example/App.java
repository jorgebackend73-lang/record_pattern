package com.example;



public class App {
	// Metodo que recibe un objeto como parametro y muestra los detalles de dicho ogjeto
	// urilizando la sentencia if y Pattern Matching con el metodo instanceof
	// y ademas estructura del tipo record que es uno de los record patterns.
	static void imprimirDetalles(Object obj) {
		
		// En Java 21 con Record Pattern, especificamente con destructure
		// Lo desestrucutra todo y no hace falta ni llamar a las variables con el mismo 
		// nombre con el que fueron creadas.
		// Nos coge directamente lo que hemos creado más abajo.
		if (obj instanceof Book(String titulo, String autor)) {
			System.out.println("Titulo del libro: " + titulo);
			System.out.println("Autor del libro: " + autor);
		}
	}
	
    public static void main(String[] args) {
        
    	// Crear un objeto de tipo record Book
    	
    	// Book libro = new Book("Java es bueno", "yo mismo");
    	
    	Book libro = Book.builder()
    			.title("Java es bueno.")
    			.author("Yo mismo.")
    			.build();
    	
    	imprimirDetalles(libro);
    	
    }
}
