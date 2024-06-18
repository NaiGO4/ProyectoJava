import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg:");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Tu IMC es: " + imc);

        if (imc < 18.5){
            System.out.println("Bajo peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidad");
        }
    }
}
