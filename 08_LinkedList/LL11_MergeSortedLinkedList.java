 class solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public Node mergeTwoLists(Node list1, Node list2) {
        
        //domy know how to create a dummy node
        Node dummy = new Node(-1); 
        //now put head and tail at this dummy node

        Node anstail = dummy;
        Node anshead = dummy;

        while(list1!=null && list2!= null){

            if(list1.data<list2.data){
                anstail.next = list1;
                list1 = list1.next;
                //there is a new node after tail so update tail
                anstail = anstail.next;
            }
            else{
                anstail.next = list2;
                list2 = list2.next;
                anstail  = anstail.next;
            }
        }
        //list1 fully consume nhi hui
        if(list1!=null){
            anstail.next = list1;

        }
        //list2 fully consume nhi hui
        if(list2!=null){
            anstail.next = list2;

        }

        //most important mode ans head 1 step forward because currently it is at -1 
        anshead = anshead.next;
        //dummy will be free
        dummy.next = null;
        return anshead;
    }
}
