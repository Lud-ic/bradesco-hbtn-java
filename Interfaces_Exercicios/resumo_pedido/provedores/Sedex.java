package resumo_pedido.provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();

        if (peso > 1000) {
            frete.setValor(0.1*valor);
        } else {
            frete.setValor(0.05*valor);
        }

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
