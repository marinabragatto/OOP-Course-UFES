

class Metro extends Transporte{
    private int numero_de_passageiros;
    private double receita_por_passageiro;

    public Metro(double custo_base, int numero_de_passageiros, double receita_por_passageiro){
        super(custo_base);
        this.numero_de_passageiros = numero_de_passageiros;
        this.receita_por_passageiro = receita_por_passageiro;
    }
    @Override
    public double lucratividade(){
        return this.numero_de_passageiros*this.receita_por_passageiro - this.custo_base;
    }

        @Override
    public String nome(){
        return "Metro";
    }


}