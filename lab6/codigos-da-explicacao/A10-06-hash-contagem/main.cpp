#include <iostream>
#include <unordered_map>
#include <sstream>
#include <string>
using namespace std;

int main() {
    string texto = "gato cachorro gato passaro cachorro gato";
    unordered_map<string, int> contagem;

    stringstream ss(texto);
    string palavra;

    while (ss >> palavra) {
        contagem[palavra]++;
    }

    for (auto& [palavra, freq] : contagem) {
        cout << palavra << ": " << freq << endl;
    }

    return 0;
}
