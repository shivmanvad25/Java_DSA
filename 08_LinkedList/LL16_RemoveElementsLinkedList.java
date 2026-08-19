public class LL16_RemoveElementsLinkedList {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public Node removeElements(Node head, int val) {

        if(head==null){
            return null;
        }

        //if the head node itself has the value to be removed, we need to move the head pointer to the next node until we find a node that doesn't have the value to be removed.
        while(head!=null && head.data==val){
            head = head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr!=null){

            if(curr.data==val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return head;
    }
    //o(n) time and o(1) space

    //or we can do this by creating a dummy node at the start of the list and then iterating through the list, removing nodes with the specified value. This approach simplifies edge cases, such as when the head node needs to be removed.
    public Node removeElementsWithDummy(Node head, int val) {
        Node dummy = new Node(0); // Create a dummy node
        dummy.next = head; // Point the dummy node to the head of the list  

        Node prev = dummy; // Start with the dummy node
        Node curr = head; // Start with the actual head of the list

        while(curr!=null){
            if(curr.data!=val){
                prev = prev.next; // Move prev to the next node
            }
            else{
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next; // Return the new head, which is the next of the dummy node
        
    }
    
}
