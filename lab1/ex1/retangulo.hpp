#ifndef RETANGULO_H
#define RETANGULO_H

class Retangulo{
public: 
    float largura, altura;
    float area();
    float perimetro();
    Retangulo(float largura, float altura);
};


// Crie uma classe retângulo com atributos largura e altura do tipo float, e métodos para calcular área e perímetro. Na função main, crie um objeto do tipo retângulo, leia os valores dos atributos usando scanf e mostre na tela a área e perímetro usando printf.

#endif