public class Produto {
    private double valor;
    private String nome;
    private int qtd_estoque;


    public Produto(String nome_in, double valor_in){
        this.qtd_estoque = 0;
        this.nome = nome_in;
        this.valor = valor_in;
    }
    
    public void incrementa_estoque(int quantidade_in){
        this.qtd_estoque+=quantidade_in;
    }

    public void decrementa_estoque(int quantidade_in){
        this.qtd_estoque -= quantidade_in;
    }

    public int retorna_estoque(){
        return this.qtd_estoque;
    }

    public double retorna_valor(){
        return this.valor;
    }

    public String retorna_nome(){
        return this.nome;
    }

}
