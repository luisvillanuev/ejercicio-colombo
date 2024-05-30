import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio197 {

    public static void main(String[] args) {
        String nombreArchivo = "estado_de_cuenta.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String nombre = datos[0];
                String numeroCuenta = datos[1];
                String movimientos = datos[2];
                String tiposMovimientos = datos[3];
                double saldo = Double.parseDouble(datos[4]);

                System.out.println("Nombre: " + nombre);
                System.out.println("Número de cuenta: " + numeroCuenta);
                System.out.println("Movimientos: " + movimientos);
                System.out.println("Tipos de movimientos: " + tiposMovimientos);
                System.out.println("Saldo: " + saldo);
                System.out.println("----------------------------------------");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}