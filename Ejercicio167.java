import java.util.Scanner;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 0;
        int suma = 0;

        while (true) {
            System.out.println("Ingrese un número (0 para terminar):");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            totalNumeros++;
            suma += numero;
        }

        if (totalNumeros == 0) {
            System.out.println("No se ha ingresado ningún número.");
        } else {
            double promedio = (double) suma / totalNumeros;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        }

        scanner.close();
    }
}
