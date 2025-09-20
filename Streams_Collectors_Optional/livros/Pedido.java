

import java.util.List;

public class Pedido {

    int codigo;
    List<Produto> produto;
    Cliente cliente;

    public Pedido(int codigo, List<Produto> produto, Cliente cliente) {
        this.codigo = codigo;
        this.produto = produto;
        this.cliente = cliente;
    }
}
