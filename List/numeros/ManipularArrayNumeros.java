

import java.util.List;

public class ManipularArrayNumeros {
    
    public static Integer buscarPosicaoNumero(List<Integer>numeros, int numeroProcurado) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numeroProcurado) {
                return numeros.indexOf(numeroProcurado);
            } else {
                return -1;
            }
        }
        return 0;
    }

    public static void adicionarNumero(List<Integer> numeros, int i) {
        if(numeros.contains(i)){
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            numeros.add(i);
        }
    }

    public static void removerNumero(List<Integer> numeros, int i) {
        if (!numeros.contains(i)) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        } else {
            numeros.remove(Integer.valueOf(i));
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int index = numeros.indexOf(numeroSubstituir);
        if (numeros.contains(numeroSubstituir)) {
            numeros.set(index, numeroSubstituto);
        } else {
            adicionarNumero(numeros, numeroSubstituto);
        }
    }
  
}
