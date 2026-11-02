#include "funcionario.hpp"


Funcionario:: Funcionario(std::string nome) {
    this->nome = nome;
}
std::string Funcionario:: retorna_nome(){
    return this->nome;
}