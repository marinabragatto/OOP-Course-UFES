
class FretePadrao implements FreteStrategy{

    public FretePadrao(){
        this._custoBase = 5.0;
    }
    public double calcularFrete(double pesoEmKg, double distanciaEmKm){
        return (_custoBase + (pesoEmKg*1.0));
    }

    private double _custoBase;
}
   

// No exemplo, crie uma interface FreteStrategy contendo apenas um método `double calcularFrete(double pesoEmKg, double distanciaEmKm)`.

// Implemente as seguintes classes que implementam a interface:

// * FretePadrao: Custo = 5.0 + (pesoEmKg * 1.0)
// * FreteExpresso: Custo = 10.0 + (pesoEmKg * 2.5) + (distanciaEmKm * 0.1)
// * RetiradaNaLoja: Custo = 0.0
// * FreteTransportadora: Custo = (pesoEmKg * 1.8) + (distanciaEmKm * 0.5)

// Na classe carrinho, receba um FreteStrategy no construtor e crie uma setter que permita modificar a estratégia.
