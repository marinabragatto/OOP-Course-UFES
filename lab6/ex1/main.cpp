#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>


// bool myfunction (int i,int j) { 
//     return (i<j); 
// }

// struct myclass {
//   bool operator() (int i,int j) { return (i<j);}
// } myobject;
// //vetor de objetos que nao implementar o menor

int find_vector_int(std :: vector<int> vet_int, int value){
    std::vector<int>::iterator it;
  
    it = find (vet_int.begin(), vet_int.end(), value);

    if (it != vet_int.end()){
    
        int idx = distance(vet_int.begin(), it);
        return idx;
    }
    else{
            return -1;
    }
        
} 

void mostrar_vector_int(std :: vector<int> vet_int){

    for(size_t i  = 0; i < vet_int.size(); i++){
        std:: cout << vet_int[i] << std::endl;
    }

}

std :: vector<int>  ordenar_vector_int(std :: vector<int> vet_int){

    std::sort(vet_int.begin(), vet_int.end());

    return vet_int;

}


int main(){

    int num;
    std:: cin  >> num;
    std:: vector<int> vet_int;


    std:: string operation;
    int value,idx;

    for(int i = 0; i < num; i++){
        std:: cin >> operation;
        
        if(operation.compare("TAMANHO") == 0){
            std:: cout << vet_int.size() << std::endl; 


        }
        else if(operation.compare("BUSCAR") == 0){
            std:: cin >> value;
            int ret = find_vector_int(vet_int,value);
            std:: cout << ret << std::endl;


        }
        else if(operation.compare("INSERIR") == 0){
            std:: cin >> value;
            vet_int.push_back(value);
            
        }
        else if(operation.compare("VER") == 0){
           std:: cin >> idx;
           std:: cout << vet_int[idx] << std::endl;
        }
        else if(operation.compare("REMOVER") == 0){
            std:: cout << vet_int.back() << std::endl;
            vet_int.pop_back();
        }
        else if(operation.compare("ORDENAR") == 0){
            vet_int=ordenar_vector_int(vet_int);
        }
        else if(operation.compare("MOSTRAR") == 0){
            mostrar_vector_int(vet_int);
        }
    }


    return 0;
}

