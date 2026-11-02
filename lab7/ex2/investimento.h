#pragma once
// Crie uma classe abstrata Investimento com um atributo nome e um valor de investimento_inicial 
//que possa ser acessado apenas por suas subclasses, getters públicos e  um método público e abstrato retorno(): double.
#include <iostream>

class Investimento{
protected:
    std::string nome;
    double valor_inicial;

public:
    Investimento(std:: string nome, double valor_inicial);
    virtual double retorno() = 0;    
    std::string get_nome();
    double get_valor_inicial();
    virtual ~Investimento() = default; 
};