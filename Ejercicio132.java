import java.util.Scanner;

public class Ejercicio132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000;

        while (true) {
            System.out.println("Saldo actual: " + saldo);
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción:");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo final: " + saldo);
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
