public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = {5,2,4,6,1,3};
        insertionSort(vetor);

        System.out.println("Vetor Ordenado");
        for (int num : vetor) {
            System.out.println(num + "");
        }
    }
                    // 5,2,4,6,1,3
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // Move os elementos maiores que a chave uma posicao a frente
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            // Insere a chave na posicao correta
            vetor[j + 1] = chave;
        }
    }
}
