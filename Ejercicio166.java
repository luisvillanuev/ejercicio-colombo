import java.util.Scanner;

public class Ejercicio166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su estatura en metros:");
        double estatura = scanner.nextDouble();

        double imc = peso / (estatura * estatura);

        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);

        scanner.close();
    }
}