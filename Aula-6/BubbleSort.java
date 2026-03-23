public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {1,1,4,2,2};
        System.out.println(vetor.length);
        System.out.println("Vetor Ordenado:");
        for (int num : vetor) {
            System.out.println(num + " ");
        }
        bubbleSort(vetor);

        System.out.println("Vetor Ordenado:");
        for (int num : vetor) {
            System.out.println(num + " ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        // 2 1 3 -> 1 2 3
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[ j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}
