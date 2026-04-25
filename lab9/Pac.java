public class Pac implements MeioEntrega{
    public Pac(){
        
    }


    public int prazo(){
        return 15;
    }

    public double frete(Carrinho carrinho, Cliente cliente){
        return (carrinho.total()*0.05) + 0.05*cliente.retorna_dist_entrega();
    }

    
}