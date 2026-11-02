// Na classe carrinho, receba um FreteStrategy no construtor e crie uma setter que permita modificar a estratégia.
// Para simular esta situação, crie uma classe Carrinho com um método calcularTotalCompra que receba como argumento o valor total dos itens, seu peso e a distancia para o local de entrega. O objetivo do método é calcular o custo da compra somando o valor dos itens com o valor do frete.
class Carrinho{
    private FreteStrategy _freteStrategy;
    public Carrinho(FreteStrategy freteStrategy){
        this._freteStrategy = freteStrategy;
    }
    public double calcularTotalCompra(double valorTotalItems, double pesoEmKg, double distanciaEmKm){
        return (valorTotalItems + this._freteStrategy.calcularFrete(pesoEmKg, distanciaEmKm));
    }
    public void novo_freteStrategy(FreteStrategy freteStrategy){
        this._freteStrategy = freteStrategy;
    }
}