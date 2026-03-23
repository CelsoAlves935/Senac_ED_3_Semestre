import java.util.LinkedList;
import java.util.Queue;

public class Teste01 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        fila.add(1); // Adiciona
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString()); // Exibe

        System.out.println(fila.peek());
        // Recupera, mas não remove, o cabeçalho desta fila ou retorna nulo se a fila estiver vazia ou seja, novvo método espiar.

        System.out.println(fila.remove());
        // Remove elemento da fila ou desinfileira, por conta da classe Queue
        // FIFO - First in First Out .
        
    }
}
