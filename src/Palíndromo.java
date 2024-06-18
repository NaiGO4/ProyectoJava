import java.util.Scanner;

public class Palíndromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equalsIgnoreCase(palabraInvertida)){
            System.out.println(palabra + " es un palabra");
        }else {
            System.out.println(palabra + " no es un palindromo");
        }
    }
}