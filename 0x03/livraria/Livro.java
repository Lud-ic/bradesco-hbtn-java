

import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() throws LivroInvalidoException {
        if(titulo.length()<3){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() throws AutorInvalidoException {
        String [] nomes = autor.split("\\s+");

        if(nomes.length < 2) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() throws LivroInvalidoException {
        if(preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
