abstract class Transporte{
    protected double custo_base;

    public Transporte(double custo_base){
        this.custo_base = custo_base;
    }
    public abstract String nome();
    public abstract double lucratividade();
}   
