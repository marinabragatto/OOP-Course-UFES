#include "conta.hpp"

Conta::Conta(std::string numero, Pessoa titular){
    saldo = 0.0;
    titular = titular;
    numero = numero;
}
void Conta::deposito(float valor){
    saldo += valor;
}

void Conta::saque(float valor){
    if(saldo - valor >= 0){
        saldo -= valor;
    }
    else{
        std::cout << "Saldo Insuficiente" << std:: endl;
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