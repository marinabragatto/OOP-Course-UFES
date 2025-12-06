public class ExemploGeral {
    public static void main(String[] args) {
        try {
            String texto = null;
            System.out.println(texto.length());  // causa NullPointerException
        }
        catch (Exception e) {  // captura qualquer exceção derivada de Exception
            System.out.println("Exceção capturada: " + e);
        }
    }
}
