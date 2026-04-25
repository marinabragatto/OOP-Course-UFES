
class ProdutoPorPeso extends Produto{
    protected double kg_comprados;
    protected double kg_vendidos;
    protected double preco_por_kg_compra;
    protected double preco_por_kg_venda;

    public ProdutoPorPeso(String nome, double kg_comprados, double kg_vendidos, double preco_por_kg_compra, double preco_por_kg_venda){
        super(nome);
        this.kg_comprados = kg_comprados;
        this.kg_vendidos = kg_vendidos;
        this.preco_por_kg_compra = preco_por_kg_compra;
        this.preco_por_kg_venda = preco_por_kg_venda;
    }

    @Override
    public double entrada(){
        return kg_vendidos * preco_por_kg_venda;
    }
    @Override
    public double custo(){
        return kg_comprados * preco_por_kg_compra;
    }
}