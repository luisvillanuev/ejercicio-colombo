import java.util.Scanner;

public class Ejercicio154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = "Hola que tal";
        System.out.println(frase);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println(frase + " " + nombre);

        scanner.close();
    }
}