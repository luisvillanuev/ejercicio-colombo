import java.util.Scanner;

public class Ejercicio141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su raíz cuadrada:");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        scanner.close();
    }
}