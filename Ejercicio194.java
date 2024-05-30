public class Ejercicio194 {

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 7, 3, 8, 6, 4, 10};
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("Números ordenados de forma ascendente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}