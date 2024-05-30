import java.util.Scanner;

public class Ejercicio175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato AAAA-MM-DD:");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split("-");

        int año = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int dia = Integer.parseInt(partes[2]);

        if (dia > 1) {
            dia--;
        } else {
            if (mes == 1) {
                mes = 12;
                año--;
            } else {
                mes--;
            }
            dia = ultimoDiaMes(mes, año);
        }

        System.out.println("La fecha del día anterior es: " + año + "-" + String.format("%02d", mes) + "-"
                + String.format("%02d", dia));

        scanner.close();
    }

    static int ultimoDiaMes(int mes, int año) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) ? 29 : 28;
            default:
                return -1;
        }
    }
}
