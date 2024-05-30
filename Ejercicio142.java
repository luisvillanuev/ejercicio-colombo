import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la potencia:");
        double exponente = scanner.nextDouble();

        double resultado = Math.pow(base, exponente);

        System.out.println(base + " elevado a la potencia " + exponente + " es: " + resultado);

        scanner.close();
    }
}