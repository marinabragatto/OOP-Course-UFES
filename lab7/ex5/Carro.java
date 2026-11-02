
class Carro extends Transporte{
    private double taxa_desvalorização;
    private double distancia_percorrida;
    private double preco_gasolina_por_km;
    private double preco_manunentacao_por_km;
    
    public Carro(double custo_base, double taxa_desvalorização, double distancia_percorrida, double preco_gasolina_por_km, double preco_manunentacao_por_km){
        super(custo_base);
        this.taxa_desvalorização = taxa_desvalorização;
        this.distancia_percorrida = distancia_percorrida;
        this.preco_gasolina_por_km = preco_gasolina_por_km;
        this.preco_manunentacao_por_km = preco_manunentacao_por_km;
    }

    @Override
    public double lucratividade(){        
        return (this.custo_base*this.taxa_desvalorização*(this.custo_base + this.distancia_percorrida*this.preco_gasolina_por_km + this.distancia_percorrida*this.preco_manunentacao_por_km));
    }
        
    @Override
    public String nome(){
        return "Carro";
    }

}