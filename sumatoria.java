import java.util.Scanner;

public class sumatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el límite inferior: ");
        int lim_inf = scanner.nextInt();

        System.out.print("Ingresa el límite superior: ");
        int lim_sup = scanner.nextInt();

        int resultado = sumaCuadradosEnRango(lim_inf, lim_sup);

        System.out.println("La suma de los cuadrados de " + lim_inf + " a " + lim_sup + " es: " + resultado);

        scanner.close();
    }
    public static int sumaCuadradosEnRango(int lim_inf, int lim_sup) {
        if (lim_inf > lim_sup) {
            return 0;
        } else {
            return lim_inf * lim_inf + sumaCuadradosEnRango(lim_inf + 1, lim_sup);
        }
    }
}