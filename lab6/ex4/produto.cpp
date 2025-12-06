#include "produto.h"

Produto:: Produto(std::string nome_in, float valor_in){
    this->quantidade_estoque = 0;
    this->nome = nome_in;
    this->valor = valor_in;
}

int Produto:: retorna_quantidade_estoque(){
    return this->quantidade_estoque;
}

std:: string  Produto:: retorna_nome(){
    return this->nome;
}

void Produto:: incrementa_estoque(int quantidade){
    this->quantidade_estoque+=quantidade;
}

void Produto:: decrementa_estoque(int quantidade){
    this->quantidade_estoque-= quantidade;
}

float Produto:: retorna_valor(){
    return this->valor;
}


