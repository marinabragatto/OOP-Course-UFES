import java.util.Scanner;


public class LeitorTerminal implements AutoCloseable{
    private final Scanner _sc;
    public LeitorTerminal(){
        _sc = new Scanner(System.in);
    }

    public Cliente leCliente(){
        String nome = _sc.next();
        String email = _sc.next();
        String telefone = _sc.next();
        double dist_entrega = _sc.nextDouble();

        return new Cliente(nome, telefone, email, dist_entrega);
    }

    public Produto le_produto(){
        String nome = _sc.next();        
        double preco = _sc.nextDouble();

        return new Produto(nome, preco);

    }
    public Compra le_compra(){
        
        Compra compra  = new Compra();

        /* LEITURA DO CLIENTE DA COMPRA*/
        Cliente cliente = leCliente();
        compra.define_cliente(cliente);

        
        /* LEITURA DOS PRODUTOS DA COMPRA*/
        int qtd_items = _sc.nextInt();
        for(int i = 0; i < qtd_items; i++){
            Produto prod_i = le_produto();
            compra.insere_produto(prod_i);
        }

        /* LEITURA MEIO DE ENTREGA*/
        String nome_meio_entrega = _sc.next();
        MeioEntrega meio_entrega = null;
        if(nome_meio_entrega.equals("PAC")){
            meio_entrega = new Pac();
        }
        if(nome_meio_entrega.equals("SEDEX")){
            meio_entrega = new Sedex();
        }
        if(nome_meio_entrega.equals("SEDEX10")){
            meio_entrega = new Sedex10();
        }

        if(meio_entrega != null){
            compra.define_meio_entrega(meio_entrega);
        }

        /* LEITURA METODO PAGAMENTO */
        String nome_metodo_pagamento = _sc.next();
        MetodoPagamento metodo_pagamento =  null;
        if(nome_metodo_pagamento.equals("PIX")){
            metodo_pagamento = new Pix();
        }
        if(nome_metodo_pagamento.equals("CARTAO")){
            metodo_pagamento = new Cartao();
        }
        if(nome_metodo_pagamento.equals("CARNE")){
            metodo_pagamento = new Carne();
        }
        if(metodo_pagamento != null){
            compra.define_metodo_pagamento(metodo_pagamento);
        }

        return compra;
    }


    @Override 
    public void close(){
        _sc.close();
    }    
}