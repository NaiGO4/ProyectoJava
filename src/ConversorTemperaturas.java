import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius (C°): ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Temperatura en Fahrenhait (F°): " + fahrenheit);

        System.out.println("Introduce la temperatura en Fahrenhait (F°): ");
        fahrenheit = scanner.nextDouble();

        celcius = (fahrenheit - 32 ) * 5/9;
        System.out.println("Temperatura el Celsius (C°): " + celcius);
    }
}