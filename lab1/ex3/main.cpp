#include "pessoa.hpp"

int main(){
    char nomeIn[32];
    int anoNascimentoIn=0;
    
    scanf("%*[^A-Za-z]");
    scanf("%[^ ] %d", nomeIn, &anoNascimentoIn);

    Pessoa p(nomeIn, anoNascimentoIn);
    
    int anoAtual = 0;
    scanf("%*[^-0-9]%d", &anoAtual);
    
    printf("%d", p.idade(anoAtual));
    return 0;
}




/*
Crie uma classe Pessoa contendo os seguintes atributos:

- nome: char[32]
- ano_nascimento: int

A classe deve conter os seguintes métodos:
- int idade(int ano_atual): retorna a idade da pessoa.

Regras de Negócio: O ano atual deve ser positivo e maior ou igual que o ano de nascimento da pessoa. Caso o valor quebre esta regra, mostre na tela "VALOR INVALIDO" e retorne -1.

Na função main, crie um objeto do tipo Pessoa, leia o nome, o ano de nascimento e o ano atual. Mostre na tela a idade.

*/