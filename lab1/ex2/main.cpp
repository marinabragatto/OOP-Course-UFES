#include "conta.hpp"


int main(){
    Conta c1;
    
    int qtd;
    scanf("%d", &qtd);

    char op;

    for(int i  = 0; i < qtd; i++){
        scanf("%*[^SD]");
        scanf("%c", &op);

        float valor;

        if(op == 'S'){
            scanf("%f", &valor);
            c1.saque(valor);
        }
        if(op == 'D'){
            scanf("%f", &valor);
            c1.deposito(valor);
        }
    }

    return 0;
}


// Na função main, crie um objeto do tipo conta e inicialize o número da conta com um valor qualquer e o saldo com zero. Em seguida, leia um número inteiro N representando a quantidade de operações que serão realizadas na conta. As próximas N linhas irão conter comandos que podem ser dos seguintes tipos:

// D : realiza o depósito de um valor.
// S : realiza o saque de um valor.

// Depois de cada operação, o saldo deve ser exibido na tela, mesmo em caso de erro (valor inválido ou saldo insuficiente).