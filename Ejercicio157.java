import java.util.Scanner;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        if (nombre.startsWith("A")) {
            nombre = nombre.toLowerCase();
        }

        System.out.println("Nombre modificado: " + nombre);

        scanner.close();
    }
}