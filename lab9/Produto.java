public class Produto{

    public Produto(String nome, double preco){
        _nome = nome;
        _preco = preco;
    }

    public double retorna_preco(){
        return this._preco;
    }

    @Override
    public String toString(){
        return _nome + " " + String.format("%.2f\n", _preco);
    }
    String _nome;
    double _preco;
}