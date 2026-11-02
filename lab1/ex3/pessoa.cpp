#include "pessoa.hpp"

int Pessoa:: idade(int ano_atual){
    if(ano_atual > 0 && ano_atual >= anoNascimento){
        return ano_atual-anoNascimento;
    }
    else{
        printf("VALOR INVALIDO\n");
        return -1;
    }
    
}
Pessoa::  Pessoa(char nomeIn[32], int anoNascimentoIn){
    strcpy(nome, nomeIn);
    anoNascimento = anoNascimentoIn;
}

