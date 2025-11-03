import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numBuffer;
        numBuffer = sc.nextInt();

        Dobro num = new Dobro(numBuffer);

        System.out.printf("%d\n", num.calculaDobro());


        sc.close();
    }
}