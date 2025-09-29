#include "pessoa.hpp"


Pessoa:: Pessoa(std::string nome_in, std::string cpf_in) : nome(nome_in), cpf(cpf_in){
    
}
void Pessoa:: print(void){
    std::string saida = "Pessoa(" + nome + ", " + cpf + ")"; 
    std::cout << saida;

}
