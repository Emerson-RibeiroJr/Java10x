package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um Ninja. - Kakashi -
        */

        int idade = 31; //Tem um valor máximo que pode ser colocado (2 147 483 647)
        double altura = 1.81;
        char inicial = 'K'; // Sempre colocar o valor com 'aspas simples'
        boolean vivoOuMorto = true;
        int saldoBancarioAnterior = 399833; // Valor maximo int: 2 147 483 647
        Long saldoBancario = 9958218L; //Ele serve para extender o valor máximo do int (9 223 372 036 854 775 807)

        System.out.println(idade); //Comando para mostrar para o usuário
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("Saldo Bancario é: " + saldoBancario);
        System.out.println("Ele está: " + vivoOuMorto);



    }
}
