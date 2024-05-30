import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres:");
        String cadena1 = scanner.nextLine();

        char[] arreglo = cadena1.toCharArray();
        char[] copia = new char[arreglo.length];

        System.arraycopy(arreglo, 0, copia, 0, arreglo.length);
        String cadena2 = new String(copia);

        System.out.println("Cadena original: " + cadena1);
        System.out.println("Copia de la cadena: " + cadena2);

        scanner.close();
    }
}