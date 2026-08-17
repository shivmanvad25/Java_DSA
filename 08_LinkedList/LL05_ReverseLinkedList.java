//Reverse a linked list


public class LL05_ReverseLinkedList {

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
    public LL05_ReverseLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node reverselist(){
        Node curr = head;
        Node prev = null;
        
        while(curr != null){

            Node forward = curr.next;


            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        //updated head
        return prev;
    }
    
    public void main(String[] args) {

        LL05_ReverseLinkedList list = new LL05_ReverseLinkedList();

        list.insertLast(10);
        list.insertLast(40);
        list.insertLast(70);
        list.insertLast(80);
        list.insertLast(90);

        System.out.println("original list:");
        list.display(list.head);
        
        Node newHead = list.reverselist();

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
