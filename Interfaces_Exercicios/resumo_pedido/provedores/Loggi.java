package resumo_pedido.provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();

        if (peso > 5000) {
            frete.setValor(0.12*valor);
        } else {
            frete.setValor(0.04*valor);
        }

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
