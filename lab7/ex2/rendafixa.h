#pragma once
#include "investimento.h"

class RendaFixa : public  Investimento{
private:
    int meses;
    double taxa;
public:
    RendaFixa(std:: string nome, double valor_inicial, int meses, double taxa);
    double retorno() override;
    
};

// Crie uma subclasse RendaFixa que tenha os atributos privados duração do investimento (em meses) e a taxa de lucro. Implemente o retorno como a soma do investimento inicial mais os lucros mensais. A cada mês será aplicada a taxa de lucro sobre o total parcial (juros compostos).