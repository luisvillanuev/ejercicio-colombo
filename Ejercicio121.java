import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("La suma de los 5 números es: " + suma);

        scanner.close();
    }
}