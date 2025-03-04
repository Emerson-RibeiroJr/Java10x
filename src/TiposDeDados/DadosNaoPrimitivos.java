package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro do comando PSVM, vai ser compilado pelo Java (basicamente o Body)

            /*
            * Dados não primitivos: String, Array, Class
            * Objetivo: Criar um ninja, e atribuir metodos a ele.
            * */

            String name = "Kakashi Hatake";
            String nameUpperCase = name.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
            System.out.println("Texto em CAPSLOCK: " + nameUpperCase);
            System.out.println("Texto Normal: " + name);

            System.out.println(); // Pulando linha

            String cla = "Hatake";
            String claLowerCase = cla.toLowerCase(); // toLowerCase coloca tudo em caixa baixa
            System.out.println("Texto em caixa baixa: " + claLowerCase);
            System.out.println("Texto Normal: " + cla);

    }
}
