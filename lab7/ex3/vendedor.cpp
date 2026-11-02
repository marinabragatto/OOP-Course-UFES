#include "vendedor.hpp"

Vendedor:: Vendedor(std:: string nome, double salario_base, double comissao, bool bateu_meta) : FuncionarioContratado(nome, salario_base){
    this->comissao = comissao; this->bateu_meta = bateu_meta;
}

double Vendedor:: descontos() {
    if(!this->bateu_meta){
        return this->salario_base*0.10;
    }
    return 0;
}

double Vendedor:: bonus() {
    if(this->bateu_meta){
        return this->salario_base*0.25 + this->comissao;
    }
    return 0;
}