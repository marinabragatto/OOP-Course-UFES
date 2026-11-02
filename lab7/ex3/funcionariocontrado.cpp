#include "funcionariocontratado.hpp" 

FuncionarioContratado:: FuncionarioContratado(std::string nome, double salario_base) : Funcionario(nome){
    this->salario_base = salario_base;
}


double FuncionarioContratado :: salario(){
    return this->salario_base + this->bonus() - this->descontos();
}
