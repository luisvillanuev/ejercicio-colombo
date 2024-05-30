import java.util.Scanner;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha en formato MM-AAAA:");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split("-");

        int mes = Integer.parseInt(partes[0]);
        int año = Integer.parseInt(partes[1]);

        for (int i = 0; i < 12; i++) {
            if (mes == 1) {
                mes = 12;
                año--;
            } else {
                mes--;
            }
            System.out.println(String.format("%02d", mes) + "-" + año);
        }

        scanner.close();
    }
}