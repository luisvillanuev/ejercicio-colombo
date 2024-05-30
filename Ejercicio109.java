import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la venta:");
        double montoVenta = scanner.nextDouble();

        if (montoVenta > 1000) {
            double descuento = montoVenta * 0.10; // 10% de descuento
            double montoNeto = montoVenta - descuento;
            System.out.println("Monto neto de la venta: $" + montoNeto);
        } else {
            System.out.println("Monto neto de la venta: $" + montoVenta);
        }

        scanner.close();
    }
}