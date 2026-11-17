package Ejercicio3;

public class Ejercicio3 {

	public static class Animal {
        private String nombre;
        private int edad;

        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    public static class Perro extends Animal {
        private String raza;

        public Perro(String nombre, int edad, String raza) {
            super(nombre, edad);
            this.raza = raza;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public void ladrar() {
            System.out.println("el perro está ladrando");
        }
    }

    public static void main(String[] args) {

        Perro miPerro = new Perro("Firulais", 4, "Labrador");
        System.out.println("Perro: " + miPerro.getNombre() + ", Edad: " + miPerro.getEdad() + ", Raza: " + miPerro.getRaza());
        miPerro.ladrar();
    }
}
