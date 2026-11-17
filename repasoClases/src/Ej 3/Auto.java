package Ej3;

public class Auto {
	public String marca;
	public String modelo;
    public String color;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.println("Soy un " + marca + " modelo " + modelo + " de color " + color);
    }
}
