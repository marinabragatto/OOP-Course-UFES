public class Sedex10 implements MeioEntrega{
    public Sedex10(){
        
    }

// - PAC: entrega em até 15 dias e custo é 5% do valor da compra + 0.05 * distância para casa.
// - SEDEX: entrega em até 5 dias e custo é 20% do valor da compra + 0.1 * distância para casa..
// - SEDEX10: entrega em até 24h e custo é 50% do valor da compra + 0.75 * distância para casa..

    public int prazo(){
        return 1;
    }

    public double frete(Carrinho carrinho, Cliente cliente){
        return (carrinho.total()*0.5) + 0.75*cliente.retorna_dist_entrega();
    }

}