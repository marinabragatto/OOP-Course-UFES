#ifndef PRODUTO_H
#define PRODUTO_H

#include <iostream>

class Produto{
public:
    Produto();
    Produto(std::string nome_in, float valor);
    void incrementa_estoque(int quantidade);
    void decrementa_estoque(int quantidade);
    int retorna_quantidade_estoque();
    float retorna_valor();
    std:: string retorna_nome();
private:
    std::string nome;
    float valor;
    int quantidade_estoque;

};

#endif