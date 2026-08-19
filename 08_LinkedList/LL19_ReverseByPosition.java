public class LL19_ReverseByPosition {
    class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }

    public Node reverseBetween(Node head, int left, int right) {

        Node temp = head;
        int  rightval= 0;
        int leftval = 0;

        for(int i=1; i<=right; i++){
            rightval = temp.val;
            temp = temp.next;
            
        }
        Node temps = head;  
        for(int i=1; i<=left; i++){
            leftval = temps.val;
            temps = temps.next;
        }

        Node exchange = head;
        while(exchange!=null){
            if(exchange.val ==leftval){
                exchange.val = rightval;
            }
            else if(exchange.val ==rightval){
                 exchange.val = leftval;
            }
            exchange = exchange.next;
        }
        
          return head;

        
    }
}

