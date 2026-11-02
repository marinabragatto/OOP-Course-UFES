#include <stdio.h>
#include "retangulo.hpp"

int main(){
    float largura, altura;
    scanf("%f %f", &largura, &altura);
    Retangulo r(largura, altura);

    printf("%d %d", (int)r.area(), (int)r.perimetro());

    return 0;
}

// Crie uma classe retângulo com atributos largura e altura do tipo float, e métodos para calcular área e perímetro. Na função main, crie um objeto do tipo retângulo, leia os valores dos atributos usando scanf e mostre na tela a área e perímetro usando printf.