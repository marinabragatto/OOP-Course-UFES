
public class Divisao {
    static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double resultado = dividir(10, 0);  // lança exceção
        System.out.println("Resultado: " + resultado);
    }
}

// -----------

import java.util.List;
import java.util.Arrays;

public class AcessoLista {
    static int acessarElemento(List<Integer> lista, int indice) {
        if (indice < 0 || indice >= lista.size()) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }
        return lista.get(indice);
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3);
        int valor = acessarElemento(numeros, 5);  // lança exceção
        System.out.println("Valor: " + valor);
    }
}

// -----------

import java.io.*;

public class LeituraArquivo {
    static String lerArquivo(String caminho) throws IOException {
        File file = new File(caminho);
        if (!file.exists()) {
            throw new IOException("Arquivo não encontrado: " + caminho);
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder conteudo = new StringBuilder();
        String linha;

        while ((linha = reader.readLine()) != null) {
            conteudo.append(linha).append("\n");
        }
        reader.close();
        return conteudo.toString();
    }

    public static void main(String[] args) throws IOException {
        String texto = lerArquivo("inexistente.txt");  // lança IOException
        System.out.println(texto);
    }
}
