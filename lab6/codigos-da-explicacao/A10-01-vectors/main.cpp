#include <iostream>
#include <vector>
#include <string>

class Pessoa
{
private:
    std::string nome;
    int idade;

public:
    Pessoa(std::string nome, int idade) : nome(nome), idade(idade) {}
    void apresentar() const
    {
        std::cout << "Nome: " << nome << ", Idade: " << idade << std::endl;
    }
};


int main()
{
    // --- Exemplo com tipo primitivo ---
    std::vector<int> numeros;

    numeros.push_back(10);
    numeros.push_back(20);
    numeros.push_back(30);

    std::cout << "Tamanho: " << numeros.size() << std::endl;
    std::cout << "Elemento no índice 1: " << numeros[1] << std::endl;

    numeros.pop_back(); // remove o último elemento

    std::cout << "Conteúdo do vector<int>: ";
    for (int n : numeros)
        std::cout << n << " ";
    std::cout << std::endl;

    for (int idx = 0; idx < numeros.size(); idx++)
        std::cout << numeros[idx] << " ";


    // --- Exemplo com objetos ---
    std::vector<Pessoa> pessoas;
    pessoas.push_back(Pessoa("Ana", 25));
    pessoas.push_back(Pessoa("Bruno", 30));

    std::cout << "\nLista de pessoas:" << std::endl;

    for (int idx = 0; idx < pessoas.size(); idx++)
        pessoas[idx].apresentar();

    for (const Pessoa &p : pessoas)
        p.apresentar();

    return 0;
}

