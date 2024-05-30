import java.util.Scanner;

public class Ejercicio135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int cantidad = scanner.nextInt();

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = scanner.nextInt();
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}