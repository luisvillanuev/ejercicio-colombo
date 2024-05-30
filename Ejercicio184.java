import java.util.Scanner;

public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar datos del usuario
        System.out.println("Ingrese su nombre completo:");
        String nombre = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese su fecha de nacimiento (en formato YYYYMMDD):");
        String fechaNacimiento = scanner.nextLine();

        // Obtener las iniciales del nombre
        StringBuilder iniciales = new StringBuilder();
        String[] palabras = nombre.split("\\s+");
        for (String palabra : palabras) {
            iniciales.append(palabra.charAt(0));
        }

        // Formatear fecha de nacimiento
        String fecha = fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(4, 6) + fechaNacimiento.substring(6);

        // Generar homoclave aleatoria (3 caracteres alfanuméricos)
        String homoclave = generarHomoclave();

        // Generar RFC
        String rfc = iniciales.toString() + fecha + homoclave;

        // Imprimir RFC generado
        System.out.println("RFC generado: " + rfc);

        scanner.close();
    }

    // Método para generar una homoclave aleatoria
    private static String generarHomoclave() {
        StringBuilder homoclave = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * caracteres.length());
            homoclave.append(caracteres.charAt(index));
        }
        return homoclave.toString();
    }
}