public class Fila<T> extends EstruturaEstatica {
    int contadorPrioriade = 0;

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public T Exibir(T elemento) {
        return (T) this.elementos[(int) elemento];
    }
    public void enfileira(T elemento) {
        // this.aumentaCapacidade();
        // this.elementos[this.tamanho] = elemento;
        // this.tamanho++;
        //  vamos aproveitar o código que já existe
        adiciona(elemento);
    }

    // public void enfileiraPrioridade(T elementos){
    //     adiciona(elementos);
    //     contadorPrioriade++;
    // }

    // public static void enfileiraComum(T elementos) {
    //     adiciona(elementos);
    // }

    // public void fluxo() {
    //     if (contadorPrioriade == 3) {
    //         enfileiraComum();
    //     }
    // }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return (T) this.elementos[0];   
    }

    public T desenfileira() {
        if (this.estaVazia()) {
            System.out.println("O vetor está vazio");
            return null;
        }
        // Já temos um método para remover na classe pai porém precisa indicar a posicao e para isso vamos criar um contraste

        final int POS = 0;

        T elementoASerRemovido = (T) this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }
}
