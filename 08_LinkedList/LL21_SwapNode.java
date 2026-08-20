//swap adjacent nodes in linked list
// using dummy node was the key to solve this problem, as it helps to handle edge cases and simplifies the swapping logic. The dummy node acts as a placeholder before the head of the list, allowing us to easily swap the first pair of nodes without needing special handling for the head.

public class LL21_SwapNode {
    class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }

class Solution {
    public Node swapPairs(Node head) {

        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

       while(prev.next!=null && prev.next.next!=null){
        Node curr = prev.next;
        Node forward = curr.next;

        curr.next = forward.next;
        forward.next = curr;
        prev.next = forward;

        prev = curr;

      }

      return dummy.next;


        
    }
}
    
}
