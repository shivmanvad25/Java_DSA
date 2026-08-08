public class LL01_SinglyLinkedList{

    class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    //this private here is encapsulation.
    private Node head;
    private Node tail;
    private int size;
    
    //constructer
    public LL01_SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void insertFirst(int data){

        Node newNode = new Node(data);

        //EMPTY LIST
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public void insertLast(int data){

        Node newNode = new Node(data);

        //EMPTY
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;

        }
        //as we are adding one node so it is necessary to increase size
        size++;
    }

    public void display(){

        Node temp = head;

        while(temp!=null){

            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertInMiddle(int data, int position){

        if (position < 0 || position > size) {
        System.out.println("Invalid position");
        return;
    }

        if (position == 0) {
        insertFirst(data);
        return;
    }

        if (position == size) {
        insertLast(data);
        return;
    }

    //temp should be present at the node before the insertion position.
        Node temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }

        Node newNode = new Node(data);

        newNode.next=temp.next;
        temp.next=newNode;

        size++;
    }
    
    public void deleteFirst(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }

        //Javas garbage collector can eventually remove it.
        head = head.next;
        size--;

        if(size==0){
            tail = null;
        }
    }
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        //reach the second last item
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;
    }
    public int getSize(){
        return size;
    }



    public static void main(String[] args) {

        //list.insertFirst(10);

        LL01_SinglyLinkedList list = new LL01_SinglyLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);

        list.display();

        list.insertInMiddle(55, 3);

        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        
        
        
    }
    
}