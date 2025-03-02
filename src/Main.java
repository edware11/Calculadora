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
            if (opcion >= 1 && opcion <= 7) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                double num2 = 0;
                if (opcion != 6) {
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                }
                switch (opcion) {
                    case 1: System.out.println("Resultado: " + (num1 + num2)); break;
                    case 2: System.out.println("Resultado: " + (num1 - num2)); break;
                    case 3: System.out.println("Resultado: " + (num1 * num2)); break;
                    case 4: System.out.println("Resultado: " + (num2 != 0 ? (num1 / num2) : "Error: División por cero")); break;
                    case 5: System.out.println("Resultado: " + Math.pow(num1, num2)); break;
                    case 6: System.out.println("Resultado: " + Math.sqrt(num1)); break;
                    case 7: System.out.println("Resultado: " + (num1 % num2)); break;
                }
} else if (opcion == 8) {
                System.out.print("Ingrese la temperatura en grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Resultado: " + fahrenheit + "°F");
            } else if (opcion != 9) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

        System.out.println("Calculadora finalizada.");
        scanner.close();
    }
}                
