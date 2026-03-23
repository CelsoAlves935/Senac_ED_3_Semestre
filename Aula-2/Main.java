public class Main {

    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");

        System.out.println("Quantidade de informaÃ§Ãµes no vetor: " + vetor.tamanho());

        System.out.println("ConteÃºdo do vetor: " + vetor.toString());

        System.out.println("InformaÃ§Ã£o armazenada no vetor na posiÃ§Ã£o informada: " + vetor.busca(1));

        System.out.println("PosiÃ§Ã£o do vetor onde estÃ¡ armazenado a informaÃ§Ã£o: " + vetor.busca1("ELEMENTO 1"));

    }
}