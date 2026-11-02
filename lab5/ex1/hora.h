#ifndef HORA_H
#define HORA_H

#include <stdio.h>

class Hora{
private:
    int horas,minutos,segundos;
public:
    Hora(){
        horas = 0;
        minutos = 0;
        segundos = 0;
    }


    Hora(int horas_in, int minutos_in, int segundos_in) : horas(horas_in), minutos(minutos_in), segundos(segundos_in){

    }


    Hora(int horas_in) : horas(horas_in){
        minutos = 0;
        segundos = 0;
    }

        
    Hora(int horas_in, int minutos_in) : horas(horas_in), minutos(minutos_in){
        segundos = 0;
    }


    Hora operator+(const Hora& other){
        int horas_new, minutos_new, segundos_new;
        horas_new = this->horas + other.horas;
        minutos_new = this->minutos + other.minutos;
        segundos_new = this->segundos + other.segundos;

       
        if((float)segundos_new / 60 > 1.0){
            int resto = segundos_new % 60;
            int acumulador = segundos_new / 60;

            segundos_new = resto;
            minutos_new += acumulador;

        }
        if((float)minutos_new / 60 > 1.0){
            int resto = minutos_new % 60;
            int acumulador = minutos_new / 60;
            
            minutos_new = resto;
            horas_new += acumulador;
        }

        Hora h_new(horas_new, minutos_new, segundos_new);

        return h_new;

    }

    Hora operator+(int segundos_in){
        int horas_new, minutos_new, segundos_new;
        horas_new = this->horas;
        minutos_new = this->minutos;
        segundos_new = this->segundos + segundos_in;

       
        if((float)segundos_new / 60 > 1.0){
            int resto = segundos_new % 60;
            int acumulador = segundos_new / 60;

            segundos_new = resto;
            minutos_new += acumulador;

        }
        if((float)minutos_new / 60 > 1.0){
            int resto = minutos_new % 60;
            int acumulador = minutos_new / 60;
            
            minutos_new = resto;
            horas_new += acumulador;
        }

        Hora h_new(horas_new, minutos_new, segundos_new);

        return h_new;

    }


    static Hora ler(){
        int horas, minutos, segundos;
        scanf("%*[^0-9]");
        scanf("%d %d %d", &horas, &minutos, &segundos);
        Hora h(horas, minutos, segundos);
        return h;
    }

    void print(){
        printf("%d %d %d\n", this->horas, this->minutos, this->segundos);
    }




};

#endif