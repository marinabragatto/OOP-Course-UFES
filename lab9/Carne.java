public class Carne implements MetodoPagamento{
    public Carne(){

    }

    // Os meios de pagamentos possíveis são:
// - PIX: 10% de desconto.
// - CARTAO: não altera o preço.
// - CARNE: 20% de juros.
    public double pagar(double valor){
        return  valor*1.2;
    }

}