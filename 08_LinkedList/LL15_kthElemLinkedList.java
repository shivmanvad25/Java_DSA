//in one traversal 
//1-2-3-4-5-6-7-8
public class LL15_kthElemLinkedList {
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

        if(head==null || k<=0){
            return -1;
        }
    
        //set both pointer at head
        Node prev = head;
        Node curr = head;

        //make a constant gap of k nodes between both pointerds
        
        for(int i=1; i<=k; i++){
            //most important
            if (curr == null) {
            return -1; // k is greater than list length
        }

            curr = curr.next;
        }

        //now move both pointers until curr reaches null then only prev will be at desired pos
        while(curr!=null){
            curr = curr.next;
            prev = prev.next;

        }
        return prev.data;


    }
}
