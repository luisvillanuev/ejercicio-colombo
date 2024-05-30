import java.util.Scanner;

public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera cadena:");
        String cadena1 = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese la segunda cadena:");
        String cadena2 = scanner.nextLine().toUpperCase();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        scanner.close();
    }
}