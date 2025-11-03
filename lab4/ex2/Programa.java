import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String nome;
        nome = sc.nextLine();
  

        int estoque;
        estoque = sc.nextInt();

        double valor;
        valor = sc.nextDouble();

        double desconto;
        desconto = sc.nextDouble();

        Produto p = new Produto(nome, estoque, valor, desconto);

        int it;
        it = sc.nextInt();

        char op;
        for(int i = 0; i < it; i++){
            op = sc.next().charAt(0);

            int quantidade;

            if(op == 'V'){
                quantidade = sc.nextInt();
                p.Venda(quantidade);
            }
            if(op == 'C'){
                quantidade = sc.nextInt();
                p.Compra(quantidade);
            }
        }   

        p.print();

        sc.close();
    }

}


/*
 * Descrição:
Crie uma classe Produto no arquivo Produto.java contendo os seguintes atributos privados e métodos públicos:
Atributos:
- nome: String
- estoque: int
- valor: double
- desconto: double
- total vendas: int
Métodos:
- construtor: deve receber os valores dos atributos na mesma ordem em que foram definidos, exceto o total vendas que deve ser inicializado com zero.
- compra(int): incrementa o estoque da quantidade.
- venda(int): decrementa o estoque da quantidade.
- preco() -> double: retorna o valor com desconto.
- valor_vendas() -> double: retorna o produto do número de vendas pelo preco. Vamos assumir que o desconto não muda ao longo do tempo.

As seguintes regras de negócio devem ser seguidas:
- estoque deve ser maior ou igual a zero.
- valor deve ser maior que zero.
- desconto deve estar ser maior ou igual a zero e menor que 1.
- argumentos dos métodos compra e venda devem ser maiores que zero.

Se uma das regras for invalidada, mostre na tela a mensagem VALOR INVALIDO e não atualize o valor do atributo. Os testes não precisam ser realizados no construtor.

Crie uma classe Programa no arquivo Programa.java contendo o método main.
Neste método, leia os dados do produto e use estes dados para criar um objeto do tipo Produto.
Em seguida, leia um número n representando o número de interações com o sistema. Cada interação é dada em uma linha e consiste em uma letra seguida de um número. A letra "C" indica uma compra e a letra "V" indica um venda. A cada interação, invoque os métodos associados de produto.
Ao final, mostre na tela os dados dos produtos (nome, estoque, valor, desconto e preço) e o valor total em vendas. Todos os doubles devem ser exibidos com 2 casas depois da vírgula.
 * 
 * 
 * 
 */