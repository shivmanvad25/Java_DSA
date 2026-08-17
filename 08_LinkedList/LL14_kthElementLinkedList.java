//print kth element from last of linked list
//most basic sol 2 passes


public class LL14_kthElementLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public int PrintkthFromEnd(Node head, int k){

        if(head==null){
            return -1;
        }
        if(head.next==null){
            return head.data;
        }

        int count  = 0;
        Node temp = head;

        while(temp!=null){
            count++;
            temp = temp.next;
        }
        Node target = head;
        for(int i=1; i<=count-k; i++){
            target = target.next;
            
        }
        return target.data;

    }
    
}
