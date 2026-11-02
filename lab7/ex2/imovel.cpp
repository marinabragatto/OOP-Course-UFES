#include "imovel.h"
#include "math.h"

Imovel::    Imovel(std:: string nome, double valor_inicial, double area, double taxa_valorizacao, double valor_alugel, int meses) : Investimento(nome, valor_inicial){
    this->area = area;
    this->taxa_valorizacao = taxa_valorizacao;
    this->valor_alugel = valor_alugel;
    this->meses = meses;

}
double Imovel:: retorno() {
    double retorno = 0;
    retorno += valor_alugel*meses;
    retorno -= valor_inicial;
    retorno += valor_inicial*(pow(taxa_valorizacao+1, meses));
    
        // double retorno = 0;
        // retorno -= this.get_valor_inicial();
        // retorno += this.get_valor_inicial()*Math.pow(1+this._valorizacao, this._meses);
        // retorno += this._meses*this._valor_aluguel;
    return retorno;
}

// Crie uma subclasse Imovel que tenha como atributos a área do imóvel, a valorização esperada do m2 por mês (juros compostos), o valor do aluguel que o dono recebe mensalmente e o número de meses desde a compra. Assuma que o investimento inicial foi o valor utilizado para adquirir o imóvel. Implemente o método retorno como o valor do imóvel considerando a valorização do m2 mais os ganhos com aluguéis e subtraia o custo de aquisição inicial.

