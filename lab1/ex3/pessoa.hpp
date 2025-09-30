#ifndef PESSOA_H
#define PESSOA_H

#include <stdio.h>
#include <string.h>

class Pessoa{
public:
    char nome[32];
    int anoNascimento;
    int idade(int ano_atual);
    Pessoa(char nomeIn[32], int anoNascimentoIn);
};

#endif

/*
Crie uma classe Pessoa contendo os seguintes atributos:

- nome: char[32]
- ano_nascimento: int

A classe deve conter os seguintes métodos:
- int idade(int ano_atual): retorna a idade da pessoa.

Regras de Negócio: O ano atual deve ser positivo e maior ou igual que o ano de nascimento da pessoa. Caso o valor quebre esta regra, mostre na tela "VALOR INVALIDO" e retorne -1.

Na função main, crie um objeto do tipo Pessoa, leia o nome, o ano de nascimento e o ano atual. Mostre na tela a idade.

*/