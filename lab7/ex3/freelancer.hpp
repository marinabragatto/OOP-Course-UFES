#pragma once

#include <iostream>
#include "funcionario.hpp"

class Freelancer : public Funcionario{
private:
    int horas_trabalhadas;
    int valor_por_hora;
public:
    Freelancer(std::string nome, int horas_trabalhadas, int valor_por_hora);
    double salario() override;
};