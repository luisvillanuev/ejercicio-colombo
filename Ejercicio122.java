import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int numero;
        do {
            System.out.println("Ingrese un número (0 para salir):");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}