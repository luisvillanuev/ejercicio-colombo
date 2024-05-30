import java.util.Scanner;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        String reversa = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            reversa += palabra.charAt(i);
        }

        if (palabra.equalsIgnoreCase(reversa)) {
            System.out.println("La palabra ingresada es palíndroma.");
        } else {
            System.out.println("La palabra ingresada no es palíndroma.");
        }

        scanner.close();
    }
}