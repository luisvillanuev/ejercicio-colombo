import java.util.Scanner;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String saludo = "Hola usuario!";
        char continuar;

        do {
            System.out.println(saludo);
            System.out.println("¿Desea que siga imprimiendo el texto? [S/N]");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
