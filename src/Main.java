import java.util.Scanner;

class Calculadora {
    // Código de la clase

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nCalculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Conversión Celsius a Fahrenheit");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();