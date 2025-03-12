package Desafios;

public class EmerSafio1 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");
        //Pyke
        String nome = "Pyke";
        int idade = 37;
        String objetivo = "Exterminar capitães";
        String statusObjetivo = "Chega de capitães!";
        int numAbates = 5356;

        //Verificar a quantidade de Abates
        if (idade < 38) {
            if (numAbates >= 5300 || numAbates >= 5900) { // Esse indicador || significa "OU"
                statusObjetivo = "Encontrei mais um na lista...";
            } else {
                statusObjetivo = "Os homens me diziam para matar os monstros. Os monstros, para matar os homens. É, faz sentido!";
            }
        } else {
            statusObjetivo = "Afunde!";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Abates: " + numAbates);
        System.out.println("Status do Objetivo: " + statusObjetivo);

        System.out.println("--------------------------------------------------");
    }
}
