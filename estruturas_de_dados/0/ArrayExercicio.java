
import java.util.Scanner;

public class ArrayExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            soma += numeros[i];
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("Conteúdo do array: ");
        for (int i = 0; i < tamanhoArray; i++) {
             System.out.print(numeros[i] + " ");
        }

        System.out.print("\nSoma de todos os números: " + soma);
        System.out.print("\nMaior número no array: " + maiorNumero);

        scanner.close();
    }
}
