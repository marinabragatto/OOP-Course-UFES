import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        List list = new List();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //System.out.printf("%d\n", size);
        int val = -1;

        for (int i = 0; i < size; i++)
        {
            val = sc.nextInt();
            list.push_front(val);
            //System.out.printf("%d\n", val);
        }
       // list.print();
        List clone = list.clone();

        size = clone.size;

        for (int i = 0; i < size; i++){
            System.out.printf("%d\n", clone.pop_front());
        }
        

        sc.close();

    }
}
