import java.util.Scanner;

public class Ejercicio190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las denominaciones monetarias
        int[] denominaciones = {1, 5, 10, 50, 100};
        int[] cantidades = {100, 200, 300, 500, 1000};

        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de billetes/monedas de $" + denominaciones[i] + ": " + cantidades[i]);
        }

        // Solicitar la cantidad total a pagar
        System.out.println("\nIngrese el monto total a pagar:");
        int totalPagar = scanner.nextInt();

        // Solicitar el monto pagado por el cliente
        System.out.println("Ingrese la cantidad pagada por el cliente:");
        int montoPagado = scanner.nextInt();

        // Calcular el cambio a devolver
        int cambio = montoPagado - totalPagar;
        System.out.println("El cambio a devolver es: $" + cambio);

        // Calcular las denominaciones monetarias para el cambio
        System.out.println("Denominaciones monetarias para el cambio:");
        for (int i = 4; i >= 0; i--) {
            int cantidadDenominacion = cambio / denominaciones[i];
            if (cantidadDenominacion > 0) {
                System.out.println("$" + denominaciones[i] + ": " + cantidadDenominacion);
                cambio %= denominaciones[i];
            }
        }

        scanner.close();
    }
}