#include <iostream>
#include <string>
#include <stdexcept>
using namespace std;

int main() {
    string valor = "abc";

    try {
        int numero = stoi(valor);  // lança std::invalid_argument
        cout << "Número convertido: " << numero << endl;
    }
    catch (const invalid_argument &e) {
        cout << "Erro: string não é um número válido! (" << e.what() << ")" << endl;
    }
    catch (const exception &e) {  // exceção genérica
        cout << "Outra exceção capturada: " << e.what() << endl;
    }

    return 0;
}
