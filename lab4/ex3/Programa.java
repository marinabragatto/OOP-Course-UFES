import java.util.Scanner;

public class Programa
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int altura, largura;
        altura = sc.nextInt();
        largura = sc.nextInt();

        Retangulo r = new Retangulo(largura, altura);

        System.out.printf("%d\n%d\n%d\n%d\n", r.getAltura(), r.getLargura(), r.Area(), r.Perimetro());


    }

}
// Descrição:
// Crie uma classe Retangulo em um arquivo Retangulo.java contendo o seguintes atributos privados e métodos públicos:
// Atributos:
// - altura: int
// - largura: int
// Métodos:
// - construtor(int altura, int largura)
// - area() -> int
// - perimetro() -> int
// - getAltura() -> int
// - getLargura() -> int

// Crie uma classe Programa em um arquivo Programa.java contendo o método main. Neste método, leia os dados de altura e largura do retangulo, 
// use estes dados para criar um objeto do tipo Retangulo, e use seus métodos para mostrar na tela a altura, largura, area e perimetro do retangulo.