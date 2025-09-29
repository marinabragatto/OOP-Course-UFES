#ifndef PESSOA_H
#define PESSOA_H

#include <string>
#include <iostream>

class Pessoa{
public:
    std::string nome;
    std::string cpf;
    Pessoa(std::string nome_in, std::string cpf_in);
    void print(void);
};

#endif



// A classe Pessoa tem como atributos públicos o nome (std::string) e cpf (std::string). A classe deve ter os seguintes métodos:
// - construtor(std::string nome, std::string cpf): inicializa os atributos.
// - void print(void): Mostra os dados da pessoa no formato Pessoa(nome, cpf).