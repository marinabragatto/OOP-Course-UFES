public class Produto
{
    private String nome;
    private int estoque_diario;
    private int n_vendas;
    private double custo;
    private double preco;

    public Produto(String nome, int estoque_diario, int n_vendas, double custo, double preco)
    {
        this.nome = nome;
        this.estoque_diario = estoque_diario;
        this.n_vendas = n_vendas;
        this.custo = custo;
        this.preco = preco;
    }

    public String get_nome()
    {
        return this.nome;
    }

    public int qtd_vendas()
    {
        return this.n_vendas;
    }

    public double valor_vendas()
    {
        return (this.n_vendas*this.preco);
    }

    public double custo_producao()
    {
        return (this.estoque_diario*this.custo);
    }

    public double lucro()
    {
        return (this.valor_vendas() - this.custo_producao());
    }


}


// A classe Produto possui como atributos privados o nome, estoque diário, número de vendas, custo e preço. Além disto, ela possui os métodos públicos:
// • construtor: recebe os valores de nome, estoque diário, número de vendas, custo e preço.
// • String get_nome(): retorna o nome do produto.
// • Int qtd_vendas(): retorna o número de itens vendidos.
// • float valor_vendas(): retorna o valor total recebido pelo restaurante com a venda diária dos produtos. É dado pelo produto entre número de produtos vendidos pelo preço de venda.
// • float custo_producao(): retorna o custo para produzir o estoque diário. É dado pelo produto entre o tamanho do estoque pelo custo de produção.
// • float lucro(): retorna o lucro total diário com a venda dos produtos. Deve calculado subtraindo a entrada total pelo custo total. A entrada é o preço multiplicado pelo número de produtos vendidos. O custo total é o produto do custo de produção pelo estoque.