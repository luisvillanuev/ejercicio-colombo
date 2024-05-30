import java.util.Scanner;

public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Línea de autobuses ADO, seleccione su destino:");
        System.out.println("a) Cartagena. [$150]");
        System.out.println("b) Barranquilla. [$320]");
        System.out.println("c) Sincelejo. [$120]");
        System.out.println("d) Valledupar. [$90]");
        System.out.println("e) Santa Marta.[$110]");

        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Su destino es \"Cartagena\", tiempo de traslado 2 hrs, costo $200.");
                break;
            case 'b':
                System.out.println("Su destino es \"Barranquilla\", tiempo de traslado 4 hrs, costo $320.");
                break;
            case 'c':
                System.out.println("Su destino es \"Sincelejo\", tiempo de traslado 3 hrs, costo $120.");
                break;
            case 'd':
                System.out.println("Su destino es \"Valledupar\", tiempo de traslado 6 hrs, costo $90.");
                break;
            case 'e':
                System.out.println("Su destino es \"Santa Marta\", tiempo de traslado 5 hrs, costo $110.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}