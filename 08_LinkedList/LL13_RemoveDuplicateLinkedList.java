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

    public Node deleteDuplicates(Node head) {

        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr!=null){

            if(prev.data!=curr.data){
                prev = prev.next;
                curr = curr.next;
            }
            else{
            prev.next = curr.next;
            curr = curr.next;
            }
        }
        return head;
    }
    public Node deleteDuplicates2(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }

        return head;
    }
}