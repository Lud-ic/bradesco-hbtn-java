

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String nomeArquivo;
    private List<Produto> produtos;

    public Estoque(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    private void carregarProdutos() {
        produtos.clear();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;
                String[] campos = linha.split(",");
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int quantidade = Integer.parseInt(campos[2]);
                double preco = Double.parseDouble(campos[3]);
                produtos.add(new Produto(id, nome, quantidade, preco));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private void salvarProdutos() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Produto produto : produtos) {
                bufferedWriter.write(produto.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int novoId = produtos.size() + 1;
        Produto novoProduto = new Produto(novoId, nome, quantidade, preco);
        produtos.add(novoProduto);
        salvarProdutos();
        System.out.println("Produto adicionado com ID: " + novoId);

    }

    public void excluirProduto(int idExcluir) {
        boolean removido = produtos.removeIf(p -> p.getId() == idExcluir);
        if (removido) {
            salvarProdutos();
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirEstoque() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        carregarProdutos();
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getId() == idAtualizar) {
                produto.setQuantidade(novaQuantidade);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            salvarProdutos();
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

}
