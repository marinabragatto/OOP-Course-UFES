#pragma once

#include "funcionariocontratado.hpp"

class Clt : public FuncionarioContratado{
private:
    double ticket_alimentacao;
    double desconto_FGTS;
    double desconto_IRRF;
public: 
    Clt(std::string nome, double salario_base, double ticket_alimentacao, double desconto_FGTS, double desconto_IRRF);
    double bonus() override; 
    double descontos() override;
};
