public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Pepito");
        j1.mostrarDatos(); // Pepito, nivel 1, 0 pts
        j1.ganarPuntos(10); // Pepito ganó 10 puntos. Total de puntos: 10
        j1.ganarPuntos(-5); // "Los puntos deben ser positivos"
        j1.subirNivel(); // Pepito subió de nivel a 2
        Jugador j2 = new Jugador("Carlos");
        j2.mostrarDatos(); // Carlos, nivel 1, 0 pts
        j2.ganarPuntos(20); // Carlos ganó 10 puntos. Total de puntos: 10
        j2.ganarPuntos(-5); // "Los puntos deben ser positivos"
        j2.subirNivel(); // Carlos subió de nivel a 2

        j1.mostrarDatos(); // Pepito, nivel 2, 10 pts
        j2.mostrarDatos(); // Carlos, nivel 2, 20 pts

    }
}