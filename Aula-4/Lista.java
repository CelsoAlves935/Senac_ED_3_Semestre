public class Lista<T> extends EstruturaEstatica {
    
// Método Constructor com parâmetros o super porque está herdando
    public Lista(int capacidade) {
        super(capacidade);
    }

// Método Construtor sem Parâmetros
    public Lista() {
        super();
    }

// Método para adicionar elementos na Lista
    public boolean Adiciona(T elemento) {
        return super.adiciona(elemento);
    }

// Método para adicionar elementos na Lista em uma posição especifica
    public boolean Adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    

}
