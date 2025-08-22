

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Conteúdo do arquivo '" + fileName + "':\n");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nLeitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
