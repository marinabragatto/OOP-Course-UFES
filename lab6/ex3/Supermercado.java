import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Collections;

public class Supermercado{
    private HashMap<String, Produto> produtos;
    private HashMap<String, Cliente> clientes;
    private ArrayList<Compra> compras;

    Supermercado(){
        this.produtos = new HashMap<String, Produto>();
        this.clientes = new HashMap<String, Cliente>();
        this.compras = new ArrayList<Compra>();

    }

    public void registrar_produto(Produto produto_in, String key){
        this.produtos.put(key, produto_in);

    }
    
    public void registrar_cliente(Cliente cliente_in, String key){
        this.clientes.put(key, cliente_in);
    }

    public int adquirir_produto(String nome_p, int quantidade){
        Produto p_obj = this.produtos.get(nome_p);
        
        if(p_obj != null){
            p_obj.incrementa_estoque(quantidade);
            return 1;
        }

        return 0;
    }

    public double finaliza_compra(Compra compra){
        HashMap<String, Integer> produtos_compra = compra.retorna_produtos();
        
        double valor_total = 0;
        Produto prod_i;
        int qtd_i;


        for (String nome : produtos_compra.keySet()) {
            
            qtd_i = produtos_compra.get(nome);

            prod_i = this.produtos.get(nome);

            if(prod_i != null){
                if(prod_i.retorna_estoque() >= qtd_i){
                    prod_i.decrementa_estoque(qtd_i);
                    valor_total += (prod_i.retorna_valor())*qtd_i;
                }
                else{
                    produtos_compra.replace(nome, -1);
                }
            }
        } 

        this.compras.add(compra);

        return valor_total;
    }

    public double valor_vendido(){
        double total = 0;

        for (Compra c_i: this.compras) {
            HashMap<String, Integer> produtos_compra = c_i.retorna_produtos();

            Produto prod_i;
            int qtd_i;
            
            for (String nome : produtos_compra.keySet()) {
                
                qtd_i = produtos_compra.get(nome);
                prod_i = this.produtos.get(nome);

                if(prod_i != null){
                    if(qtd_i != -1){
                        total += (prod_i.retorna_valor()) * qtd_i;
                    }
                }
            } 
            
        }

        return total;
    }

    public String produto_mais_vendido(){

        HashMap<String, Integer> todos_produtos = new HashMap<String, Integer>();

        for (Compra c_i: this.compras) {
            HashMap<String, Integer> produtos_compra = c_i.retorna_produtos();

            Produto prod_i;
            int qtd_i;
            
            for (String nome : produtos_compra.keySet()) {
                
                qtd_i = produtos_compra.get(nome);
                prod_i = this.produtos.get(nome);

                if(prod_i != null){ 
                    if(qtd_i != -1){
                        todos_produtos.merge(nome, qtd_i, Integer::sum);
                    }
                }
            } 
            
        }

        String nome_maior = null;
        int qtdMaior = -1, qtdAtual = 0;

        for(String nome_i : todos_produtos.keySet()){
            qtdAtual = todos_produtos.get(nome_i);
            if(qtdAtual > qtdMaior){
                nome_maior = nome_i;
                qtdMaior =  qtdAtual; 
            }
        }

        return nome_maior;
    }     

    public String melhor_cliente(){
        
        HashMap<String, Integer> clientes_compras = new HashMap<String, Integer>();

        for(Compra c_i : this.compras){
            String cpf_cliente = c_i.retorna_cliente_cpf();
            Cliente cliente;
            cliente = this.clientes.get(cpf_cliente);

            if(cliente != null){
                clientes_compras.merge(cpf_cliente, 1, Integer::sum);
            }
        }


        String cpf_maior = null;
        int qtdMaior = -1, qtdAtual = 0;

        for(String cpf_i : clientes_compras.keySet()){
            qtdAtual = clientes_compras.get(cpf_i);
            if(qtdAtual > qtdMaior){
                cpf_maior = cpf_i;
                qtdMaior =  qtdAtual; 
            }
        }
        Cliente cliente = this.clientes.get(cpf_maior);
        
        return cliente.retorna_nome_cliente();
    }

    public ArrayList<String> produtos_em_falta(){
        ArrayList <String> produtos_falta = new ArrayList<>(); 

        for(String nome_i : this.produtos.keySet()){
            Produto prod_i = this.produtos.get(nome_i);
            if(prod_i != null){
                if(prod_i.retorna_estoque() < 5){
                    produtos_falta.add(prod_i.retorna_nome());
                }
                
            }
        }

        return produtos_falta;
    }

}