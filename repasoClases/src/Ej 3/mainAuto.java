package Ej3;

public class mainAuto {
	
	public static void main(String[] args) {
		
        Auto auto1 = new Auto("Toyota", "Corolla", "blanco");
        Auto auto2 = new Auto("Ford", "Fiesta", "rojo");
        Auto auto3 = new Auto("Volkswagen", "Gol", "gris");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}
