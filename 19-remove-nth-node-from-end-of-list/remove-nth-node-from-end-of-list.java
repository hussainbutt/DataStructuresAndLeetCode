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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode delayed = head;

        while(n>0){
            n--;
            current = current.next;
        }
        // If current is null after first loop, it means we need to remove the head
        if (current == null) {
            return head.next;
        }

        while(current != null){
            prev = delayed;
            current = current.next;
            delayed = delayed.next;
        }
        if(prev !=null && prev.next!=null)
            prev.next = delayed.next;
    return head;
    }
}