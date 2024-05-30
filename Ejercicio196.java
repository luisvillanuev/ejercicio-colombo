import java.util.Scanner;

public class Ejercicio196 {

    public static void main(String[] args) {
        double[][] ingresos = new double[18][10];
        Scanner scanner = new Scanner(System.in);

        // Capturar los ingresos de cada vendedor para cada producto
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese los ingresos del vendedor " + (i + 1) + " para el producto " + (j + 1) + ": ");
                ingresos[i][j] = scanner.nextDouble();
            }
        }

        // Revisar el total de cada vendedor
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            System.out.println("Total de ingresos del vendedor " + (i + 1) + ": " + totalVendedor);
        }

        // Ver el promedio por cada producto
        System.out.println("\nPromedio de ingresos por producto:");
        for (int j = 0; j < 10; j++) {
            double totalProducto = 0;
            for (int i = 0; i < 18; i++) {
                totalProducto += ingresos[i][j];
            }
            double promedioProducto = totalProducto / 18;
            System.out.println("Producto " + (j + 1) + ": " + promedioProducto);
        }

        // Calcular el promedio por vendedor
        System.out.println("\nPromedio de ingresos por vendedor:");
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            double promedioVendedor = totalVendedor / 10;
            System.out.println("Vendedor " + (i + 1) + ": " + promedioVendedor);
        }

        // Calcular los ingresos totales
        double ingresosTotales = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                ingresosTotales += ingresos[i][j];
            }
        }
        System.out.println("\nIngresos totales: " + ingresosTotales);
    }
}