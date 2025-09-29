#include <stdio.h>
#include <string>
#include <iostream>
#include <fstream>
#include <string.h>

//using namespace Mynamespace (estd)

class Conta{
private:
    double saldo;
    double limite;
public:
    std::string  numero;
    //double saldo;
    // Conta(){ // Construtor, pode ter parâmetros, se tem parâmetros, ao criar o objeto é necessário passar parâmetros
    //     numero ="0000";
    //     saldo = 0.0;
    // }
    Conta(std::string n, double s, double l) : numero(n), saldo(s), limite(l){

    }
    // ~Conta(){ // destrutor, em java só tem construtor
    //     free(data) 
    // }
};

//Construtores x Destrutores 

//This pode ser omitido em c++
//Cada objeto com ponteiro paraa classes
int main(){

    //parte 1
    std::string frase = "Bom dia";

    frase.append(", tudo bem?\n");
    printf("%s",frase.c_str()); //c_str conversão para char
    char nome[12];
    strcpy(nome,"marina\n");
    std:: string nome2(nome);// construtor   
    printf("%s",nome2.c_str());


    std::cout << "Valores Digitados" << std:: endl; // impressão printf

    std::ofstream file;
    file.open("arquivo.txt");
    if(!file.is_open()){
        exit(1);
    }
    file << "oie";


    //parte 2
    Conta c1("394374", 23.2, 2323.4);
    std::cout << c1.numero << std:: endl;
   // printf("%lf\n",c1.saldo);

    return 0;
}

/*
-looping com char
    for(char c: palavra){

    }
-linkar biblioteca do c++
    -l std++ 
*/


/*
-Construtores
    Criar objetos
-Destrutores
    Só quando tem coisas de alocação de memória
    Não precisa chamar explicitamente
*/