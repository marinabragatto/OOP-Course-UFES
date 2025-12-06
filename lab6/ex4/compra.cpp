#include "compra.h"


Compra :: Compra(std::string cpf_cliente_in){
    this->cpf_cliente = cpf_cliente_in;
}



void Compra :: adiciona_produto(Produto produto_in, int quantidade_in){
    //precisa verificar primeiro se o produto existe no supermercado
    std::string nome = produto_in.retorna_nome();
    auto prod = this->produtos.find(nome);


    if(prod != this->produtos.end()){
        //Produto jah adicionado na compra
        prod->second.incrementa_quantidade(quantidade_in);
    }
    else{
        ItemProduto item_p = ItemProduto(produto_in, quantidade_in);
        this->produtos.insert({nome, item_p});
    }
}

std:: string Compra :: retorna_cpf_comprador(){
    return this->cpf_cliente;
}
float Compra :: valor_total(){
    float total = 0;
    for(auto it =  this->produtos.begin(); it != this->produtos.end(); it++){
        total += (it->second.retorna_valor())*(it->second.retorna_quantidade());
    }
   // std::cout<<(typeid(total).name());
    return total;
}

std::unordered_map<std::string, ItemProduto> Compra:: retorna_items_produtos(){
    return this->produtos;
}

int Compra:: retorna_quantidade_items(){
    return this->produtos.size();
}

