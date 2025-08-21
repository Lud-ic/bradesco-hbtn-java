package livraria;

import livraria.exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, double preco) {
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco() throws LivroInvalidoException {
        double precoOriginal = super.getPreco();
        return 1.30 * precoOriginal;
    }
}
