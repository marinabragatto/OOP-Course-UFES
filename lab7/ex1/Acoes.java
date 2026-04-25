public class Acoes extends Investimento{
//Crie uma subclasse Acoes que tenha como atributos a taxa de variação acumulada no valor da ação até o momento. 
//Implemente o método retorno como sendo a 
//diferença entre o valor atual da ação e o valor no momento da compra (investimento inicial).
    private double taxa_variacao;

    public Acoes(String nome_in, double valor_inicial_in, double taxa_variacao_in){
        super(nome_in, valor_inicial_in);
        this.taxa_variacao = taxa_variacao_in;
    }
    
    @Override
    public double retorno() {
        double retorno = 0;
        //retorno -= this.get_valor_inicial();
        retorno += this.get_valor_inicial()*(this.taxa_variacao);

        return retorno;
    }
}