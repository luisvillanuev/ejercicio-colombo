import java.util.Scanner;

public class Ejercicio123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el capital:");
        double capital = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interés:");
        double tasaInteres = scanner.nextDouble() / 100; // Convertir a decimal

        System.out.println("Ingrese el número de días:");
        int dias = scanner.nextInt();

        double interesSimpleDiario = capital * tasaInteres * dias;
        double capitalFinal = capital + interesSimpleDiario;

        System.out.println("El capital final es: " + capitalFinal);

        scanner.close();
    }
}
