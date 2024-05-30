import java.util.Scanner;

public class Ejercicio145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado 1 del triángulo:");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el lado 2 del triángulo:");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el lado 3 del triángulo:");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados dados no forman un triángulo.");
        }

        scanner.close();
    }
}