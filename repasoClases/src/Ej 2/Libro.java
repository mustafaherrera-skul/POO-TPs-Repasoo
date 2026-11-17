package Ej2;

public class Libro {
	public String titulo;
    public String autor;
    public int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public void mostrarDatos() {
        System.out.println("Libro: " + titulo + " , autor: " + autor + " , año: " + año);
    }
}
