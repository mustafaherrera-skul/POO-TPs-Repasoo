public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Billetera Virtual (" + nombreAplicacion + ") de " + getTitular() + " por $" + monto + " procesado con éxito.");
        } else {
            System.out.println("Error: El monto debe ser mayor que cero para procesar el pago con Billetera Virtual.");
        }
    }
}
