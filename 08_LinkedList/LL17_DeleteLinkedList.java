/**
 * Definition for singly-linked list.
  public class Node {
     int val;
      Node next;
      Node(int x) { val = x; }
  }
 */

//INTUITION: The problem is to delete a node from a singly linked list, given only access to that node. Since we don't have access to the head of the list, we can't traverse the list to find the previous node. Instead, we can copy the data from the next node into the current node and then bypass the next node, effectively deleting it.
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

    public void deleteNode(Node node) {

        Node nexts = node.next;

        node.data = nexts.data;
        node.next = nexts.next;

        return;
       
    }
}