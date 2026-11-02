#include <iostream>
#include <stdexcept>
using namespace std;

double dividir(double numerador, double denominador) {
    if (denominador == 0) {
        throw invalid_argument("Denominador não pode ser zero.");
    }
    return numerador / denominador;
}

int main() {
    double resultado = dividir(10, 0);  // lança exceção
    cout << "Resultado: " << resultado << endl;
}

// -----

#include <iostream>
#include <stdexcept>
#include <vector>
using namespace std;

int acessarElemento(const vector<int>& v, int indice) {
    if (indice < 0 || indice >= v.size()) {
        throw out_of_range("Índice fora dos limites do vetor.");
    }
    return v[indice];
}

int main() {
    vector<int> numeros = {1, 2, 3};
    int valor = acessarElemento(numeros, 5);  // lança exceção
    cout << valor << endl;
}


// -----

#include <iostream>
#include <fstream>
#include <stdexcept>
using namespace std;

string lerArquivo(const string &nomeArquivo) {
    ifstream arquivo(nomeArquivo);
    if (!arquivo.is_open()) {
        throw runtime_error("Falha ao abrir o arquivo: " + nomeArquivo);
    }

    string conteudo, linha;
    while (getline(arquivo, linha)) {
        conteudo += linha + "\n";
    }
    return conteudo;
}

int main() {
    string texto = lerArquivo("inexistente.txt");  // lança exceção
    cout << texto;
}
