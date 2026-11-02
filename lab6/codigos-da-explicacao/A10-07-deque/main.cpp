#include <iostream>
#include <deque>
using namespace std;

int main() {
    deque<int> dq;

    // Inserindo elementos nas duas pontas
    dq.push_back(10);   // [10]
    dq.push_front(20);  // [20, 10]
    dq.push_back(30);   // [20, 10, 30]

    cout << "Deque inicial: ";
    for (int x : dq) cout << x << " ";
    cout << endl;

    // Acessando elementos
    cout << "Primeiro elemento: " << dq.front() << endl;
    cout << "Ultimo elemento: " << dq.back() << endl;

    // Removendo elementos
    dq.pop_front(); // remove 20
    dq.pop_back();  // remove 30

    cout << "Depois das remocoes: ";
    for (int x : dq) cout << x << " ";
    cout << endl;

    // Inserindo novamente
    dq.push_front(5);
    dq.push_back(15);

    // Acesso por índice
    cout << "Elemento no índice 1: " << dq[1] << endl;

    // Verificando tamanho
    cout << "Tamanho final: " << dq.size() << endl;

    return 0;
}
