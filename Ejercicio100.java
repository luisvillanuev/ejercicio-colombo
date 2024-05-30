import java.util.Scanner;

public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        if (suma % 2 == 0) {
            System.out.println("La suma de la serie es par.");
        } else {
            System.out.println("La suma de la serie es impar.");
        }

        scanner.close();
    }
}
