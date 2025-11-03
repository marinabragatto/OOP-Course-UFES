public class Produto
{
    public String nome;
    public int estoque;
    public double valor;
    public double desconto;
    public int totalVendas;

    public Produto(String nome,int estoque, double valor, double desconto){
        this.nome = nome;

        if(estoque < 0){
            System.out.printf("VALOR INVALIDO\n");
            this.estoque = 0;
        }
        else {
            this.estoque = estoque;
        }

        if(valor < 0){
            System.out.printf("VALOR INVALIDO\n");
            this.valor = 0;           
        }
        else {
            this.valor = valor;
        }
        //- desconto deve estar ser maior ou igual a zero e menor que 1.
        if(desconto >= 0 && desconto < 1){
            
            this.desconto = desconto;
        }
        else {
            System.out.printf("VALOR INVALIDO\n");
            this.desconto = 0;
        }
        
        this.totalVendas = 0;
    }

    public void Compra(int quantidade){
        if(quantidade < 0){
            System.out.printf("VALOR INVALIDO\n");
        }
        else {
            this.estoque+= quantidade;
        }
    }


    public void Venda(int quantidade){
        if(quantidade < 0){
            System.out.printf("VALOR INVALIDO\n");
        }
        else {
            this.estoque -= quantidade;
            this.totalVendas+= quantidade;
        }

    }
    public double Preco(){
        return this.valor - (this.valor)*(this.desconto);
    }
    public double valor_vendas(){
        return (this.Preco())*this.totalVendas;
    }

    public void print(){
        System.out.printf("%s\n%d\n%.2f\n%.2f\n%.2f\n%.2f", this.nome, this.estoque, this.valor,this.desconto, this.Preco(), this.valor_vendas());
    }
}

/*
 * 
 * 
 * 
 * 
 * 
 *  * Descrição:
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
 */