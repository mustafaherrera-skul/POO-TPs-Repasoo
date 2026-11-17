package Ejercicio1;

public class Ejercicio1 {

	public static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
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

    public static class Empleado extends Persona {
        private double salario;

        public Empleado(String nombre, int edad, double salario) {
            super(nombre, edad);  // hereda atributos
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void mostrarDatos() {
            System.out.println("Nombre: " + getNombre());
            System.out.println("Edad: " + getEdad());
            System.out.println("Salario: " + salario);
        }
    }

    public static void main(String[] args) {

        Empleado empl = new Empleado("Mustafa Herrera", 18, 29000.1);
        empl.mostrarDatos();
    }
}
