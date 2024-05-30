import java.util.Scanner;

public class Ejercicio198 {

    // Tamaño del tablero de Sudoku
    public static final int TAMANO = 9;

    public static void main(String[] args) {
        int[][] tablero = generarTablero();
        imprimirTablero(tablero);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la fila (1-9) o 0 para salir:");
            int fila = scanner.nextInt();
            if (fila == 0) {
                break;
            }

            System.out.println("Ingrese la columna (1-9):");
            int columna = scanner.nextInt();

            System.out.println("Ingrese el número (1-9):");
            int numero = scanner.nextInt();

            if (!esValido(tablero, fila - 1, columna - 1, numero)) {
                System.out.println("¡Movimiento inválido! Intente nuevamente.");
                continue;
            }

            tablero[fila - 1][columna - 1] = numero;
            imprimirTablero(tablero);

            if (estaCompleto(tablero)) {
                System.out.println("¡Felicidades! Has completado el Sudoku.");
                break;
            }
        }

        scanner.close();
    }

    // Genera un tablero de Sudoku aleatorio
    public static int[][] generarTablero() {
        int[][] tablero = new int[TAMANO][TAMANO];
        // Aquí puedes implementar un algoritmo para generar un tablero válido
        // Por simplicidad, este ejemplo simplemente crea un tablero vacío
        return tablero;
    }

    // Imprime el tablero de Sudoku
    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verifica si un movimiento es válido
    public static boolean esValido(int[][] tablero, int fila, int columna, int numero) {
        // Verificar fila y columna
        for (int i = 0; i < TAMANO; i++) {
            if (tablero[fila][i] == numero || tablero[i][columna] == numero) {
                return false;
            }
        }

        // Verificar subcuadrícula 3x3
        int subFilaInicio = fila - fila % 3;
        int subColumnaInicio = columna - columna % 3;
        for (int i = subFilaInicio; i < subFilaInicio + 3; i++) {
            for (int j = subColumnaInicio; j < subColumnaInicio + 3; j++) {
                if (tablero[i][j] == numero) {
                    return false;
                }
            }
        }

        return true;
    }

    // Verifica si el tablero está completo
    public static boolean estaCompleto(int[][] tablero) {
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (tablero[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}