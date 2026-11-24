public class MaterialDigital {
    private String titulo;

    public MaterialDigital(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarDescripcion() {
        System.out.println("Material disponible en la biblioteca digital");
    }
}
