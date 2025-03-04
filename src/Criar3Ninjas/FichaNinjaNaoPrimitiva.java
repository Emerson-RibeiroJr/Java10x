package Criar3Ninjas;

public class FichaNinjaNaoPrimitiva {
    public static void main(String[] args) {
        /*
         * Criar a ficha de mais 3 ninjas utilizando dados primitivos
         * Ninjas:
         * Itachi Uchiha (21, 1.75, I, false);
         * Jiraiya Togakure (54, 1.91, J, false);
         * Might Guy (30, 1.84, G, true)
         * */

        /* Itachi Uchiha */
        String name = "Itachi Uchiha";
        String nameUpperCase = name.toUpperCase(); //metodo - CAPSLOCK
        System.out.println("CAPSLOCK: " + nameUpperCase);
        System.out.println("Normal: " + name);

        System.out.println(); //Pulando Linha

        String cla = "Uchiha";
        String claLowerCase = cla.toLowerCase(); //metodo - caixa baixa
        System.out.println("caixa baixa: " + claLowerCase);
        System.out.println("Normal: " + cla);

        System.out.println(); //Pulando Linha

        /* Jiraya Togakure */
        String nameJ = "Jiraya Togakure";
        String nameUpperCaseJ = name.toUpperCase();
        System.out.println("CAPSLOCK: " + nameUpperCaseJ);
        System.out.println("Normal: " + nameJ);

        System.out.println(); //Pulando Linha

        String claJ = "Desconhecido";
        String claLowerCaseJ = claJ.toLowerCase();
        System.out.println("caixa baixa: " + claLowerCaseJ);
        System.out.println("Normal: " + claJ);

        System.out.println(); //Pulando Linha

        /* Might Guy */
        String nameG = "Might Guy";
        String nameUpperCaseG = nameG.toUpperCase();
        System.out.println("CAPSLOCK: " + nameUpperCaseG);
        System.out.println("Normal: " + nameG);

        System.out.println(); //Pulando Linha

        String claG = "Não pertencente";
        String claLowerCaseG = claG.toLowerCase();
        System.out.println("caixa baixa: " + claLowerCaseG);
        System.out.println("Normal: " + claG);
        System.out.println("Test new commit");

    }
}
