

import java.util.List;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.produto.stream()
                .filter(p -> p.categoria == CategoriaProduto.LIVRO)
                .toList();
    }
}
