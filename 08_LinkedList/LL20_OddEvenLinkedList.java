//It was intuitive and relatively easy.

public class LL20_OddEvenLinkedList {
    class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }

    public Node oddEvenList(Node head) {

        if(head==null){
            return null;
        }
    
        Node odd = head;
        Node even = head.next;
        Node temp = even;

        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = temp;
        return head;
        
    }

    
}
