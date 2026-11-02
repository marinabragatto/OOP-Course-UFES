class ProdutoProcessadoKg extends ProdutoProcessado{
    private double preco_kg_venda;
    private double kg_vendidos;

    public ProdutoProcessadoKg(String nome, int qtd_produzida, double custo_materia_prima_por_qtd, double custo_funcionario, double preco_kg_venda, double kg_vendidos){
        super(nome, qtd_produzida, custo_materia_prima_por_qtd, custo_funcionario);
        this.preco_kg_venda = preco_kg_venda;
        this.kg_vendidos = kg_vendidos;
    }
    
    @Override
    public double entrada(){
        return preco_kg_venda*kg_vendidos;
    }
}