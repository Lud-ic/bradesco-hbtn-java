

public class Comida {
    String nome;
    double calorias;
    Double preco;

    public Comida(String nome, double calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "["+nome+"] " + String.format("%.6f", calorias) + " R$ " + String.format("%.6f", preco);
    }
}
