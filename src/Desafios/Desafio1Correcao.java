package Desafios;

public class Desafio1Correcao {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");
        //Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 13;
        String missao = "Encontrar o bandido";
        String statusMissao = "Em andamento";
        char nivelMissao = 'S';

        //Verificar nivel da missao e idade do ninja
        if (idade < 15) {
            if (nivelMissao == 'C' || nivelMissao == 'D'){ // Esse indicador || significa "OU"
                statusMissao = "Concluída";
            } else {
                statusMissao = "Não Concluída, idade insuficiente";
            }
        } else {
            statusMissao = "Concluída";
        }

        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nível da Missao: " + nivelMissao);
        System.out.println("Status da Missao: " + statusMissao);

        System.out.println("--------------------------------------------------");
        //Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 19;
        String missao2 = "Reconhecimento da aldeia";
        String statusMissao2 = "Em andamento";
        char nivelMissao2 = 'D';

        if (idade2 < 15){
            if (nivelMissao2 == 'C' || nivelMissao2 == 'D') {
                statusMissao2 = "Missao Concluída";
            } else {
                statusMissao2 = "Missao não concluída, você é muito novo.";
            }
        } else {
            statusMissao2 = "Missão concluída! Você já é maior de idade";
        }

        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Nível da Missao: " + nivelMissao2);
        System.out.println("Status da Missao: " + statusMissao2);

        System.out.println("--------------------------------------------------");
        //Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 15;
        String missao3 = "Curar feridos da guerra";
        String statusMissao3 = "Concluído";
        char nivelMissao3 = 'S';

        if (idade3 > 15){
            if (nivelMissao3 == 'A' || nivelMissao3 == 'S') {
                statusMissao3 = "Concluído.";
            } else {
                statusMissao3 = "Não concluído. Faça missões mais avançadas.";
            }
        } else if (idade3 < 15) {
            statusMissao3 = "Não concluído. Ainda é muito jovem.";
        } else {
            statusMissao3 = "Concluído. Já pode fazer missões de nivel maior.";
        }

        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Nível da Missao: " + nivelMissao3);
        System.out.println("Status da Missao: " + statusMissao3);

        System.out.println("--------------------------------------------------");

    }
}
