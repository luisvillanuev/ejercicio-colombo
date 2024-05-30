import java.util.Scanner;

public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la posición actual del caballo (fila columna):");
        int filaActual = scanner.nextInt();
        int columnaActual = scanner.nextInt();
        System.out.println("Ingrese la posición a la que desea mover el caballo (fila columna):");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();

        boolean movimientoValido = validarMovimientoCaballo(filaActual, columnaActual, filaDestino, columnaDestino);
        if (movimientoValido) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }

        scanner.close();
    }

    public static boolean validarMovimientoCaballo(int filaActual, int columnaActual, int filaDestino, int columnaDestino) {
        int filaDiferencia = Math.abs(filaDestino - filaActual);
        int columnaDiferencia = Math.abs(columnaDestino - columnaActual);
        return (filaDiferencia == 2 && columnaDiferencia == 1) || (filaDiferencia == 1 && columnaDiferencia == 2);
    }
}