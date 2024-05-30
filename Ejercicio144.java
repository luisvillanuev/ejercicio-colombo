public class Ejercicio144 {
    public static void main(String[] args) {
        int sumaPares = 0;
        int multiplicacionImpares = 1;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                multiplicacionImpares *= i;
            }
        }

        System.out.println("La suma de los números pares entre 1 y 100 es: " + sumaPares);
        System.out.println("La multiplicación de los números impares entre 1 y 100 es: " + multiplicacionImpares);
    }
}
