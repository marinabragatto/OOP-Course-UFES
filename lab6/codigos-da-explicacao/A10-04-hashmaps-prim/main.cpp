#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<int, double> mapa;  // chave int, valor double

    mapa[1] = 10.5;
    mapa[2] = 20.3;
    mapa[3] = 30.7;

    cout << "Valor da chave 2: " << mapa[2] << endl;

    // Iterando
    for (auto& par : mapa) {
        cout << "Chave: " << par.first << ", Valor: " << par.second << endl;
    }

    // Verificando existência
    if (mapa.find(3) != mapa.end()) {
        cout << "Chave 3 encontrada!" << endl;
    }

    return 0;
}
