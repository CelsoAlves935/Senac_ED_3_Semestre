public class Teste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        // // Vamos verificar se a fila está vazia, nesse caso será false
        // System.out.println("A fila está vazia? " + fila.estaVazia());

        // // Vamos verificar o tamanho da minha fila após enfileirar
        // System.out.println("Qual o tamanho da fila: " + fila.tamanho());

        // // Vamos visualizar os elementos dentro da fila
        System.out.println(fila.toString());

        // Vamos espiar a fila
        // System.out.println(fila.espiar());
        // Poderiamos criar uma estrutura de decisão com o retorno do método
        // if (fila.espiar() == null) {
        // System.out.println("Ninguem na Fila");
        // } else {
        // System.out.println("O elemento da primeira posição é " + fila.espiar());
        // }

        System.out.println(fila.desenfileira());

        System.out.println(fila.toString());

    }
}
