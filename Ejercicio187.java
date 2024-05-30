import java.util.Scanner;

public class Ejercicio187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la posición actual de la reina (fila columna):");
        int filaActual = scanner.nextInt();
        int columnaActual = scanner.nextInt();
        System.out.println("Ingrese la posición a la que desea mover la reina (fila columna):");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();

        boolean movimientoValido = validarMovimientoReina(filaActual, columnaActual, filaDestino, columnaDestino);
        if (movimientoValido) {
            System.out.println("El movimiento de la reina es válido.");
        } else {
            System.out.println("El movimiento de la reina no es válido.");
        }

        scanner.close();
    }

    public static boolean validarMovimientoReina(int filaActual, int columnaActual, int filaDestino, int columnaDestino) {
        return filaActual == filaDestino || columnaActual == columnaDestino || Math.abs(filaDestino - filaActual) == Math.abs(columnaDestino - columnaActual);
    }
}