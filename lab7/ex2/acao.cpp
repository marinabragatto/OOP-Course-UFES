#include "acao.h"

Acao:: Acao(std::string nome, double valor_inicial, double taxa): Investimento(nome, valor_inicial){
    this->taxa = taxa;  
}
double Acao:: retorno() {
    double retorno=0;
    retorno += valor_inicial*(1+taxa) - valor_inicial;
    
    return retorno;
}

