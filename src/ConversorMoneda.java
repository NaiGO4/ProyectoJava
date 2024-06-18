import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {
        final double TazaSoles = 3.79;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en dolares: ");
        double dolares = scanner.nextDouble();

        double soles = dolares * TazaSoles;
        System.out.println(dolares + " dolares son " + soles + " soles.");

    }
}