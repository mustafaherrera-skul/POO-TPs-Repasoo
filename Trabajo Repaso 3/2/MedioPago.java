public class MedioPago {
    private String titular;

    public MedioPago(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Procesando pago por $" + monto);
        } else {
            System.out.println("Error: El monto debe ser mayor que cero.");
        }
    }
}
