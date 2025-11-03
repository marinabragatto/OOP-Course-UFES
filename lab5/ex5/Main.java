import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        // Create a new binary tree
        BinaryTree b_tree = new BinaryTree();

        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();


        int value;
        // Read values from input and insert them into the binary tree
        for(int i = 0; i < numNodes; i++){
            value = sc.nextInt();
            b_tree.binary_tree_add(value);
        }

        System.out.printf("%d\n", b_tree.binary_tree_min());
        System.out.printf("%d\n", b_tree.binary_tree_max());


        //Read a set of numbers and check if they exists in the tree
        int numSet = sc.nextInt();

        for(int i = 0; i < numSet; i++){
            value = sc.nextInt();
            if(b_tree.binary_tree_exists(value)){
                System.out.printf("EXISTE\n");
            }
            else {
                System.out.printf("NAO EXISTE\n");
            }
        }

    }
}
