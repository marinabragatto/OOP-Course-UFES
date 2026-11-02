#include <iostream>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){

    std::string palavra("HELLO");
    const char * nome = palavra.c_str();
    printf("(%s)\n", nome);
    std::cout << "("<< palavra << ")" << std::endl;

    std::string frase="Bom Dia, ";
    
    frase.append("opa");
    printf("(%s)", frase.c_str());
    
    frase.replace(4, 3, "Noite");
    printf("(%s)", frase.c_str());

    frase.insert(0,"ola");
    printf("(%s)\n", frase.c_str());

    for(char c: frase){
        printf("%c\n", c);
    }
    return 0;
}