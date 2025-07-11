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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int maxSum = 0;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        ListNode prev = null;
        while(mid != null){
            ListNode next = mid.next;
            mid.next=prev;
            prev = mid;
            mid = next;
        }
        ListNode end = prev;
        while(prev!=null && head != null){
            int sum = prev.val + head.val;
            maxSum = Math.max(sum,maxSum);
            prev = prev.next;
            head = head.next;
        }
        return maxSum;
    }
}