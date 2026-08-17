//brute force requires double pass

public class LL07_MiddleOfLinkedList{


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

        // Step 1: count nodes
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: find middle index
        int middle = count / 2;

        // Step 3: move to middle node
        temp = head;

        for (int i = 0; i < middle; i++) {
            temp = temp.next;
        }

        return temp;
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

        LL07_MiddleOfLinkedList list = new LL07_MiddleOfLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        System.out.println("Linked List:");
        list.display();

        Node middle = list.middleNode();

        System.out.println("Middle Node: " + middle.data);
    }
}


