import java.util.Scanner;

public class Ejercicio110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura del día:");
        int temperatura = scanner.nextInt();

        if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("Mucho Frío");
        } else if (temperatura >= 11 && temperatura <= 18) {
            System.out.println("Frío");
        } else if (temperatura >= 19 && temperatura <= 25) {
            System.out.println("Templado");
        } else if (temperatura >= 26 && temperatura <= 40) {
            System.out.println("Calor");
        } else {
            System.out.println("Temperatura no válida");
        }

        scanner.close();
    }
}