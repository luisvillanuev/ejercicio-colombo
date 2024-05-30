import java.util.Scanner;

public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Ingrese el área o departamento:");
        String departamento = scanner.nextLine();

        String[] partesNombre = nombreCompleto.split(" ");
        String nombreUsuario = "";

        for (String parte : partesNombre) {
            nombreUsuario += parte.charAt(0);
        }

        nombreUsuario += departamento.substring(0, Math.min(departamento.length(), 3));

        System.out.println("Nombre de usuario generado: " + nombreUsuario.toLowerCase());

        scanner.close();
    }
}
