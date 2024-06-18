import java.util.Arrays;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int[] numeros = {5,3, 8, 4,2, 7, 1, 10, 6, 9};
        System.out.println("Array original: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length -1; i++){
            for (int j = 0; j < numeros.length -1 - i; j++){
                if (numeros[j]> numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros [j + 1];
                    numeros[j+ 1]= temp;
                }
            }
        }
        System.out.println("Array ordenado: " +     Arrays.toString(numeros));
    }
}