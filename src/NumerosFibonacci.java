import java.util.Scanner;

public class NumerosFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros Fibonacci a generar: ");
        int n = scanner.nextInt();

        int a = 0 , b = 1, c;
        System.out.println("Los primos " + n + " numeros de Fibonacci son: " + a + " " + b);

        for (int i = 2; i<n; i++){
            c = a + b;
            System.out.println(" " + c );
            a = b;
            b = c;
        }
        System.out.println();
    }
}