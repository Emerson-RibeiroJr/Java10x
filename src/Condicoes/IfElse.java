package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE = Condicoes
        * else if
        * Objetivo: Passar o ninja de nivel de acordo com o número de missões
        * */

        //Ninja Rock Lee
        String nameL = "Rock Lee";
        String rankL;
        int idadeL = 15;
        boolean hokageL = false;
        short numMissoesL = 37;

        // se (condicao) {faca isso}
        // "&&" = E também
        if (numMissoesL == 20 && idadeL > 13) {
            System.out.println("Promovido para Rank: Chunnin");
        }
        // se if = false (condicao) {faca isso}
        else if (numMissoesL >= 35 && idadeL >= 15) {
            System.out.println("Promovido para Rank: Jounin!");
        }
        // se não (condicao) {faca isso}
        else {
            System.out.println("Ainda se mantém no Rank: Gennim");
        }

        System.out.println(); //Pulando linha --> Mudar isso caso esta não for a maneira correta de se fazer.

        //Ninja Kakashi Hatake
        String nameK = "Kakashi Hatake";
        String rankK;
        int idadeK = 31;
        boolean hokageK = false;
        short numMissoesK = 1141;

        //if (condicao) {faca isso}
        // "&&" = E também
        if (numMissoesK >= 1000 && idadeK >= 35) {
            System.out.println("Kakashi está pronto para concorrer à Hokage.");
        }
        //else (condicao) {faca isso}
        else {
            System.out.println("Kakashi ainda não está pronto para essa promoção.");
        }

    }
}
