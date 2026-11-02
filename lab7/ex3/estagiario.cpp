#include "estagiario.hpp"

Estagiario:: Estagiario(std::string nome, double salario_base, double auxilio_transporte) : FuncionarioContratado(nome, salario_base){
    this->auxilio_transporte = auxilio_transporte;
}


double Estagiario:: descontos(){
    return 0.0;
}
double Estagiario:: bonus(){
    return this->auxilio_transporte;
}