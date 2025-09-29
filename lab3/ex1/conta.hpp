#ifndef CONTA_H
#define CONTA_H


#include "pessoa.hpp"
#include <string>
#include <iostream>

class Conta{
private:    
    std::string numero;
    float saldo;
    Pessoa titular;

public:
    Conta(std::string numero, Pessoa titular);
    void deposito(float valor);
    void saque(float valor);
    float ConsultaSaldo(void);
    void print(void);
};




#endif



/*

Nesta atividade, vamos implementar a classe Conta novamente, mas com algumas modificações. As classes devem ser organizadas em arquivos .h e .cpp.

A classe Conta deve ter como atributos privados o número da conta (std::string), o saldo (float) e o titular (Pessoa). A classe deve conter os seguintes métodos:

- construtor(std::string numero, Pessoa titular): Recebe como argumentos o titular e o número da conta. Inicializa o saldo com zero.
- void deposito(float valor): Soma um valor ao saldo.
- void saque(float valor): Remove um valor do saldo.
- float saldo(void): Retorna o valor do saldo.
- void print(void): Mostra os dados da conta na tela no formato Conta(numero, saldo, Pessoa(nome, cpf)). Chame a função print de pessoa para mostrar os dados do titular. O saldo deve ser exibido com 2 casas depois da vírgula.

A classe Pessoa tem como atributos públicos o nome (std::string) e cpf (std::string). A classe deve ter os seguintes métodos:
- construtor(std::string nome, std::string cpf): inicializa os atributos.
- void print(void): Mostra os dados da pessoa no formato Pessoa(nome, cpf).

Regras de Negócio:
- O valor do saque ou do depósito deve ser positivo. Caso o valor quebre esta regra, mostre na tela "VALOR INVALIDO" e não realize a operação.
- Se a conta não tiver saldo suficiente para o saque, deve ser mostrado na tela a mensagem "SALDO INSUFICIENTE" e o saque não deve ser efetivado.

Na função main, primeiramente, você deve ler o nome, cpf e número da conta, nesta ordem, separados por espaço. Use os dados para construir objetos do tipo Pessoa e Conta. Em seguida, leia um número inteiro N representando a quantidade de operações que serão realizadas na conta. As próximas N linhas irão conter comandos que podem ser dos seguintes tipos:

D : realiza o depósito de um valor.
S : realiza o saque de um valor.

Ao final, mostre na tela o nome os dados da conta como indicado nos casos de teste.


*/