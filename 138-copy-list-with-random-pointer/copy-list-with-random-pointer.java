/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        //make copies in front of them
        Node current = head;
        while(current!=null){
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;   
        }
        //Point randoms
        current = head;
        while(current!=null){
            if(current.random != null){
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        //remove unneccessary elements
        
        current = head;
        Node copyCurrent = head.next;
        Node copyHead = head.next;
        while(current!=null && current.next != null && copyCurrent!=null ){
            current.next = current.next.next;
            if(copyCurrent.next != null)
                copyCurrent.next = copyCurrent.next.next;
            current = current.next;
            copyCurrent = copyCurrent.next;
        }
        return copyHead;
    }
}