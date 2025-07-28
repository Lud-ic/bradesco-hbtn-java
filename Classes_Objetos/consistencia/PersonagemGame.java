package consistencia;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if(saudeAtual > 0){
            status="vivo";
        } else if(saudeAtual == 0){
            status = "morto";
        }
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano){
        setSaudeAtual(getSaudeAtual()-quantidadeDeDano);
        if(getSaudeAtual()<0){
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura){
       setSaudeAtual(getSaudeAtual()+quantidadeDeCura);
        if(getSaudeAtual()>= 100) {
            setSaudeAtual(100);
        }
    }
}
