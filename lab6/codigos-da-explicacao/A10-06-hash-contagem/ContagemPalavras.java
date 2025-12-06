import java.util.HashMap;

public class ContagemPalavras {
    public static void main(String[] args) {
        String texto = "gato cachorro gato passaro cachorro gato";
        HashMap<String, Integer> contagem = new HashMap<>();

        for (String palavra : texto.split(" ")) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        contagem.forEach((palavra, freq) -> System.out.println(palavra + ": " + freq));
    }
}
