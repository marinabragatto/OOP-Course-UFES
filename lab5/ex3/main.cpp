
#include "matriz.h"

int main()
{
  Matriz m1 = Matriz::ler();
  Matriz m2 = Matriz::ler();

  Matriz m3 = m1 * 5 + m1 * 9;
  m3 = m3 + m3;

  Matriz m4(m3);
  m4 = m3 = m3;

 Matriz m5 = (m1 * 3) * (m2 * 2);

  Matriz m6 = Matriz::ones(m5.colunas(), m5.colunas()) * Matriz::eye(m5.colunas(), m5.linhas()) * m5;

  m4.print();
  m5.print();
  m6.print();

   return 0;
}
// Crie uma classe Matriz representando uma matriz com n linhas e m colunas de valores double. Implemente os seguintes métodos públicos:

// - método estático zeros(int n, int m) que retorne uma matriz inicializada com zeros.
// - método estático ones(int n, int m) que retorne uma matriz inicializada com uns.
// - método estático eye(int n, int m) que retorne uma matriz identidade.
// - operator+ recebendo uma matriz como entrada
// - operator+ recebendo um escalar como entrada
// - operator* recebendo um escalar como entrada
// - operator* recebendo uma matriz como entrada e realize multiplicação de matrizes
// - método estático Matriz ler(): lê as dimensões da matriz (n e m) e, em seguida, os valores que compõe a matriz. Usa estes valores para inicializar a matriz.
// - void print(): mostra os elementos da matriz na tela separados por espaço (todos na mesma linha) e com 2 números depois da vírgula.
// - int linhas(): retorna o número de linhas.
// - int colunas(): retorna o número de colunas.
// - int get(int linha, int coluna): retorna o valor das coordenadas.

// Os arquivos matriz.h e main.cpp são anexados na questão. Sua tarefa é implementar o arquivo matriz.cpp . IMPORTANTE: O static usado para indicar que um membro é de classe e não de objeto, é adicionado apenas .h e não deve ser adicionado durante a definição no arquivo .cpp.
// Use o valgrind para verificar se existem memory leaks ou double free.

// Observação: Esta questão é muito longa para uma atividade avaliativa, mas ela é bem completa porque cobre todos os pontos que estudamos