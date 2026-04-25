#include "investimento.h"

Investimento:: Investimento(std:: string nome, double valor_inicial){
    this->nome = nome;
    this->valor_inicial = valor_inicial;
}

std::string Investimento:: get_nome(){
    return this->nome;
}
double Investimento:: get_valor_inicial(){
    return this->valor_inicial;
}


