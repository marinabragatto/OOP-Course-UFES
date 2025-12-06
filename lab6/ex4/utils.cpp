#include "utils.h"


ItemProduto:: ItemProduto(Produto produto_in, int quantidade_in) : produto(produto_in){
    this->quantidade = quantidade_in;
}
void  ItemProduto:: incrementa_quantidade(int quantidade){
    this->quantidade += quantidade;
}

float ItemProduto:: retorna_valor(){
    return this->produto.retorna_valor();
}

int ItemProduto:: retorna_quantidade(){
    return this->quantidade;
}

ItemProduto:: ItemProduto(Produto produto_in) : produto(produto_in){
    this->quantidade = 0;
}

Produto ItemProduto:: retorna_produto(){
    return this->produto;
}
