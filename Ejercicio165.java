import java.util.Scanner;

public class Ejercicio165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas:");
        int horas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de minutos:");
        int minutos = scanner.nextInt();
        System.out.println("Ingrese la cantidad de segundos:");
        int segundos = scanner.nextInt();

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.println("El tiempo ingresado equivale a " + totalSegundos + " segundos.");

        scanner.close();
    }
}
