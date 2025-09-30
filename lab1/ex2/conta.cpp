#include "conta.hpp"

void Conta:: deposito(float valor){
    if(valor <= 0){
        printf("VALOR INVALIDO\n");
    }
    else{
        saldo += valor;
    }
    printf("%d\n", (int)saldo);
}
void Conta:: saque(float valor){
    if(valor <= 0){ 
        printf("VALOR INVALIDO\n");
    }
    else if(saldo - valor < 0){
        printf("SALDO INSUFICIENTE\n");
    }
    else {
        saldo -= valor;
    }        
    printf("%d\n", (int)saldo);
}
Conta :: Conta(){
    saldo = 0.0;
}

//Regras de Negócio: O valor do saque ou do depósito deve ser positivo. Caso o valor quebre esta regra, mostre na tela "VALOR INVALIDO" e não realize a operação. Se a conta não tiver saldo suficiente para o saque, deve ser mostrado na tela a mensagem "SALDO INSUFICIENTE" e o saque não deve ser efetivado.