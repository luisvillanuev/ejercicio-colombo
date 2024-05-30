import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación de Matemáticas:");
        double matematicas = scanner.nextDouble();
        System.out.println("Ingrese la calificación de Inglés:");
        double ingles = scanner.nextDouble();
        System.out.println("Ingrese la calificación de Español:");
        double espanol = scanner.nextDouble();

        int materiasAprobadas = 0;

        if (matematicas >= 6) {
            materiasAprobadas++;
        }
        if (ingles >= 6) {
            materiasAprobadas++;
        }
        if (espanol >= 6) {
            materiasAprobadas++;
        }

        System.out.println("Promedio: " + (matematicas + ingles + espanol) / 3);
        System.out.println("Materias aprobadas: " + materiasAprobadas);
        System.out.println("Materia con menor calificación:");

        if (matematicas <= ingles && matematicas <= espanol) {
            System.out.println("Matemáticas: " + matematicas);
        } else if (ingles <= espanol) {
            System.out.println("Inglés: " + ingles);
        } else {
            System.out.println("Español: " + espanol);
        }

        scanner.close();
    }
}