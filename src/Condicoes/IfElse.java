package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE = Condicoes
        * else if
        * Objetivo: Passar o ninja de nivel de acordo com o número de missões
        * */

        //Ninja Kakashi Hatake
        String name = "Kakashi Hatake";
        String rank;
        int idade = 31;
        boolean hokage = false;
        short numMissoes = 1141;

        //se (condicao) {faca isso}
        // "&&" = E também
        if (numMissoes >= 3500 && idade >= 35) {
            System.out.println("Kakashi está pronto para concorrer à Hokage.");
        }
        //se não (condicao) {faca isso}
        else {
            System.out.println("Kakashi ainda não está pronto para essa promoção.");
        }

    }
}
