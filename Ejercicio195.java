import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio195 {

    public static void main(String[] args) {
        int[] arreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
        int elementoBuscado;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el elemento que desea buscar: ");
        elementoBuscado = scanner.nextInt();

        int indice = busquedaBinaria(arreglo, elementoBuscado);

        if (indice != -1) {
            System.out.println("Elemento encontrado en el índice " + indice + ".");
            System.out.println("Cantidad de comparaciones realizadas: " + (indice + 1));
        } else {
            System.out.println("El elemento no se encuentra en el arreglo.");
            System.out.println("Cantidad de comparaciones realizadas: " + arreglo.length);
        }
    }

    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el elemento está presente en el medio
            if (arreglo[medio] == elemento) {
                return medio;
            }

            // Si el elemento es mayor, ignoramos la mitad izquierda del arreglo
            if (arreglo[medio] < elemento) {
                izquierda = medio + 1;
            }
            // Si el elemento es menor, ignoramos la mitad derecha del arreglo
            else {
                derecha = medio - 1;
            }
        }

        // Si el elemento no está presente en el arreglo
        return -1;
    }
}