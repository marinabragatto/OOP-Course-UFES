
#include <iostream>

using namespace std;

// ***************
// Definição de um template de função
// ***************

template <typename T>
T maximo(T a, T b) {
    return (a > b) ? a : b;
}

void uso_maximo() {
    cout << maximo<int>(10, 20) << endl;       // int
    cout << maximo<float>(3.5, 2.1) << endl;     // double
    cout << maximo<char>('a', 'z') << endl;     // char
    cout << maximo<string>("bola", "casa") << endl;     // char
}

// ***************
// templates em classes
// ***************

template <typename T>
class Caixa {
private:
    T valor;
public:
    void guardar(T v) { valor = v; }
    T pegar() { return valor; }
};

void uso_caixa() {
    Caixa<int> c1;
    c1.guardar(42);
    cout << "Caixa<int>: " << c1.pegar() << endl;

    Caixa<string> c2;
    c2.guardar("Olá, mundo!");
    cout << "Caixa<string>: " << c2.pegar() << endl;
}

// ***************
// templates com dois tipos
// ***************

template <typename T1, typename T2>
class Par {
public:
    T1 primeiro;
    T2 segundo;

    Par(T1 a, T2 b) : primeiro(a), segundo(b) {}

    T1 get_first() { return primeiro; }
    T2 get_second() { return segundo; }
};

void uso_par() {
    Par<int, double> p1(10, 3.14);
    Par<string, int> p2("idade", 25);

    printf("%d %.2f\n", p1.get_first(), p1.get_second());
    printf("%s %d\n", p2.get_first().c_str(), p2.get_second());
}


// ***************
// main
// ***************

int main()
{
  uso_maximo();
  uso_caixa();
  uso_par();

  return 0;
}