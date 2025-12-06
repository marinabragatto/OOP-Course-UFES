import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Inserindo elementos nas duas pontas
        dq.addLast(10);   // [10]
        dq.addFirst(20);  // [20, 10]
        dq.addLast(30);   // [20, 10, 30]

        System.out.println("Deque inicial: " + dq);

        // Acessando elementos
        System.out.println("Primeiro elemento: " + dq.getFirst());
        System.out.println("Último elemento: " + dq.getLast());

        // Removendo elementos (retorna e remove)
        dq.removeFirst(); // remove 20
        dq.removeLast();  // remove 30

        System.out.println("Depois das remoções: " + dq);

        // Inserindo novamente
        dq.addFirst(5);
        dq.addLast(15);

        // Iterando manualmente
        System.out.print("Elementos do deque: ");
        for (int x : dq)
            System.out.print(x + " ");
        System.out.println();

        // Verificando tamanho
        System.out.println("Tamanho final: " + dq.size());
    }
}
