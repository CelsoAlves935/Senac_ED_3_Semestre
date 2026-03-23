public class Teste {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 01");
        vetor.adiciona("Elemento 02");
        // try {
        // vetor.adiciona("Elemento 01");
        // vetor.adiciona("Elemento 02");
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        System.out.println("Quantidade de informações no vetor: " + vetor.tamanho());

        System.out.println("Conteúdo do vetor: " + vetor.toString());

        System.out.println("Informação armazenada no vetor na posição informada: " + vetor.busca(1));

        System.out.println("Buscar o endereco da informacao Elemento 1: " + vetor.busca1("Elemento 01"));

        
    }
}
