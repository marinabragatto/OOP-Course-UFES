public class BinaryTree{

    public class BtNode{
        int value;
        BtNode left;
        BtNode right;

        public BtNode(int value_in, BtNode left_in, BtNode right_in){
            this.value = value_in;
            this.left = left_in;
            this.right = right_in;
        }

  
    }


    public BtNode root;    


    public BinaryTree(){
        this.root = null;
    }
    

    public void binary_tree_add(int value){
        BtNode new_node = new BtNode(value, null, null);

        if(this.root == null){
            this.root = new_node;
        }
        else{
            BtNode aux_node = this.root;

            while(aux_node != null){
                
                if(value == aux_node.value){
                    //There is already this value in the tree
                    break;
                }
                else if(value < aux_node.value){ // The value is less than the current node
                    if(aux_node.left == null){
                        aux_node.left = new_node;
                        break;
                    }
                    else {
                        aux_node = aux_node.left;
                        continue;
                    }
                }
                else if (value > aux_node.value){ // The value is greater than the current node
                    if(aux_node.right == null){
                        aux_node.right = new_node;
                        break;
                    }
                    else {
                        aux_node = aux_node.right;
                    }
                }
            }
        }
    }

    public boolean binary_tree_exists(int value){
        BtNode aux_node = this.root;

        while(aux_node  != null){
            if(value == aux_node.value){
                return true;
            }
            else if(value < aux_node.value){
                aux_node = aux_node.left;
            }
            else { 
                aux_node = aux_node.right;
            }
        }

        return false;
    }


    public int binary_tree_min(){
        if(this.root == null){
            System.out.printf("Error: empty tree\n");
            System.exit(1);
        }
        
        BtNode aux_node = this.root;

        while(aux_node.left != null){
            aux_node = aux_node.left;
        }

        return aux_node.value;
    }


    public int binary_tree_max(){
        if(this.root == null){
            System.out.printf("Error: empty tree\n");
            System.exit(1);
        }

        BtNode aux_node = this.root;

        while(aux_node.right != null){
            aux_node = aux_node.right;
        }

        return aux_node.value;
    }
}





