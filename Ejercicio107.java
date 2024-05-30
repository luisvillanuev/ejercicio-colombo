import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        if (edad >= 18 && edad <= 100) {
            System.out.println("Es mayor de edad.");
        } else if (edad >= 1 && edad <= 17) {
            System.out.println("Es menor de edad.");
        } else {
            System.out.println("Edad no válida.");
        }

        scanner.close();
    }
}
