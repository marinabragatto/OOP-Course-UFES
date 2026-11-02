import java.util.*;


public class Product implements Comparable<Product>{
    
    public Product(String nome, double preco){
        this._nome = nome;
        this._preco = preco;
    }   

    @Override
    public int compareTo(Product other){
        if(this._preco < other._preco){
            return -1;
        }
        if(this._preco > other._preco){
            return 1;
        }

        if(this._nome.compareTo(other._nome) > 0){
            return 1;
        }

        return -1;
    }

    public String retorna_nome(){
        return this._nome;
    }
    
    public double retorna_preco(){
        return this._preco;
    }

    private String _nome;
    private double _preco;

}
