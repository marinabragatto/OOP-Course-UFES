
class CarneAcougue extends ProdutoPorPeso{
    public double custo_acougueiro;

    public CarneAcougue(String nome, double kg_comprados, double kg_vendidos, double preco_por_kg_compra, double preco_por_kg_venda, double custo_acougueiro){
        super(nome, kg_comprados, kg_vendidos, preco_por_kg_compra, preco_por_kg_venda);
        this.custo_acougueiro = custo_acougueiro;
    }
    @Override
    public double custo(){
        return super.custo() + custo_acougueiro;
    }
}

