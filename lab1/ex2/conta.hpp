#ifndef CONTA_H
#define CONTA_H

#include <stdio.h>

class Conta{
public:
    char conta[12];
    float saldo;
    void deposito(float valor); 
    void saque(float valor); 
    Conta();
};

#endif



/*
Linguagem de Programação: C/C++
Descrição:
Crie uma classe Conta para representar uma conta de banco. A classe deve ter como atributos o número da conta (char[12]) e o saldo (float). A classe deve conter os seguintes métodos:

- void deposito(float valor): soma um valor ao saldo.
- void saque(float valor): remove um valor do saldo.

Regras de Negócio: O valor do saque ou do depósito deve ser positivo. Caso o valor quebre esta regra, mostre na tela "VALOR INVALIDO" e não realize a operação. Se a conta não tiver saldo suficiente para o saque, deve ser mostrado na tela a mensagem "SALDO INSUFICIENTE" e o saque não deve ser efetivado.

Na função main, crie um objeto do tipo conta e inicialize o número da conta com um valor qualquer e o saldo com zero. Em seguida, leia um número inteiro N representando a quantidade de operações que serão realizadas na conta. As próximas N linhas irão conter comandos que podem ser dos seguintes tipos:

D : realiza o depósito de um valor.
S : realiza o saque de um valor.

Depois de cada operação, o saldo deve ser exibido na tela, mesmo em caso de erro (valor inválido ou saldo insuficiente).


*/