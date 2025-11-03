public class Retangulo{
    public int altura;
    public int largura;

    public Retangulo(int largura, int altura){
        this.altura = altura;
        this.largura = largura;
    }   

    public int Area(){
        return this.altura*this.largura;
    }
    public int Perimetro(){
        return 2*(this.altura+this.largura);
    }
    public int getAltura(){
        return this.altura;
    }
    public int getLargura(){
        return this.largura;
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