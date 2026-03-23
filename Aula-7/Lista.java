public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println();
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        
        lista.adiciona("Celso");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println();
        
        
        lista.adiciona("Camila");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println();


        lista.adiciona("Camile");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println();

        System.out.println("Elemento na posicao 2 = " + lista.get(2).getElemento());
        System.out.println();

        lista.remover("Camila");
        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        System.out.println();
    }
}
