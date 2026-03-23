public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = {10,7,8,9,1,5};
        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("Vetor Ordenado");
        for (int num : vetor) {
            System.out.println(num + "");
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int IndicePivo = partition(vetor,inicio,fim);
            quickSort(vetor, inicio, IndicePivo - 1);
            quickSort(vetor, IndicePivo + 1, fim);
        }
    }

    public static int partition(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        // coloca o pivo na posicao correta
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }
}
