import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
        // --- Exemplo com tipo primitivo (usa wrapper) ---
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Elemento no índice 1: " + numeros.get(1));

        numeros.remove(numeros.size() - 1);
        numeros.remove(0);

        System.out.print("Conteúdo do ArrayList<Integer>: ");
        for (int n : numeros)
            System.out.print(n + " ");
        System.out.println();

        // --- Exemplo com objetos ---
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Bruno", 30));
        pessoas.add(new Pessoa("Carlos", 22));

        System.out.println("\nLista de pessoas:");
        for (Pessoa p : pessoas)
            p.apresentar();
    }
}
