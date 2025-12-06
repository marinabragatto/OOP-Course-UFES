#ifndef SISTEMA_H
#define SISTEMA_H

#include "supermercado.h"
#include <iostream>

class Sistema{
public: 
    Sistema();
    int menu(std::string operacao);

private:
    Supermercado supermercado;
};

#endif