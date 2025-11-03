#include "eleicao.hpp"

Eleicao :: Eleicao(int num_candidatos){
    n_candidatos = num_candidatos;
    votos = (int*)malloc(sizeof(int)*num_candidatos);
    for(int i = 0; i < num_candidatos; i++){
        votos[i] = 0;
    }
    return;
}
Eleicao :: ~Eleicao(){
    free(votos);
}
void Eleicao :: votar(int candidato, int quantidade){
    votos[candidato] += quantidade;
    return;
}
int Eleicao :: vencedor(void){
    int idxMaior= -1;
    int maior = -1;

    for(int i = 0; i < n_candidatos; i++){
        if(votos[i] > maior){
            idxMaior = i;
            maior = votos[i];
        }
    }

    return idxMaior;
}
int Eleicao :: numero_votos(void){
    int soma= 0;
    for(int i = 0; i < n_candidatos; i++){
        soma += votos[i];
    }
    return soma;
}