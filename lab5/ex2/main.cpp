#include <cstdio>
#include "mystring.h"

String fn(String a, String b)
{
  return a + b;
}

int main()
{
  char s1[128], s2[128];

  scanf("%s %s", s1, s2);


  String x1(s1);
  String x2(x1);
  String x3, x4, x5, x6;
  x3 = String(s2);
  x4 = x3 = x3;

  x5 = x1 + x2;
  x6 = fn(x3, x4);

  printf("%s\n", x5.c_str());
  printf("%s\n", x6.c_str());

  return 0;
}

/*
Linguagem de Programação: C/C++
Descrição:
Crie uma classe String no arquivo mystring.h contendo como atributos privados um elemento _data do tipo char* e um inteiro _tam representando o tamanho da string. A classe deve conter os seguintes métodos públicos:
- Construtor default: inicializa _data como uma string vazia e _tam com 0.
- Construtor parametrizado: recebe um argumento do tipo const char* e armazena uma cópia em _data.
- Construtor de cópia
- operator=
- operator+: concatena duas strings
- c_str(): retorna _data.

Podem ser usadas as funções de cstring.h na implementação (strlen, strcat, strdup, etc.).  
O arquivo main.c é anexado à questão.
Utilize o valgrind para verificar se não existem memory leaks ou double free.
Lembre-se que no operator=, _data pode ter sido alocado e, neste caso, deve ser desalocado. Lembre-se ainda de verificar no operador se não está acontecendo auto-atribuição, isto é, se não foi realizada a operação s = s. Para isto, verifique se o endereço do argumento é igual ao this. Nada precisa ser feito neste caso. Basta retornar *this.
*/