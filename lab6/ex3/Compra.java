import java.util.ArrayList;
import java.util.HashMap;

public class Compra{
    private String cpf_cliente;
    private HashMap<String, Integer> produtos; // Armazena o produto e a quantidade dele

    
    Compra(String cpf_in){
        
        this.cpf_cliente = cpf_in;
        this.produtos = new HashMap<String, Integer>();

    }

    public void adiciona_produto(String nome, int quantidade){
        produtos.put(nome, quantidade);
    }
    
    public HashMap<String, Integer> retorna_produtos(){
        return this.produtos;
    }

    public String retorna_cliente_cpf(){
        return this.cpf_cliente;
    }


    

    // public void efetua_compra(){

    // }
}