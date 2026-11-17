public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Juan Piris", 30, "Inglés");
        docente1.mostrarInformacion();
        Preceptor preceptor1 = new Preceptor("Pablo Greco", 35, "5° 3°");
        preceptor1.mostrarInformacion();
        preceptor1.setEdad(36);
        preceptor1.mostrarInformacion();
    }
}