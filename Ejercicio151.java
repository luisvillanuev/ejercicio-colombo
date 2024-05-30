import java.util.Scanner;

public class Ejercicio151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = scanner.nextLine();

        if (cadena.length() > 10) {
            System.out.println("La cadena ingresada es: " + cadena);
        } else {
            System.out.println("La cadena ingresada no supera los 10 caracteres.");
        }

        scanner.close();
    }
}