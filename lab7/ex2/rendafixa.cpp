#include "rendafixa.h"
#include "math.h"

RendaFixa:: RendaFixa(std:: string nome, double valor_inicial, int meses, double taxa) : Investimento(nome,valor_inicial){
    this->meses = meses;
    this->taxa = taxa;

}
double RendaFixa:: retorno() {
    double retorno = 0;
    retorno += this->valor_inicial*(pow(taxa+1, meses));
    return retorno;
}

// Crie uma subclasse RendaFixa que tenha os atributos privados duração do investimento (em meses) e a taxa de lucro. Implemente o retorno como a soma do investimento inicial mais os lucros mensais. A cada mês será aplicada a taxa de lucro sobre o total parcial (juros compostos).


