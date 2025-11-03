public class Restaurante
{
    private String nome;
    private Produto [] produtos;

    public Restaurante(String nome, Produto[] produtos)
    {
        this.nome = nome;
        this.produtos = produtos;

    }

    public String get_nome()
    {
        return this.nome;
    }

    public double valor_vendas(){
        double soma = 0;       
        for(int i = 0; i < 3; i++){
            soma += this.produtos[i].valor_vendas();
        }

        return soma;
    }
    
    public double custo()
    {
        double soma = 0;       
        for(int i = 0; i < 3; i++){
            soma += this.produtos[i].custo_producao();
        }

        return soma;
    }

    public double lucro()
    {
        double soma = 0;       
        for(int i = 0; i < 3; i++){
            soma += this.produtos[i].lucro();
        }

        return soma;
    }

    public Produto mais_vendido()
    {
        int idxMaior=-1;
        int maior=-1;
               
        for(int i = 0; i < 3; i++){
            if(this.produtos[i].qtd_vendas() > maior){
                idxMaior = i;
                maior = this.produtos[i].qtd_vendas();
            }
        }

        return this.produtos[idxMaior];
    }
    }

