public class Pilha<T> extends EstruturaEstatica {
    
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

// Método para adicionar elementos na Pilha
    public void empilha(T elemento) {
        // dessa forma estamos reutilizando o codigo da classe pai
        super.adiciona(elemento);
    }

// Método para visualizar a informação no topo da Pilha
    public T topo() {
        if (this.estaVazia()) {
            return null;
        } else {
            return (T) this.elementos[tamanho - 1];
        }
    }

    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }
        T elemento = (T) this.elementos[tamanho - 1];
        super.remove(tamanho-1); //tamanho--;
        return elemento;
    }

    






    
}
