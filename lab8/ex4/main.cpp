#include <iostream>
#include "product.hpp"
#include <vector>
#include <iomanip>
#include <algorithm>

int main(){
    int qtd;
    std::cin >> qtd;

    std::vector<Product> products;

    std::string nome;
    double preco;


    for(int i = 0; i < qtd; i++){
        std::cin >> nome >> preco;
        products.push_back(Product(nome, preco));
    }

    std::cout << std::fixed << std:: setprecision(2);
    
    std::sort(products.begin(), products.end());
    for(Product p_i : products){
        std:: cout << p_i.retorna_nome() << " " << p_i.retorna_preco() << std::endl;
    }


    return 0;
}

