package Ejercicio2;

public class Ejercicio2 {

	public static class Vehiculo {
        private String marca;
        private String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

    public static class Auto extends Vehiculo {
        private int cant_Puertas;

        public Auto(String marca, String modelo, int cant_Puertas) {
            super(marca, modelo);
            this.cant_Puertas = cant_Puertas;
        }

        public int getCant_Puertas() {
            return cant_Puertas;
        }

        public void setCant_Puertas(int cant_Puertas) {
            this.cant_Puertas = cant_Puertas;
        }

        public void mostrarInfo() {
            System.out.println("Marca: " + getMarca());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Cantidad de puertas: " + cant_Puertas);
        }
    }

    public static void main(String[] args) {
        Auto miAuto = new Auto("MBMW", "1G", 4);
        miAuto.mostrarInfo();
    }
}
