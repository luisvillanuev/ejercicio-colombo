import java.util.Random;
import java.util.Scanner;

public class Ejercicio149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("Adivina el número (entre 1 y 100):");

        while (true) {
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroAleatorio) {
                System.out.println("¡Correcto! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
                break;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número que has ingresado es menor.");
            } else {
                System.out.println("El número que has ingresado es mayor.");
            }
        }

        scanner.close();
    }
}