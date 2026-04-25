import java.util.Scanner;


public class Programa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String nome_generator;
        nome_generator = sc.next();

        Generator gen = null;

        if(nome_generator.equals("Range")){
            double valor_inicial, valor_final, passo;
            valor_inicial = sc.nextDouble();
            valor_final = sc.nextDouble();
            passo = sc.nextDouble();

            gen = new Range(valor_inicial, valor_final, passo);
        }

        if(nome_generator.equals("Fibonacci")){
            int num_items_final;
            num_items_final = sc.nextInt();

            gen = new Fibonacci(num_items_final);
        }

        if(nome_generator.equals("Permutations")){
            int tamanho;
            tamanho = sc.nextInt();

            gen = new Permutations(tamanho);
        }

        if(gen != null){
            gen.reset();
            Object obj;

            do{
                obj = gen.next();
                System.out.printf("%s\n", obj.toString());
            }while(!gen.is_over());

        }
    }
}
// Generators (geradores) são estruturas de dados utilizadas para produzir sequências de dados por demanda, isto é, sem computar a priori todos os valores. O uso de generatos está relacionado à técnica de lazy computing (computação preguiçosa) que tem como objetivo minimizar o consumo de memória (mantendo um ou poucos itens da sequência na memória de cada vez) e postergar a computação até quando ela é realmente necessária. Para estudar esta técnica, vamos implementar alguns geradores.

// Crie uma interface Generator contendo os métodos listados abaixo. Use template/generics para definir o tipo de retorno do método next.

// - void reset(): inicia o processo de geração.
// - bool is_over(): retorna True se não existem mais itens a serem gerados e False, caso contrário.
// - T next(): retorna o próximo item da sequência e atualiza o estado do gerador.

// Em seguida, escreva as seguintes classes implementado a interface:

// Range (herda de Generator): usado para gerar números sequencialmente.

// - No construtor, receba o valor inicial, o valor final e o passo de atualização da sequência. Crie um atributo privado valor_atual que irá armazenar o próximo valor a ser retornado pelo gerador.
// - reset(): inicializa o valor_atual como o valor inicial da geração.
// - is_over(): compara o valor_atual com o valor final para verificar a geração deve terminar. Se o passo for positivo e o valor_atual for maior ou igual que o valor final, retorna verdadeiro. De forma similar, se o passo for negativo e o valor_atual for menor ou igual que o valor final, retorna verdadeiro. Se nenhuma das duas condições for satisfeita, retorna Falso.
// - next(): retorna o valor_atual e atualiza o valor somando o passo.

// ---

// Fibonacci (herda de Generator): usado para gerar números de Fibonacci (1, 1, 2, 3, 5, 8, 13, 21, ...) sequencialmente, isto é, um de cada vez.

// - No construtor, recebe o número de itens da sequência a serem gerados. Crie atributos privados para armazenar a quantidade de itens produzidos e para guardar os dois últimos valores produzidos.
// - reset(): inicializa a quantidade de itens produzidos como 0 e os dois últimos valores produzidos como 1.
// - is_over(): verifica se a quantidade de itens produzidos é igual à quantidade desejada.
// - next(): Um item da sequência de fibonacci é dado pela soma dos dois anteriores.


// ---



// -----------------------------

// Na main, cria uma variável do tipo Generator `Generator gen = null;`. O símbolo de `?` é chamado de `wildcard` (curinga) e é usado quando não sabemos o tipo que o template vai assumir no momento de declaração da variável.

// Em seguida, leia o nome de um gerador e seus argumentos como indicado abaixo.

// - Range
// - Fibonacci
// - Permutations

// Crie um objeto do tipo indicado e atribua à variável do tipo Generator. Note como não é possível saber em tempo de compilação qual será o tipo do objeto que será atribuído à variável do tipo Generator.

// Em seguida, usando os métodos da interface, gere todos os itens da sequência e mostre-os na tela. Como os tipos gerados por next serão diferentes dependendo de qual gerador foi criado, armazena o resultado de next em uma variável do tipo Object e conte com o mecanismo de amarração tardia para garantir que a versão correta de toString() será invocada para mostrar os dados na tela.