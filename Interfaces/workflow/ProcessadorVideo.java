

import java.util.ArrayList;

public class ProcessadorVideo {
    ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal (CanalNotificacao canalNotificacao) {
        canais.add(canalNotificacao);
    }


    public void processar(Video video) {
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto(video.getArquivo() + " - " +video.getFormato());
        mensagem.setTipoMensagem(TipoMensagem.LOG);
        for (CanalNotificacao canalNotificacao : canais) {
            canalNotificacao.notificar(mensagem);
        }
    }
}
