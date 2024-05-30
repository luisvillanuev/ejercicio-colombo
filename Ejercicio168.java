import java.util.Arrays;

public class Ejercicio168 {
    public static void main(String[] args) {
        char[] vocales = { 'e', 'a', 'o', 'u', 'i' };
        Arrays.sort(vocales);

        System.out.println("Vocales ordenadas:");
        for (char vocal : vocales) {
            System.out.println(vocal);
        }
    }
}
