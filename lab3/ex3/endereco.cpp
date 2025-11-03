#include "endereco.hpp"

Endereco :: Endereco(string rua, string numero, string bairro, string cidade, string pais) : rua(rua), numero(numero), bairro(bairro), cidade(cidade), pais(pais){

}
void Endereco :: print(){
    printf("Endereco(%s, %s, %s, %s, %s)", rua.c_str(), numero.c_str(), bairro.c_str(), cidade.c_str(), pais.c_str());

}