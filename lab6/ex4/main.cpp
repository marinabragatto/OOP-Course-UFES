#include <stdio.h>
#include <iostream>
#include "sistema.h"

int main(){

    Sistema sistema = Sistema();

    std::string operacao;

    while(1){

        std:: cin >> operacao;
       // std::cout << "(" << operacao << ")" << std::endl;
        if(sistema.menu(operacao) == -1){
            break;
        }
        
    }

    return 0;
}


/*





*/