import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifa = scanner.nextDouble();

        double salario;

        if (horas > 40) {
            double horasExtra = horas - 40;
            salario = 40 * tarifa + horasExtra * tarifa * 1.5;
        } else {
            salario = horas * tarifa;
        }

        System.out.println("El salario del trabajador es: " + salario);

        scanner.close();
    }
}