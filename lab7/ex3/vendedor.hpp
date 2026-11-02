#pragma once

#include "funcionariocontratado.hpp"

class Vendedor : public FuncionarioContratado{
private:
    double comissao;
    bool bateu_meta;
public:
    Vendedor(std:: string nome, double salario_base, double comissao, bool bateu_meta);
    double descontos() override;
    double bonus() override;
};

