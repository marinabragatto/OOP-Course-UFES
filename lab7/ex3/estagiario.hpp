#pragma once

#include "funcionariocontratado.hpp"

class Estagiario : public FuncionarioContratado{
private:
    double auxilio_transporte;
public:
    Estagiario(std::string nome, double salario_base, double auxilio_transporte);
    double descontos() override;
    double bonus() override;
};