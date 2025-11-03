#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
int main(){

    const char * nome = "hello";
    printf("(%s)\n", nome);
//    nome[0] = 'c'; NÃO PODE FAZER ISSO
    printf("(%s)\n", nome);


    std :: string palavra;
    palavra = "baby";
    printf("(%s)\n", palavra.c_str());
    return 0;
}