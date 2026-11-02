
class ProdutoEmpacotado extends Produto{
    private int quantidade_comprada;
    private int quantidade_vendida;
    private double preco_compra;
    private double preco_venda;

    public ProdutoEmpacotado(String nome, int quantidade_comprada, int quantidade_vendida, double preco_compra, double preco_venda){
        super(nome);
        this.quantidade_comprada = quantidade_comprada;
        this.quantidade_vendida = quantidade_vendida;
        this.preco_compra = preco_compra;
        this.preco_venda = preco_venda;
    }
    @Override 
    public double entrada(){
        return quantidade_vendida*preco_venda;
    }   
    
    @Override 
    public double custo(){
        return quantidade_comprada*preco_compra;
    }
}
