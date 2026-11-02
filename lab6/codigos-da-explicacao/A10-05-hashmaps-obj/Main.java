import java.util.HashMap;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<String, Pessoa> mapa = new HashMap<>();
        mapa.put("joao", new Pessoa("João", 25));
        mapa.put("maria", new Pessoa("Maria", 30));

        mapa.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));
    }
}
