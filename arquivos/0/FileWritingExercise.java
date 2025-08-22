

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Digite linhas de texto (digite 'sair' para finalizar):");
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("sair")) {
                    break;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Arquivo '" + fileName + "' criado e conteúdo salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
