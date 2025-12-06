#include <iostream>
#include <vector>
#include <stdexcept>
using namespace std;

int main() {
    vector<int> numeros = {1, 2, 3};

    try {
        cout << "Acessando elemento fora dos limites..." << endl;
        cout << numeros.at(5) << endl;  // lança std::out_of_range
    }
    catch (const out_of_range &e) {
        cout << "Capturada exceção out_of_range: " << e.what() << endl;
    }

    cout << "Programa continua normalmente." << endl;
    return 0;
}
