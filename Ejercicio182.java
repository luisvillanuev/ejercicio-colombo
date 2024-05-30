import java.util.Scanner;

public class Ejercicio182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número (menor o igual a 1000): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 1000) {
            String numeroRomano = convertirANumeroRomano(numero);
            System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
        } else {
            System.out.println("El número ingresado debe estar entre 1 y 1000.");
        }

        scanner.close();
    }

    public static String convertirANumeroRomano(int numero) {
        String[] simbolos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] valores = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder resultado = new StringBuilder();

        int i = valores.length - 1;
        while (numero > 0) {
            int divisor = numero / valores[i];
            numero %= valores[i];
            while (divisor > 0) {
                resultado.append(simbolos[i]);
                divisor--;
            }
            i--;
        }
        return resultado.toString();
    }
}