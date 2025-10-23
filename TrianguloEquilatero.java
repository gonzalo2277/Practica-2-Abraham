public class TrianguloEquilatero {
    private double lado;

    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 3 * lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(5.0);

        System.out.println("Perímetro del triángulo equilátero: " + triangulo.calcularPerimetro());
        System.out.println("Área del triángulo equilátero: " + triangulo.calcularArea());
    }
}
