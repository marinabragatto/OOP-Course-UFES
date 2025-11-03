#include "matriz.h"
#include <stdlib.h>


Matriz :: Matriz(int n, int m) {
    this->_alocar(n,m);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            this->_data[i][j] = 0; 
        }
    }
}


Matriz :: Matriz(int n, int m, const double* valores) : Matriz(n, m){
    int idx_m, idx_n;

    for(int i = 0; i < n*m; i++){
        idx_n = i / m;
        idx_m = i % m;

        this->_data[idx_n][idx_m] = valores[i];
    }
}


Matriz :: Matriz(const Matriz& other) : Matriz(other._n, other._m){
    int n  = other._n;
    int m = other._m;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            this->_data[i][j] = other._data[i][j];
        }
    }
}


Matriz& Matriz :: operator=(const Matriz& other) {
    int n  = other._n;
    int m = other._m;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            this->_data[i][j] = other._data[i][j];
        }
    }

    return *this;
}


Matriz Matriz:: zeros(int n, int m){
    Matriz mat_new(n,m);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            mat_new._data[i][j] = 0;
        }
    }
    return mat_new;
}


Matriz Matriz:: ones(int n, int m){
    Matriz mat_new(n,m);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            mat_new._data[i][j] = 1;
        }
    }
    return mat_new;
}
Matriz  Matriz:: eye(int n, int m){
    // if(n != m){
    //     printf("ERRO!, não existe matriz identidade com m diferente n\n");
    //     exit(1);
    // }
    Matriz mat_new(n,m);
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(j == i){
              mat_new._data[i][j] = 1;  
            }
            else {
              mat_new._data[i][j] = 0;  
            }
            
        }
    }
    return mat_new;
}


Matriz Matriz:: operator+(const Matriz& other) const{ // const == o método não pode modificar  *this
    if(this->_m != other._m){
        printf("ERRO!, não existe soma de matrizes com m1 diferente m2\n");
        exit(1);
    }
    if(this->_n != other._n){
        printf("ERRO!, não existe soma de matrizes com n1 diferente n2\n");
        exit(1);
    }

    Matriz mat_new(this->_n,this->_m);
    int n  = this->_n;
    int m = this->_m;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            mat_new._data[i][j] = this->_data[i][j] + other._data[i][j];
        }
    }
    return mat_new;    
}


Matriz Matriz:: operator+(double escalar) const{
    Matriz mat_new(this->_n,this->_m);
    int n  = this->_n;
    int m = this->_m;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            mat_new._data[i][j] += escalar;
        }
    }
    return mat_new;    
}


Matriz Matriz:: operator*(double escalar) const{
    Matriz mat_new(this->_n,this->_m);
    int n  = this->_n;
    int m = this->_m;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            mat_new._data[i][j] += this->_data[i][j]*(escalar);
        }
    }
    return mat_new;    
}


Matriz Matriz:: operator*(const Matriz& other) const{
    if(this->_m != other._n){
        printf("ERRO!, não existe mutiplicao de matrizes com m1 diferente n2\n");
        exit(1);
    }
    

    Matriz mat_new(this->_n, other._m);
    int n  = this->_n;
    int m = other._m;
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            mat_new._data[i][j] = 0;

            for(int n_idx = 0, m_idx = 0; n_idx < this->_m; n_idx++,m_idx++){
                mat_new._data[i][j] += (this->_data[i][n_idx])*(other._data[n_idx][j]);
            }

        }
    }
    return mat_new;   
}


Matriz Matriz:: ler(){
    int n, m;
    scanf("%*[^0-9]");
    scanf("%d %d", &n, &m);

    double valores[n*m];
    for(int i = 0; i < n*m; i++){
        scanf("%*[^0-9.-]");
        scanf("%lf", &valores[i]);
    }

    Matriz mat_new(n, m, valores);

    return mat_new;
}


void Matriz:: print() const{
    for(int i = 0; i < this->_n; i++){
        for(int j = 0; j < this->_m; j++){
            printf("%.2f ", this->_data[i][j]);
        }
    }
    printf("\n");
}


Matriz:: ~Matriz(){
    this->_liberar();
}


int Matriz::  linhas() const{
    return this->_n;
}


int Matriz:: colunas() const{
    return this->_m;
}