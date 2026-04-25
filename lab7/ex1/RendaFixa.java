public class RendaFixa extends Investimento{
    private int _duracao;
    private double _taxa;

    public RendaFixa(String nome_in, double valor_inicial_in, int duracao_in, double taxa_in){
        super(nome_in, valor_inicial_in);
        this._duracao = duracao_in;
        this._taxa = taxa_in;
    }

    public double retorno(){
        double retorno = 0;

        retorno +=  this.get_valor_inicial()*(Math.pow((1 + this._taxa), this._duracao));
        
        return retorno;
    }


}   
