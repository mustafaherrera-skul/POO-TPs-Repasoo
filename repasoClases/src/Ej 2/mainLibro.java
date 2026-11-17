package Ej2;

public class mainLibro {
	
	public static void main(String[] args) {
		
        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", 1997);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        libro1.mostrarDatos();
        libro2.mostrarDatos();
    }
}
