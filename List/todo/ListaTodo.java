

import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefaAdd) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getIdentificador() == tarefaAdd.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
        }
        this.tarefas.add(tarefaAdd);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }


    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.modificarDescricao();
        }
        for (Tarefa tarefa : tarefas) {
            String status = tarefa.isEstahFeita() ? "[X]" : "[ ]";
            System.out.println(status + "  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        }
    }

    public boolean desfazerTarefa(int i) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == i) {
                tarefa.setEstahFeita(false);
                return false;
            }
        }
        return false;
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }
}
