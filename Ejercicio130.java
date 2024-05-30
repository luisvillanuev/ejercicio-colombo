import java.util.Scanner;

public class Ejercicio130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el capital:");
        double capital = scanner.nextDouble();

        System.out.println("Ingrese el plazo de pago en meses (12 o 24):");
        int meses = scanner.nextInt();

        double interes = 0.02;
        double totalPagar = capital;

        for (int i = 1; i <= meses; i++) {
            totalPagar += totalPagar * interes;
        }

        System.out.println("El monto total a pagar es: " + totalPagar);

        scanner.close();
    }
}
