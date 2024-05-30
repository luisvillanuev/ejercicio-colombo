import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        while (true) {
            System.out.println("Ingrese un número (0 para salir):");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            contador++;
        }
        System.out.println("Se han introducido " + contador + " números distintos de cero.");

        scanner.close();
    }
}