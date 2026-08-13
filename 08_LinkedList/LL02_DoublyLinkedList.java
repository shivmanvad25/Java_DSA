public class LL02_DoublyLinkedList {

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

    LL02_DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void insertFirst(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            size++;
            return;

        }
        
        newNode.next = head;
        head.prev = newNode;
        //head update
        head = newNode;
        size++;
    }

    public void insertLast(int data){

        Node newNode = new Node(data);

        if(head== null){
            head = tail =  newNode;
            size++;
            return;
            
        }
        
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    
        size++;

    }
    
    public void insertPosition(int position, int data){

        if(position<1 || position>size+1){
            System.out.println("Invalid list");
            return;
        }

        if(position==1){
            insertFirst(data);
            return;
        }
        if(position==size+1){
            insertLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

       for(int i=1; i<=position-2; i++){
        temp = temp.next;
       }
       newNode.next = temp.next;
       newNode.prev = temp;

       temp.next.prev = newNode;
       temp.next = newNode;

       size++;
    }

    public void display(){
         
        Node temp = head;

        //use temp here not temp.next
        while(temp!= null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){

        Node temp = tail;

        System.out.print("null");
        while(temp!= null){
            System.out.print("<-"+temp.data);
            temp = temp.prev;
        }
       

    }

    public boolean search(int target){

        if(head==null){
            System.out.println("Empty linked list");
            return false;
        }

        Node temp = head;
        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void updateValue(int oldValue, int newValue){

        if(head==null){
            System.out.println("Empty linked list");
            return;
        }

        Node temp = head;

        while(temp!=null){
            if(temp.data == oldValue){
                temp.data = newValue;               
            }
            temp = temp.next;
        }
    }


    public void deleteHead(){
       
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        //what if there is a single node
        if(head==tail){
            head = null;
            tail = null;
            size = 0;//forgot to do that
            return;
        }

        //java garbabe will collect the remaining node 
        head = head.next;
        head.prev = null;

        size--;

    }

    //on O(1) without traversal
    
    public void deleteLast(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head==tail){
            head = tail = null;
            size = 0;
            return;
        }

        tail = tail.prev;
        tail.next = null;

        size--;

    }

    public void deleteAtPosition(int position){

        if(position<1 || position>size){
            System.out.println("Invaloid position");
            return;//forgot that
        }
        if(position==1){
            deleteHead();
            return;
        }
        if(position==size){
            deleteLast();
            return;
        }

        Node temp = head;
        for(int i=1; i<=position-2; i++){
            temp = temp.next;
        }
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        size--;

        //CAN BE DONE LIKE THIS
        // Node temp = head;
        // for(int i = 1; i < position; i++) {
        //     temp = temp.next;
        // }

        // temp.prev.next = temp.next;
        // temp.next.prev = temp.prev;
    }



    public static void main(String[] args) {

        LL02_DoublyLinkedList list = new LL02_DoublyLinkedList();
    
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertLast(11);
        list.display();
        list.insertPosition(4,155);
        list.display();
        list.displayBackward();
        System.out.println("\nElement present: "+list.search(255));

        list.updateValue(155, 555);
        list.display();
        list.deleteHead();
        list.display();

        list.deleteAtPosition(1);
        list.display();

        
    }
    
}
