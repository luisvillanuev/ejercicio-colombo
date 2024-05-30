import java.util.Scanner;

public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar datos del usuario
        System.out.println("Ingrese su primer apellido:");
        String apellido1 = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese su segundo apellido:");
        String apellido2 = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese su nombre(s):");
        String nombre = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese su fecha de nacimiento (en formato YYYYMMDD):");
        String fechaNacimiento = scanner.nextLine();

        System.out.println("Ingrese su sexo (F o M):");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Ingrese las dos letras correspondientes a su entidad de nacimiento:");
        String entidadNacimiento = scanner.nextLine().toUpperCase();

        // Obtener primera letra del segundo apellido
        char letraApellido2 = apellido2.charAt(0);

        // Obtener primera letra del nombre
        char letraNombre = nombre.charAt(0);

        // Obtener fecha de nacimiento
        String fecha = fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(4, 6) + fechaNacimiento.substring(6);

        // Obtener primera consonante interna del primer apellido
        char consonanteInternaApellido1 = obtenerConsonanteInterna(apellido1);

        // Obtener primera consonante interna del segundo apellido
        char consonanteInternaApellido2 = obtenerConsonanteInterna(apellido2);

        // Obtener primera consonante interna del nombre
        char consonanteInternaNombre = obtenerConsonanteInterna(nombre);

        // Obtener dígito verificador
        char digitoVerificador = obtenerDigitoVerificador(fechaNacimiento);

        // Generar homoclave aleatoria (3 caracteres alfanuméricos)
        String homoclave = generarHomoclave();

        // Generar CURP
        String curp = letraApellido2 + letraNombre + fecha + sexo + entidadNacimiento + consonanteInternaApellido1 + consonanteInternaApellido2 + consonanteInternaNombre + digitoVerificador + homoclave;

        // Imprimir CURP generado
        System.out.println("CURP generado: " + curp);

        scanner.close();
    }

    // Método para obtener la primera consonante interna de una cadena
    private static char obtenerConsonanteInterna(String cadena) {
        for (int i = 1; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (esConsonante(c)) {
                return c;
            }
        }
        return 'X'; // Si no se encuentra ninguna consonante interna, se utiliza 'X' como valor por defecto
    }

    // Método para determinar si un carácter es una consonante
    private static boolean esConsonante(char c) {
        return Character.isLetter(c) && !"AEIOU".contains(String.valueOf(c));
    }

    // Método para obtener el dígito verificador
    private static char obtenerDigitoVerificador(String fechaNacimiento) {
        int year = Integer.parseInt(fechaNacimiento.substring(0, 4));
        return (year < 2000) ? calcularDigitoVerificador(fechaNacimiento) : obtenerLetraVerificadora(fechaNacimiento);
    }

    // Método para calcular el dígito verificador para fechas de nacimiento hasta el año 1999
    private static char calcularDigitoVerificador(String fechaNacimiento) {
        int sum = 0;
        for (int i = 0; i < fechaNacimiento.length(); i++) {
            sum += Character.getNumericValue(fechaNacimiento.charAt(i)) * (fechaNacimiento.length() - i);
        }
        int remainder = sum % 10;
        return (char) (remainder + '0');
    }

    // Método para obtener la letra verificadora para fechas de nacimiento a partir del año 2000
    private static char obtenerLetraVerificadora(String fechaNacimiento) {
        int year = Integer.parseInt(fechaNacimiento.substring(0, 4));
        int month = Integer.parseInt(fechaNacimiento.substring(4, 6));
        int day = Integer.parseInt(fechaNacimiento.substring(6, 8));
        int value = ((year - 2000) % 10) * 100 + month * 10 + day;
        return (char) (value % 26 + 'A');
    }

    // Método para generar una homoclave aleatoria
    private static String generarHomoclave() {
        StringBuilder homoclave = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * caracteres.length());
            homoclave.append(caracteres.charAt(index));
        }
        return homoclave.toString();
    }
}
