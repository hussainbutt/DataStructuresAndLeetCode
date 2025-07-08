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
    public void reorderList(ListNode head) {
        ListNode current = head;
        ListNode currentSlow = head;
        ListNode currentFast = head;
        while(currentFast !=null && currentFast.next != null && currentFast.next.next!=null){
            currentSlow = currentSlow.next;
            currentFast = currentFast.next.next;
        }
        ListNode mid = currentSlow;
        ListNode currentMid = mid.next;
        mid.next= null;

        ListNode prev = null;

        while(currentMid != null){
            ListNode next = currentMid.next;
            currentMid.next = prev;
            prev = currentMid;
            currentMid = next;
        }
        ListNode head2 = prev;

        current = head;
        ListNode currentEnd = head2;
        while(current != null && currentEnd != null){
            ListNode leftNext = current.next;
            ListNode rightNext = currentEnd.next;

            current.next = currentEnd;
            currentEnd.next = leftNext;
            current = leftNext;
            currentEnd = rightNext; 
        }
    }
}