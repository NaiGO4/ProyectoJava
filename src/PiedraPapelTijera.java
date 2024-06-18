import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"Piedra", "Tijera", "Papel"};

        System.out.println("Elige una opcion (Piedra, Tijera, Papel): ");
        String eleccionUsurio = scanner.nextLine();

        String eleccionComputadora = opciones[random.nextInt(3)];
        System.out.println("Computadora eligio: " + eleccionComputadora);

        if (eleccionUsurio.equalsIgnoreCase(eleccionComputadora)){
            System.out.println("Es un empate");
        } else if ((eleccionUsurio.equalsIgnoreCase("Piedra") && eleccionComputadora.equals("Tijera")) ||
                (eleccionUsurio.equalsIgnoreCase("Papel") && eleccionComputadora.equals("Piedra")) ||
                (eleccionUsurio.equalsIgnoreCase("Tijera") && eleccionComputadora.equals("Papel"))) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}