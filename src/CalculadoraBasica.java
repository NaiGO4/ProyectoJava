import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("Elija el operador(+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado;
        switch (operacion){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operacion no valida");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
