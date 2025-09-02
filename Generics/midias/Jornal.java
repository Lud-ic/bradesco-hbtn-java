package midias;

public class Jornal extends Midia{
    private int quantidadeArtigos;

    public Jornal(String nome, int quantidadeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtigos;
    }

    @Override
    public String toString() {
        return "Jornal - Nome: " + getNome();
    }
}
