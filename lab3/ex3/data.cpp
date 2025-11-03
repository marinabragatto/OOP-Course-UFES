#include "data.hpp"

Data :: Data(int dia, int mes, int ano) : dia(dia), mes(mes), ano(ano){

}
void Data :: print(){
    printf("Data(%d, %d, %d)", dia,mes,ano);
    // - print: mostra a data na tela no formato Data(dia, mes, ano).
}