#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

struct Pessoa {
    string nome;
    int idade;
};

int main() {
    unordered_map<string, Pessoa> mapa;

    mapa["joao"] = {"João", 25};
    mapa["maria"] = {"Maria", 30};

    for (auto& [usuario, pessoa] : mapa) {
        cout << usuario << " -> " << pessoa.nome << ", " << pessoa.idade << " anos" << endl;
    }

    return 0;
}
