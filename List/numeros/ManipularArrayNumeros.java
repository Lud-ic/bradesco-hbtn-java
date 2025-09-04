package numeros;

import java.util.List;

public class ManipularArrayNumeros {
    
    public static void buscarPosicaoNumero(){
        int[] numeros = {10, 20, 30, 40, 50};
        int numeroProcurado = 30;
        int posicao = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Número " + numeroProcurado + " encontrado na posição: " + posicao);
        } else {
            System.out.println("Número " + numeroProcurado + " não encontrado no array.");
        }
    }

    public static void adicionarNumero(List<Integer> numeros, int i) {
        numeros.add(i);
    }

    public static void removerNumero(List<Integer> numeros, int i) {
        numeros.remove(Integer.valueOf(i));
    }

    public static void substituirNumero(List<Integer> numeros, int i, int i1) {
        int index = numeros.indexOf(i);
        if (index != -1) {
            numeros.set(index, i1);
        }
    }
  
}
