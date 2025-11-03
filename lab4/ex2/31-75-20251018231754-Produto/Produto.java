public class Produto {
    // Atributos
    private String nome;
    private int estoque;
    private double valor;
    private double desconto;
    private int total_vendas;

    // Construtor
    public Produto(String nome_, int estoque_, double valor_, double desconto_) {
        this.nome = nome_;

        if(estoque_ >= 0)
            this.estoque = estoque_;
        else {
            System.out.println("VALOR INVALIDO");
            this.estoque = 0;
        }

        if(valor_ > 0) 
            this.valor = valor_;
        else {
            System.out.println("VALOR INVALIDO");
            this.valor = 1000000;
        }

        if(desconto_ >= 0 && desconto_ < 1)
            this.desconto = desconto_;
        else {
            System.out.println("VALOR INVALIDO");
            this.desconto = 0;
        }

        this.total_vendas = 0;
    }

    // Metodos
    public void compra(int qtd) {
        if(qtd > 0)
            this.estoque += qtd;
        else 
            System.out.println("VALOR INVALIDO");
        
    }

    public void venda(int qtd) {
        if(qtd > 0) {
            this.estoque -= qtd;
            total_vendas += qtd;
        } else
            System.out.println("VALOR INVALIDO");
    }

    public double preco() {
        return (this.valor)*(1-this.desconto);
    }

    public double valor_vendas() {
        return this.preco() * this.total_vendas;
    }

    public void print() {
        System.out.printf("%s\n%d\n%.2f\n%.2f\n%.2f\n%.2f",
        this.nome,
        this.estoque,
        this.valor,
        this.desconto,
        this.preco(),
        this.valor_vendas());
    }

}