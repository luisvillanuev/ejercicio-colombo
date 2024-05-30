import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de mes:");
        int month = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int year = scanner.nextInt();

        int dias = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Mes no válido.");
        }

        System.out.println("El mes " + month + " del año " + year + " tiene " + dias + " días.");

        scanner.close();
    }
}