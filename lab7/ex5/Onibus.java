class Onibus extends Transporte {
    private double distancia_percorrida;
    private double preco_gasolina_por_km;
    private int numero_de_passageiros;
    private double preco_passagem;   

    public Onibus(double custo_base, double distancia_percorrida, double preco_gasolina_por_km, int numero_de_passageiros, double preco_passagem){
        super(custo_base);
        this.distancia_percorrida=distancia_percorrida;
        this.preco_gasolina_por_km = preco_gasolina_por_km;
        this.numero_de_passageiros = numero_de_passageiros;
        this.preco_passagem = preco_passagem;
    }

    @Override
    public double lucratividade(){
        return (this.numero_de_passageiros*this.preco_passagem*(this.custo_base + this.distancia_percorrida * this.preco_gasolina_por_km));
    }
        
    @Override
    public String nome(){
        return "Onibus";
    }

}