public class main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha();

        


        System.out.println("Verifica se a Pilha está vazia: " + pilha.estaVazia());
        System.out.println("Informações no Topo da Pilha: " + pilha.topo());

        pilha.adiciona(1);
        pilha.adiciona(2);
        pilha.adiciona(3);


        System.out.println("Verifica se a Pilha está vazia: " + pilha.estaVazia());
        System.out.println("Informações no Topo da Pilha: " + pilha.topo());

        pilha.desempilha();
        System.out.println("Dados da Pilha: " + pilha.toString());
        System.out.println("Qtade de Dados na Pilha: " + pilha.tamanho());
    }
}
