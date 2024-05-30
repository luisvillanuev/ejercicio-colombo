import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio192 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto (máximo 255 caracteres):");
        String texto = scanner.nextLine();
        if (texto.length() > 255) {
            System.out.println("El texto excede los 255 caracteres.");
            return;
        }

        String nombreArchivo = "texto.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write(texto);
            System.out.println("El texto se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}