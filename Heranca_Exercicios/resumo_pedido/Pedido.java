package resumo_pedido;

import resumo_pedido.produtos.Livro;
import resumo_pedido.produtos.Produto;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal(){
        double precoTotal = 0;
        for(ItemPedido item : itens){
            precoTotal += (double)item.getQuantidade()*item.getProduto().obterPrecoLiquido();
        }
        double descontoTotal = precoTotal * (percentualDesconto/100);
        return precoTotal - descontoTotal;
    }


    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double precoTotalFinal = 0.0;
        for(ItemPedido item : itens){
            Produto produto = item.getProduto();
            double precoTotal = produto.obterPrecoLiquido() * item.getQuantidade();
            precoTotalFinal += precoTotal;

            if(produto instanceof Livro) {
                System.out.printf("Tipo: Livro  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                        item.getProduto().getTitulo(),item.getProduto().obterPrecoLiquido(),item.getQuantidade(),precoTotal);
            } else {
                System.out.printf("Tipo: Dvd  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                        item.getProduto().getTitulo(),item.getProduto().obterPrecoLiquido(),item.getQuantidade(),precoTotal);
            }
        }

        double descontoTotal = precoTotalFinal * (percentualDesconto/100);
        double totalPagar = precoTotalFinal - descontoTotal;

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", descontoTotal);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", precoTotalFinal);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalPagar);
        System.out.println("----------------------------");
    }
}
