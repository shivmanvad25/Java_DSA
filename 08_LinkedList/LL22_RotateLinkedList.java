//length and pointer manipulation 

public class LL22_RotateLinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){            this.data = data;
            this.next = null;
        }

        public Node Rotate(Node head, int k){

            if(head==null || head.next==null){
                return head;
            }

            int len = 1;
            Node temp = head;
            while(temp.next!=null){
                len++;
                temp = temp.next;
            }

            
            k = k%len;//if k is greater than length of linked list, we can take mod to get the effective rotations needed
            if(k==0){
                return head;
            }

            Node move = head;
            for(int i=1; i<len-k; i++){
                move = move.next;
            }
            Node head2 = move.next;
            move.next = null;
            temp.next = head;

            return head2;
        


        }
    }

}