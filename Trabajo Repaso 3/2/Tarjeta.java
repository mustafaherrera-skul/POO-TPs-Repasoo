public class Tarjeta extends MedioPago {
    private int ultimosCuatroDigitos;

    public Tarjeta(String titular, int ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    public int getUltimosCuatroDigitos() {
        return ultimosCuatroDigitos;
    }

    public void setUltimosCuatroDigitos(int ultimosCuatroDigitos) {
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Tarjeta (últimos dígitos: " + ultimosCuatroDigitos + ") de " + getTitular() + " por $" + monto + " procesado con éxito.");
        } else {
            System.out.println("Error: El monto debe ser mayor que cero para procesar el pago con Tarjeta.");
        }
    }
}
