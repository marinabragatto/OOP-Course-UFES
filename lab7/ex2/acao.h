#pragma once
#include "investimento.h"

class Acao : public Investimento{
private:
    double taxa;
public:
    Acao(std::string nome, double valor_inicial, double taxa);
    double retorno() override;
};


