#ifndef RETANGULO_H
#define RETANGULO_H


class Retangulo{
public:
    float largura, altura;
    float area(){
        return this->altura*this->largura;
    }
    float perimetro(){
        return ((this->altura*2) + (this->largura*2));
    }

    
};




#endif
