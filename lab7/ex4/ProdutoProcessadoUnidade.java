

class ProdutoProcessadoUnidade extends ProdutoProcessado{
    private double preco_unidade;
    private int unidades_vendidas;
    
    public ProdutoProcessadoUnidade(String nome, int quantidade_produzida, double custo_materia_prima_por_qtd, double custo_funcionario, double preco_unidade, int unidades_vendidas){
        super(nome, quantidade_produzida, custo_materia_prima_por_qtd, custo_funcionario);
        this.preco_unidade = preco_unidade;
        this.unidades_vendidas = unidades_vendidas;
    }
    
    @Override 
    public double entrada(){
        return preco_unidade*unidades_vendidas;
    }
}