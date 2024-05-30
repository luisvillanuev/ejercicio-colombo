import java.util.Scanner;

public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine().toLowerCase();

        int totalVocales = 0;
        int[] contadorVocales = new int[5]; // Se consideran solo las vocales a, e, i, o, u

        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            if (letra == 'a') {
                contadorVocales[0]++;
                totalVocales++;
            } else if (letra == 'e') {
                contadorVocales[1]++;
                totalVocales++;
            } else if (letra == 'i') {
                contadorVocales[2]++;
                totalVocales++;
            } else if (letra == 'o') {
                contadorVocales[3]++;
                totalVocales++;
            } else if (letra == 'u') {
                contadorVocales[4]++;
                totalVocales++;
            }
        }

        System.out.println("Total de vocales: " + totalVocales);
        System.out.println("Vocal 'a' : " + contadorVocales[0]);
        System.out.println("Vocal 'e' : " + contadorVocales[1]);
        System.out.println("Vocal 'i' : " + contadorVocales[2]);
        System.out.println("Vocal 'o' : " + contadorVocales[3]);
        System.out.println("Vocal 'u' : " + contadorVocales[4]);

        scanner.close();
    }
}
