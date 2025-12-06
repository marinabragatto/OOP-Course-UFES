import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Double> mapa = new HashMap<>();

        mapa.put(1, 10.5);
        mapa.put(2, 20.3);
        mapa.put(3, 30.7);

        System.out.println("Valor da chave 2: " + mapa.get(2));

        // Iterando
        for (Map.Entry<Integer, Double> entrada : mapa.entrySet()) {
            System.out.println("Chave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // Verificando existência
        if (mapa.containsKey(3)) {
            System.out.println("Chave 3 encontrada!");
        }
    }
}
