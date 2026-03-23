import java.util.Arrays;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto (int capacidade) {
        elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) throws Exception{
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("O vetor ja esta cheio, " + "não é possivel adicionar novos elementos");
        }
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for(int i = this.tamanho - 1; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Posição Invalida Parceiro");
        }
        return true;
    }

    public void remove (int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.elementos[tamanho - 1] = null;
            this.tamanho--;
        } else {
            throw new Exception("Posição Invalida");
        }
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) throws Exception{
        if (posicao >= 0 && posicao < tamanho) {
            return this.elementos[posicao];
        } else {
            throw new Exception("Posicao invalida, não exite isso ai não amigo");
        }

    }

    public int busca1 (Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int tamanhoTotal() {
        return elementos.length;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(", ");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
    // public String toString() {
    //     return Arrays.toString(elementos);
    // }
    // @Override
    // public String toString() {
    //     return "Vetor [elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "]";
    // }

    
}
