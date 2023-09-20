import java.util.Scanner;

public class mcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        
        int mcd = calcularMCD(num1, num2);
        
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
        
        sc.close();
    }
    
    
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

