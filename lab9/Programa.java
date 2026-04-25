
import java.util.Scanner;

public class Programa{
    public static void main(String args[]){
        LeitorTerminal leitor_terminal = new LeitorTerminal();
        Compra compra = leitor_terminal.le_compra();
        compra.finalizar();

    }
}

// O objetivo da questão é praticar o uso de interfaces e polimorfismo. O tema é simular o processo de compra de uma loja online. 
// Vamos usar interfaces e polimorfismo para trocar facilmente o tipo de entrega, método de pagamento e implementar os notificadores. 
// Anexado à questão é dado um diagrama de classes contendo o design da solução. Os pacotes ajudam a organizar o código, mas não são obrigatórios. 
// A classe que contém a main não foi representada. As entradas e saídas são descritas a seguir.

// Primeiro são digitados os dados do cliente (nome, email, telefone e distancia para residência), um número inteiro representando 
// a quantidade de itens adquiridos e, para cada item, uma palavra para representar o nome do produto e um double para representar seu preço. 
// Por fim, é digitado o tipo de entrega e o método de pagamento selecionado pelo cliente. Os tipos de entrega possíveis são:

// - PAC: entrega em até 15 dias e custo é 5% do valor da compra + 0.05 * distância para casa.
// - SEDEX: entrega em até 5 dias e custo é 20% do valor da compra + 0.1 * distância para casa..
// - SEDEX10: entrega em até 24h e custo é 50% do valor da compra + 0.75 * distância para casa..

// Os meios de pagamentos possíveis são:
// - PIX: 10% de desconto.
// - CARTAO: não altera o preço.
// - CARNE: 20% de juros.

// Ao finalizar a compra, o cliente deve ser notificado da compra por e-mail, pop-up no celular e por SMS. Nos três canais, a
//  mensagem deve ser "Compra realizada por no valor de e entrega em até dias.". Para simular estas notificações, adicione o prefixo 
//  "Notificação para : ". Além disso, deve ser exibida na tela a nota fiscal contendo os produtos e seus valores, a soma dos valores dos 
//  itens da compra, o valor do frete, os descontos/juros pelo meio de pagamento e o valor final da compra.