//by recursion 

public class LL06_ReverseRecursion {

    class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    
    //constructer
    public LL06_ReverseRecursion(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node solve(Node prev, Node curr){

        // base case when entire ll has been traveled
        if(curr == null){
            return prev;
        }

        //do first case then use recursion
        Node forward = curr.next;

        curr.next = prev; 
        prev = curr;
        curr = forward;

        //recursive call
        return solve(prev , curr);
        

    }


    
    public static void main(String[] args) {

        LL06_ReverseRecursion list = new LL06_ReverseRecursion();

        list.insertLast(10);
        list.insertLast(40);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);

        System.out.println("original list:");
        list.display(list.head);

        Node oldHead = list.head;
        
        Node newHead = list.solve(null, list.head);

        list.head = newHead;
        list.tail = oldHead;

        System.out.println("Reversed list: ");
        list.display(newHead);
        
    }

    public void insertLast(int data) {

    Node newNode = new Node(data);

    if (head == null) {
        head = tail = newNode;
        size++;
        return;
    }

        tail.next = newNode;
        tail = newNode;
        size++;
}

public void display(Node head) {

    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}
}


    

