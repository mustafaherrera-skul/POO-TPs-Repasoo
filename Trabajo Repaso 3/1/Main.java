public class Main {
    
    public static void main(String[] args) {
        LibroDigital ld1 = new LibroDigital("Las aventuras de pepito");
        ld1.mostrarDescripcion();

        LibroAudio la1 = new LibroAudio("Las aventuras de pepito");
        la1.mostrarDescripcion();
    }
}
