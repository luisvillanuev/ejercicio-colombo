import java.util.Scanner;

public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Ingrese la edad de la persona (-1 para terminar):");
            int edad = scanner.nextInt();
            if (edad == -1) {
                break;
            }
            totalPersonas++;

            System.out.println("Ingrese el sexo de la persona (H para hombre, M para mujer):");
            char sexo = scanner.next().charAt(0);
            if (sexo == 'H' || sexo == 'h') {
                totalHombres++;
                sumaEdadesHombres += edad;
            } else if (sexo == 'M' || sexo == 'm') {
                totalMujeres++;
                sumaEdadesMujeres += edad;
            } else {
                System.out.println("Sexo no válido.");
                totalPersonas--;
            }

            if (edad < edadMasJoven) {
                edadMasJoven = edad;
            }
        }

        if (totalPersonas == 0) {
            System.out.println("No se ingresaron datos.");
        } else {
            System.out.println("Total de personas en la fiesta: " + totalPersonas);
            System.out.println("Hombres: " + totalHombres);
            System.out.println("Mujeres: " + totalMujeres);
            System.out.println("Promedio de edad de hombres: " + (double) sumaEdadesHombres / totalHombres);
            System.out.println("Promedio de edad de mujeres: " + (double) sumaEdadesMujeres / totalMujeres);
            System.out.println("Edad de la persona más joven: " + edadMasJoven);
        }

        scanner.close();
    }
}