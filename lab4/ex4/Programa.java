import java.util.Scanner;

public class Programa
{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        
        String nomeRede;
        nomeRede = sc.nextLine();

        Restaurante [] restaurantes = new Restaurante[2];
        String nomeRestaurante, nomeProduto;
        int estoque_diario, n_vendas;
        double custo, preco;

        for(int i = 0; i < 2; i++){
            
            nomeRestaurante = sc.nextLine();

            Produto [] produtos = new Produto[3];

            for(int j = 0; j < 3; j++){
                //estoque diário, vendas, custo e preço
                nomeProduto = sc.next();
                estoque_diario = sc.nextInt();
                n_vendas = sc.nextInt();
                custo = sc.nextDouble();
                preco = sc.nextDouble();

                produtos[j] = new Produto(nomeProduto, estoque_diario, n_vendas, custo, preco);
    
            } 

            restaurantes[i] = new Restaurante(nomeRestaurante, produtos);  
            if(sc.hasNextLine()){
                sc.nextLine();
            }
        }

        Rede rede = new Rede(nomeRede, restaurantes);
        
        Produto p_mais_vendido;
        p_mais_vendido = rede.mais_vendido();
        System.out.printf("%s %d\n", p_mais_vendido.get_nome(), p_mais_vendido.qtd_vendas());

        Restaurante r_mais_lucrativo;
        r_mais_lucrativo = rede.mais_lucrativo();
        System.out.printf("%s %.2f\n", r_mais_lucrativo.get_nome(), r_mais_lucrativo.lucro());

        System.out.printf("%.2f\n%.2f\n%.2f\n", rede.valor_vendas(), rede.custo(), rede.lucro());

        sc.close();

    }
}