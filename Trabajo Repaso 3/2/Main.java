public class Main {
    
    public static void main(String[] args) {
        Tarjeta t1 = new Tarjeta("Mustafa Herrera", 1234);
        BilleteraVirtual bv1 = new BilleteraVirtual("Mustafa Herrera", "MercadoPago");

        System.out.println("--- Pruebas de pago válidas ---");
        t1.procesarPago(1500.50);
        bv1.procesarPago(850.00);

        System.out.println("\n--- Pruebas de pago con validación (monto <= 0) ---");
        t1.procesarPago(-50.0);
        bv1.procesarPago(0.0);
    }
}
