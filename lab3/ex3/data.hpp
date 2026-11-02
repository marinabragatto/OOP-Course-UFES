#ifndef DATA_HPP
#define DATA_HPP

#include "utils.hpp"

class Data{
private:
    int dia;
    int mes;
    int ano;
public:
    Data(int dia, int mes, int ano);
    void print();
};

#endif

// A classe Data deve ter como atributos privados:
// - dia: int
// - mes: int
// - ano: int

// e métodos públicos:
// - Construtor: Recebe os valores de todos os atributos.
// - print: mostra a data na tela no formato Data(dia, mes, ano).