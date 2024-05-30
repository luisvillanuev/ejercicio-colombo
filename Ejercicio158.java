import java.util.Scanner;

public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = scanner.nextLine().toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < cadena.length(); j++) {
            char letra = cadena.charAt(j);
            switch (letra) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("Cantidad de ocurrencias de 'a': " + a);
        System.out.println("Cantidad de ocurrencias de 'e': " + e);
        System.out.println("Cantidad de ocurrencias de 'i': " + i);
        System.out.println("Cantidad de ocurrencias de 'o': " + o);
        System.out.println("Cantidad de ocurrencias de 'u': " + u);

        scanner.close();
    }
}
