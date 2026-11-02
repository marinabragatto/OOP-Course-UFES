public class ExemploArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        try {
            System.out.println(numeros[5]);  // causa ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites do array!");
        }
    }
}
