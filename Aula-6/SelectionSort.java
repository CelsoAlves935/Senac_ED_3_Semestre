public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = {64,25,12,22,11};
        selectionSort(vetor);

        System.out.println("Vetor Ordenado: ");
        for (int num : vetor) {
            System.out.println(num + " ");
        }
    }

    public static void selectionSort(int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            // encontra o menor elemento da parte não ordenada
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor= j;
                }
            }

            // troca o menor encontrado com o primeiro da parte não ordenada
            int temp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = temp;
        }
    }
}
