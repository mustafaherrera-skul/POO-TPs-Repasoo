public class LibroDigital extends MaterialDigital{
    
    public LibroDigital(String titulo){
        super(titulo)
    }

    @Override
    public class mostrarDescripcion(){
        System.out.println("«Se puede leer en pantalla»");
    }
}
