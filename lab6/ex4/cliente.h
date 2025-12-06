#ifndef CLIENTE_H
#define CLIENTE_H

#include <iostream>
#include <vector>
#include <string>
#include "compra.h"

class Cliente{
public:
    Cliente();
    Cliente(std::string nome_in, std::string cpf_in);
    std::string retorna_cpf();
    std::string retorna_nome();

private:
    std::string nome;
    std::string cpf;
    std:: vector<Compra> compras;


};

#endif