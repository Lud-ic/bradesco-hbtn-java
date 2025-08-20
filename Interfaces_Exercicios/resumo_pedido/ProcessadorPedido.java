

import provedores.ProvedorFrete;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
        provedorFrete.obterTipoProvedorFrete();
    }

    public void processar(Pedido pedido) {
        pedido.setFrete(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
        pedido.getFrete().setTipoProvedorFrete(provedorFrete.obterTipoProvedorFrete());
    }
}
