#ifndef ELEICAO_HPP
#define ELEICO_HPP

#include "utils.hpp"

class Eleicao{
private:
    int n_candidatos;
    int * votos;
public:
    Eleicao(int num_candidatos);
    ~Eleicao();
    void votar(int candidato, int quantidade);
    int vencedor(void);
    int numero_votos(void);
};


#endif



// Descrição:
// O objetivo desta atividade é criar um mini simulador de uma eleição. Para isto, vamos criar uma classe Eleição com os seguintes atributos privados:
// - int n_candidatos: número de candidatos.
// - int *votos: número de votos para cada candidato. O tamanho do array é dado pela variável n_candidatos.

// e os seguintes métodos públicos:
// - Construtor(int num_candidatos): inicializa o número de candidatos, aloca espaço para o array de votos e inicializa o número de votos de todos os candidatos com zero.
// - Destrutor: desloca o array de votos.
// - void votar(int candidato, int quantidade): incrementa o número de votos do candidato cujo índice foi passado como argumento.
// - int vencedor(void): retorna o candidato com mais votos.
// - int numero_votos(void): retorna o número de votos na eleição.