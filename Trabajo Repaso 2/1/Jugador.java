/*1. Crear una clase Jugador con los atributos privados nombre, nivel y puntos. Implementar un constructor que reciba el nombre y establezca nivel = 1 y puntos = 0. Crear getters para los tres atributos. Implementar ganarPuntos(int cantidad), que solo permita cantidades positivas, y subirNivel(), que aumente el nivel en una unidad. No permitir modificar puntos ni nivel directamente desde Main.
En Main: crear dos jugadores, mostrar sus datos, sumar puntos a ambos, intentar sumar una cantidad negativa y subir el nivel de uno. Mostrar los resultados para comprobar las validaciones.

2. Crear una clase Persona con los atributos privados nombre y edad, constructor, getters y setters. Validar que la edad no sea negativa. Crear las subclases Docente (agrega materia) y Preceptor (agrega cursoAsignado). Cada subclase debe tener su constructor y un método mostrarInformacion() que muestre los atributos heredados y los propios.
En Main: crear un Docente y un Preceptor, mostrar sus datos y modificar la edad de uno mediante su setter. */

public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void subirNivel() {
        this.nivel = nivel + 1;
        System.out.println(nombre + " subió de nivel a " + nivel);
    }

    public void ganarPuntos(int pts) {
        if (pts > 0) {
            this.puntos += pts;
            System.out.println(nombre + " ganó " + pts + " puntos. Total de puntos: " + puntos);
        } else {
            System.out.println("Los puntos ganados deben ser positivos.");
        }
    }

    public void mostrarDatos() {
        System.out.println("-------------------------");
        System.out.println("Jugador: " + this.nombre);
        System.out.println("nivel: " + this.nivel);
        System.out.println("nuntos: " + this.puntos);
        System.out.println("-------------------------");
    }
}