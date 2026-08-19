
//  this one is avery basic approach by finding the length of both the linked list and then moving the pointer of the longer linked list by the difference in length and then moving both the pointers together until they meet at the intersection point.

// imp takeaway is that we have to find the same node in memory and not the same value. So we have to compare the nodes and not the values of the nodes.
public class LL18_IntersectionOfTwoLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public int getLength(Node head){

        int count =0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node getIntersectionNode(Node headA, Node headB) {

        int len1 = getLength(headA);
        int len2 = getLength(headB);

        int diff = (len1 - len2);
        if(diff<1){
            diff = -1 * diff;
        }



        for(int i=1; i<=diff; i++){
            if(len2<len1){
                headA = headA.next;
            }
            else{
                headB = headB.next;
            }
        }

        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

        

        
    }
}