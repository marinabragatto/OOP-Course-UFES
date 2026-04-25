#include "product.hpp"

Product:: Product(std::string nome, double preco){
    this->_nome = nome;
    this->_preco = preco;
}
std::string Product:: retorna_nome(){
    return this->_nome;
}
double Product:: retorna_preco(){
    return this->_preco;
}

bool Product:: operator<(const Product& other){
    if(this->_preco < other._preco){
        return 1;
    }
    else if(this->_preco > other._preco){
        return 0;
    }
    
    if(this->_nome.compare(other._nome) > 0){
        return 0;
    }

    return 1;
}
