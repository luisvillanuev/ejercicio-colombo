import java.util.Scanner;

public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador de la primera fracción:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la primera fracción:");
        int den1 = scanner.nextInt();
        System.out.println("Ingrese el numerador de la segunda fracción:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la segunda fracción:");
        int den2 = scanner.nextInt();

        if (den1 != den2) {
            System.out.println("Las fracciones deben tener el mismo denominador para realizar la operación.");
        } else {
            int sumaNum = num1 + num2;
            int restaNum = num1 - num2;
            int denComun = den1;

            System.out.println("Suma de las fracciones: " + sumaNum + "/" + denComun);
            System.out.println("Resta de las fracciones: " + restaNum + "/" + denComun);
        }

        scanner.close();
    }
}