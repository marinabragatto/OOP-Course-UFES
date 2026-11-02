#pragma once

#include "funcionario.hpp"
#include <iostream>

class FuncionarioContratado : public Funcionario{
protected:
    double salario_base;
    virtual double descontos() = 0;
    virtual double bonus() = 0;
public:
    FuncionarioContratado(std::string nome, double salario_base);
    double salario();
};
