import java.util.Scanner;

public class Sangue extends Fila{
    public static <T> void main(String[] args) {
        Fila filinha = new Fila<>();
        Scanner sc = new Scanner(System.in);
        String opcao;
        int prioridadeDemais = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("###################################################");
            System.out.println("Bom dia, qual a sua categoria? Comum ou Prioridade");
            System.out.println("---------------------------------------------------");
            opcao = sc.nextLine();
            filinha.adiciona(opcao); 
            prioridadeDemais++;
        }
        
        for (int i = 0; i < filinha.tamanho; i++) {
            filinha.Exibir(i);
        }


    }
}
