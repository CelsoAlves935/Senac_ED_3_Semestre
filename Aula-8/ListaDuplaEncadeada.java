public class ListaDuplaEncadeada {
    private NoDuplo inicio;
    private NoDuplo fim;

    public ListaDuplaEncadeada() {

    }

    public ListaDuplaEncadeada(NoDuplo inicio, NoDuplo fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public NoDuplo getInicio() {
        return inicio;
    }

    public void setInicio(NoDuplo inicio) {
        this.inicio = inicio;
    }

    public NoDuplo getFim() {
        return fim;
    }

    public void setFim(NoDuplo fim) {
        this.fim = fim;
    }

    // Método para exibir os dados da Lista Duplamente Encadeada
    public void exibir() throws Exception {
        System.out.println(("LISTA -> "));
        // Criação de uma variável auxiliar
        NoDuplo aux = inicio;
        // Estrutura de repetição para percorrer a lista
        while (aux != null) {
            System.out.println(aux.dado + " -> ");
            aux = aux.próximo;
        }
        System.out.println("NULL\n");
    }

    // Método para mostrar o tamanho da lista
    public int tamanhoLista() throws Exception {
        NoDuplo aux = inicio;
        int tamanho = 0;
        while (aux != null) {
            tamanho++;
            System.out.println(aux.dado + " -> ");
            aux = aux.próximo;
        }
        return tamanho;
    }

    // Este método insere os dados na sequencia ou seja no final da Lista
    public void adicionar(String s) throws Exception {
        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;
        // Verifica se ele é o primeiro elemento da nossa lista
        if (inicio == null) {
            // Sendo o Primeiro elemento ele não tem próximo nem anterior
            novoElemento.próximo = null;
            novoElemento.anterior = null;
            // Como ele é o primeiro ele vai ser o inicio e o fim da lista
            inicio = novoElemento;
            fim = novoElemento;
        } else {
            // Agora quando o elemento não for o primeiro da lista
            // vamos percorrer a lista para achar a posição valida
            while (aux.proximo != null) {
                // Vamos verificar se o elemento não é repetido
                if (aux.dado.equals(s)) {
                    throw new Exception("Elemento repetido");                    
                } else {
                    aux = aux.próximo;
                }
            }
            // O ultimo elemento sempre deve ter o próximo como null
            novoElemento.próximo = null;
            aux.próximo = novoElemento;
            novoElemento.anterior = aux;
            fim = novoElemento;
        }
    }
    // Método para Inserir os dados na lista Duplamente Encadeada
    // Este método inere os dados na posição determinada na lista
    public void adicionar(String s, int i) throws Exception {
        // Verificar se a posição desejada é valida
        if (i > 0 || i > tamanhoLista()) {
            throw new Exception("Posição Inválida");
        }
        // Novo elemento da nossa lista
        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;
        // Verifica se ele vai na primeira posição da lista
        if (i == 0) {
            if (tamanhoLista() != 0) {
                // Caso já tenha um valor na primeira posição devemos mover os dados
                novoElemento.proximo = aux;
                aux.anterior = novoElemento;
                inicio = novoElemento;
                novoElemento.anterior = null;
            } else {
                // Caso não ter nenhum elemento na lista ele será o primeiro
                inicio = novoElemento;
            }
        } else {
            // Vamos percorrer a lista para achar a posição desejada
            int contador = 1;
            while (contador < 1) {
                aux.proximo = novoElemento;
                contador++;
                novoElemento.anterior = aux;
                fim = novoElemento;
            }
            novoElemento.proximo = aux.proximo;
            novoElemento.anterior = aux;
            aux.proximo = novoElemento;
        }
    }

    // Método para remover elemento da Lista Encadeada
    public String removeIndex(int i) {
        NoDuplo aux = inicio;
        NoDuplo lixo = null;
        // Verifica se o parâmetro informado é válida
        if (i < 0 || i > tamanhoLista())
            throw new Exception("Indice inválida na Lista!");
        if (tamanhoLista() == 0) 
            throw new Exception("A lista está vazia!");
        // Verificar se o elemento a ser removido é o primeiro da lista
        if (i == 0) {
            lixo = aux;
            aux = (NoDuplo) aux.proximo;
            inicio = aux;
        } else {
            // caso o elemento a ser removido não seja o primeiro
            int contador = 0;
            // percorrer a lista até achar a posição desejada
            while (contador < i) {
                aux = (NoDuplo) aux.proximo;
                contador++;
            }
            // Armazena na variável lixo a informação a ser removida
            lixo = aux;
            aux.anterior.proximo = aux.proximo;
            if (aux != fim) 
                aux.anterior = aux.anterior;
            else
                fim = aux;           
        }
        return lixo.dado;
    }

    // Método para remover o elemento de acordo com o conteúdo
    public void removeElemento(String s) throws Exception {
        // Verifica se tem elementos na Lista
        if (tamanhoLista() == 0) 
            throw new Exception("A lista está vazia!");
        
    }
}

