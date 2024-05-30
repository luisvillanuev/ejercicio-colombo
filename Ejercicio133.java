import java.util.Scanner;

public class Ejercicio133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("El número mayor es: " + Math.max(num1, num2));
            System.out.println("El número menor es: " + Math.min(num1, num2));
        }

        scanner.close();
    }
}