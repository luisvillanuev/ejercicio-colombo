import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la primera variable:");
        int a = scanner.nextInt();
        System.out.println("Ingrese el valor de la segunda variable:");
        int b = scanner.nextInt();

        System.out.println("Valores originales:");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores intercambiados:");
        System.out.println("a = " + a + ", b = " + b);

        scanner.close();
    }
}