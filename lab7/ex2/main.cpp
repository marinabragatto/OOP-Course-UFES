
#include "investimento.h"
#include "imovel.h"
#include "rendafixa.h"
#include "acao.h"

#include <iomanip>
#include <iostream>
#include <stdio.h>
#include <vector>

int main(){
    int num;
    std::cin >> num;
    std :: string operacao;

    std::vector<Investimento*> investimentos;

    for(int i = 0; i <  num; i++){
        std:: cin >> operacao;

        std::string nome;
        double valor_inicial;

        std::cin>>nome;
        std::cin>>valor_inicial;
        
        std::cout <<std::fixed << std::setprecision(2);
        if(operacao.compare("RendaFixa") == 0){
            int meses;
            double taxa;
            std::cin >> meses;
            std::cin >> taxa;
            
            
            Investimento * novo = new RendaFixa(nome, valor_inicial, meses, taxa);
          // investimentos.push_back(new RendaFixa(nome, valor_inicial, meses, taxa));
            investimentos.push_back(novo);


        }

        if(operacao.compare("Imovel") == 0){
            double area;
            double taxa_valorizacao;
            double valor_alugel;
            int meses;

            std::cin >> area;
            std::cin >> taxa_valorizacao;
            std::cin >> valor_alugel;
            std::cin >> meses;

            Investimento * novo = new Imovel(nome, valor_inicial, area, taxa_valorizacao, valor_alugel, meses);

            investimentos.push_back(novo);

        }

        if(operacao.compare("Acoes") == 0){
            double taxa;
            std::cin >> taxa;

            Investimento * novo = new Acao(nome, valor_inicial, taxa);
          // investimentos.push_back(new RendaFixa(nome, valor_inicial, meses, taxa));

            investimentos.push_back(novo);


        }
        
        //Imovel AptoJp 450000 80 0.001 2500 36
    }   
    double total = 0;
    int idx_maior = 0;
    double maior_retorno = investimentos[0]->retorno();
    for(size_t i  = 0; i < investimentos.size(); i++){
        double retorno = investimentos[i]->retorno(); 
        total += retorno;
        std:: cout << investimentos[i]->get_nome() <<" "<<retorno << std::endl;

        if(maior_retorno < retorno){
            idx_maior = i;
            maior_retorno = retorno;
        }
    }
    std::cout << total<< std::endl;
    std::cout << investimentos[idx_maior]->get_nome();

    for(Investimento *i: investimentos) {
        delete i;
    }

    

    return 0;
}