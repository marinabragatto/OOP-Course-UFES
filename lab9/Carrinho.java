import java.util.ArrayList;

public class Carrinho{
    public Carrinho(){
        _produtos = new ArrayList<Produto>();        
    }

    public double total(){
        double total = 0;
        for(Produto produto_i : this._produtos){
            total += produto_i.retorna_preco();
        }

        return total;
    }

    public void imprime(){
        for(Produto produto_i : this._produtos){
            System.out.print(produto_i);
        }
    }

    public void insere_produto(Produto produto){
        _produtos.add(produto);
    }
    private ArrayList<Produto> _produtos;

}