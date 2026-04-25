public class Imovel extends Investimento{
    private double _area;
    private double _valorizacao;
    private double _valor_aluguel;
    private int _meses;
    
    public Imovel(String nome_in, double valor_inicial_in, double area_in, double valorizao_in, double valor_aluguel_in, int meses_in){
        super(nome_in, valor_inicial_in);
        this._area = area_in;
        this._valorizacao = valorizao_in;
        this._valor_aluguel = valor_aluguel_in;
        this._meses = meses_in;
    }

    public double retorno(){

        double retorno = 0;
        retorno -= this.get_valor_inicial();
        retorno += this.get_valor_inicial()*Math.pow(1+this._valorizacao, this._meses);
        retorno += this._meses*this._valor_aluguel;

        return retorno;
    }
}

