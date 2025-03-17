package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuário {
    public static void main(String[] args) {
        /*
         * Scanner = É um modo de trazer o usuário para dentro da aplicação.
         * Objetivo = O usuário vai criar um campeão. Nós validaremos os dados.
         *
         * */
        Scanner caixaDeTexto = new Scanner(System.in);

        // Título
        System.out.println("----------------------------------");
        System.out.println("Criando um campeão");
        System.out.println("----------------------------------");
        // Recebe Nome
        System.out.println("Digite o nome");
        String nomeCampeao = caixaDeTexto.nextLine();
        System.out.println("Nome: " + nomeCampeao);
        // Recebe idade
        System.out.println("Digite a idade");
        int idadeCampeao = caixaDeTexto.nextInt();
        System.out.println("Idade: " + idadeCampeao + " anos");

        // Tratamento de dados
        if (idadeCampeao >= 18 ){
            System.out.println("Campeão maior de idade, já pode ir para o Monte Targon");
        } else {
            System.out.println("Campeão ainda é muito novo para se arriscar no Monte Targon");
        }

        // Sempre fechar o Scanner
        caixaDeTexto.close();
    }
}