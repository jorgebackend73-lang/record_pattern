package com.example;



public class App {
	// Metodo que recibe un objeto como parametro y muestra los detalles de dicho ogjeto
	// urilizando la sentencia if y Pattern Matching con el metodo instanceof
	// y ademas estructura del tipo record que es uno de los record patterns.
	static void imprimirDetalles(Object obj) {
		
		// ¿Cómo sería en versiones anteriores a java 21 donde no existia record patterns?
		if (obj instanceof Book book) {
			System.out.println("Titulo del libro: " + book.title());
			System.out.println("Autor del libro: " + book.author());
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
