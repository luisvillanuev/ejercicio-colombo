import java.util.Scanner;

public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número límite para la serie Fibonacci:");
        int limite = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int suma;

        System.out.print("Serie Fibonacci hasta " + limite + ": " + num1 + " " + num2 + " ");

        while (num1 + num2 <= limite) {
            suma = num1 + num2;
            System.out.print(suma + " ");
            num1 = num2;
            num2 = suma;
        }

        scanner.close();
    }
}