import java.util.Scanner;

public class Ejercicio148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 0;
        int suma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Ingrese un número (0 para terminar):");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            totalNumeros++;
            suma += numero;
            min = Math.min(min, numero);
            max = Math.max(max, numero);
        }

        double promedio = (double) suma / totalNumeros;

        System.out.println("Total de números ingresados: " + totalNumeros);
        System.out.println("Suma de los números ingresados: " + suma);
        System.out.println("Promedio de los números ingresados: " + promedio);
        System.out.println("Número mínimo: " + min);
        System.out.println("Número máximo: " + max);

        scanner.close();
    }
}