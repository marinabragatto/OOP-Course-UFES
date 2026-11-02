import java.util.Scanner;

public class Programa {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Lendo dados
        String nome;
        int estoque;
        double valor, desconto;

        nome = sc.nextLine();
        estoque = sc.nextInt();
        valor = sc.nextDouble();
        desconto = sc.nextDouble();

        // Criando produto
        Produto p1 = new Produto(nome, estoque, valor, desconto);

        // IO
        int num_ops = sc.nextInt();
        String arg1;
        int arg2;

        for(int i = 0; i < num_ops; i++) {
            // Lendo letra
            arg1 = sc.next();
            arg2 = sc.nextInt();

            if(arg1.equals("V"))
                p1.venda(arg2);
            else
                p1.compra(arg2);
        }

        p1.print();

        sc.close();
    }
}