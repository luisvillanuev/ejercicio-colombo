import java.util.Scanner;

public class Ejercicio162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para mostrar su tabla de multiplicar:");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
