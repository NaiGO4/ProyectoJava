import java.util.Random;
import java.util.Scanner;

public class AdividaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numeroUsurio;

        System.out.println("Adivina el numero entre 1 y 100");
        do {
            System.out.println("Introduce el numero: ");
            numeroUsurio = scanner.nextInt();
            intentos++;
            if (numeroUsurio < numeroSecreto){
                System.out.println("Demaciado bajo!");
            }else if(numeroUsurio > numeroSecreto){
                System.out.println("Demaciado alto!");
            }
        }while (numeroUsurio != numeroSecreto);
        System.out.println("Correcto! has adivinado en " + intentos + " intentos.");
    }
}
