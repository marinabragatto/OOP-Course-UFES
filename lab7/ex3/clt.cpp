#include "clt.hpp"

Clt:: Clt(std::string nome, double salario_base, double ticket_alimentacao, double desconto_FGTS, double desconto_IRRF) : FuncionarioContratado(nome, salario_base){
    this->ticket_alimentacao = ticket_alimentacao;
    this->desconto_FGTS = desconto_FGTS;
    this->desconto_IRRF = desconto_IRRF;
}

double Clt:: bonus(){
    return this->ticket_alimentacao;
}
double Clt:: descontos(){
    return this->salario_base*(this->desconto_FGTS + this->desconto_IRRF);
}


