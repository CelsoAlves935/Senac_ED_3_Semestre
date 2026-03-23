import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Elemento A");
        arraylist.add("Elemento C");

        System.out.println(arraylist);

        arraylist.add(1,"Elemento B");

        System.out.println(arraylist);
        
        boolean existe = arraylist.contains("Elemento H");

        if (existe) {
            System.out.println("Elemento encontrado no vetor");
        } else {
            System.out.println("ELemento não encotrado no vetor");
        }
        int posicao = arraylist.indexOf("Elemento C");

        if (posicao > -1) {
            System.out.println("Elemento(s) encontrado(s) na posição n°" + posicao);
        } else {
            System.out.println("Elemento(s) não existe(m) no vetor");
        }

        System.out.println(arraylist.get(1));

        arraylist.remove(0);
        arraylist.remove("Elemento C");

        System.out.println(arraylist);

        System.out.println("Tamanho do vetor: " + arraylist.size());

        // VetorObjeto vetor = new VetorObjeto(5);

        // Contato c1 = new Contato("Claudio","9999-2525","claudio@gmail.com");
        // Contato c2 = new Contato("Celso","9999-2525","celso@gmail.com");
        // Contato c3 = new Contato("Camila","9999-2525","camila@gmail.com");

        // try {
        //     vetor.adiciona(c1);
        //     vetor.adiciona(c2);
        //     vetor.adiciona(c3);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // System.out.println("Tamanho do vetor: " + vetor.tamanho());
        // System.out.println("Tamanho Total do vetor: " + vetor.tamanhoTotal());

        // System.out.println(vetor);
    }

}
