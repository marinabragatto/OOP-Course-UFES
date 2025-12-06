#include "sistema.h"
#include <iostream>

Sistema:: Sistema(){
    this->supermercado = Supermercado();
}

int Sistema:: menu(std::string operacao){
   
        if(operacao.compare("REGISTRAR_PRODUTO") == 0){
            std:: string nome_p;
            float valor;
            
            std::cin >> nome_p;
            std::cin >> valor;

            Produto prod = Produto(nome_p, valor);

            this->supermercado.registrar_produto(prod);
        }

        if(operacao.compare("REGISTRAR_CLIENTE") == 0){

            std:: string nome_c;
            std:: string cpf_c;
            
            std::cin >> nome_c;
            std::cin >> cpf_c;

            Cliente cliente = Cliente(nome_c, cpf_c);

            this->supermercado.registrar_cliente(cliente);
        }

        if(operacao.compare("ADQUIRIR_PRODUTO") == 0){
            std:: string nome_p;
            int quantidade;
            std::cin >> nome_p;
            std::cin >> quantidade;
            
            this->supermercado.adquirir_produto(nome_p, quantidade);
        }

        if(operacao.compare("INICIAR_COMPRA") == 0){
            std:: string suboperacao;  
            std:: string cpf_cliente;
            std::cin >> cpf_cliente;

            Compra compra = Compra(cpf_cliente);

            while(1){
                std::cin >> suboperacao;
                if(suboperacao.compare("ADD_ITEM") == 0){
                    std:: string nome_p;
                    int quantidade;
                    std::cin >> nome_p;
                    std::cin >> quantidade;
                    //std::cout<<nome_p;
                    if(supermercado.valida_produto_compra(nome_p, quantidade)){
                        
                        Produto prod =supermercado.retorna_produto(nome_p);
                        compra.adiciona_produto(prod, quantidade);
                    }
                    else{
                        printf("Nao foi possivel adicionar o item, ou ele nao existe, ou nao tem a quantidade no estoque\n");
                    }
                }   
                
                if(suboperacao.compare("FINALIZAR_COMPRA") == 0){
                    printf("%.2f\n", compra.valor_total());
                    supermercado.registrar_compra(compra);
                    break;
                }
            }
        }

        
        if(operacao.compare("REVENUE") == 0){
            printf("%.2f\n", supermercado.revenue());
        }
        
        if(operacao.compare("MAIS_VENDIDO") == 0){
            // MAIS_VENDIDO: mostra o nome do produto com mais itens vendidos considerando todas as compras
            std::cout << supermercado.retorna_nome_produto_mais_vendido()<< std:: endl;
        }
        
        if(operacao.compare("MELHOR_CLIENTE")==0){
            std::cout << supermercado.retorna_melhor_cliente()<< std:: endl;
        }
        
        if(operacao.compare("EM_FALTA")==0){
            std::vector<std::string> produtos = supermercado.retorna_produtos_em_falta();
            for(std::string nome_p : produtos){
                std::cout << nome_p << std::endl;
            } 
        }

        if(operacao.compare("ENCERRAR")==0){
            return -1;
        }

        return 0;
}