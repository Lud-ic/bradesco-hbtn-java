

import java.util.Objects;

public class Autor implements Comparable<Autor> {
    String nome;
    String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor o) {
//        int sobrenomeComp = this.sobrenome.compareTo(o.sobrenome);
//        if (sobrenomeComp != 0) {
//            return sobrenomeComp;
//        }
        return this.nome.compareTo(o.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } if (o == null || getClass() != o.getClass()){
            return false;
        }
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) && Objects.equals(sobrenome, autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
