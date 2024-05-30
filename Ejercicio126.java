import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha en formato AAAA MM DD:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // Array con los nombres de los meses
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        System.out.println(day + " " + meses[month] + " de " + year);

        scanner.close();
    }
}