package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();

        double valorFrete = valor;

        if (peso > 2000) {
            frete.setValor(0.07*valor);
        } else {
            frete.setValor(0.045*valor);
        }

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
