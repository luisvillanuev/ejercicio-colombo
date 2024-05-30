import java.util.Scanner;

public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String contrasenaCorrecta = "passwd";
        int intentos = 0;

        while (intentos < 3) {
            System.out.println("Ingrese la contraseña:");
            String contrasena = scanner.nextLine();
            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Contraseña aceptada.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
                intentos++;
            }
        }

        if (intentos == 3) {
            System.out.println("Intentos excedidos.");
        }

        scanner.close();
    }
}