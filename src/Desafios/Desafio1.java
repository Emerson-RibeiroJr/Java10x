package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        /*
        * Criar 2 ninjas da Vila da Folha (Konoha) e suas missoes
        * Ninja deve ter: nome (String), idade (int), missoesConcluidas (int)
        * Em missao: nomeMissao (String), rankMissao (char), statusMissao (boolean)
        * Níveis das missões (D, C, B, A, S)
        * */
        /*
        * Mais dificuldade, aprimorando conhecimentos.
        * Usar condicionais para verificar se o ninja pode concluir a missão baseado na idade
        * If; Else If; Else; &&;
        * < 15 anos = D, C
        * >= 15 = todas missoes
        * */

        //Ninja 1 - Kakashi Hatake - 31 anos
        String nameK = "Kakashi";
        int idadeK = 31;
        int missoesConcluidasK = 1141;
        //Missao - Nivel - Status
        String nomeMissaoK = "Localizar e adquirir informações da Akatsuki";
        char rankMissaoK = 'S';
        boolean statusMissaoK = true;
        //Ninja 1 - Visão do usuário
        System.out.println("Ninja 1");
        System.out.println("Nome: " + nameK);
        System.out.println("Idade: " + idadeK);
        System.out.println("Missões concluídas: " + missoesConcluidasK);
        System.out.println(); //Pulando Linha
        //Informações missão
        System.out.println("Missão: " + nomeMissaoK);
        System.out.println("Rank: " + rankMissaoK);
        //O Ninja pode completar essa missão? If - Else - &&
        if (idadeK >= 25 && missoesConcluidasK >= 150) {
            System.out.println("Ninja apto para missão!");
        }
        else {
            System.out.println("Ninja não está pronto para esta missão.");
        }
        //Status da Missão com If Else
        if (statusMissaoK == true) {
            System.out.println("Status: Missão concluída!");
        }
        else {
            System.out.println("Status: Missão incompleta.");
        }

        System.out.println("--------------------------------------------"); //Pulando Linha

        //Ninja 2 - Konohamaru Sarutobi - 12 anos
        String nameKH = "Konohamaru";
        int idadeKH = 12;
        int missoesConcluidasKH = 5;
        //Missao - Nivel - Status
        String nomeMissaoKH = "Limpar estátuas dos Hokages";
        char rankMissaoKH = 'B';
        //Ninja 2 - Visão do usuário
        System.out.println("Ninja 2");
        System.out.println("Nome: " + nameKH);
        System.out.println("Idade: " + idadeKH);
        System.out.println("Missões concluídas: " + missoesConcluidasKH);
        System.out.println(); //Pulando linha
        //Informações missão
        System.out.println("Missão: " + nomeMissaoKH);
        System.out.println("Rank: " + rankMissaoKH);
        //O Ninja pode completar essa missão? If - ElseIf - Else - &&
        if (idadeK == 12 && missoesConcluidasKH > 11) {
            System.out.println("Ninja apto para missão!");
        }
        else if (idadeK == 12 && missoesConcluidasKH <= 4) {
            System.out.println("Este ninja precisa de missões, de Rank menor.");
        }
        else {
            System.out.println("Conclua mais missões de Rank C.");
            System.out.println("Missão incompleta.");
        }
    }
}
