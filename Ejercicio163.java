import java.util.Scanner;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double b = scanner.nextDouble();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Residuo: " + (a % b));

        scanner.close();
    }
}