public class Rede
{
    private String nome;
    private Restaurante[] restaurantes;

    public Rede (String nome, Restaurante[] restaurantes){
        this.nome = nome;
        this.restaurantes = restaurantes;
    }
    
    public double valor_vendas()
    {
        double soma=0;
        for(int i = 0; i < 2; i++){
            soma += this.restaurantes[i].valor_vendas();
        }

        return soma;
    }
    public double custo()
    {
        double soma=0;
        for(int i = 0; i < 2; i++){
            soma += this.restaurantes[i].custo();
        }

        return soma;
    }        
    public double lucro()
    {
        double soma=0;
        for(int i = 0; i < 2; i++){
            soma += this.restaurantes[i].lucro();
        }

        return soma;        
    }

    public Produto mais_vendido()
    {
        Produto [] produtos= new Produto[2];

        for(int i = 0; i < 2;i++){
            produtos[i] = this.restaurantes[i].mais_vendido();
        }

        if(produtos[0].qtd_vendas() > produtos[1].qtd_vendas()){
            return produtos[0];
        }
        return produtos[1];
        
    }

    public Restaurante mais_lucrativo()
    {
        if(this.restaurantes[0].lucro() > this.restaurantes[1].lucro()){
            return this.restaurantes[0];
        }
        return this.restaurantes[1];
    }


}

// A classe Rede possui como atributos privados o nome e duas instâncias de Restaurante. A classe deve possuir os seguintes métodos públicos:
// • construtor: recebe o nome da rede e os dois objetos do tipo Restaurante.
// • float valor_vendas(): retorna a soma dos valores recebidos com as vendas em todos os restaurantes.
// • float custo(): retorna o custo total dos restaurantes.
// • float lucro(): retorna o lucro total dos restaurantes.
// • Produto mais_vendido(): retorna o produto mais vendido em todos os restaurantes.
// • Restaurante mais_lucrativo(): retorna o restaurante mais lucrativo da rede.