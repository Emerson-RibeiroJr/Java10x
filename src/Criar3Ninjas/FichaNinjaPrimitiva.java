package Criar3Ninjas;

public class FichaNinjaPrimitiva {
    public static void main(String[] args) {
        /*
         * Criar a ficha de mais 3 ninjas utilizando dados primitivos
         * Ninjas:
         * Itachi Uchiha (21, 1.75, I, false);
         * Jiraiya Togakure (54, 1.91, J, false);
         * Might Guy (30, 1.84, G, true)
         * */

        /* Itachi Uchiha */
        int idadeI = 21; //Tem um valor máximo que pode ser colocado (2 147 483 647)//
        double alturaI = 1.75;
        char inicialI = 'I';
        boolean vivoOuMortoI = false;
        Long saldoBancarioI = 9958455L; //Ele serve para extender o valor máximo do int (9 223 372 036 854 775 807)//

        System.out.println("Itachi Uchiha tem: " + idadeI + " anos");
        System.out.println("Itachi Uchiha tem: " + alturaI + " metros");
        System.out.println("Primeira letra: " + inicialI);
        System.out.println("Atualmente ele está: " + vivoOuMortoI); // Ajustar quando souber sobre if | else
        System.out.println("Saldo Bancário: " + saldoBancarioI);

        System.out.println(); // pulando linha

        /*Jiraiya Togakure*/
        int idadeJ = 54;
        double alturaJ = 1.91;
        char inicialJ = 'J';
        boolean vivoOuMortoJ = false;
        Long saldoBancarioJ = 1849998755L;

        System.out.println("Jiraiya Togakure tem: " + idadeJ + " anos");
        System.out.println("Jiraiya Togakure tem: " + alturaJ + " metros");
        System.out.println("Primeira letra: " + inicialJ);
        System.out.println("Atualmente ele está: " + vivoOuMortoJ);
        System.out.println("Saldo Bancário: " + saldoBancarioJ);

        System.out.println(); //Pulando linha

        /*Might Guy*/
        int idadeG = 30;
        double alturaG = 1.84;
        char inicialG = 'G';
        boolean vivoOuMortoG = true;
        Long saldoBancarioG = 9998755L;

        System.out.println("Might Guy tem: " + idadeG + " anos");
        System.out.println("Might Guy tem: " + alturaG +" metros");
        System.out.println("Primeira letra: " + inicialG);
        System.out.println("Atualmente ele está: " + vivoOuMortoG);
        System.out.println("Saldo Bancário:" + saldoBancarioG);


    }
}
