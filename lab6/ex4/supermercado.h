#ifndef SUPERMERCADO_H
#define SUPERMERCADO_H

#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <unordered_map>
#include <vector>

#include "produto.h" 
#include "utils.h"
#include "cliente.h"
#include "compra.h"


class Supermercado{
public:

    Supermercado();
    int valida_produto_compra(std:: string nome_produto, int quantidade_desejada);
    Produto retorna_produto(std::string nome_p);
    void adquirir_produto(std::string nome, int quantidade);
    void registrar_produto(Produto produto);
    void registrar_cliente(Cliente cliente);
    void registrar_compra(Compra compra);
    float revenue();
    std::string retorna_nome_produto_mais_vendido();
    std::string retorna_melhor_cliente();
    std::vector<std::string> retorna_produtos_em_falta();

private:

    std:: vector<Compra> compras;
    std::unordered_map<std::string, Produto> produtos;
    std::unordered_map<std::string, Cliente> clientes;
};

#endif