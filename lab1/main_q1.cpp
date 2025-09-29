#include <stdio.h>
#include "retangulo.hpp"

int main(){
    Retangulo c1; 
    c1.altura = 3;
    c1.largura = 6;
    float altura, largura;
    printf("Digite a altura e largura: ");
    scanf("%f %f", &altura, &largura);
    c1.altura= altura;
    c1.largura=largura;
    float area = c1.area();
    float perimetro = c1.perimetro();
    printf("AREA : %.2f\nPERIMETRO : %.2f",area, perimetro);
    return 0;
}