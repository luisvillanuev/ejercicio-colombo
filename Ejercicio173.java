import java.util.Scanner;

public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalProductos = 0;
        double totalFactura = 0;

        while (true) {
            System.out.println("Introduzca la cantidad vendida:");
            int cantidad = scanner.nextInt();
            if (cantidad == 0) {
                break;
            }
            System.out.println("Introduzca el precio:");
            double precio = scanner.nextDouble();
            totalProductos += cantidad;
            totalFactura += cantidad * precio;
        }

        System.out.println("Total a pagar: $" + totalFactura);
        System.out.println("Cantidad total de productos: " + totalProductos);

        scanner.close();
    }
}