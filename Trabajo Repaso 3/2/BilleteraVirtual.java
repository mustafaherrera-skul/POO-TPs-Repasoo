package 2;

public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public Tarjeta(String titular, String nombreAplicacion){
        super(titular);
        this.nombreAplicacion = nombreAplicacion;

        
    }
}

