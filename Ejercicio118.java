import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el monto del artículo " + i + ":");
            double monto = scanner.nextDouble();
            total += monto;
        }
        System.out.println("El monto total a pagar es: $" + total);

        scanner.close();
    }
}
