#include "retangulo.hpp"

float Retangulo:: area(){
    return largura*altura;
}
float Retangulo:: perimetro(){
    return (2*largura + 2*altura);
}
Retangulo:: Retangulo(float largura, float altura) : largura(largura), altura(altura){

}