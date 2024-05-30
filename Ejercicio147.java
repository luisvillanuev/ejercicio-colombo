import java.util.Scanner;

public class Ejercicio147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlumnos = 5;
        int aprobaronTodos = 0;
        int aprobaronAlMenosUno = 0;
        int aprobaronUltimo = 0;

        for (int i = 1; i <= totalAlumnos; i++) {
            System.out.println("Ingrese la nota del alumno " + i + " en el primer examen:");
            int examen1 = scanner.nextInt();
            System.out.println("Ingrese la nota del alumno " + i + " en el segundo examen:");
            int examen2 = scanner.nextInt();
            System.out.println("Ingrese la nota del alumno " + i + " en el tercer examen:");
            int examen3 = scanner.nextInt();

            if (examen1 >= 10 && examen2 >= 10 && examen3 >= 10) {
                aprobaronTodos++;
            }
            if (examen1 >= 10 || examen2 >= 10 || examen3 >= 10) {
                aprobaronAlMenosUno++;
            }
            if (examen3 >= 10 && examen1 < 10 && examen2 < 10) {
                aprobaronUltimo++;
            }
        }

        System.out.println("Alumnos que aprobaron todos los exámenes: " + aprobaronTodos);
        System.out.println("Alumnos que aprobaron al menos un examen: " + aprobaronAlMenosUno);
        System.out.println("Alumnos que aprobaron únicamente el último examen: " + aprobaronUltimo);

        scanner.close();
    }
}