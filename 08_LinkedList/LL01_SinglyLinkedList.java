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
            temp = temp.next;//means move temp to the next node
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
        //move pos-1 steps basically stop before the position of the insertion.
        for(int i=0; i<position-1; i++){
            temp = temp.next;// it is taraversing.
        }

        Node newNode = new Node(data);

        newNode.next=temp.next;// first we connect newnode to the next node so that we do not lose the list instead of connecting temp to the newnode first.
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

        //if only one node then after deletion it will become null.
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

        //temp is at second last node.
        temp.next = null;
        tail = temp;

        size--;
    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head== null;
    }

    public int getHead(){
        if(head==null){
            return -1;
        }
        else{
            return head.data;
        }
    }

    public int tail(){
        if(tail==null){
            return -1;
        }
        else{
            return tail.data;
        }

    }

    public boolean search(int target){

        Node temp = head;

        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;

    }

    //return 0 based indexing
    public int findPosition(int target){

        Node temp = head;

        for(int i=0; i<size; i++){
            if(temp.data==target){
                return i+1;
            }
                temp = temp.next;
            
        }
        return -1;

    }

    //we can use this because it will keep on moving until there is a node.
    public int findPosition2(int target){

        Node temp = head;
        int position = 1;

        while(temp != null){
            if(temp.data==target){
                return position;
            }
                temp = temp.next;
                position++;
            
        }
        return -1;

    }
    public void updatePosition(int position, int newData){

        Node temp = head;
        int currentPos = 1;

        if(position<1 || position> size){
            System.out.println("Invalid position");
        }

        while(temp!=null){

            if(currentPos==position){
                temp.data = newData;
                return;

            }

            temp = temp.next;
            currentPos++;
        }

       
       
    }
    public void updatePosition2(int position, int newData){

        if(position<1 || position> size){
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;

        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        temp.data = newData;      
    }

    public boolean updateValue(int oldValue, int newValue){

        Node temp = head;

        while(temp!=null){
            if(temp.data==oldValue){
                temp.data=newValue;
                return true;
                
            }
            //move to next node.
            temp= temp.next;
        }
        //if i am here then i havent find any old value in the list
        return false;

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

        //variables we need are->prev , current , forward. dont really require forward and current tho.

        Node prev = head;
        for(int i=1; i<=position-2; i++){
            prev= prev.next;
        }
        prev.next= prev.next.next;
        size--;
    }

    //here we have to delete first occurance
    public boolean deleteValue(int target){

        if(head==null){
            System.out.println("Deletion not possible because list is empty.");
            return false;
        }
        if(head.data == target){
            deleteFirst();
            return true;
        }
        Node temp = head;
    
        //also check if the value exist or not
        //imp: java evaluates && from left to right 
        while(temp.next!=null && temp.next.data!=target){
            temp=temp.next;
        }
        if(temp.next==null){
            return false;
        }
        temp.next= temp.next.next;
        size--;
        return true;
        
    }

    
    public static void main(String[] args) {

        //list.insertFirst(10);

        LL01_SinglyLinkedList list = new LL01_SinglyLinkedList();

        if(list.isEmpty() ){
            System.out.println("list is empty");
        }
        System.out.println("Size of LL: "+list.getSize());

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

        System.out.println(list.findPosition2(50));
        System.out.println("Found or not:" +list.search(40)); 
        
        list.updatePosition2(3, 200);
        list.display();

        System.out.println("Updated or not: "+list.updateValue(40, 67));
        list.display();

        list.deleteAtPosition(3);
        list.display();

        list.deleteAtPosition(2);
        list.display();
        System.out.println(list.deleteValue(30));
        list.display();
        
    }
    
}