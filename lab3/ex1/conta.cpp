#include "conta.hpp"

Conta::Conta(std::string numeroIn, Pessoa titularIn) : numero(numeroIn),  saldo(0.0), titular(titularIn){

}
void Conta::deposito(float valor){
    if(valor <= 0){
        std:: cout << "VALOR INVALIDO" << std:: endl;
    }
    else {
        saldo += valor;
    }
    
}

void Conta::saque(float valor){
    if(valor <= 0){
        std:: cout << "VALOR INVALIDO" << std:: endl;
    }
    else if(saldo - valor >= 0){
        saldo -= valor;
    }
    else{
        std::cout << "SALDO INSUFICIENTE" << std:: endl;
    }
}
float Conta::ConsultaSaldo(void){
    return saldo;
}
void Conta::print(void){
    printf("Conta(%s, %.2f, ", numero.c_str(), saldo);
    titular.print();
    printf(")\n");

} 