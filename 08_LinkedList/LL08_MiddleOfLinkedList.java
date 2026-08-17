//OPTIMAL WAY: SLOW and FAST POINTER.

public class LL08_MiddleOfLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Add node at the end
    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    public Node middleNode() {

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LL08_MiddleOfLinkedList list = new LL08_MiddleOfLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);

        System.out.println("Linked List:");
        list.display();

        Node middle = list.middleNode();

        System.out.println("Middle Node: " + middle.data);
    }

    
}
