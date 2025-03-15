package Condicoes;

public class ScannerDoUsuário {
    // Exame Chunin: Verificando se o ninja tem idade suficiente para competir
import java.util.Scanner;
    public class ExameChunin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a sua idade, jovem ninja: ");
            int idade = scanner.nextInt();
            if (idade >= 12) {
                System.out.println("Parabéns! Você pode participar do Exame Chunin!");
            } else {
                System.out.println("Você ainda é muito jovem para o Exame Chunin. Continue treinando!");
            }
            scanner.close();
        }
    }

}
