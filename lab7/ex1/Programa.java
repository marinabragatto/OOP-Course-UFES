import java.util.Scanner;
import java.util.ArrayList;
public class Programa{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String operacao;
        int qtd = sc.nextInt();
        
        ArrayList<Investimento> investimentos = new ArrayList<Investimento>(); 


        for(int i = 0; i < qtd; i++){
            operacao = sc.next();
            String nome;
            double valor_inicial;
            
            nome =sc.next();
            valor_inicial = sc.nextDouble();
            
            if(operacao.equals("Acoes")){
                double taxa_variacao;
                taxa_variacao = sc.nextDouble();

                Investimento novo = new Acoes(nome, valor_inicial, taxa_variacao);
                investimentos.add(novo);

            }
            if(operacao.equals("RendaFixa")){
                
                int duracao;
                double taxa;
                duracao=sc.nextInt();
                taxa = sc.nextDouble();
                
                Investimento novo = new RendaFixa(nome,valor_inicial,duracao,taxa);
                investimentos.add(novo);
            
            }
            if(operacao.equals("Imovel")){
                double area;
                double valorizao;
                double valor_aluguel;
                int meses;

                area = sc.nextDouble();
                valorizao = sc.nextDouble();
                valor_aluguel = sc.nextDouble();
                meses = sc.nextInt();

                Investimento novo = new Imovel(nome,valor_inicial, area,valorizao, valor_aluguel, meses);
                investimentos.add(novo);

            }
           
            
        }

        double total = 0;
        int primeira_iteracao=1;
        int idxMaior =-1;
        double valor_maior=-1;
        int i = 0;

        for (Investimento inv : investimentos) {
            System.out.printf("%s %.2f\n", inv.get_nome(),  inv.retorno());
            if(primeira_iteracao == 1){
                primeira_iteracao = 0;
                idxMaior = i;
                valor_maior = inv.retorno();
            }
            
            if(valor_maior < inv.retorno()){
                idxMaior = i;
                valor_maior = inv.retorno();
            }

            total += inv.retorno();
            i++;
        }

    //    Cole

        System.out.printf("%.2f\n",  total);
        System.out.printf("%s\n",  investimentos.get(idxMaior).get_nome());

    }
}

