#include "supermercado.h"

Supermercado:: Supermercado(){

}

int Supermercado:: valida_produto_compra(std:: string nome_produto, int quantidade_desejada){
    //verifica estoque e existencia do produto
    auto prod = this->produtos.find(nome_produto);
    if(prod != this->produtos.end()){
        if(prod->second.retorna_quantidade_estoque() >= quantidade_desejada){
            prod->second.decrementa_estoque(quantidade_desejada);
            return 1;
        }
        else{
            printf("Nao eh possivel comprar esse produto\n");
        }
    }

    return 0;
}

void Supermercado:: registrar_produto(Produto produto){
    std::string nome_p = produto.retorna_nome();
    if(this->produtos.find(nome_p) != this->produtos.end()){
        printf("Produto %s jah registrado!\n", nome_p.c_str());
    }
    else{
        this->produtos.insert({nome_p, produto});      
    }
    
}
void Supermercado:: registrar_cliente(Cliente cliente){
    std::string cpf_c = cliente.retorna_cpf();
    if(this->clientes.find(cpf_c) != this->clientes.end()){
        printf("Cliente de cpf %s jah registrado!\n", cpf_c.c_str());
    }
    else{
        this->clientes.insert({cpf_c, cliente});   
    }
    
}

void Supermercado:: registrar_compra(Compra compra){
    this->compras.push_back(compra);
}


void Supermercado :: adquirir_produto(std::string nome, int quantidade){
    auto it_prod = this->produtos.find(nome);
    if(it_prod != this->produtos.end()){
        it_prod->second.incrementa_estoque(quantidade);    
    }   
    else{
        printf("Produto %s nao existe\n", nome.c_str());
    }
}

Produto Supermercado :: retorna_produto(std::string nome_p){
    return (this->produtos.find(nome_p))->second;
}

float Supermercado:: revenue(){
    float total = 0;
    for(Compra compra_i : this->compras){
       // printf("%.2f\n", compra_i.valor_total());
        total+=compra_i.valor_total();
    }

    return total;
}


std::string Supermercado:: retorna_nome_produto_mais_vendido(){
    std:: unordered_map<std::string, ItemProduto> produtos_quantidade_vendida;
    //armazena os valores para achar o maior depois
    
    std:: unordered_map<std::string, ItemProduto> produtos_it;
    //estrutura que armazena momentaneamente os produtos de cada compra

    for(Compra compra_i : this->compras){
        //itera sobre as compras
       
        produtos_it = compra_i.retorna_items_produtos(); //recupera os produtos das compras

        for(auto it_j = produtos_it.begin(); it_j != produtos_it.end(); it_j++){
            //itera sobre os produtos
            std::string nome_p = it_j->first;
            ItemProduto item_prod_j = it_j->second;
            Produto prod_j = item_prod_j.retorna_produto();

            auto it_prod = produtos_quantidade_vendida.find(nome_p);
            //verifica se o produto ja foi adicionado em produtos_quantidade_vendida 
            if(it_prod != produtos_quantidade_vendida.end()){
                //achou o produto
                it_prod->second.incrementa_quantidade(item_prod_j.retorna_quantidade());
            }
            else{
                
                ItemProduto new_item_produto = ItemProduto(prod_j, item_prod_j.retorna_quantidade());

                produtos_quantidade_vendida.insert({nome_p, new_item_produto});
            }
        }
    }

    int maior_quantidade=-1;
    std::string maior_nome= "";
    for (auto it_k = produtos_quantidade_vendida.begin(); it_k != produtos_quantidade_vendida.end();it_k++){
        ItemProduto item_prod_k = it_k->second;
        std::string nome_k = it_k->first;
        int qtd_k = item_prod_k.retorna_quantidade();
        
        if(qtd_k > maior_quantidade){
            maior_quantidade = qtd_k;
            maior_nome = nome_k;
        }
    }

    return maior_nome;
}


std::string Supermercado:: retorna_melhor_cliente(){
    std:: unordered_map<std::string, int> clientes_qtd_compras;

    for(Compra compra_i : this->compras){

        std::string cpf_i = compra_i.retorna_cpf_comprador();

        auto add = clientes_qtd_compras.find(cpf_i);
        if(add != clientes_qtd_compras.end()){
            clientes_qtd_compras[cpf_i]+=1;
        }
        else{
            clientes_qtd_compras.insert({cpf_i, 1});
        }
    }

    int maior_quantidade=-1;
    std::string maior_cpf= "";
    for (auto it_k = clientes_qtd_compras.begin(); it_k != clientes_qtd_compras.end();it_k++){
        std::string cpf_k = it_k->first;
        int qtd_k = it_k->second;
    
        if(qtd_k > maior_quantidade){
            maior_quantidade = qtd_k;
            maior_cpf = cpf_k;
        }
    }

    Cliente cliente = this->clientes[maior_cpf];
    std::string nome = cliente.retorna_nome();
    return nome;

}
std::vector<std::string> Supermercado:: retorna_produtos_em_falta(){
    std::vector<std::string> produtos_em_falta;

    for(auto it = this->produtos.begin(); it != this->produtos.end(); it++){
        Produto prod = it->second;
        std::string nome_p = it->first;
        if(prod.retorna_quantidade_estoque() < 5){
            produtos_em_falta.push_back(nome_p);
        }
    }
    return produtos_em_falta;
}
//  MAIS_VENDIDO: mostra o nome do produto com mais itens vendidos considerando todas as compras