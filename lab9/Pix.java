public class Pix implements MetodoPagamento{
    Pix(){

    }

    // Os meios de pagamentos possíveis são:
// - PIX: 10% de desconto.
// - CARTAO: não altera o preço.
// - CARNE: 20% de juros.
    public double pagar(double valor){
        Double total = valor*0.9;
        Double desconto = valor*0.1;

        return valor - desconto;
        // return valor*0.9;

        // return  Math.round(total * 40.0) / 40.0;
    }

}