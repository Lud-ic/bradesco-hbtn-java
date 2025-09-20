

import java.util.List;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.produtos.stream()
                .filter(p -> p.categoria == CategoriaProduto.LIVRO)
                .toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .max((p1, p2) -> Double.compare(p1.preco, p2.preco))
                .orElse(null);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream()
                .filter(p -> p.preco >= precoMinimo)
                .toList();
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(p -> p.produtos.stream()
                        .anyMatch(prod -> prod.categoria == CategoriaProduto.ELETRONICO))
                .toList();
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .map(p -> {
                    if (p.categoria == CategoriaProduto.ELETRONICO) {
                        return new Produto(p.codigo, p.nome, p.categoria, p.preco * 0.85);
                    } else {
                        return p;
                    }
                })
                .toList();
    }
}
