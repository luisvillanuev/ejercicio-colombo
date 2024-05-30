import java.util.Scanner;

public class Ejercicio140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Salir");
            System.out.println("2. Sumatoria");
            System.out.println("3. Factorial");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.println("Ingrese un número:");
            int numero = scanner.nextInt();

            switch (opcion) {
                case 2:
                    int sumatoria = 0;
                    for (int i = 1; i <= numero; i++) {
                        sumatoria += i;
                    }
                    System.out.println("La sumatoria de " + numero + " es: " + sumatoria);
                    break;
                case 3:
                    int factorial = 1;
                    for (int i = 1; i <= numero; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " + numero + " es: " + factorial);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}