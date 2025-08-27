package um;

import java.util.Scanner;

public class main {

    static void menu() {
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("Menu");
        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("Digite 1 para adicionar aluno: ");
        System.out.println("Digite 2 para excluir aluno: ");
        System.out.println("Digite 3 para buscar aluno: ");
        System.out.println("Digite 4 para listar aluno: ");
        System.out.println("Digite 5 para sair: ");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestaoAlunos gestaoAlunos = new GestaoAlunos();
        Aluno aluno = new Aluno("João", 20);
        gestaoAlunos.adicionarAluno(aluno);
        Aluno aluno2 = new Aluno("Maria", 20);
        gestaoAlunos.adicionarAluno(aluno2);
        Aluno aluno3 = new Aluno("Pedro", 20);
        gestaoAlunos.adicionarAluno(aluno3);
        menu();
        int opcao = 0;

        opcao = scanner.nextInt();
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.next();
                    aluno.setNome(nome);
                    System.out.println("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    aluno.setIdade(idade);
                    gestaoAlunos.adicionarAluno(aluno);
                    System.out.println("um.Aluno adicionado com sucesso!");
                    break;
                case 2:

                    System.out.println("Digite o nome do aluno: ");
                    nome = scanner.next();
                    gestaoAlunos.excluirAluno(nome);
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno: ");
                    nome = scanner.next();
                    gestaoAlunos.buscarAluno(nome);
                    break;
                case 4:
                    gestaoAlunos.listarAlunos();
                    System.out.println("um.Aluno listado com sucesso!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            menu();
            opcao = scanner.nextInt();
        }
    }
}
