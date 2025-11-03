#ifndef PESSOA_HPP
#define PESSOA_HPP

#include "utils.hpp"
#include "endereco.hpp"
#include "data.hpp"

class Pessoa{
private:
    string nome;
    string cpf;
    string email;
    Endereco endereco;
    Data data_nasc;
    int validar_cpf(string cpf);
    int validar_email(string email);

public:
    Pessoa(string nome_in, string cpf_in, string email_in, Endereco endereco_in, Data data_nasc_in);
    void set_cpf(string cpf_in);
    void set_email(std::string email_in);
    void print();
};

#endif

// Vamos fazer uma nova versão da classe Pessoa com os seguintes atributos privados:
// - nome: std::string
// - cpf: std::string
// - email: std::string
// - endereco: Endereco
// - data_nasc: Data

// os seguintes métodos privados:
// - int validar_cpf(std::string cpf): Deve verificar se o cpf é composto apenas de digitos numéricos usando a tabela ASCII e, em caso afirmativo, retornar 1. Caso contrário, retornar 0.
// - int validar_email(std::string email): Deve verificar se o email contém "@" e ".com". Em caso afirmativo, retornar 1. Caso contrário, retornar 0.

// e os seguintes métodos públicos:
// - construtor: Recebe os valores de todos os atributos. O construtor deve verificar se o CPF e o e-mail são válidos. Campos inválidos devem ser inicializados com string vazia ("N/A").
// - set_cpf(std::string cpf): Deve verificar se o cpf é válido e, em caso afirmativo, atualizar o cpf. Caso contrário, deve ser exibida a mensagem "CPF INVALIDO" e o cpf não deve ser atualizado.
// - set_email(std::string email): Deve verificar se o email é válido e, em caso afirmativo, atualizar o email. Caso contrário, deve ser exibida a mensagem "EMAIL INVALIDO" e o email não deve ser atualizado.
// - print: mostra os dados da pessoa na tela no formato Pessoa(nome, cpf, email, Endereco(rua, numero, bairro, cidade, pais), Data(dia, mes, ano)).