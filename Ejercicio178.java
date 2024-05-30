import java.util.Scanner;

public class Ejercicio178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos:");
        int duracion = scanner.nextInt();

        double costoTotal = 0;

        if (duracion <= 3) {
            costoTotal = duracion * 3;
        } else if (duracion <= 7) {
            costoTotal = 3 * 3 + (duracion - 3) * 4.5;
        } else {
            costoTotal = 3 * 3 + 4 * 4.5 + (duracion - 7) * 6;
        }

        System.out.println("El costo total de la llamada es: $" + costoTotal);

        scanner.close();
    }
}
