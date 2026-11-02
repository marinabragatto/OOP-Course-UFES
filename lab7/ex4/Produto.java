

abstract class Produto{
    protected String nome;
    
    public Produto(String nome){
        this.nome = nome;
    }

    public abstract double custo();
    public abstract double entrada();
    
    public double lucro(){
        return (this.entrada() - this.custo());
    }
    public String retorna_nome(){
        return this.nome;
    }
}
// O objetivo é calcular o lucro gerado por diferentes tipos de produtos de supermercado, cada um com regras de custo e venda distintas.

// Crie uma classe abstrata Produto contendo:

// * atributo protegido nome com getter públicos
// * método abstrato custo(): double
// * método abstrato 
// * método lucro() dado por entrada() * custo()
