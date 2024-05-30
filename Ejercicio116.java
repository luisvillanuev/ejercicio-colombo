public class Ejercicio116 {
    public static void main(String[] args) {
        int sumaPares = 0;
        long multiplicacionImpares = 1;
        for (int i = 2; i <= 1000; i += 2) {
            sumaPares += i;
        }
        for (int i = 1; i <= 50; i += 2) {
            multiplicacionImpares *= i;
        }
        System.out.println("La suma de los números pares del 1 al 1000 es: " + sumaPares);
        System.out.println("La multiplicación de los números impares del 1 al 50 es: " + multiplicacionImpares);
    }
}