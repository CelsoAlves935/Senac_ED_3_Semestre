public class Projeto_revisao_ED {
    public static void main(String[] args) {
        double[] temperatura = new double[365];

        temperatura[0] = 25.7;
        temperatura[1] = 25.7;
        temperatura[2] = 27.7;
        temperatura[3] = 29.7;
        temperatura[4] = 31.7;
        temperatura[5] = 30.7;
        temperatura[6] = 29.7;

        System.out.println("O valor da temperatura do dia 3 é: " + temperatura[2]);
        System.out.println("O tamanho do vetor: " + temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperatura[i]);
        }

        for (double temp: temperatura) {
            System.out.println(temp);
        }
    }
}
