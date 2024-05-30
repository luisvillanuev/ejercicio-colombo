import java.util.Scanner;

public class Ejercicio199 {

    private static final int TABLERO_TAMANO = 8;
    private static char[][] tablero = new char[TABLERO_TAMANO][TABLERO_TAMANO];
    private static int puntosJugador1 = 0;
    private static int puntosJugador2 = 0;

    public static void main(String[] args) {
        inicializarTablero();
        imprimirTablero();

        Scanner scanner = new Scanner(System.in);
        int turno = 1; // Turno del jugador 1 (blancas)
        while (true) {
            int[] movimiento = obtenerMovimiento(scanner, turno);
            if (validarMovimiento(movimiento, turno)) {
                ejecutarMovimiento(movimiento);
                imprimirTablero();
                if (turno == 1) {
                    turno = 2;
                } else {
                    turno = 1;
                }
            } else {
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }
            if (puntosJugador1 >= 8 || puntosJugador2 >= 8) {
                break;
            }
        }

        System.out.println("Fin del juego.");
        System.out.println("Puntos del jugador 1 (blancas): " + puntosJugador1);
        System.out.println("Puntos del jugador 2 (negras): " + puntosJugador2);
        scanner.close();
    }

    private static void inicializarTablero() {
        // Inicializar el tablero con las piezas
        for (int i = 0; i < TABLERO_TAMANO; i++) {
            tablero[1][i] = 'p'; // Peones blancos
            tablero[TABLERO_TAMANO - 2][i] = 'P'; // Peones negros
        }
    }

    private static void imprimirTablero() {
        System.out.println("-------------------------");
        for (int i = 0; i < TABLERO_TAMANO; i++) {
            for (int j = 0; j < TABLERO_TAMANO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    private static int[] obtenerMovimiento(Scanner scanner, int turno) {
        System.out.println("Turno del jugador " + turno + " (" + (turno == 1 ? "blancas" : "negras") + ")");
        System.out.print("Ingrese la fila de origen (1-8): ");
        int filaOrigen = scanner.nextInt() - 1;
        System.out.print("Ingrese la columna de origen (1-8): ");
        int columnaOrigen = scanner.nextInt() - 1;
        System.out.print("Ingrese la fila de destino (1-8): ");
        int filaDestino = scanner.nextInt() - 1;
        System.out.print("Ingrese la columna de destino (1-8): ");
        int columnaDestino = scanner.nextInt() - 1;
        return new int[] { filaOrigen, columnaOrigen, filaDestino, columnaDestino };
    }

    private static boolean validarMovimiento(int[] movimiento, int turno) {
        int filaOrigen = movimiento[0];
        int columnaOrigen = movimiento[1];
        int filaDestino = movimiento[2];
        int columnaDestino = movimiento[3];

        // Validar que las coordenadas estén dentro del tablero
        if (filaOrigen < 0 || filaOrigen >= TABLERO_TAMANO || columnaOrigen < 0 || columnaOrigen >= TABLERO_TAMANO
                || filaDestino < 0 || filaDestino >= TABLERO_TAMANO || columnaDestino < 0
                || columnaDestino >= TABLERO_TAMANO) {
            return false;
        }

        // Validar que la pieza en la posición de origen sea un peón y que esté en el lado correcto del tablero
        char piezaOrigen = tablero[filaOrigen][columnaOrigen];
        if ((turno == 1 && piezaOrigen != 'p') || (turno == 2 && piezaOrigen != 'P')) {
            return false;
        }

        // Validar movimiento válido para el peón
        if ((turno == 1 && filaDestino == filaOrigen + 1 && columnaDestino == columnaOrigen)
                || (turno == 2 && filaDestino == filaOrigen - 1 && columnaDestino == columnaOrigen)) {
            // Movimiento válido hacia adelante
            return true;
        } else if ((turno == 1 && filaDestino == filaOrigen + 1 && Math.abs(columnaDestino - columnaOrigen) == 1)
                || (turno == 2 && filaDestino == filaOrigen - 1 && Math.abs(columnaDestino - columnaOrigen) == 1)) {
            // Movimiento válido para "comer" una pieza rival
            char piezaDestino = tablero[filaDestino][columnaDestino];
            if ((turno == 1 && Character.isUpperCase(piezaDestino))
                    || (turno == 2 && Character.isLowerCase(piezaDestino))) {
                return true;
            }
        }

        return false;
    }

    private static void ejecutarMovimiento(int[] movimiento) {
        int filaOrigen = movimiento[0];
        int columnaOrigen = movimiento[1];
        int filaDestino = movimiento[2];
        int columnaDestino = movimiento[3];

        char piezaOrigen = tablero[filaOrigen][columnaOrigen];
        char piezaDestino = tablero[filaDestino][columnaDestino];

        // Mover la pieza al destino
        tablero[filaDestino][columnaDestino] = piezaOrigen;
        tablero[filaOrigen][columnaOrigen] = '.';

        // Sumar puntos si se "come" una pieza rival
        if (Character.isLowerCase(piezaOrigen) && Character.isUpperCase(piezaDestino)) {
            puntosJugador1++;
        } else if (Character.isUpperCase(piezaOrigen) && Character.isLowerCase(piezaDestino)) {
            puntosJugador2++;
        }
    }
}