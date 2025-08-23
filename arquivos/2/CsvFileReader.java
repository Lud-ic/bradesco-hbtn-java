

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {
    public static void main(String[] args) {
        String nomeArquivo = "funcionarios.csv"; // Change to your CSV file name

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] colunas = linha.split(",");
                System.out.println("Funcionário: " + colunas[0]);
                System.out.println("Idade: " + colunas[1]);
                System.out.println("Departamento: " + colunas[2]);
                System.out.println("Salarial: " + colunas[3]);
                System.out.println("------------------------");
            }
            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
