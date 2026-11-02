import java.util.Scanner;

public class Programa{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Sistema sistema = new Sistema();
        
        String operation;

        while(true){
            operation = sc.next();
            if(sistema.menu(operation,sc) == -1){
                break;
            }
        }

        sc.close();
    }
}

