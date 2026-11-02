#ifndef ENDERECO_HPP
#define ENDERECO_HPP

#include "utils.hpp"

class Endereco{
private:
    string rua;
    string numero;
    string bairro;
    string cidade;
    string pais;
public: 
    Endereco(string rua, string numero, string bairro, string cidade, string pais);
    void print();
};

#endif

// A classe Endereço deve possuir como atributos privados:
// - rua: std::string
// - numero: std::string
// - bairro: std::string
// - cidade: std::string
// - país: std::string

// e métodos públicos:
// - Construtor: Recebe os valores de todos os atributos como argumento.
// - print: mostra o endereço no formato Endereco(rua, numero, bairro, cidade, pais).