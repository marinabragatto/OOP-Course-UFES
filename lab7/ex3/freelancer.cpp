#include "freelancer.hpp"

Freelancer:: Freelancer(std::string nome, int horas_trabalhadas, int valor_por_hora) : Funcionario(nome) {
    this->horas_trabalhadas = horas_trabalhadas;
    this->valor_por_hora = valor_por_hora;
}


double Freelancer:: salario(){
    return this->horas_trabalhadas*this->valor_por_hora;
}
