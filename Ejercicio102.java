import java.util.Scanner;

public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifa = scanner.nextDouble();

        double salario = calcularSalario(horasTrabajadas, tarifa);
        System.out.println("El salario del trabajador es: $" + salario);

        scanner.close();
    }

    public static double calcularSalario(int horasTrabajadas, double tarifa) {
        double salarioBase = horasTrabajadas * tarifa;
        if (horasTrabajadas > 40) {
            double horasExtra = horasTrabajadas - 40;
            salarioBase += horasExtra * (tarifa * 0.25); // 25% más para horas extras
        }
        return salarioBase;
    }
}
