#include "utils.hpp"
#include "eleicao.hpp"


int main (){
    int num_candidatos =-1; 
    scanf("%d", &num_candidatos);
    Eleicao e(num_candidatos);

    
    int num_registros = -1;
    scanf("%*[^0-9]");
    scanf("%d", &num_registros);

    int idx, votos;
    idx = votos = -1;

    for(int i = 0; i < num_registros; i++){
    
        scanf("%*[^0-9]");
        scanf("%d %d", &idx, &votos);

        e.votar(idx,votos);
    }
    
    int idxVencedor = e.vencedor();
    int numero_votos = e.numero_votos();
    printf("%d\n%d", idxVencedor, numero_votos);


    return 0;
}

// Na função main:
// - Leia o número de candidatos e crie um objeto do tipo Eleicao.
// - Leia um número inteiro N representando o número de registros de votos que serão feitos.
// - Cada uma das próximas N linhas, vai conter um registro de votos.
// - Um registro de voto é dado pelo índice do candidato seguido da quantidade de votos que ele recebeu neste registro.
// - Ao final, mostre na tela o vencedor e o número total de votos na eleição.

