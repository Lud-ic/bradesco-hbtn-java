package armazem_especifico;

public class Eletronico {
    String descricao;
    double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "["+descricao+"] " + "R$ " + String.format("%.6f",valor);
    }
}
