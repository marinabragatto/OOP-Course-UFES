import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Programa{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vector = new ArrayList<>();

        int num = sc.nextInt();
        String op;
        int value,idx;

        for(int i = 0; i < num; i++){
            op = sc.next();


            if(op.equals("TAMANHO")){
                System.out.printf("%d\n", vector.size());
            }
            if(op.equals("BUSCAR")){
                value = sc.nextInt();
                System.out.printf("%d\n", vector.indexOf(value));

            }
            if(op.equals("INSERIR")){
                value = sc.nextInt();
                vector.add(value);
            }
            if(op.equals("ORDENAR")){
                Collections.sort(vector);
            }
            if(op.equals("REMOVER")){
                Integer obj =  vector.remove(vector.size() - 1);
                System.out.printf("%d\n", obj);
            }
            if(op.equals("MOSTRAR")){
                for(Integer i_value : vector){
                    System.out.printf("%d\n", i_value);
                }
            }
            if(op.equals("VER")){
                idx = sc.nextInt();
                System.out.printf("%d\n", vector.get(idx));
            }

            sc.close();
        }
    }
}


// - INSERIR : adiciona um item ao final do vetor.
// - REMOVER: mostra na tela o último elemento do vetor e o remove.
// - VER : mostra na tela o item que está na posição dada (não é necessário verificar a validade do índice).
// - MOSTRAR: itera sobre os elementos mostrando-os na tela.
// - TAMANHO: mostra o número de elementos no vetor na tela.
// - ORDENAR: ordena os elementos do vector (veja função Collections.sort).
// - BUSCAR : mostra na tela o índice do valor ou -1 caso ele não exista (veja método indexOf).
 

// Escreva um programa em na função main crie uma variável do tipo ArrayList para armazenar inteiros.

// Em seguida, leia um número inteiro N representando a quantidade de comandos que serão digitados a seguir. Nas próximas N linhas serão dadas instruções de manipulação dos vector. Os comandos possíveis são:

