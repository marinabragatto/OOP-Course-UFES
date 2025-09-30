#include "conta.hpp"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define TAM_MAX_NOME 32
#define TAM_MAX_NUMERO 32
#define TAM_MAX_CPF 32

int main(){
    char nome[TAM_MAX_NOME], numero[TAM_MAX_NUMERO], cpf[TAM_MAX_CPF];

    scanf("%*[^A-Za-z]");
    scanf("%[^ ]", nome);
    scanf("%*[^0-9]");
    scanf("%[^ ]", cpf);
    scanf("%*[^0-9]");
    scanf("%[^\n\r]", numero);

    std:: string nomeS(nome);
    std:: string numeroS(numero);
    std:: string cpfS(cpf);
    
    Pessoa p(nomeS, cpfS);
    Conta c(numeroS, p);



    int qtd = 0;
    scanf("%d", &qtd);

    char op;
    for(int i = 0; i < qtd; i++){
        scanf("%*[^DS]");
        scanf("%c", &op);

        float valor;

        if(op == 'S'){
            scanf("%*[^-0-9]");
            scanf("%f", &valor);
            c.saque(valor);
        }
        else if(op == 'D'){
            scanf("%*[^-0-9]");
            scanf("%f", &valor);
            c.deposito(valor);
        }
    }    
    
    c.print();
    
    return 0;
}

/*
Suellen 74810184 44352
6
D 6
S -3
D -2
S 3
D 2
S 1*/