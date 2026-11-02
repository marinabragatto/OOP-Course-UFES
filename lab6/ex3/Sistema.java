import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Scanner;

public class Sistema{
    private Supermercado supermercado;

    Sistema(){
        this.supermercado = new Supermercado();
    }
    public int  menu(String operation, Scanner sc){

        if(operation.equals("INICIAR_COMPRA")){
            String cpf;
            cpf = sc.next();
            
            Compra compra = new Compra(cpf);

            String sub_operation;

            while(true){
                sub_operation = sc.next();
                if(sub_operation.equals("ADD_ITEM")){
                    String nome_p;
                    nome_p = sc.next();
                    int quantidade;
                    quantidade = sc.nextInt();
                    
                    compra.adiciona_produto(nome_p, quantidade);
                }
                if(sub_operation.equals("FINALIZAR_COMPRA")){
                    System.out.printf("%.2f\n", supermercado.finaliza_compra(compra));
                    break;
                }
            }
        }

        if(operation.equals("REGISTRAR_PRODUTO")){
            String nome;
            nome = sc.next();
            double valor;
            valor = sc.nextDouble();
            
            Produto produto = new Produto(nome, valor); 
            
            supermercado.registrar_produto(produto, nome);
            
        }

        if(operation.equals("ADQUIRIR_PRODUTO")){
            String nome;
            nome = sc.next();
            int quantidade;
            quantidade = sc.nextInt();
            
            supermercado.adquirir_produto(nome, quantidade); 
        }
        
        if(operation.equals("REGISTRAR_CLIENTE")){
            String nome, cpf;
            nome = sc.next();
            cpf = sc.next();

            Cliente cliente = new Cliente(nome, cpf);

            supermercado.registrar_cliente(cliente, cpf);   
        }
        
        if(operation.equals("REVENUE")){
            System.out.printf("%.2f\n", supermercado.valor_vendido());
        }
        
        if(operation.equals("MAIS_VENDIDO")){
            System.out.printf("%s\n", supermercado.produto_mais_vendido());
        }

        if(operation.equals("EM_FALTA")){
            ArrayList<String> produtos = supermercado.produtos_em_falta();
            for (String nome : produtos) {
                System.out.println(nome);
            }   
        }

        if(operation.equals("MELHOR_CLIENTE")){
            System.out.printf("%s\n", supermercado.melhor_cliente());
        }

        if(operation.equals("ENCERRAR")){
            return -1;
        }

        return 0;
    }

}