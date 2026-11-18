package 2;

public class Tarjeta extends MedioPago{
    private int ultimosCuatroDigitos;

    public Tarjeta(String titular, int ultimosCuatroDigitos){
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;

        
    }
}
