package Ej5;

public class mainFormas {

	public static void main(String[] args) {

		Triangulo t = new Triangulo();
		t.setBase(8.0);
		t.setAltura(5.0);
		
		Rectangulo r = new Rectangulo();
		r.setBase(9.0);
		r.setAltura(5.0);
		
		System.out.println("El área del triángulo es: " + t.calcularArea());
		System.out.println("El área del rectángulo es: " + r.calcularArea());
	}
}
