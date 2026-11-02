#pragma once
#include "investimento.h"

class Imovel : public  Investimento{
private:
    double area;
    double taxa_valorizacao;
    double valor_alugel;
    int meses;
public:
    Imovel(std:: string nome, double valor_inicial, double area, double taxa_valorizacao, double valor_alugel, int meses);
    double retorno() override;

};


// Crie uma subclasse Imovel que tenha como atributos a área do imóvel, a valorização esperada do m2 por mês (juros compostos), o valor do aluguel que o dono recebe mensalmente e o número de meses desde a compra. Assuma que o investimento inicial foi o valor utilizado para adquirir o imóvel. Implemente o método retorno como o valor do imóvel considerando a valorização do m2 mais os ganhos com aluguéis e subtraia o custo de aquisição inicial.
