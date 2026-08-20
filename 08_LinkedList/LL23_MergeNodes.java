//this is the simplest way else we can do this with inline pointer manipulation.

public class LL23_MergeNodes {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public Node mergeNodes(Node head) {

        if(head==null || head.next==null){
            return head;
        }

        Node dummy = new Node(0);
        Node curr = dummy;
        int sum = 0;

        while(head!=null){

            if(head.data!=0){
                sum+=head.data;
            }
            else{
                if(sum>0){
                    curr.next = new Node(sum);
                    curr = curr.next;
                    sum=0;
                }
            }
            head = head.next;
        }

        return dummy.next;
    }
    
}
