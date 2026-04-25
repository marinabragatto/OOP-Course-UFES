

class BicicletaCompartilhada extends Transporte{
    private double horas_utilizadas;
    private double preco_por_hora;
    private double custo_manutencao_por_hora;

    public BicicletaCompartilhada(double custo_base, double horas_utilizadas, double preco_por_hora, double custo_manutencao_por_hora){
        super(custo_base);
        this.horas_utilizadas = horas_utilizadas;
        this.preco_por_hora = preco_por_hora;
        this.custo_manutencao_por_hora = custo_manutencao_por_hora;
    }

    @Override
    public double lucratividade(){        
        return (this.horas_utilizadas*this.preco_por_hora*(this.custo_base + this.custo_manutencao_por_hora * this.horas_utilizadas));
    }
        
    @Override
    public String nome(){
        return "Bicicleta";
    }
}