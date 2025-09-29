#include <stdio.h>
#include <string.h>

class Conta{
    public:
        char num[13];
        float saldo;
        void deposito(float valor){
            if(valor > 0){
                this->saldo += valor;
                printf("Deposito concluido com sucesso!\n");
            }
            else{
                printf("Valor invalido\n");
            }
            
            return;
        }
        
        void saque(float valor){
            if(saldo >= valor && valor > 0){
                this->saldo -= valor;
                printf("Saque concluido com sucesso!\n");
            }
            else if(saldo < valor){
                printf("Saldo insuficiente\n");
            }
            else if(valor <= 0){
                printf("Valor invalido\n");
            }

        }

};

int main(){
    Conta c1;
    c1.saldo = 0;
    strcpy(c1.num ,"2345");
    printf("Num conta: %s\n", c1.num);
    c1.deposito(-12.3); //Valor invalido
    printf("Saldo: %.2f\n", c1.saldo); // 0
    c1.deposito(12.3); //ok
    printf("Saldo: %.2f\n", c1.saldo);// 12.3
    c1.saque(5); //ok
    printf("Saldo: %.2f\n", c1.saldo); //7.3
    c1.saque(-5); //ok
    printf("Saldo: %.2f\n", c1.saldo); //7.3
    c1.saque(100); //ok
    printf("Saldo: %.2f\n", c1.saldo); //7.3
    return 0;
}