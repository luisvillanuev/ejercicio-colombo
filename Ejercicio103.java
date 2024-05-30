import java.util.Scanner;

public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        int menor = encontrarMenor(num1, num2, num3);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }

    public static int encontrarMenor(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
