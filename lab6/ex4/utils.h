#ifndef UTILS_H
#define UTILS_H

#include "produto.h"


class ItemProduto{
public:
    ItemProduto(Produto produto_in);
    ItemProduto(Produto produto_in, int quantidade_in);
    int retorna_quantidade();
    float retorna_valor();
    Produto retorna_produto();
    void incrementa_quantidade(int quantidade);
    
private:
    int quantidade;
    Produto produto;

};

#endif