#pragma once

#include <iostream>

class Product{
private:
    std::string _nome;
    double _preco;

public:
    Product(std::string nome, double preco);
    std::string retorna_nome();
    double retorna_preco();
    bool operator<(const Product& other);

};
