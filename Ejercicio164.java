import java.util.Scanner;

public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBoletos = 0;
        double ventaTotal = 0;
        int boletosAdulto = 0;
        int boletosNiño = 0;
        int boletosPromocion = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tipo de boleto vendido (1 = Adulto, 2 = Niño, 3 = Promociones, 0 = Terminar):");
            int tipoBoleto = scanner.nextInt();

            if (tipoBoleto == 0) {
                break;
            }

            System.out.println("Cantidad de boletos vendidos:");
            int cantidad = scanner.nextInt();

            switch (tipoBoleto) {
                case 1:
                    ventaTotal += cantidad * 60;
                    boletosAdulto += cantidad;
                    break;
                case 2:
                    ventaTotal += cantidad * 30;
                    boletosNiño += cantidad;
                    break;
                case 3:
                    ventaTotal += cantidad * 20;
                    boletosPromocion += cantidad;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    i--;
            }

            totalBoletos += cantidad;
        }

        System.out.println("Total de boletos vendidos: " + totalBoletos);
        System.out.println("Venta bruta: " + ventaTotal);
        System.out.println("Venta por tipo de boleto:");
        System.out.println("Adulto: " + boletosAdulto + " boletos");
        System.out.println("Niño: " + boletosNiño + " boletos");
        System.out.println("Promociones: " + boletosPromocion + " boletos");

        scanner.close();
    }
}
