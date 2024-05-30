import java.util.Scanner;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el límite superior:");
        int limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}