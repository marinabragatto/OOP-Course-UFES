import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


class Programa{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        
        ArrayList<Product> products = new ArrayList<Product>();

        String nome;
        double preco;
        for(int i = 0; i < n; i++){
            nome = sc.next();
            preco = sc.nextDouble();

            products.add(new Product(nome, preco));
        }

        Collections.sort(products);

        for(Product p_i : products){
            System.out.printf("%s %.2f\n",p_i.retorna_nome(), p_i.retorna_preco());
        }
    }
}
