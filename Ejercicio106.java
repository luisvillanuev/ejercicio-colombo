import java.util.Scanner;

public class Ejercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int m = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int n = scanner.nextInt();

        int mcd = encontrarMCD(m, n);
        System.out.println("El máximo común divisor es: " + mcd);

        scanner.close();
    }

    public static int encontrarMCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}