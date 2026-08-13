//CIRCULAR LL TYPES
//1.Singky circular LL
//2.Doubly circular LL

public class LL03_CircularSinglyLinkedList {

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    // data members

    private Node head;
    private Node tail;
    private int size;

    LL03_CircularSinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    //for circular singly linked list.

    public void insertFirst(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;

            //circular connection
            tail.next = head;
            size++;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        
        //circular connection
        tail.next = head;
        size++;
    }

    public void insertLast(int data){

        Node newNode = new Node(data);

        if(head== null){
            head = tail =  newNode;
            tail.next = head;
            size++;
            return;
            
        }
        
        tail.next = newNode;
        tail = newNode;

        //will point new tail to head to maintain circular connection
        tail.next = head;
    
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
        //move pos-1 steps basically stop before the position of the insertion.
        for(int i=1; i<=position-2; i++){
            temp = temp.next;// it is taraversing.
        }

        Node newNode = new Node(data);

        newNode.next=temp.next;
        temp.next=newNode;

        size++;
    }

    public void display(){
         if(head==null){
            System.out.println("Circular Linked List is empty");
            return;
         }

        Node temp = head;
        // we are using do while bcz in first iteration we do not check condition, as we must run this loop thru first head
        do{

            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        while(temp!= head);
        System.out.println("Back to head");
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
        //Java has Garbage Collection. Once the old head node is no longer reachable from head/tail, Java can eventually clean it up. so dont need explicitly remove the data
     
        head = head.next;
        //always maintain tail in circular ll
        tail.next = head;
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

        //reach the second last item
        while (temp.next != tail) {
            temp = temp.next;
        }

        //temp is at second last node.
        tail = temp;
        tail.next = head;

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

        // Node prev = head;
        // for(int i=1; i<=position-2; i++){
        //     prev= prev.next;
        // }
        // prev.next= prev.next.next;

    
        Node prev = head;
        for(int i=1; i<=position-2; i++){
            prev = prev.next;
        }
        Node current = prev.next;
        Node nextNode = current.next;

        prev.next = nextNode;
        current.next = null;



         size--;
    }

    public static void main(String[] args) {
        
        LL03_CircularSinglyLinkedList list = new LL03_CircularSinglyLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(9);
        list.insertLast(5);
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPosition(4);
        list.display();

    }

}

