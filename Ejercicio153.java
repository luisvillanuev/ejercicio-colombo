import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera cadena:");
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena:");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            int comparacion = cadena1.compareTo(cadena2);
            if (comparacion < 0) {
                System.out.println("La primera cadena es menor alfabéticamente.");
            } else {
                System.out.println("La segunda cadena es menor alfabéticamente.");
            }
        }

        scanner.close();
    }
}