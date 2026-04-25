
abstract class Investimento{
    protected String nome;
    protected double valor_inicial;
    
    public Investimento(String nome, double valor_inicial){
        this.nome = nome;
        this.valor_inicial = valor_inicial;
    }
    
    public String get_nome(){
        return this.nome;
    }
    public double get_valor_inicial(){
        return this.valor_inicial;
    }

    public abstract double retorno();
}
