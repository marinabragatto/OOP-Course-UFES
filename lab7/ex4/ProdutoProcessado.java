

abstract class ProdutoProcessado extends Produto{
    protected int qtd_produzida;
    protected double custo_materia_prima_por_qtd;
    protected double custo_funcionario;

    public ProdutoProcessado(String nome, int qtd_produzida, double custo_materia_prima_por_qtd, double custo_funcionario){
        super(nome);
        this.custo_materia_prima_por_qtd = custo_materia_prima_por_qtd;
        this.custo_funcionario = custo_funcionario;
        this.qtd_produzida = qtd_produzida;
    }

    @Override
    public double custo(){
        return ((qtd_produzida * custo_materia_prima_por_qtd) + custo_funcionario);
    }

    public abstract double entrada();
}