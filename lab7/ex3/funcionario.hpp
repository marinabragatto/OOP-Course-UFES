#pragma once

#include <iostream>

class Funcionario{
protected: 
    std::string nome;
public:
    Funcionario(std::string nome);
    std::string retorna_nome();
    virtual double salario() = 0;
    virtual ~Funcionario() = default;
};