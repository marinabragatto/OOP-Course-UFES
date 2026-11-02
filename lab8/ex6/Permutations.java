import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations implements Generator<ArrayList<Integer>>{
    public Permutations(int tamanho){
        this.reset();
        this._tamanho = tamanho;
    }

    public void reset(){

        this._array = new ArrayList<Integer>();
        for(int i = 0; i < this._tamanho; i++){
            this._array.add(i);
        }
        this._arrays_gerados = 0;

    }
    public boolean is_over(){
        int tamanho_array = this._tamanho - 1;

        boolean verificacao1=true;
        for(int value = tamanho_array, i = 0; value >= 0; value--, i++){
            if(this._array.get(i) != value){
                verificacao1 = false;
            }
        }
        if(verificacao1 == true && this._arrays_gerados == this.fatorial(this._tamanho)){
            return true;
        }

        return false;
       
    }
    public ArrayList<Integer> next(){
        ArrayList <Integer> antigo = new ArrayList<Integer>(this._array);

        int tamanho_array = this._tamanho - 1;

        int idxParte1 = -1; 
        for(int i = tamanho_array; i >= 0; i--){
            if(i != tamanho_array){
                if(this._array.get(i) < this._array.get(i+1)){
                    idxParte1 = i;
                    break;
                }
            }
        }

        
        if(idxParte1 != -1){
            int idxParte2 = -1; 
            for(int j = tamanho_array; j >= 0; j--){
                if(this._array.get(j) > this._array.get(idxParte1)){
                    idxParte2 = j;
                    break;
                }
            }
            
            int elemento_antigo = this._array.get(idxParte1);
            this._array.set(idxParte1, this._array.get(idxParte2)); 
            this._array.set(idxParte2, elemento_antigo);

            List<Integer> ultimos = this._array.subList(idxParte1 + 1, this._tamanho);

            Collections.sort(ultimos);
            
        }
        this._arrays_gerados++;
            

        return antigo;
    }

    private int fatorial(int n){
        int fatorial=1;
        if(n == 0){
            return fatorial;
        }
        for(int i = n ; i > 0; i--){
            fatorial *= i;
        }

        return fatorial;
    }

    ArrayList<Integer> _array;
    private int _tamanho;
    private int _arrays_gerados;

}

// Permutations (herda de Generator >): usado para gerar todas as permutações de uma sequência de números. A cada chamada de next retorna a próxima permutação dos números.



// - next(): Retorne a sequência atual e atualize o array para ser a próxima permutação (veja a seguir).

// Algoritmo para Próxima Permutação


// Exemplo:

// Considere que o array atual é [1, 3, 5, 4, 2]:

// 1. Encontrar o Pivô:  Percorrendo da direita, o primeiro número menor que seu vizinho da direita é 3 (no índice i = 1), pois 3 < 5. O sufixo é [5, 4, 2].
// 2. Encontrar o Elemento de Troca: O menor elemento do sufixo [5, 4, 2] que é maior que 3 é 4 (no índice j = 3).
// 3. Trocar: Troque array[1] = 3 com array[3] = 4. O array vira [1, 4, 5, 3, 2].
// 4. Reverter o Sufixo: Inverta os elementos do índice 2 até o final: [5, 3, 2] vira [2, 3, 5].

// Resultado final: [1, 4, 2, 3, 5].

// Repetindo o processo continuamente, serão produzidas todas as permutações de valores.