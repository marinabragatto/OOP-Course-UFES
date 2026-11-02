#ifndef COMPRA_H
#define COMPRA_H

#include <iostream>
#include <vector>
#include <unordered_map>
#include "produto.h"
#include "utils.h"

class Compra{
    public:
        Compra(std::string cpf_cliente_in);
        void adiciona_produto(Produto produto, int quantidade);
        float valor_total();
        int retorna_quantidade_items();
        std:: string retorna_cpf_comprador();
        std::unordered_map<std::string, ItemProduto> retorna_items_produtos();
    private:
        std::string cpf_cliente;
        std::unordered_map<std::string, ItemProduto> produtos;
};
#endif