#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "mystring.h"

#define MAX_LEN 100

String:: String(){
    
    this->_data = strdup(" ");
    this->_tam = 0;
}
    
    
String:: String(const char * data_in){
    //printf("oi");
    this->_tam = strlen(data_in);
    this->_data = strdup(data_in);
}


String:: String(const String& string_in){ // Esse const indica que o elemento passado não será alterado    
    this->_data = strdup(string_in._data); 
    this->_tam = strlen(string_in._data);

}
//- Construtor de cópia
// - operator=
// - operator+: concatena duas strings
String String:: operator+(const String& other){
    char buffer[100];
    strcpy(buffer, this->_data);
    strcat(buffer, other._data);
    
    String s(buffer);
    
    return s;
}

String& String:: operator=(const String& other){
    
    if(this != &other){
        free(this->_data);
        this->_data = strdup(other._data);
        this->_tam = other._tam;        
    }

    return *this;
}

char * String:: c_str(){
    return this->_data;
}

String:: ~String(){
    free(this->_data);
}



/*
Linguagem de Programação: C/C++
Descrição:
Crie uma classe String no arquivo string.h contendo como atributos privados um elemento _data do tipo char* e um inteiro _tam representando o tamanho da string. A classe deve conter os seguintes métodos públicos:
- Construtor default: inicializa _data como uma string vazia e _tam com 0.
- Construtor parametrizado: recebe um argumento do tipo const char* e armazena uma cópia em _data.
- Construtor de cópia
- operator=
- operator+: concatena duas strings
- c_str(): retorna _data.

Podem ser usadas as funções de cstring.h na implementação (strlen, strcat, strdup, etc.).  
O arquivo main.c é anexado à questão.
Utilize o valgrind para verificar se não existem memory leaks ou double free.
Lembre-se que no operator=, _data pode ter sido alocado e, neste caso, deve ser desalocado. Lembre-se ainda de verificar no operador se não está acontecendo auto-atribuição, isto é, se não foi realizada a operação s = s. Para isto, verifique se o endereço do argumento é igual ao this. Nada precisa ser feito neste caso. Basta retornar *this.

*/