package um;

import java.util.ArrayList;

public class GestaoAlunos {

    ArrayList<Aluno> alunos;

    public GestaoAlunos() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno (Aluno aluno) {
        alunos.add(aluno);
    }

    public void excluirAluno (String excluirAluno){
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(excluirAluno)) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    public void buscarAluno (String buscarAluno){
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(buscarAluno)) {
                System.out.println(aluno);
                break;
            }
        }
    }

    public void listarAlunos () {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
