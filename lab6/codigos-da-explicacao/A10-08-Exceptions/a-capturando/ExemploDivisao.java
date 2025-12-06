public class ExemploDivisao {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;  // causa ArithmeticException
            System.out.println("Resultado: " + resultado);
        }
        catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        }
    }
}
