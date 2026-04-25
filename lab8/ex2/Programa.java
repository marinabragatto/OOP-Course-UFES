import java.util.Scanner;
import java.util.ArrayList;


class Programa{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String nome_freteStrategy;
        nome_freteStrategy = sc.nextLine();


        Carrinho carrinho = new Carrinho(new FretePadrao());
        if(!nome_freteStrategy.equals("FretePadrao")){
            if(nome_freteStrategy.equals("RetiradaNaLoja")){
                carrinho.novo_freteStrategy(new RetiradaNaLoja());
            }
            if(nome_freteStrategy.equals("FreteExpresso")){
                carrinho.novo_freteStrategy(new FreteExpresso());
            }
            if(nome_freteStrategy.equals("FreteTransportadora")){
                carrinho.novo_freteStrategy(new FreteTransportadora());
            }
        }



        double valorTotalItems, pesoEmKg, distanciaEmKm;
        valorTotalItems = sc.nextDouble();
        pesoEmKg = sc.nextDouble();
        distanciaEmKm = sc.nextDouble();

        System.out.printf("%.2f\n", carrinho.calcularTotalCompra(valorTotalItems, pesoEmKg, distanciaEmKm));

        sc.close();
    }

}
// Na main, leia o tipo de frete (mesmo nome das classes) e crie um objeto Carrinho passando como argumento um objeto que implementa FreteInterface. Em seguida, leia o valor da compra, o peso e a distância para o local de entrega. Invoque o método calcularTotalCompra da compra e mostre o valor na tela.

// Note que ao usar Strategy:

// * A lógica de frete fica encapsulada em classes independentes.
// * Podemos adicionar novos tipos de frete sem modificar código existente.
// * Trocar o comportamento é tão simples quanto chamar o setFreteStrategy.
// * O Carrinho não sabe como o frete é calculado: baixo acoplamento.
// * Código organizado e modular.