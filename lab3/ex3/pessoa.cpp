#include "pessoa.hpp"

Pessoa :: Pessoa(string nome_in, string cpf_in, string email_in, Endereco endereco_in, Data data_nasc_in) : endereco(endereco_in), data_nasc(data_nasc_in) {
    if(validar_cpf(cpf_in)){
        cpf = cpf_in; 
    }
    else{
        cpf = "N/A";
    }
    if(validar_email(email_in)){
        email = email_in;
    }
    else{
        email = "N/A";
    }

    nome = nome_in; 
    
}
void Pessoa :: set_cpf(string cpf_in){
    if(validar_cpf(cpf_in)){
        cpf = cpf_in; 
    }
    else{
        printf("CPF INVALIDO\n");
    }

}
void Pessoa ::set_email(string email_in){
    if(validar_email(email_in)){
        email = email_in;
    }
    else{
        printf("EMAIL INVALIDO\n");
    }
}
void Pessoa :: print(){
    printf("Pessoa(%s, %s, %s, ", nome.c_str(), cpf.c_str(), email.c_str());
    endereco.print();
    printf(", ");
    data_nasc.print();
    printf(")\n");
// - print: mostra os dados da pessoa na tela no formato Pessoa(nome, cpf, email, Endereco(rua, numero, bairro, cidade, pais), Data(dia, mes, ano)).
}
int Pessoa :: validar_cpf(string cpf){

    for(int i = 0; cpf[i]; i++){
        if(cpf[i] < '0' || cpf[i] > '9'){
            return 0;
        }
    }

    return 1;

}
int Pessoa :: validar_email(std::string email){
    if(email.find(".com") != std::string::npos && email.find("@") != std::string::npos){
        return 1;
    }
    return 0;
}

