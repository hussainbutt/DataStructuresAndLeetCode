/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        while(true){
            //count
            ListNode check = current;
            for(int i = 0;i<k;i++){
                if(check == null) return dummy.next;
                check = check.next;
            }
            ListNode start = current;
            ListNode prevNode = null;
            for (int i = 0; i < k; i++) {
                ListNode next = current.next;
                current.next = prevNode;
                prevNode = current;
                current = next;
            }
            prev.next = prevNode;
            start.next = current;
            prev = start;

        }
    }
}