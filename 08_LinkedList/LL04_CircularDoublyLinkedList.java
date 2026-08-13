public class LL04_CircularDoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            
        }
    }
    // data members

    private Node head;
    private Node tail;
    private int size;

    LL04_CircularDoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void insertFirst(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;

            //circular connection
            head.prev = tail;
            tail.next = head;
            size++;
            return;
        }
        
        newNode.next = head;
        newNode.prev = tail;
        
        head.prev = newNode;
        tail.next = newNode;
        
        head = newNode;
        
        size++;
    }

    public void insertLast(int data){

        Node newNode = new Node(data);

        if(head== null){
            head = tail =  newNode;
            head.prev = tail;
            tail.next = head;
            size++;
            return;
            
        }

        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        head.prev = tail;
        
        
        size++;

    }

    public void insertAtPosition(int data, int position){

        if (position < 1 || position > size+1) {
        System.out.println("Invalid position");
        return;
        }

        if (position == 1) {
        insertFirst(data);
        return;
        }

        if (position == size+1) {
        insertLast(data);
        return;
        }

        Node temp = head;

        for(int i=1; i<=position-2; i++){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        Node nextNode = temp.next;

        
        newNode.next = nextNode;
        newNode.prev = temp;

        temp.next = newNode;
        nextNode.prev = newNode;
        
        
        size++;
    }

    public void display(){
         if(head==null){
            System.out.println("Circular Linked List is empty");
            return;
         }

        Node temp = head;
        
        do{
            System.out.print(temp.data+ "<->");
            temp = temp.next;
        }
        while(temp!= head);

        System.out.println("Back to head");
    }

    public void displayBackward(){
         if(tail==null){
            System.out.println("Circular Linked List is empty");
            return;
         }

        Node temp = tail;
        
        do{
            System.out.print("<->"+temp.data);
            temp = temp.prev;
        }
        while(temp!= tail);
        
        System.out.println("<->Back to tail");
    }

    public boolean search(int target){

        if(head == null){
            return false;
        }

        Node temp = head;

        do{
            if(temp.data == target){
                return true;
            }
            
            temp = temp.next;
        }
        while(temp != head);
        
        return false;

    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void deleteFirst(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }

        //single node
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;

        }
    
     
        head = head.next;
        tail.next = head;
        head.prev = tail;
        size--;

    
    }

    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        
        tail = temp;
        tail.next = head;
        head.prev = tail;

        size--;
    }

    public void deleteAtPosition(int position){
        if(position<1 || position>size){
            System.out.println("Invalid positon");
            return;
        }
        if(position==1){
            deleteFirst();
            return;
        }
        if(position==size){
            deleteLast();
            return;
        }
    
        Node prev = head;
        for(int i=1; i<=position-2; i++){
            prev = prev.next;
        }
        Node toBeDeleted = prev.next;
        Node nextNode = toBeDeleted.next;

        prev.next = nextNode;
        nextNode.prev = prev;

        //not necessory in java
        toBeDeleted.next = null;
        toBeDeleted.prev = null;
        

        size--;
    }

    public static void main(String[] args) {
        
        LL04_CircularDoublyLinkedList list = new LL04_CircularDoublyLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(40);
        list.insertLast(50);
    
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPosition(2);
        list.display();
        list.displayBackward();

        System.out.println("Size of Linked List: "+list.getSize());

        System.out.println("target found: " + list.search(35));

        System.out.println(list.isEmpty());

    }

}




