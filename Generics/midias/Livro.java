

public class Livro extends Midia{
    private int edicao;

    public Livro(String nome, int edicao) {
        super(nome);
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Tipo: Livro - Nome: " + getNome();
    }
}
