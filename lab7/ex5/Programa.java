import java.util.Scanner;
import java.util.ArrayList;

class Programa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();

        double custo_base;
        String operation;

        ArrayList<Transporte> transportes = new ArrayList<Transporte>();        

        for(int i = 0; i < num; i++){
            operation = sc.next();
            custo_base = sc.nextDouble();

            if(operation.equals("Onibus")){
                double distancia_percorrida, preco_gasolina_por_km, preco_passagem; 
                int numero_de_passageiros;

                distancia_percorrida = sc.nextDouble();
                preco_gasolina_por_km = sc.nextDouble();
                numero_de_passageiros = sc.nextInt();
                preco_passagem = sc.nextDouble();
                

                transportes.add(new Onibus(custo_base, distancia_percorrida, preco_gasolina_por_km, numero_de_passageiros, preco_passagem));
                
            }
            if(operation.equals("Bicicleta")){
                double horas_utilizadas, preco_por_hora, custo_manutencao_por_hora;
                
                horas_utilizadas = sc.nextDouble();
                preco_por_hora = sc.nextDouble();
                custo_manutencao_por_hora = sc.nextDouble();

                transportes.add(new BicicletaCompartilhada(custo_base, horas_utilizadas, preco_por_hora, custo_manutencao_por_hora));        
            }
            if(operation.equals("Carro")){
                double taxa_desvalorização, distancia_percorrida, preco_gasolina_por_km,  preco_manunentacao_por_km;
                taxa_desvalorização = sc.nextDouble();
                distancia_percorrida = sc.nextDouble();
                preco_gasolina_por_km = sc.nextDouble();
                preco_manunentacao_por_km = sc.nextDouble();

                transportes.add(new Carro(custo_base, taxa_desvalorização, distancia_percorrida, preco_gasolina_por_km, preco_manunentacao_por_km));
            }
            if(operation.equals("Metro")){
                double receita_por_passageiro; 
                int numero_de_passageiros;
                numero_de_passageiros = sc.nextInt();
                receita_por_passageiro = sc.nextDouble();
                

                transportes.add(new Metro(custo_base, numero_de_passageiros, receita_por_passageiro));
            }
        }


        int idx_menor=0;
        int idx_maior=0;
        double maior_lucro=0;
        double menor_lucro=0;

        if(transportes.size() != 0){
            maior_lucro = transportes.get(0).lucratividade();
            menor_lucro = transportes.get(0).lucratividade();
        }

        double lucro_i=0;
        for(int i = 0; i < num; i++){
            lucro_i = transportes.get(i).lucratividade();
            System.out.printf("%s %.2f\n", transportes.get(i).nome(), lucro_i);
            if(lucro_i > maior_lucro){
                idx_maior = i;
                maior_lucro = lucro_i;
            }

            if(lucro_i < menor_lucro){
                idx_menor = i;
                menor_lucro = lucro_i;
            }
        }
        System.out.printf("%s\n%s\n", transportes.get(idx_maior).nome(), transportes.get(idx_menor).nome());
        sc.close();
    }
}

