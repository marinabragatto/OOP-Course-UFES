public class List{

    private class Node{
        public int value;
        public Node next;

        public Node(int value_in, Node next_in){
            value = value_in;
            next = next_in;
        }

    }


    public Node head;
    public int  size;


    public List(){
        head = null;
        size = 0;
    } 


    public void push_front(int val){
        if(head != null){
            Node new_node = new Node(val, head);
            head = new_node;
        }
        else {
            Node new_node = new Node(val, null);
            head = new_node;
        }
        
        
        size++;
    }


    public void print(){
        Node n;
        n = head;

        System.out.printf("[");

        while (n != null){
            System.out.printf("%d", n.value);
            n = n.next;

            if (n != null)
                System.out.printf(", ");
        }

        System.out.printf("]");
    }


    public int pop_front(){
        if (head == null){
            System.out.printf("Error: forward_list_pop_front(): list is empty.");
            System.exit(1);
        }

        Node n = head;
        head = head.next;
        size--;

        return n.value;
    }


    public List clone(){
        List copy = new List();

        Node n = head;
        
        int [] int_vet = new int[size];

        int i = 0;
        while (n != null){
            int_vet[i] = n.value;
            i++;
            n = n.next;
        }

        for(i = size-1; i >= 0; i--){
            copy.push_front(int_vet[i]);
        }

        return copy;
    }
    
}


