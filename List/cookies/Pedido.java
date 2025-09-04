

import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }


    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie pedidoCookie : this.cookies) {
            totalCaixas += pedidoCookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }


    public int removerSabor(String sabor) {
        int quantidadeCaixasRemovidas = 0;

        Iterator<PedidoCookie> iterator = cookies.iterator();
        while (iterator.hasNext()) {
            PedidoCookie pedidoCookie = iterator.next();
            if (pedidoCookie.getSabor().equals(sabor)) {
                quantidadeCaixasRemovidas += pedidoCookie.getQuantidadeCaixas();
                iterator.remove();
            }
        }
        return quantidadeCaixasRemovidas;
    }
}
