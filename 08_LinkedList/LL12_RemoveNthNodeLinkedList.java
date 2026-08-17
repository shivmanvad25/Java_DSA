//Brute force

class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    
    public Node removeNthFromEnd(Node head, int n) {

        if(head==null || head.next==null){
            head = null;
            return head;
        }

        int count  = 0;
        Node temp = head;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        Node target = head;
        if(count==n){
            head = head.next;
            return head;
        }

        for(int i=1; i<count-n; i++){
            target = target.next;
        }
        Node curr = target.next;
        Node morenext = curr.next;

        target.next = morenext;
        curr.next = null;

        return head;
        
    }
}
    

