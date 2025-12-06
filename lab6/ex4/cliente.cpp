#include "cliente.h"


Cliente:: Cliente(std::string nome_in, std::string cpf_in){
    this->cpf = cpf_in;
    this->nome = nome_in;
}

Cliente:: Cliente(){
    this->nome = "";
    this->cpf = "";
}


std::string Cliente:: retorna_cpf(){
    return this->cpf;
}

std::string Cliente:: retorna_nome(){
    return this->nome;
}

