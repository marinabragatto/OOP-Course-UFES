#include "clt.hpp"
#include "estagiario.hpp"
#include "vendedor.hpp"
#include  "freelancer.hpp"
#include "funcionario.hpp"

#include <iostream>
#include <vector>
#include <iomanip>

int main(){
    int num;
    std:: cin >> num;

    std:: string operation;
    std:: string nome;

    std::vector<Funcionario*> funcionarios;


    for(int i = 0; i < num; i++){
        std:: cin >> operation;
        std:: cin >> nome;        

        if(operation.compare("Freelancer") == 0){
            
            int horas_trabalhadas;
            int valor_por_hora;
            std:: cin >> horas_trabalhadas >> valor_por_hora;
            
            Funcionario * novo = new Freelancer(nome, horas_trabalhadas, valor_por_hora);

            funcionarios.push_back(novo);
        }

        if(operation.compare("Estagiario") == 0){
            double salario_base;
            double auxilio_transporte;  
            
            std:: cin >> salario_base >> auxilio_transporte;

            Funcionario * novo = new Estagiario(nome, salario_base, auxilio_transporte);

            funcionarios.push_back(novo);
        }

        if(operation.compare("CLT") == 0){
            double salario_base;
            double ticket_alimentacao;
            double desconto_FGTS;
            double desconto_IRRF;
            std::cin >> salario_base >> ticket_alimentacao >> desconto_FGTS >> desconto_IRRF;

            Funcionario * novo = new Clt(nome, salario_base, ticket_alimentacao, desconto_FGTS, desconto_IRRF);

            funcionarios.push_back(novo);
        }

        if(operation.compare("Vendedor") == 0){

            double salario_base;
            double comissao;
            bool bateu_meta;      
            
            std::cin >> salario_base >> comissao >> bateu_meta;

            Funcionario * novo = new Vendedor(nome,salario_base, comissao, bateu_meta);

            funcionarios.push_back(novo);
        }
    }

    std:: cout << std::fixed << std::setprecision(2);

    int idx_maior=0, idx_menor=0;
    double total = 0;
    if(funcionarios.size() != 0){
        double salario_menor = funcionarios[0]->salario();
        double salario_maior = funcionarios[0]->salario();

        for(size_t i = 0; i < funcionarios.size(); i++){
            double salario_i = funcionarios[i]->salario();
            total += salario_i;
            std:: cout << funcionarios[i]->retorna_nome() << " " << salario_i << std::endl;

            if(salario_i < salario_menor){
                salario_menor = salario_i;
                idx_menor = i;
            }
            if(salario_i > salario_maior){
                salario_maior = salario_i;
                idx_maior = i;
            }
        }
        std::cout << funcionarios[idx_maior]->retorna_nome() << " " << funcionarios[idx_maior]->salario() << std::endl;
        
        std::cout << funcionarios[idx_menor]->retorna_nome() << " " << funcionarios[idx_menor]->salario() <<  std::endl;
    }

    for(Funcionario *f_i: funcionarios){
        delete f_i;
    }
    


    std:: cout << total;

    return 0;
}