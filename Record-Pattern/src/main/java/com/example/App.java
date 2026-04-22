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
    	
    	/**
    	 * Comentario pra javadoc (herramienta que analiza tu código para extaer tus comentarios
    	 * crados asi.
    	 */
    	
    	/*
    	 * Record patterns can also be nested, allowing you to destructure complex 
    	 * object graphs in a single step.
    	 * */
    	
    	Library library = Library.builder()
    			.name("Bibliotéca de Móstoles")
    			.bestseller(
    				Book.builder()
    					.title("Java programing")
    					.author("John Doe")
    					.build()
    				)
    			.build();
    	
    	if (library instanceof Library(String nombre, Book(var titulo, var autor))) {
    		System.out.println("En la Biblioteca: " + nombre + ", el bestseller es: " + 
    				titulo + ", por el autor: " + autor);
    		
    	}
    	
    }
}
