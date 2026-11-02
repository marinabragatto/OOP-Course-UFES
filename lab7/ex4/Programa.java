import java.util.Scanner;
import java.util.ArrayList;

class Programa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Produto> produtos = new ArrayList<>();

        String operation;
        String nome;
        for(int i = 0; i < num; i++){
            operation = sc.next();
            nome = sc.next();
            
            if(operation.equals("ProdutoEmpacotado")){
                int quantidade_comprada, quantidade_vendida; 
                double preco_compra, preco_venda;
                quantidade_comprada = sc.nextInt();
                quantidade_vendida = sc.nextInt();
                preco_compra = sc.nextDouble();
                preco_venda = sc.nextDouble();
                
                produtos.add(new ProdutoEmpacotado(nome, quantidade_comprada, quantidade_vendida, preco_compra, preco_venda));
            }
            if(operation.equals("ProdutoPorPeso")){
                double kg_comprados, kg_vendidos, preco_por_kg_compra, preco_por_kg_venda;
                kg_comprados = sc.nextDouble();
                kg_vendidos = sc.nextDouble();
                preco_por_kg_compra = sc.nextDouble();
                preco_por_kg_venda = sc.nextDouble();

                produtos.add(new ProdutoPorPeso(nome, kg_comprados, kg_vendidos, preco_por_kg_compra, preco_por_kg_venda));
            }
            if(operation.equals("ProdutoProcessadoUnidade")){
                int qtd_produzida, unidades_vendidas;
                double custo_materia_prima_por_qtd, custo_funcionario, preco_unidade;

                qtd_produzida = sc.nextInt();
                custo_materia_prima_por_qtd = sc.nextDouble();
                custo_funcionario = sc.nextDouble();
                preco_unidade = sc.nextDouble();
                unidades_vendidas = sc.nextInt();


                produtos.add(new ProdutoProcessadoUnidade(nome, qtd_produzida, custo_materia_prima_por_qtd, custo_funcionario, preco_unidade, unidades_vendidas));
            }
            if(operation.equals("ProdutoProcessadoKg")){
                int quantidade_produzida;
                double custo_materia_prima_por_qtd, custo_funcionario, preco_kg_venda, kg_vendidos;

                quantidade_produzida = sc.nextInt();
                custo_materia_prima_por_qtd = sc.nextDouble();
                custo_funcionario = sc.nextDouble();
                preco_kg_venda = sc.nextDouble();
                kg_vendidos = sc.nextDouble();

                produtos.add(new ProdutoProcessadoKg(nome, quantidade_produzida, custo_materia_prima_por_qtd, custo_funcionario, preco_kg_venda, kg_vendidos));
            }
            if(operation.equals("CarneAcougue")){
                double kg_comprados, kg_vendidos, preco_por_kg_compra, preco_por_kg_venda, custo_acougueiro;

                kg_comprados = sc.nextDouble();
                kg_vendidos = sc.nextDouble();
                preco_por_kg_compra = sc.nextDouble();
                preco_por_kg_venda = sc.nextDouble();
                custo_acougueiro = sc.nextDouble();

                produtos.add(new CarneAcougue(nome, kg_comprados, kg_vendidos, preco_por_kg_compra, preco_por_kg_venda, custo_acougueiro));
            
            }
        }


        double receita_total, custo_total, lucro_total;
        receita_total = custo_total = lucro_total = 0;

        double custo_i, lucro_i, receita_i;

        int i = 0;

        int idx_maior_receita=0;
        int idx_maior_lucro=0;
        int idx_maior_custo=0;
        int idx_menor_lucro=0;

        double maior_receita=0;
        double maior_lucro=0;
        double maior_custo=0;
        double menor_lucro=0;

        if(produtos.size() != 0){
            maior_receita=produtos.get(0).entrada();
            maior_lucro=produtos.get(0).lucro();
            maior_custo=produtos.get(0).custo();
            menor_lucro=produtos.get(0).lucro();
        }

        for(Produto p_i : produtos){
            custo_i = p_i.custo();
            custo_total += custo_i;

            receita_i = p_i.entrada();
            receita_total += receita_i;  
            
            lucro_i = p_i.lucro();
            lucro_total  += lucro_i;

            System.out.printf("%s: Receita=%.2f, Custo=%.2f, Lucro=%.2f\n", p_i.retorna_nome(), receita_i, custo_i,  lucro_i);

            if(custo_i > maior_custo){
                idx_maior_custo = i;
                maior_custo = custo_i;
            }
            if(lucro_i > maior_lucro){
                idx_maior_lucro = i;
                maior_lucro = lucro_i;
            }

            if(lucro_i < menor_lucro){
                idx_menor_lucro = i;
                menor_lucro = lucro_i;
            }

            if(receita_i > maior_receita){
                idx_maior_receita = i;
                maior_receita = receita_i;
            }
            i++;
        }

        System.out.printf("Receita Total: %.2f\nCusto Total: %.2f\nLucro Total: %.2f\n", receita_total, custo_total, lucro_total);

        if(produtos.size() != 0){
            System.out.printf("maior receita: %s (%.2f)\nmais custoso: %s (%.2f)\nmais lucrativo: %s (%.2f)\nmenos lucrativo: %s (%.2f)", produtos.get(idx_maior_receita).retorna_nome(), produtos.get(idx_maior_receita).entrada(), produtos.get(idx_maior_custo).retorna_nome(), produtos.get(idx_maior_custo).custo(), produtos.get(idx_maior_lucro).retorna_nome(), produtos.get(idx_maior_lucro).lucro(), produtos.get(idx_menor_lucro).retorna_nome(), produtos.get(idx_menor_lucro).lucro());

        }

        sc.close();

    }
}




// Leia os dados, crie os respectivos objetos e armazene num ArrayList/vector do tipo Produto. Em seguida, itere sobre a lista de produtos e mostre na tela:

// * Nome de cada produto, além de sua receita, custo e lucro (com 2 casas decimais)
// * Receita, custo e lucro total do supermercado
// * Produto que gera maior receita
// * Produto mais custoso
// * Produto mais lucrativo
// * Produto menos lucrativo