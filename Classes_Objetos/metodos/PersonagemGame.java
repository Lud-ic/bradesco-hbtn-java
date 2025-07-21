package metodos;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano){
        int quatidadeDeSaude;
        quatidadeDeSaude=getSaudeAtual()-quantidadeDeDano;
        if(quatidadeDeSaude<0){
            setSaudeAtual(0);
        }else {
            setSaudeAtual(quatidadeDeSaude);
        }
    }

    public void receberCura(int quantidadeDeCura){
        int quatidadeDeSaude;
        quatidadeDeSaude = getSaudeAtual()+quantidadeDeCura;
        if(quatidadeDeSaude >= 100) {
            setSaudeAtual(100);
        }else {
            setSaudeAtual(quatidadeDeSaude);
        }
    }
}
