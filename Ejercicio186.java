import java.util.Scanner;

public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = scanner.nextLine();
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
        scanner.close();
    }

    public static String invertirCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }
}