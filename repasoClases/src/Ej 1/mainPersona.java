package Ej1;


public class mainPersona {
	
	public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.nombre = "Dante";
        p1.edad = 18;

        Persona p2 = new Persona();
        p2.nombre = "Mati";
        p2.edad = 18;

        System.out.println("La Persona 1 se llama: " + p1.nombre + ", de edad: " + p1.edad);
        System.out.println("La Persona 2 se llama: " + p2.nombre + ", de edad: " + p2.edad);
    }
}

