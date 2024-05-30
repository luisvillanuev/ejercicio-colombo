import java.util.Scanner;

public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el transporte:");
        System.out.println("1) Motocicleta");
        System.out.println("2) Automóvil");
        System.out.println("3) Pickup");
        int opcion = scanner.nextInt();

        double rendimiento;
        switch (opcion) {
            case 1:
                rendimiento = 20; // km/lt
                break;
            case 2:
                rendimiento = 10; // km/lt
                break;
            case 3:
                rendimiento = 5; // km/lt
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        double distancia = 500; // km
        double precioGasolina = 4.5; // precio por litro
        double gasolinaRequerida = distancia / rendimiento;
        double costoTotal = gasolinaRequerida * precioGasolina;

        System.out.println("El gasto total de gasolina es: $" + costoTotal);

        scanner.close();
    }
}