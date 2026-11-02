
#include <cstdio>
#include "hora.h"

int main()
{
  Hora h1;
  Hora h2(2);
  Hora h3(1, 25);
  Hora h4(2, 30, 40);

  Hora h5 = Hora::ler();

  Hora h6 = h1 + h5;
  Hora h7 = h2 + h5;
  Hora h8 = h3 + h5;
  Hora h9 = h4 + h5;

  h6.print();
  h7.print();
  h8.print();
  h9.print();

  return 0;
}

// Descrição:
// Implemente uma classe Hora em C++, no arquivo hora.h, com atributos privados hora, minutos, segundos e os seguintes métodos públicos:
// - Construtor parametrizado com valores default de 0.
// - Operator+ que recebe outro horário. A soma deve ser tal que se o número de segundos for maior que 60, o excedente deve ser transformado em minutos. Da mesma forma, se os minutos ultrapassarem 60, o excedente deve ser somado às horas.
// - Operator+ que recebe um inteiro e incrementa a quantidade de segundos.
// - Hora ler(): método de classe (estático) que lê os valores de hora, minutos e segundos e constrói um objeto Hora com estes valores.
// - void print(): mostra na tela os valores de horas, minutos e segundos separados por espaço.

// Envie o arquivo hora.h como resposta. O arquivo main é dado e anexo à questão.