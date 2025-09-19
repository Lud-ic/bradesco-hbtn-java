

import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterio) {
        return produtos.stream().filter(criterio::test).toList();
    }
}
