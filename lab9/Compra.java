import java.util.ArrayList;

public class Compra{

    public Compra(){

        _carrinho = new Carrinho();
        _cliente = null;
        _notificadores = new ArrayList<Notificador>();
        _notificadores.add(new Email());
        _notificadores.add(new PopUp());
        _notificadores.add(new Sms());
        _metodo_pagamento = null;
        _meio_entrega = null;

    }
    public void insere_produto(Produto produto){
        _carrinho.insere_produto(produto);
    }

    public void define_cliente(Cliente cliente){
        _cliente = cliente;
    }

    public double total(){
        double carrinho_total = _carrinho.total();
        double frete = _meio_entrega.frete(_carrinho,_cliente);
        double total = carrinho_total+frete;

        double valor_pago = _metodo_pagamento.pagar(total);
        String valor_arrendodado = String.format("%.3f", valor_pago);
        valor_arrendodado = valor_arrendodado.substring(0, valor_arrendodado.length() - 1);
        valor_pago = Double.parseDouble(valor_arrendodado);
        return valor_pago;
    }
    public void define_meio_entrega(MeioEntrega meio_entrega){
        _meio_entrega = meio_entrega;
    } 

    public void define_metodo_pagamento(MetodoPagamento metodo_pagamento){
        _metodo_pagamento = metodo_pagamento;
    } 

    public int prazo_entrega(){
        return _meio_entrega.prazo();
    }

    public void finalizar(){
        for(Notificador notificador_i : _notificadores){
            notificador_i.notificar(_cliente, this);
        }
        
        imprime_notal_fiscal();
    }

    public void imprime_notal_fiscal(){
        _carrinho.imprime();
        double carrinho_total = _carrinho.total();
        double frete = _meio_entrega.frete(_carrinho,_cliente);
        double total = carrinho_total+frete;
        System.out.printf("soma dos itens: %.2f\n", carrinho_total);
        System.out.printf("frete: %.2f\n", frete);
        System.out.printf("total com frete: %.2f\n", total);

        // erro de precisao
        double valor_pago = _metodo_pagamento.pagar(total);
        String valor_arrendodado = String.format("%.3f", valor_pago);
        valor_arrendodado = valor_arrendodado.substring(0, valor_arrendodado.length() - 1);
        System.out.printf("valor total: %s", valor_arrendodado);
        

    }

    private Carrinho _carrinho;
    private Cliente _cliente;
    private ArrayList<Notificador> _notificadores;
    private MetodoPagamento _metodo_pagamento;
    private MeioEntrega _meio_entrega; 

}