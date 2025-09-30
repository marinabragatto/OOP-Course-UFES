#include <stdio.h>
#include "retangulo.hpp"

//class = struct com funçoes 
class Circulo{
public:

    float raio;    //atributos
    float area(){ //metodo
        return 3.14*this->raio*this->raio; //ponteiros do this, feito de forma implicita
    }
};

int main(){
    Circulo c1; // objeto ou instancia]
    c1.raio = 3;
    float area = c1.area();
    printf("AREA : %.2f\n",area);
    return 0;
}
//.h ou .
//compilação g++ -Wall -o circulo aula1.cpp
//testr