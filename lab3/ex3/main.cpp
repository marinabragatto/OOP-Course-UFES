#include "utils.hpp"
#include "pessoa.hpp"


int main(){
    int dia,mes,ano;
    scanf("%*[^0-9]");
    scanf("%d %d %d", &dia, &mes,&ano);
    Data d(dia,mes,ano);

    string rua, numero, bairro, cidade, pais;
    std :: cin >> rua;
    std :: cin >> numero;
    std :: cin >> bairro;
    std :: cin >> cidade;
    std :: cin >> pais;

    Endereco e(rua, numero,bairro, cidade, pais);

    string nome, cpf, email;
    std :: cin >> nome;
    std :: cin >> cpf;
    std :: cin >> email;

    Pessoa p(nome, cpf, email, e, d);

    scanf("%*[^0-9]");
    int numAt=-1;
    scanf("%d", &numAt);
    string op;
    string cpf_in;
    string email_in;
    for(int i = 0; i<numAt; i++){
        scanf("%*[^A-Za-z]");
        std :: cin >> op;
        if(op.compare("CPF") == 0){
            std :: cin >> cpf_in;
            p.set_cpf(cpf_in);
        }
        else if(op.compare("EMAIL") == 0){
            std :: cin >> email_in;
            p.set_email(email_in);            
        }
    }
    p.print();
    return 0;
}




// A função main deve ler os dados necessários para criar os objetos e invocar seus construtores.
// Os dados serão digitados na seguinte ordem:
// - dia, mês e ano de nascimento separados por espaço.
// - rua, numero, bairro, cidade e país separados por espaço.
// - nome, cpf e email separados por espaço.

// A seguir, leia um número inteiro N representando uma quantidade de atualizações de cpf e email que serão feitas. Em cada uma das próximas N linhas será dado um comando do tipo:
// - CPF valor : tenta atualizar o CPF para o novo valor
// - EMAIL valor : tenta atualizar o EMAIL para o novo valor

// Por fim, invoque o método print de pessoa para mostrar seus dados na tela.